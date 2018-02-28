package com.magicsoft.kiwihotfit

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.taobao.sophix.SophixManager

class MainActivity : AppCompatActivity() {
    val TAG = "MMM"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //
    }


    fun startRefresh(view: View){
        Log.e(TAG, "onCreate: 方法一" )
        SophixManager.getInstance().queryAndLoadNewPatch();
    }
}
