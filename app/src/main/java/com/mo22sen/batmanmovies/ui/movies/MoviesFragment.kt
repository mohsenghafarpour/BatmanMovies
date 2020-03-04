package com.mo22sen.batmanmovies.ui.movies

import com.mo22sen.batmanmovies.R
import com.mo22sen.batmanmovies.base.BaseFragment
import com.mo22sen.batmanmovies.databinding.FragmentMoviesBinding
import kotlinx.android.synthetic.main.fragment_movies.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MoviesFragment : BaseFragment<MoviesViewModel, FragmentMoviesBinding>() {

    override val viewModel: MoviesViewModel by viewModel()
    private val adapter: MoviesAdapter by inject()

    override val layoutRes: Int = R.layout.fragment_movies

    override fun configEvents() {
        list_movie.adapter = adapter
        adapter.onItemClicked = { item, _ ->
            viewModel.openDetailsMovie(item)
        }
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