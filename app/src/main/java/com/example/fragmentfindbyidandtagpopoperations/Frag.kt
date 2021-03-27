package com.example.fragmentfindbyidandtagpopoperations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class Frag : Fragment() {
    lateinit var title: TextView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.frag, container, false)
        title = view.findViewById(R.id.title)
        var msg = this.arguments?.getString("msg")
        title.text = msg
        return view
    }

    /*fun update(count: Int) {
        title.text = count.toString()
    }*/
}