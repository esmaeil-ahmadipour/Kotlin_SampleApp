package ir.ea2.kotlin_sampleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ir.ea2.kotlin_sampleapp.util.replaceFragment
import ir.ea2.kotlin_sampleapp.util.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializer()
        replaceFragment(R.id.fragment_container,HomeFragment.newInstance())
        setupBottomNavigation()

    }

    private fun initializer() {
        //Toolbar : Set & Config
        ac_main_toolbar.title = resources.getString(R.string.app_name)
        setSupportActionBar(ac_main_toolbar)

    }

    private fun setupBottomNavigation() {
        menu_bottom_Navigation.setOnNavigationItemSelectedListener {
            var result: Boolean = when (it.itemId) {
                R.id.ic_home -> {
                    replaceFragment(R.id.fragment_container,HomeFragment.newInstance())
                    true
                }
                R.id.ic_profile -> {
                    replaceFragment(R.id.fragment_container,ProfileFragment.newInstance())
                    true
                }
                R.id.ic_search -> {
                    replaceFragment(R.id.fragment_container,SearchFragment.newInstance())
                    true
                }
                else -> false
            }
            result
        }

    }

}