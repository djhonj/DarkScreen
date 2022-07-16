package com.djhonj.darkscreen

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnSetting: ImageView = findViewById(R.id.btnSetting)

        btnSetting.setOnClickListener {
            Toast.makeText(this, "image", Toast.LENGTH_SHORT).show()
        }

        btnSetting.setOnTouchListener { v, event ->
            when(event.action) {
                MotionEvent.ACTION_DOWN -> {
                    Toast.makeText(this@MainActivity, "DOWN", Toast.LENGTH_SHORT).show()
                }
                MotionEvent.ACTION_UP -> {
                    Toast.makeText(this@MainActivity, "UP", Toast.LENGTH_SHORT).show()
                }
            }

            true
        }
    }
}