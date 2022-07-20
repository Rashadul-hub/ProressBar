package com.example.proressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.proressbar.utel.LoadingDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** NOW CALL THE LOADING CLASS */

        val loading = LoadingDialog(this)
        loading.startLoading()
        val handler = Handler()
        handler.postDelayed(object : Runnable {
            override fun run() {
                loading.isDismiss()
            }
        },5000)
    }

    /** NOW RUN IT `*/

}