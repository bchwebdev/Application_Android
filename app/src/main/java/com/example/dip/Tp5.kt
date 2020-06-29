package com.example.dip

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.dip.ui.FragmentBottomNavBar.HomeFragment
import com.example.dip.ui.FragmentBottomNavBar.PlaneFragment
import com.example.dip.ui.FragmentBottomNavBar.TaxiFragment
import kotlinx.android.synthetic.main.tp5_fragment.*

class Tp5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tp5_fragment)

        var sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)

        val homeFragment = HomeFragment()
        val planeFragment = PlaneFragment()
        val taxiFragment = TaxiFragment()

        var SavedString = sharedPreferences.getString("STRING_KEY",null)

        if(sharedPreferences.getString("STRING_KEY",null).equals(null)){
            makeCurrentFragment(homeFragment)
        }else if(sharedPreferences.getString("STRING_KEY",null).equals("home")){
            makeCurrentFragment(homeFragment)
        }else if(sharedPreferences.getString("STRING_KEY",null).equals("plane")){
            makeCurrentFragment(planeFragment)
        }else if(sharedPreferences.getString("STRING_KEY",null).equals("taxi")){
            makeCurrentFragment(taxiFragment)
        }

        val editor = sharedPreferences.edit()
        nbtp5.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.navigation_home -> {
                    makeCurrentFragment(homeFragment)
                     editor.apply{
                        putString("STRING_KEY","home")
                    }.apply()
                }
                R.id.navigation_dashboard -> {
                    makeCurrentFragment(planeFragment)
                    editor.apply{
                        putString("STRING_KEY","plane")
                    }.apply()
                }
                R.id.navigation_notifications -> {
                    makeCurrentFragment(taxiFragment)
                    editor.apply{
                        putString("STRING_KEY","taxi")
                    }.apply()
                }
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fltp5, fragment)
            commit()
        }
}
