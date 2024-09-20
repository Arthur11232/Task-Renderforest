package com.alexandryan.userinfo.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alexandryan.userinfo.R
import com.alexandryan.userinfo.presentation.navigation.NavigationFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.container, NavigationFragment(), NavigationFragment::class.java.simpleName).commit()
    }
}