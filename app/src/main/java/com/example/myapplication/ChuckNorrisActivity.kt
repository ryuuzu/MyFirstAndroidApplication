package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.retrofitobjects.JokeAPI
import com.example.myapplication.retrofitobjects.RetrofitHelper
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ChuckNorrisActivity : AppCompatActivity() {
    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chuch_norris)

        val jokeAPI = RetrofitHelper.getInstance().create(JokeAPI::class.java)

        GlobalScope.launch {
            val result = jokeAPI.getJoke()
            Log.d("API Log: ", result.body().toString())
        }
    }
}