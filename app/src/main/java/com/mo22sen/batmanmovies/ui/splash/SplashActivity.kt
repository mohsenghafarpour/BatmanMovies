package com.mo22sen.batmanmovies.ui.splash

import com.mo22sen.batmanmovies.R
import com.mo22sen.batmanmovies.base.BaseActivity
import com.mo22sen.batmanmovies.databinding.ActivitySplashBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashActivity : BaseActivity<SplashViewModel, ActivitySplashBinding>() {

    override val viewModel: SplashViewModel by viewModel()

    override val layoutRes: Int = R.layout.activity_splash

    override val navigationId: Int = R.id.splash_navigation


    override fun configEvents() {

    }

    override fun bindObservables() {

    }

    override fun initBinding() {
        binding.apply {
            lifecycleOwner = this@SplashActivity
            vm = viewModel
            executePendingBindings()
        }

    }

}