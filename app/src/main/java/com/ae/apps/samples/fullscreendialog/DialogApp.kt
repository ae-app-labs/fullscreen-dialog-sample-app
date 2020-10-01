package com.ae.apps.samples.fullscreendialog

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class DialogApp : Application() {
    override fun onCreate() {
        super.onCreate()

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
    }
}