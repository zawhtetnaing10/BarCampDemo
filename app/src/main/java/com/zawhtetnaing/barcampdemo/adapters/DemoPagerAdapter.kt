package com.zawhtetnaing.barcampdemo.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.zawhtetnaing.barcampdemo.fragments.DemoOneFragment
import com.zawhtetnaing.barcampdemo.fragments.DemoTwoFragment

class DemoPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> DemoOneFragment.newFragment()
            else -> DemoTwoFragment.newFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Demo One"
            else -> "Demo Two"
        }
    }
}