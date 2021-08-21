package com.example.all_progressbar.activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.all_progressbar.DialogCustomProgressBar
import com.example.all_progressbar.R
import com.example.all_progressbar.databinding.ActivityCustomLoader1Binding

class CustomLoader1Activity : AppCompatActivity() {
    var binding: ActivityCustomLoader1Binding?= null
    companion object{
        fun start(context: Activity?=null){
            val intent = Intent(context,CustomLoader1Activity::class.java)
            context?.startActivity(intent)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomLoader1Binding.inflate(layoutInflater)
        binding?.apply {
            setContentView(binding?.root)
        }
        binding?.signin?.setOnClickListener {
            val dialog = DialogCustomProgressBar.newInstance()
            dialog.show(supportFragmentManager, "DialogCustomProgressBar")
        }
    }
}