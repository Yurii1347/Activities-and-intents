package com.vytivskyi.homework400

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vytivskyi.homework400.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var second_message: String
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        second_message = intent.getStringExtra("send2")?: " "
        binding.textView.text = savedInstanceState?.getString("message2")?: second_message

        binding.btSend.setOnClickListener{
            val i = Intent(this@MainActivity, SecondActivity::class.java)
            val message: String = binding.edSend.text.toString()
            i.putExtra("send1", message)
            startActivity(i)
            finish()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("message2", second_message)
    }

}