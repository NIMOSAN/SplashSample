package com.example.splashsample

import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView2 = findViewById<TextView>(R.id.textView2);
        blinkText(textView2, 1000, 500);
    }

    private fun blinkText(textView: TextView, duration: Long, offset: Long) {
        val text:Animation = AlphaAnimation(0.0f, 1.0f)
        text.duration = duration
        text.startOffset = offset
        text.repeatMode = Animation.REVERSE
        text.repeatCount = Animation.INFINITE
        textView.startAnimation(text)
    }
}