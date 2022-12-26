package com.superking.parchi.aaaaaactiv

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.google.android.material.snackbar.Snackbar
import com.orhanobut.hawk.Hawk
import com.superking.parchi.R
import com.superking.parchi.ooooootger.AppleClasa
import com.superking.parchi.ooooootger.AppleClasa.Companion.checkfrr
import com.superking.parchi.ooooootger.AppleClasa.Companion.hyhyMAIN_IDffrr
import com.superking.parchi.ooootheer2.FiiikiClasssasssssssss
import com.superking.parchi.ooootheer2.Meeeeeeeeeeeeeeee
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class FilliOneActivity : AppCompatActivity() {

    val testyyy = "tttttttttttttt"

    private fun bgbgbgbggb(): String? {
        val restCheckftgt: String? = Hawk.get(checkfrr)
        Log.d("lolo", "checker ${restCheckftgt}")
        return restCheckftgt
    }

    private fun juujujkiikikik() {
        val intent = Intent(this@FilliOneActivity, GaamarattooActivity::class.java)
        Hawk.put(AppleClasa.gthygeomeo, null)
        Hawk.put(AppleClasa.hnnhnhnhhn, null)
        Hawk.put(checkfrr, null)
        startActivity(intent)
        finish()
    }

    private fun checkCountry() {

        val check = bgbgbgbggb()

        if (check == "0") {
            juujujkiikikik()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                hyhyhy()
            }
            gthyyy()
        }
    }

    private fun hyhyhy() {
        val adInfo = AdvertisingIdClient(applicationContext)
        adInfo.start()
        val adIdInfo = adInfo.info.id
        Hawk.put(hyhyMAIN_IDffrr, adIdInfo)
    }

    private fun gthyyy() {
        val intentfrfr = Intent(this@FilliOneActivity, FiiliTvoooActivity::class.java)
        startActivity(intentfrfr)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filli_one)
        checkCountry()

        if (testyyy == "fiifififi"){
            val meeeeeeeeeeeeeeee = Meeeeeeeeeeeeeeee(this)
            Log.d("gttgttg", "gtgtgtt ${meeeeeeeeeeeeeeee.displayMessage(5)}")

            FiiikiClasssasssssssss(ccooooontext = this).also {
                it.prrrrrrint()
            }
        }
    }




}