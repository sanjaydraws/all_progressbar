package com.example.all_progressbar.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.all_progressbar.databinding.ActivityLoader2Binding
import com.github.ybq.android.spinkit.sprite.Sprite
import com.github.ybq.android.spinkit.style.*


class Loader2Activity : AppCompatActivity() {
    var binding: ActivityLoader2Binding?= null
    companion object{
        fun start(context: Activity?=null){
            val intent = Intent(context,Loader2Activity::class.java)
            context?.startActivity(intent)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoader2Binding.inflate(layoutInflater)
        binding?.apply {
            setContentView(binding?.root)
        }
        val doubleBounce: Sprite = DoubleBounce()
        val fadingCircle = FadingCircle()
        val chasingDots = ChasingDots()
        val circle = Circle()
        val wanderingCubes = WanderingCubes()


        binding?.spinKit?.setIndeterminateDrawable(doubleBounce)
        binding?.fadingCircle?.setIndeterminateDrawable(fadingCircle)
        binding?.chasingDots?.setIndeterminateDrawable(chasingDots)
        binding?.circle?.setIndeterminateDrawable(circle)
        binding?.wanderingCubes?.setIndeterminateDrawable(wanderingCubes)


    }
}