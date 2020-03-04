package com.mo22sen.batmanmovies.ui.movies

import com.mo22sen.batmanmovies.R
import com.mo22sen.batmanmovies.base.BaseFragment
import com.mo22sen.batmanmovies.databinding.FragmentMoviesBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MoviesFragment : BaseFragment<MoviesViewModel, FragmentMoviesBinding>() {

    override val viewModel: MoviesViewModel by viewModel()

    override val layoutRes: Int = R.layout.fragment_movies

    override fun configEvents() {
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