package com.superking.parchi.aaaaaactiv

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import com.superking.parchi.R
import com.superking.parchi.databinding.ActivityOpennUriBinding
import com.superking.parchi.ooooootger.AppleClasa.Companion.c1gttg
import com.superking.parchi.ooooootger.AppleClasa.Companion.hyhyMAIN_IDffrr
import com.superking.parchi.ooooootger.AppleClasa.Companion.hyyDEEPLfrfr
import com.superking.parchi.ooooootger.AppleClasa.Companion.kiikikikki
import com.superking.parchi.ooootheer2.FiiikiClasssasssssssss
import com.superking.parchi.ooootheer2.Meeeeeeeeeeeeeeee
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException

class OpennUriActivity : AppCompatActivity() {
    private val ggttgt = 1

    val testyyy = "ffffffffffffffffffffffffffffffffffffh"

    var bgbgbgbggb: ValueCallback<Array<Uri>>? = null
    lateinit var ghhyy: WebView

    var kiikikikik = ""


    lateinit var hyhy: ActivityOpennUriBinding
    var hyhyhy: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hyhy = ActivityOpennUriBinding.inflate(layoutInflater)
        setContentView(hyhy.root)

        ghhyy = hyhy.viie
        jojojojojoj()

        if (testyyy == "fiifififi"){
            val meeeeeeeeeeeeeeee = Meeeeeeeeeeeeeeee(this)
            Log.d("gttgttg", "gtgtgtt ${meeeeeeeeeeeeeeee.displayMessage(5)}")

            FiiikiClasssasssssssss(ccooooontext = this).also {
                it.prrrrrrint()
            }
        }


        val gttgththy = CookieManager.getInstance()
        gttgththy.setAcceptCookie(true)
        gttgththy.setAcceptThirdPartyCookies(ghhyy, true)

