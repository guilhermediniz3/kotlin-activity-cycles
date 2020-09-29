package com.example.randomicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity() : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonRandom.setOnClickListener(this)
        textNumber.setOnClickListener(this)
        Toast.makeText(getApplicationContext(),"onCreate", Toast.LENGTH_SHORT ).show();
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.buttonRandom || v?.id == R.id.textNumber){
     textNumber.text = random().toString()
    }
     }
        fun random():Int{

            return  Random.nextInt(50)+1
        }



    override fun onStart() {
        super.onStart()
        Toast.makeText(getApplicationContext(),"onStart", Toast.LENGTH_SHORT ).show();
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(getApplicationContext(),"onRestart", Toast.LENGTH_SHORT ).show();
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(getApplicationContext(),"onResume", Toast.LENGTH_SHORT ).show();
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(getApplicationContext(),"onPause", Toast.LENGTH_SHORT ).show();
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(getApplicationContext(),"onStop", Toast.LENGTH_SHORT ).show();
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(getApplicationContext(),"onDestroy", Toast.LENGTH_SHORT ).show();
    }
}


