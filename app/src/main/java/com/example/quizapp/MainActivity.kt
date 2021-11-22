package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.Manifest
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_start.setOnClickListener{
            if(et_name.text.toString().isEmpty()){
                Toast.makeText(this@MainActivity,"Please enter your name",Toast.LENGTH_LONG).show()
            }
            else{
                val intent=Intent(this@MainActivity,QuizQuestionActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}