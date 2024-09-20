package com.alexandryan.userinfo.utils

import androidx.viewpager2.widget.ViewPager2


fun ViewPager2.selected(call: (Int) -> Unit) {
    registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            call(position)
        }
    })
}