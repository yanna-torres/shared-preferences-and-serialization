package com.example.shared_preferences_and_serialization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val text:String = getIntent().getExtras()?.getSerializable("info") as String
        val result:TextView = findViewById(R.id.result)
        result.setText(text)
    }
}