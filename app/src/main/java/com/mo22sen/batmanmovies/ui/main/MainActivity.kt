package com.mo22sen.batmanmovies.ui.main

import com.mo22sen.batmanmovies.R
import com.mo22sen.batmanmovies.base.BaseActivity
import com.mo22sen.batmanmovies.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>() {

    override val viewModel: MainViewModel by viewModel()

    override val layoutRes: Int = R.layout.activity_main

    override val navigationId: Int = R.id.main_navigation

    override fun configEvents() {
    }

    override fun bindObservables() {
    }

    override fun initBinding() {
        binding.apply {
            lifecycleOwner = this@MainActivity
            vm = viewModel
            executePendingBindings()
        }
    }

}
