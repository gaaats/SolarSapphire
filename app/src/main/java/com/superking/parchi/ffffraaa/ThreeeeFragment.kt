package com.superking.parchi.ffffraaa

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.superking.parchi.R
import com.superking.parchi.databinding.FragmentThreeeeBinding
import com.superking.parchi.ooootheer2.SlotListAdapterrrrrrr
import com.superking.parchi.ooootheer2.oo1o1.SlotElement
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random


class ThreeeeFragment : Fragment() {
    private val hhyhy = SlotListAdapterrrrrrr()
    private val hhyyh = SlotListAdapterrrrrrr()
    private fun vccccf() {
        frgttgyhy5.btnImgExittttttMoney.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }

    private val ftgtgtg = SlotListAdapterrrrrrr()


    val test = "gtgtgttggt"
    val f8 = "sasffrgtgtgtrffr"
    val f1 = "sasffrrffr"
    val f3 = "sasffgtgttggtrrffr"
    val f4 = "sasfrgtffrrffr"
    val f5 = "sasffrgttgrffr"
    private var frgyhyjuji: FragmentThreeeeBinding? = null
    val f9 = "sasffrrffr"
    val f6 = "sasffgtgtrrffr"
    val f7 = "sasffrrffr"

    val res = f1 + f3 + f4 + f5 + f6 + f7 + f8 + f9




    private val rftgyhyhyy = juujujujju()
    private val frgttgyhy5
        get() = frgyhyjuji ?: throw RuntimeException("FragmentThreeeeBinding = null")

    private var tgtgtgt5 = 300

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        frgyhyjuji = FragmentThreeeeBinding.inflate(inflater, container, false)
        return frgttgyhy5.root
    }


    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        if (test == "gtgtgtgtgttgthjujikkkiigtgt") {
            hhhhhhhhhgttfffdd()
        }

        frgttgyhy5.root.background.alpha = 230

        bgvvv()

        gtjigtjtgjjgtjigt()


        vccccf()
        val manager = frgttgyhy5.recVRight.layoutManager as LinearLayoutManager
        val layoutManager =
            frgttgyhy5.recVLeft.layoutManager as LinearLayoutManager
        val hyyhhyhyhyyhyh =
            frgttgyhy5.recVCenter.layoutManager as LinearLayoutManager


        disableScrollingRecVeivs()
        recV()
        submitListsForRecV()

        gtuhgtgthgtddhdgdgd(
            layoutManager,
            hyyhhyhyhyyhyh,
            manager
        )
        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtuhgtgthgtddhdgdgd(
        linearLayoutManagerLeftdferfgtghyt: LinearLayoutManager,
        linearLayoutManagerCenterrrrrrrr: LinearLayoutManager,
        frgthyhyhyyh: LinearLayoutManager
    ) {
        gtgththghffhfnv(
            linearLayoutManagerLeftdferfgtghyt,
            linearLayoutManagerCenterrrrrrrr,
            frgthyhyhyyh
        )
    }

    private fun hhhhhhhhhgttfffdd() {
        Snackbar.make(
            frgttgyhy5.root,
            "You win $res points",
            Snackbar.LENGTH_LONG
        ).show()
    }



    private fun gtgththghffhfnv(
        linearLayoutManagerLeftdferfgtghyt: LinearLayoutManager,
        linearLayoutManagerCenterrrrrrrr: LinearLayoutManager,
        frgthyhyhyyh: LinearLayoutManager
    ) {
        frgttgyhy5.btnGoSpin.setOnClickListener {
            // just change time of each scrolling recViev for better performance
            slotMachine(linearLayoutManagerLeftdferfgtghyt, 8, 12)
            slotMachine(linearLayoutManagerCenterrrrrrrr, 12, 18)
            slotMachine(frgthyhyhyyh, 20, 27)
        }
    }


    private fun bgvvv() {
        frgttgyhy5.tvUserBetCountMoney.text = tgtgtgt5.toString()
    }



    private fun gtjigtjtgjjgtjigt() {
        frgttgyhy5.btnImgPlusMoney.setOnClickListener {
            tgtgtgt5 += 100
            frgttgyhy5.tvUserBetCountMoney.text = tgtgtgt5.toString()
        }
        frgttgyhy5.btnImgMinusMoney.setOnClickListener {
            if (tgtgtgt5 >= 100) tgtgtgt5 -= 100
            frgttgyhy5.tvUserBetCountMoney.text = tgtgtgt5.toString()
        }
    }


    private fun submitListsForRecV() {
        hhyhy.submitList(frgtghyhyhyhhy())
        hhyyh.submitList(frgtghyhyhyhhy())
        ftgtgtg.submitList(frgtghyhyhyhhy())
    }

    override fun onDestroy() {
        frgyhyjuji = null
        super.onDestroy()
    }


    @SuppressLint("ClickableViewAccessibility")
    private fun disableScrollingRecVeivs() {
        frgttgyhy5.recVLeft.setOnTouchListener { _, _ -> true }
        frgttgyhy5.recVRight.setOnTouchListener { _, _ -> true }
        frgttgyhy5.recVCenter.setOnTouchListener { _, _ -> true }
    }

    private fun slotMachine(
        linearLayoutManager: LinearLayoutManager,
        minNumberScrolling: Int,
        maxNumberScrolling: Int
    ) {
        lifecycleScope.launch {
            val topdrfgtgtgt = Random.nextInt(minNumberScrolling, maxNumberScrolling)
            var gtgtgtgttggtgt = 100L
            for (i in 1..topdrfgtgtgt) {
                linearLayoutManager.scrollToPositionWithOffset(i, 0)
                delay(gtgtgtgttggtgt)
                gtgtgtgttggtgt += 5
            }
            if (maxNumberScrolling == 27) {
                gktkgtktkgtkogt()
            }
        }
    }

    private fun gktkgtktkgtkogt() {
        Snackbar.make(
            frgttgyhy5.root,
            "${bingo()}. You spin ${Random.nextInt(from = 300, until = 5000)} points",
            Snackbar.LENGTH_LONG
        ).show()
    }


    private fun recV() {
        frgttgyhy5.recVLeft.adapter = hhyhy
        frgttgyhy5.recVCenter.adapter = ftgtgtg
        frgttgyhy5.recVRight.adapter = hhyyh

    }



    private fun frgtghyhyhyhhy(): List<SlotElement> {
        val slotElements = mutableListOf<SlotElement>()
        for (i in 1..50) {
            slotElements.add(
                SlotElement(
                    Random.nextInt(until = Int.MAX_VALUE),
                    rftgyhyhyy.random(),
                )
            )
        }
        return slotElements
    }

    private fun bingo(): String {
        return listOf(
            "Bingo",
            "Jackpot",
            "Red line",
            "Jombo",
            "Cosmo Combo",
        ).shuffled().random()
    }

    private fun juujujujju(): List<Int> {
        return listOf(
            R.drawable.el1,
            R.drawable.el2,
            R.drawable.el3,
            R.drawable.el4,
            R.drawable.el5,
        )
    }


}