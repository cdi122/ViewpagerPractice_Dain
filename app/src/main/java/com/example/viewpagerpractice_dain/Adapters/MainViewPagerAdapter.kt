package com.example.viewpagerpractice_dain.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpagerpractice_dain.fragments.GreetingsFragment
import com.example.viewpagerpractice_dain.fragments.MyinfoFragment
import com.example.viewpagerpractice_dain.fragments.NameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "이름"
            1 -> "내 정보"
            else -> "인사말"
        }

    }

    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> NameFragment()
            1 -> MyinfoFragment()
            else -> GreetingsFragment()
        }
    }
    override fun getCount(): Int {
        return 3
    }
}