package com.mo22sen.batmanmovies.ui.details

import androidx.navigation.fragment.navArgs
import com.mo22sen.batmanmovies.R
import com.mo22sen.batmanmovies.base.BaseFragment
import com.mo22sen.batmanmovies.databinding.FragmentDetailBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailFragment : BaseFragment<DetailViewModel, FragmentDetailBinding>() {

    override val viewModel: DetailViewModel by viewModel()
    private val args: DetailFragmentArgs by navArgs()
    override val layoutRes: Int = R.layout.fragment_detail

    override fun configEvents() {
        viewModel.setData(args.data)
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