package com.alexandryan.userinfo.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import dagger.hilt.android.AndroidEntryPoint
import java.lang.reflect.ParameterizedType

abstract class BaseFragment<B : ViewBinding> : Fragment() {
    protected lateinit var binding: B

    open fun createBinding(): Class<B> {
        return (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] as Class<B>
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val method = createBinding().getMethod("inflate", LayoutInflater::class.java)
        binding = method.invoke(null, inflater) as B
        binding.root.isClickable = true
        binding.root.isFocusable = true
        return binding.root
    }
}