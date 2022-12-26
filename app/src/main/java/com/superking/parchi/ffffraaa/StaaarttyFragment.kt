package com.superking.parchi.ffffraaa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.superking.parchi.R
import com.superking.parchi.databinding.FragmentStaaarttyBinding


class StaaarttyFragment : Fragment() {


    private var soskagtgtgt: FragmentStaaarttyBinding? = null
    private val fragmentStaaarttyBinding get() = soskagtgtgt ?: throw RuntimeException("FragmentStaaarttyBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        soskagtgtgt = FragmentStaaarttyBinding.inflate(inflater, container, false)
        return fragmentStaaarttyBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            hyjhyjyhhy()

        } catch (e: Exception) {
            hyhhyhyyhkk()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun hyjhyjyhhy() {
        fragmentStaaarttyBinding.btnPlayGameeee.setOnClickListener {
            findNavController().navigate(R.id.action_staaarttyFragment_to_secciFragment)
        }
    }

    private fun hyhhyhyyhkk() {
        Snackbar.make(
            fragmentStaaarttyBinding.root,
            "Error 505...reloading...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onDestroy() {
        soskagtgtgt = null
        super.onDestroy()
    }

}