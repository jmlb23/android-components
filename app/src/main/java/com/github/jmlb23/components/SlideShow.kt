package com.github.jmlb23.components

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import com.github.jmlb23.components.adapter.CustomPagerAdapter


/**
 * A Slide Show implementation
 */
class SlideShow :  ViewPager {

    constructor(context: Context) : super(context) {
        init(null, 0)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(attrs, 0)
    }

    private fun init(attrs: AttributeSet?, defStyle: Int) {
    }

    fun addElments(list: MutableList<Drawable>) {
        this.adapter = CustomPagerAdapter(context,list)
    }

}
