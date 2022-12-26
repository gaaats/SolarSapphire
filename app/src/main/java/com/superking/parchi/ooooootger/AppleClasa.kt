package com.superking.parchi.ooooootger

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class AppleClasa : Application() {
    companion object {
        const val loololol = "89d5d0ef-90a8-4293-a296-dae102614afe"
        var checkfrr = "appsChecker"
        var gthygeomeo = "geo"
        var c1gttg: String? = "c11"
        var kiikikikki = "link"
        var hyhyMAIN_IDffrr: String? = "mainid"
        var hyyDEEPLfrfr: String? = "d11"
        var hnnhnhnhhn: String? = "countryCode"

    }

    override fun onCreate() {
        super.onCreate()
        ggtgtjgtgtjigtji()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(loololol)
        gttggtgtgt()
    }

    private fun ggtgtjgtgtjigtji() {
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
    }

    private fun gttggtgtgt() {
        Hawk.init(this).build()
    }
}
