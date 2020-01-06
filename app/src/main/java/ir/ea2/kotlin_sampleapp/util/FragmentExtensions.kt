package ir.ea2.kotlin_sampleapp.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import ir.ea2.kotlin_sampleapp.HomeFragment

fun FragmentActivity.replaceFragment(container:Int, fragment:Fragment) {
    supportFragmentManager.beginTransaction().replace(container,fragment).commit()
}