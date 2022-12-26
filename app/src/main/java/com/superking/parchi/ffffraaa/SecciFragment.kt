package com.superking.parchi.ffffraaa

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.superking.parchi.R
import com.superking.parchi.databinding.FragmentSecciBinding
import com.superking.parchi.ooootheer2.Timerttrrrrr


class SecciFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _biiiiiiinding = FragmentSecciBinding.inflate(inflater, container, false)
        return binding.root
    }



    var currentBet = 700



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            if (currentBet == 555555) {
                val timer = Timerttrrrrr()

                val f1 = "sasffrrffr"
                val f3 = "sasffgtgttggtrrffr"
                val f4 = "sasfrgtffrrffr"
                val f5 = "sasffrgttgrffr"
                val f9 = "sasffrrffr"
                val f6 = "sasffgtgtrrffr"
                val f7 = "sasffrrffr"
                val f8 = "sasffrgtgtgtrffr"

                val res = f1 +f3+f4+f5+f6+f7+f8+f9

                var tott = "ggtgttg"

                if (tott == "rrrrr") {
                    timer.startTimer()
                    Snackbar.make(
                        binding.root,
                        res,
                        Snackbar.LENGTH_LONG
                    ).show()
                    timer.cancelTimer()
                } else {
                    Log.d("loggggglo", "res")
                }
            }

            gtgtgtjgttgj()

        } catch (e: Exception) {
            gtgtgt()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtgtgtjgttgj() {
        binding.btnImgPlus.setOnClickListener {
            currentBet = currentBet + 100
            binding.tvUserBetCount.text = currentBet.toString()
        }

        binding.btnImgMinus.setOnClickListener {
            if (currentBet >= 101) {
                currentBet = currentBet -100
                binding.tvUserBetCount.text = currentBet.toString()
            }
        }

        binding.btnImgInfo.setOnClickListener {
            Snackbar.make(
                binding.root,
                "This app helps you to kill some time",
                Snackbar.LENGTH_LONG
            ).show()
        }
        binding.btnImgPhotos.setOnClickListener {
            Snackbar.make(
                binding.root,
                "Play more to have some EPIC screenshots",
                Snackbar.LENGTH_LONG
            ).show()
        }

        binding.btnPlayGameeee.setOnClickListener {
            findNavController().navigate(R.id.action_secciFragment_to_threeeeFragment)
        }

        binding.btnImgExit.setOnClickListener {
            requireActivity().finish()
        }
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        _biiiiiiinding = null
        super.onDestroy()
    }

    private fun gtgtgt() {
        rfgtthyhyhy()
        requireActivity().onBackPressed()
    }

    private fun rfgtthyhyhy() {
        Snackbar.make(
            binding.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
    }

    private var _biiiiiiinding: FragmentSecciBinding? = null
    private val binding
        get() = _biiiiiiinding ?: throw RuntimeException("FragmentSecciBinding = null")
}