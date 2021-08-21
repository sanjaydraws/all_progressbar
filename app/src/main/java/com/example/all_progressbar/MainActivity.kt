package com.example.all_progressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.all_progressbar.activity.CustomLoader1Activity
import com.example.all_progressbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding:ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding?.apply {
            setContentView(binding?.root)
        }
        binding?.custom1?.setOnClickListener {
            CustomLoader1Activity.start(this@MainActivity)
        }

    }
}