package com.example.trans

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.blair.texttransformer.TextTransformer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.transformButton)
        val textView = findViewById<EditText>(R.id.myEditText)
        btn.setOnClickListener {
            TextTransformer.toggleCase(textView)
        }
    }
}