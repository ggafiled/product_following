package com.example.productfollowing

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ismaeldivita.chipnavigation.ChipNavigationBar

class MainActivity : AppCompatActivity() {

    private var bottomNavigation: ChipNavigationBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigation = findViewById(R.id.bottom_navigation)
        bottomNavigation?.setMenuOrientation(ChipNavigationBar.MenuOrientation.HORIZONTAL)
        bottomNavigation?.setMenuResource(R.menu.main_toolbar_menu)
        bottomNavigation?.setOnItemSelectedListener {
            when (it) {
                R.id.action_home -> {
                    loadFragment(HomeFragment())
                }
                R.id.action_favorites -> {
                    loadFragment(FavoritiesFragment())
                }
                R.id.action_me -> {
                    loadFragment(MeFragment())
                }
                R.id.action_activity -> {
                    loadFragment(ActivitiesFragment())
                }
            }
        }
        loadFragment(HomeFragment())

    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
