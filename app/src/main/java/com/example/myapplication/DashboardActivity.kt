package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val affirmationBtn = findViewById<Button>(R.id.affirmationsBtn)
        affirmationBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                val intent = Intent(this@DashboardActivity, AffirmationActivity::class.java)
                startActivity(intent)
            }
        })
        findViewById<Button>(R.id.chuckJokeBtn).setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                val intent = Intent(this@DashboardActivity, ChuckNorrisActivity::class.java)
                startActivity(intent)
            }
        })
    }
}