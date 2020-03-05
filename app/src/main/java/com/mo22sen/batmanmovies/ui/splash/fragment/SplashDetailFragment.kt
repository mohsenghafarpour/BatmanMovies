package com.mo22sen.batmanmovies.ui.splash.fragment

import com.mo22sen.batmanmovies.R
import com.mo22sen.batmanmovies.base.BaseFragment
import com.mo22sen.batmanmovies.databinding.FragmentSplashDetailBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashDetailFragment : BaseFragment<SplashDetailViewModel, FragmentSplashDetailBinding>() {

    override val viewModel: SplashDetailViewModel by viewModel()

    override val layoutRes: Int = R.layout.fragment_splash_detail

    override fun configEvents() {
        viewModel.checkDestination()
    }

    override fun bindObservables() {

    }

    override fun initBinding() {
        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            vm = viewModel
            executePendingBindings()
        }
    }

}