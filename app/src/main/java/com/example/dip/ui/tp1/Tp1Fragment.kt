package com.example.dip.ui.tp1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dip.R

class Tp1Fragment : Fragment() {

    companion object {
        fun newInstance() = Tp1Fragment()
    }

    private lateinit var viewModel: Tp1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.tp1_fragment, container, false)
    }


}
