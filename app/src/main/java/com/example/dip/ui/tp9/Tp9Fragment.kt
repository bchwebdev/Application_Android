package com.example.dip.ui.tp9

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dip.R

class Tp9Fragment : Fragment() {

    companion object {
        fun newInstance() = Tp9Fragment()
    }

    private lateinit var viewModel: Tp9ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.tp9_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Tp9ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
