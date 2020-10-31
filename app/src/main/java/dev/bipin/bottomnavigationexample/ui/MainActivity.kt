package dev.bipin.bottomnavigationexample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import dev.bipin.bottomnavigationexample.R
import dev.bipin.bottomnavigationexample.setupWithNavController


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            setupBottomNavigationBar()
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        setupBottomNavigationBar()
    }

    private fun setupBottomNavigationBar() {
        val navGraphIds = listOf(
                R.navigation.nav_graph_home,
                R.navigation.nav_graph_search,
                R.navigation.nav_graph_create_post,
                R.navigation.nav_graph_notification,
                R.navigation.nav_graph_profile
        )

        // Setup the bottom navigation view with a list of navigation graphs
        findViewById<BottomNavigationView>(R.id.bottomNavigationView).setupWithNavController(
                navGraphIds = navGraphIds,
                containerId = R.id.fragmentContainerView,
                fragmentManager = supportFragmentManager,
                intent = intent
        )
    }

}
