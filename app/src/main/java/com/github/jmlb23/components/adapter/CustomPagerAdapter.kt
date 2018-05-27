package com.github.jmlb23.components.adapter

import android.content.Context
import android.graphics.drawable.Drawable
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.github.jmlb23.components.R
import com.squareup.picasso.Picasso

class CustomPagerAdapter(val context: Context,val list: MutableList<Drawable>) : PagerAdapter(){

    override fun isViewFromObject(view: View, obj: Any): Boolean = view === obj

    override fun getCount(): Int = list.size

    override fun destroyItem(container: ViewGroup, position: Int, view: Any) {
        container.removeView((view as View))
        notifyDataSetChanged()
    }


    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val root = LayoutInflater.from(context).inflate(R.layout.custom_view_element,container,false)
        val img = root.findViewById<ImageView>(R.id.imageSlide)
        img.setImageDrawable(list[position])
        container.addView(root)
        return root
    }
}