package com.example.fragmentfindbyidandtagpopoperations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    lateinit var fragManager: FragmentManager
     var count: Int =1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragManager = supportFragmentManager
        var frame: LinearLayout = findViewById(R.id.frame)
        var btn: Button = findViewById(R.id.btn)
        btn.setOnClickListener {
            addFragment(count)
            count++
        }
    }
    private fun addFragment(count:Int)
    {
        var bundle = Bundle()
        bundle.putString("msg",count.toString())
        var frag = Frag()
        frag.arguments = bundle
        var fragTransaction : FragmentTransaction= fragManager.beginTransaction()
        fragTransaction.add(R.id.frame,frag)
        //frag.update(count)
        fragTransaction.commit()
        fragTransaction.addToBackStack(null)
    }
}