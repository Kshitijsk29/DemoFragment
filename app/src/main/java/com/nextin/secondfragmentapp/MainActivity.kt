package com.nextin.secondfragmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nextin.secondfragmentapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val firstFragment = FirstFragment()
        val secondFragment =SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment)
            commit()
        }
        binding?.btnOne?.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment,firstFragment)
                commit()
            }
        }
        binding?.btnTwo?.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, secondFragment)
                commit()
            }
        }
    }
}