package com.zawhtetnaing.barcampdemo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentStatePagerAdapter
import com.zawhtetnaing.barcampdemo.R
import com.zawhtetnaing.barcampdemo.adapters.DemoPagerAdapter
import kotlinx.android.synthetic.main.activity_tab_layout_demo.*

class TabLayoutDemoActivity : AppCompatActivity() {

    private lateinit var mPagerAdapter : DemoPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout_demo)

        mPagerAdapter = DemoPagerAdapter(supportFragmentManager)
        viewPager.adapter = mPagerAdapter

        tabLayout.setupWithViewPager(viewPager)
    }
}
