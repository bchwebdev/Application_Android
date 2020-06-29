package com.example.dip.ui.tp3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dip.R

class Tp3Fragment : Fragment() {

    companion object {
        fun newInstance() = Tp3Fragment()
    }

    private lateinit var viewModel: Tp3ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.tp3_fragment, container, false)
    }


}
