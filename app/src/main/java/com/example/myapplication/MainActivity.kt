package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // thinhvh
        var a=10

        var b=20

        //xử lý đăng nhập
        xulydangnhap()
    }

    fun xulydangnhap(){
        Log.d("thinh", "xulydangnhap: ")
    }
}