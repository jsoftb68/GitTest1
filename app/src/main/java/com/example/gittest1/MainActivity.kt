package com.example.gittest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_count_forward.setOnClickListener {
            counter++
            tv_output.text = counter.toString()
        }

        btn_count_backward.setOnClickListener {
            counter--
            tv_output.text = counter.toString()
        }

        btn_count_reset.setOnClickListener {
            counter = 25
            tv_output.text = counter.toString()
        }
    }
}