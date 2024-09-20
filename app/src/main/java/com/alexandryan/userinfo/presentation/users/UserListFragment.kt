package com.alexandryan.userinfo.presentation.users

import androidx.fragment.app.viewModels
import com.alexandryan.userinfo.presentation.base.BaseFragment
import com.alexandryan.userinfo.databinding.FragmentUserListBinding
import com.alexandryan.userinfo.model.viewmodel.UserViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserListFragment: BaseFragment<FragmentUserListBinding>() {
    private val viewModel: UserViewModel by viewModels()
}