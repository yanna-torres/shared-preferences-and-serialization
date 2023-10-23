package com.example.shared_preferences_and_serialization

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var info: EditText = findViewById(R.id.infoTextEdit)
        var btn : Button = findViewById(R.id.button)

        btn.setOnClickListener(View.OnClickListener {
            if (info.text.isNotEmpty()) {
                var text : String = info.text.toString()
                val itmatch = Intent(this, SecondActivity::class.java).apply { putExtra("info", text) }
                startActivity(itmatch)
            }
        })
    }
}