package com.storm.stormlibdemo


import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.storm.storm_test_lib.utils.GsonUtils

import com.storm.stormlibdemo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    companion object{
        val TAG = "MainActivity"
    }
    lateinit var mBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        var json = "{\n" +
                "    \"name\": \"zhang\",\n" +
                "    \"sex\": \" 男\",\n" +
                "    \"score\": 100\n" +
                "}"
      var  student =  GsonUtils.insance.formJson(json,  Student::class.java)

        mBinding.tvName.text = student.name.toString()

    }
}


