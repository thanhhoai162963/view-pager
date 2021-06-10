package com.example.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

@Suppress("DEPRECATION")
class Adapter(private val fm: FragmentManager, private val behavior: Int) :
    FragmentStatePagerAdapter(fm, behavior) {
    private val mFragmentList = arrayListOf<Fragment>()
    private val titleList = arrayListOf<String>()
    override fun getCount(): Int {
        mFragmentList.size
    }

    override fun getItem(position: Int): Fragment {
        return mFragmentList[position]
    }


}