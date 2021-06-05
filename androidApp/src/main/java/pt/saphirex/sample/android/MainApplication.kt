package pt.saphirex.sample.android

import android.content.Context
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication

class MainApplication : MultiDexApplication() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

}