package com.alexandryan.userinfo.presentation.navigation

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.activity.OnBackPressedCallback
import com.alexandryan.userinfo.R
import com.alexandryan.userinfo.databinding.FragmentNavigationBinding
import com.alexandryan.userinfo.presentation.adapters.NavigationAdapter
import com.alexandryan.userinfo.presentation.base.BaseFragment
import com.alexandryan.userinfo.utils.selected

class NavigationFragment : BaseFragment<FragmentNavigationBinding>() {

    private val backPressDispatcher = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            val currentItem = binding.appPager.currentItem
            managePager(currentItem)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner, backPressDispatcher)
        initViewPager()
        initBottomNavigation()
    }

    private fun initViewPager() = binding.run {
        appPager.apply {
            isUserInputEnabled = false
            adapter = NavigationAdapter(this@NavigationFragment)
            selected { position -> appBottomNavigation.selectedItemId = getItemId(position) }
        }
    }

    private fun initBottomNavigation() = binding.run {
        appBottomNavigation.setOnItemSelectedListener { itemMenu ->
            handleBottomMenuItemSelected(itemMenu)
        }
    }

    private fun handleBottomMenuItemSelected(itemMenu: MenuItem): Boolean {
        selectViewPager(getItemIdPosition(itemMenu.itemId))
        return true
    }

    private fun getItemId(it: Int) = when (it) {
        0 -> R.id.users
        else -> R.id.favorites
    }

    private fun getItemIdPosition(item: Int) = when (item) {
        R.id.users -> 0
        else -> 1
    }

    private fun selectViewPager(position: Int): Boolean {
        binding.appPager.setCurrentItem(position, false)
        return true
    }

    private fun managePager(currentItem: Int) = if (currentItem == 0) {
        activity?.finish()
    } else binding.appPager.setCurrentItem(0, false)
}