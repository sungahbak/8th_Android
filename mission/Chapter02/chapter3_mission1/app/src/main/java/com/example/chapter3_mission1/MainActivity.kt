package com.example.chapter3_mission1

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 첫 화면 기본 프래그 먼트
        replaceFragment(HomeFragment(), "fade")

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> replaceFragment(HomeFragment(), "fade")
                R.id.nav_write -> replaceFragment(WriteFragment(), "slide")
                R.id.nav_calendar -> replaceFragment(CalendarFragment(), "fade")
                R.id.nav_profile -> replaceFragment(ProfileFragment(), "slide")
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment, animationType: String) {
        val transaction = supportFragmentManager.beginTransaction()

        when (animationType) {
            "fade" -> transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
            "slide" -> transaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }
}
