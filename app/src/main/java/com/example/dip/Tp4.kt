package com.example.dip

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.dip.ui.FragmentBottomNavBar.HomeFragment
import com.example.dip.ui.FragmentBottomNavBar.PlaneFragment
import com.example.dip.ui.FragmentBottomNavBar.TaxiFragment
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import kotlinx.android.synthetic.main.tp4_fragment.*

class Tp4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tp4_fragment)

        val homeFragment = HomeFragment()
        val planeFragment = PlaneFragment()
        val taxiFragment = TaxiFragment()
        makeCurrentFragment(homeFragment)
        nbtp4.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.navigation_home -> makeCurrentFragment(homeFragment)
                R.id.navigation_dashboard -> makeCurrentFragment(planeFragment)
                R.id.navigation_notifications -> makeCurrentFragment(taxiFragment)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fltp4, fragment)
            commit()
        }
}
