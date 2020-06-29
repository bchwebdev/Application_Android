package com.example.dip.ui.tp2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dip.R

class Tp2Fragment : Fragment() {

    companion object {
        fun newInstance() = Tp2Fragment()
    }

    private lateinit var viewModel: Tp2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.tp2_fragment, container, false)
    }



}
