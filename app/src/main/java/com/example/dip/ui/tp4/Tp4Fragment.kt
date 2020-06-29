package com.example.dip.ui.tp4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dip.R

class Tp4Fragment : Fragment() {

    companion object {
        fun newInstance() = Tp4Fragment()
    }

    private lateinit var viewModel: Tp4ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.tp4_fragment, container, false)
    }


}
