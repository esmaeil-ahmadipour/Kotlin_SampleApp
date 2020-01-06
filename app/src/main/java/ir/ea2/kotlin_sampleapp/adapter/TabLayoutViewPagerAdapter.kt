package ir.ea2.kotlin_sampleapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import ir.ea2.kotlin_sampleapp.UserListFragment

class TabLayoutViewPagerAdapter(fragmentManager: FragmentManager) :FragmentPagerAdapter(fragmentManager){
    private val tabTitles= arrayOf("Man","Woman")
    override fun getItem(position: Int): Fragment =UserListFragment.newInstance()

    override fun getCount(): Int = tabTitles.size
    override fun getPageTitle(position: Int): CharSequence? =tabTitles[position]
}