package com.alexandryan.userinfo.presentation.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.alexandryan.userinfo.presentation.user_favorites.FavoriteUsersFragment
import com.alexandryan.userinfo.presentation.users.UserListFragment

class NavigationAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment = when(position){
        0 -> UserListFragment()
        else -> FavoriteUsersFragment()
    }
}