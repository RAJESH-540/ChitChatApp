package com.example.chitchat

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.chitchat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        registerBtn()  //set register button
        alreadyText()// set on click (already text)


    }

    private fun registerBtn() {
        mainBinding.registerBtn.setOnClickListener {
            mainBinding.editEmail.text.toString()
            mainBinding.password.text.toString()
            Log.d("MainActivity", "email : ${mainBinding.editEmail}")
            Log.d("MainActivity", "Password : ${mainBinding.password}")


        }
    }

    private fun alreadyText() {
        mainBinding.alreadyAccountText.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            Log.d("MainActivity", "Try to login ")

        }

    }


}
