package com.zawhtetnaing.barcampdemo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zawhtetnaing.barcampdemo.R

class DemoOneFragment : Fragment() {

    companion object{
        fun newFragment() : DemoOneFragment{
            return DemoOneFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_demo_one, container, false)
        return view
    }
}