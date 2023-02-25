package com.example.m1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.TextView

import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {
      lateinit var mainViewModel:MainViewModel
     // lateinit var buinding:ActivityMainBinding
      lateinit var textView: TextView
      lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView=findViewById(R.id.text)
       button=findViewById(R.id.button)
      //  ViewModelProvider(this,MainViewModelFactory(10,10))[MainViewModel::class.java]
       // buinding=DataBindingUtil.setContentView(this, R.layout.activity_main)
       mainViewModel=ViewModelProvider(this)[MainViewModel::class.java]

        button.setOnClickListener{
            mainViewModel.add()
            setText()
        }
        
    }
    private fun setText(){
       textView.text=mainViewModel.sum.toString()
      //  buinding.text.text=mainViewModel.sum.toString()
    }

}


