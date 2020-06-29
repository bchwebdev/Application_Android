package com.example.dip.ui.tp7

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dip.R

class Tp7Fragment : Fragment() {

    companion object {
        fun newInstance() = Tp7Fragment()
    }

    private lateinit var viewModel: Tp7ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.tp7_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Tp7ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
