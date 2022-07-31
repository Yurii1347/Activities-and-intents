package com.vytivskyi.homework400

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vytivskyi.homework400.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivitySecondBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val message = intent.getStringExtra("send1")
        binding.textView2.text = message

        binding.btSend2.setOnClickListener{
            val i = Intent(this@SecondActivity, MainActivity::class.java)
            val message2: String = binding.edSend2.text.toString()
            i.putExtra("send2",message2)
            startActivity(i)
        }
    }
}