package com.vytivskyi.homework400

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vytivskyi.homework400.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val message2: String? = intent.getStringExtra("send2")
        binding.textView.text = message2

        binding.btSend.setOnClickListener{
            val i = Intent(this@MainActivity, SecondActivity::class.java)
            val message: String = binding.edSend.text.toString()
            i.putExtra("send1", message)
            startActivity(i)
        }

    }
}