package com.github.jmlb23.components.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.github.jmlb23.components.R
import com.github.jmlb23.components.SlideShow

class TestActivity : AppCompatActivity() {

    val slide by lazy { findViewById<SlideShow>(R.id.slide) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val list = mutableListOf(
                resources.getDrawable(android.R.drawable.dialog_frame),
                resources.getDrawable(android.R.drawable.dialog_frame),
                resources.getDrawable(android.R.drawable.dialog_frame),
                resources.getDrawable(android.R.drawable.dialog_frame)
                )
        slide.addElments(list)
    }
}
