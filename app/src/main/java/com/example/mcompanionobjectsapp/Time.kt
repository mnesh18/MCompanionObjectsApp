package com.example.mcompanionobjectsapp

import android.view.View

class Time {
    companion object {
        const val day = 0
        const val night = 1

        fun changeBackground(layout: View, time: Int) {
            when (time) {
                0 -> layout.setBackgroundResource(R.drawable.day)
                1 -> layout.setBackgroundResource(R.drawable.night)
            }
        }
    }
}