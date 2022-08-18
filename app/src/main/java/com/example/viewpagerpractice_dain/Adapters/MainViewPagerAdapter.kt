package com.example.viewpagerpractice_dain.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpagerpractice_dain.fragments.GreetingsFragment
import com.example.viewpagerpractice_dain.fragments.MyinfoFragment
import com.example.viewpagerpractice_dain.fragments.NameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return NameFragment()
        }
        else if (position == 1) {
            return MyinfoFragment()
        }
        else {

        return GreetingsFragment()
        }
    }
}