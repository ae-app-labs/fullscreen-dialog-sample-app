package com.ae.apps.samples.fullscreendialog

import android.app.Dialog
import android.app.usage.UsageEvents
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

/**
 * https://material.io/develop/android/docs/getting-started
 * https://material.io/develop/android/theming/dark
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOpenDialog.setOnClickListener {
            showFullscreenDialog3()
        }
    }

    private fun showFullscreenDialog(){
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(true)
        dialog.setContentView(R.layout.dialog_layout)
        dialog.show()
    }

    private fun showFullscreenDialog2(){
        val fragmentManager: FragmentManager = supportFragmentManager
        val newFragment = FullScreenDialogFragment()
        val transaction: FragmentTransaction = fragmentManager.beginTransaction()
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        transaction.add(android.R.id.content, newFragment).addToBackStack(null).commit()
    }

    private fun showFullscreenDialog3(){
        val dialogFragment = FullScreenDialogFragment()
        dialogFragment.show(supportFragmentManager, "dialog")

    }

}