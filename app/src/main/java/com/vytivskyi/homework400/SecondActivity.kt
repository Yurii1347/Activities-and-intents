package com.vytivskyi.homework400

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vytivskyi.homework400.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var first_message: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        first_message = intent.getStringExtra("send1")?: " "
        binding.textView2.text = savedInstanceState?.getString("message1")?: first_message

        binding.btSend2.setOnClickListener{
            val i = Intent(this@SecondActivity, MainActivity::class.java)
            val message2: String = binding.edSend2.text.toString()
            i.putExtra("send2",message2)
            startActivity(i)
            finish()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("message1", first_message)
    }


}