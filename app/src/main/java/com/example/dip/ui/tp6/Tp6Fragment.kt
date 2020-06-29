package com.example.dip.ui.tp6

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dip.R

class Tp6Fragment : Fragment() {

    companion object {
        fun newInstance() = Tp6Fragment()
    }

    private lateinit var viewModel: Tp6ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.tp6_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Tp6ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