        if (testyyy == "fiifififi"){
            val meeeeeeeeeeeeeeee = Meeeeeeeeeeeeeeee(this)
            Log.d("gttgttg", "gtgtgtt ${meeeeeeeeeeeeeeee.displayMessage(5)}")

            FiiikiClasssasssssssss(ccooooontext = this).also {
                it.prrrrrrint()
            }
        }
        ujjuujggggg()
        val activity: Activity = this
        ghhyy.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (bgbbgbgbgbg(url)) {

                        val hyhytttfff = Intent(Intent.ACTION_VIEW)
                        hyhytttfff.data = Uri.parse(url)
                        startActivity(hyhytttfff)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                urlhyhyyh(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show()
            }


        }
        ghhyy.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                bgbgbgbggb?.onReceiveValue(null)
                bgbgbgbggb = filePathCallback
                var takePictureIntent: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (takePictureIntent!!.resolveActivity(packageManager) != null) {

                    var frfgtgt5: File? = null
                    try {
                        frfgtgt5 = jujujiii()
                        takePictureIntent.putExtra("PhotoPath", hyhyhy)
                    } catch (ex: IOException) {
                    }

                    if (frfgtgt5 != null) {
                        hyhyhy = "file:" + frfgtgt5.absolutePath
                        takePictureIntent.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(frfgtgt5)
                        )
                    } else {
                        takePictureIntent = null
                    }
                }
                val hyhyyy = Intent(Intent.ACTION_GET_CONTENT)
                hyhyyy.addCategory(Intent.CATEGORY_OPENABLE)
                hyhyyy.type = "image/*"
                val intents: Array<Intent?> =
                    takePictureIntent?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val intenthyhyhy = Intent(Intent.ACTION_CHOOSER)
                intenthyhyhy.putExtra(Intent.EXTRA_INTENT, hyhyyy)
                intenthyhyhy.putExtra(Intent.EXTRA_TITLE, getString(R.string.take_imagine))
                intenthyhyhy.putExtra(Intent.EXTRA_INITIAL_INTENTS, intents)
                startActivityForResult(
                    intenthyhyhy, ggttgt
                )
                return true
            }

            @Throws(IOException::class)
            private fun jujujiii(): File {
                var frfrrfr = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!frfrrfr.exists()) {
                    frfrrfr.mkdirs()
                }

                frfrrfr =
                    File(frfrrfr.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return frfrrfr
            }

        }

        ghhyy.loadUrl(ururururururururffr())
    }

    private fun jojojojojoj() {

        if (testyyy == "fiifififi"){
            val meeeeeeeeeeeeeeee = Meeeeeeeeeeeeeeee(this)
            Log.d("gttgttg", "gtgtgtt ${meeeeeeeeeeeeeeee.displayMessage(5)}")

            FiiikiClasssasssssssss(ccooooontext = this).also {
                it.prrrrrrint()
            }
        }

        Snackbar.make(
            hyhy.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()
    }

    fun urlhyhyyh(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (kiikikikik == "") {
                kiikikikik = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val gtggt = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val yhyhyhy = gtggt.edit()
                yhyhyhy.putString("SAVED_URL", lurlurlurlurlur)
                yhyhyhy.apply()
            }
        }
    }


    private fun juujhgggg(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val kiikikik = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $kiikikik"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val vfvvfbggbnhnhh =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $vfvvfbggbnhnhh"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val hyhhyhyyh = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $hyhhyhyyh"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    private fun ujjuujggggg() {
        val wstwstwstwstfrfrr = ghhyy.settings
        wstwstwstwstfrfrr.javaScriptEnabled = true

        wstwstwstwstfrfrr.loadWithOverviewMode = true
        wstwstwstwstfrfrr.allowFileAccess = true
        wstwstwstwstfrfrr.domStorageEnabled = true

        wstwstwstwstfrfrr.useWideViewPort = true


        wstwstwstwstfrfrr.userAgentString = wstwstwstwstfrfrr.userAgentString.replace("; wv", "")

        wstwstwstwstfrfrr.javaScriptCanOpenWindowsAutomatically = true
        wstwstwstwstfrfrr.setSupportMultipleWindows(false)

        wstwstwstwstfrfrr.builtInZoomControls = true
        wstwstwstwstfrfrr.displayZoomControls = false

        wstwstwstwstfrfrr.setSupportZoom(true)

        wstwstwstwstfrfrr.pluginState = WebSettings.PluginState.ON
        wstwstwstwstfrfrr.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        wstwstwstwstfrfrr.setAppCacheEnabled(true)

        wstwstwstwstfrfrr.allowContentAccess = true
    }

    private var frrfrfrf = false


    private fun ururururururururffr(): String {

        val sub5frfr = "sub_id_5="
        val sub6frfr = "sub_id_6="
        val adidddddd = "ad_id="
        val sub4frfrr = "sub_id_4="

        val ftgttg = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val packfrfrrfr = "com.superking.parchi"

        val gtgtgt:String? = Hawk.get(c1gttg, "null")
        val nbnmjj: String? = Hawk.get(hyyDEEPLfrfr, "null")
        val kmkmj: String? = Hawk.get(hyhyMAIN_IDffrr, "null")


        val bvccvgg = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        val frfrrrf = "deviceID="
        val frfrfrfr = "sub_id_1="

        val gtgtggttg = "naming"
        val hyhhy = "deeporg"


        val kiokjjlikjhmkijfrfr = Build.VERSION.RELEASE

        val ujikiikio = Hawk.get(kiikikikki, "null")

        var hylphlyplhly = ""
        if (gtgtgt != "null"){
            hylphlyplhly = "$ujikiikio$frfrfrfr$gtgtgt&$frfrrrf$bvccvgg&$adidddddd$kmkmj&$sub4frfrr$packfrfrrfr&$sub5frfr$kiokjjlikjhmkijfrfr&$sub6frfr$gtgtggttg"
            juujhgggg(bvccvgg.toString())
        } else {
            hylphlyplhly = "$ujikiikio$frfrfrfr$nbnmjj&$frfrrrf$bvccvgg&$adidddddd$kmkmj&$sub4frfrr$packfrfrrfr&$sub5frfr$kiokjjlikjhmkijfrfr&$sub6frfr$hyhhy"
            juujhgggg(bvccvgg.toString())
        }
        Log.d("lolo", "link is $hylphlyplhly")
        return ftgttg.getString("SAVED_URL", hylphlyplhly).toString()
    }

    override fun onBackPressed() {


        if (ghhyy.canGoBack()) {
            if (frrfrfrf) {
                ghhyy.stopLoading()
                ghhyy.loadUrl(kiikikikik)
            }
            this.frrfrfrf = true
            ghhyy.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                frrfrfrf = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }


    private fun bgbbgbgbgbg(uri: String): Boolean {

        val gtplgltpgtl = packageManager
        try {

            gtplgltpgtl.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != ggttgt || bgbgbgbggb == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var fnrnfnrf: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                fnrnfnrf = arrayOf(Uri.parse(hyhyhy))
            } else {
                val dataString = data.dataString
                if (dataString != null) {
                    fnrnfnrf = arrayOf(Uri.parse(dataString))
                }
            }
        }
        bgbgbgbggb?.onReceiveValue(fnrnfnrf)
        bgbgbgbggb = null
    }

}