package com.example.proressbar.utel

import android.app.Activity
import android.app.AlertDialog
import androidx.activity.R

/** First We Create Loading Class Dialog**/

class LoadingDialog(val mActivity : Activity) {

    private lateinit var isdialog: AlertDialog
    fun startLoading(){
        /** Set View*/
        val infalter = mActivity.layoutInflater
        val dialogView = infalter.inflate(com.example.proressbar.R.layout.loading_item, null )

        /**Set Dialog*/
        val builder = AlertDialog.Builder(mActivity)
        builder.setView(dialogView)
        builder.setCancelable(false)
        isdialog = builder.create()
        isdialog.show()


    }

    fun isDismiss(){
        isdialog.dismiss()
    }
}