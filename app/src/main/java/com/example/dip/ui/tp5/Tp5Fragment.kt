package com.example.dip.ui.tp5

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dip.R

class Tp5Fragment : Fragment() {

    companion object {
        fun newInstance() = Tp5Fragment()
    }

    private lateinit var viewModel: Tp5ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.tp5_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Tp5ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
