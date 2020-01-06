package ir.ea2.kotlin_sampleapp

import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.toColor
import ir.ea2.kotlin_sampleapp.util.toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    //onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initialize()
        listeners()
    }

    private fun listeners() {
        ac_second_btn?.setOnClickListener { showAlertDialog() }
    }

    private fun showAlertDialog() {
        val alert = AlertDialog.Builder(this)
        alert.setTitle(resources.getString(R.string.alert_second_title))
        alert.setMessage(resources.getString(R.string.alert_second_message))
        alert.setNegativeButton(resources.getString(R.string.alert_second_negative)) { dialogInterface: DialogInterface?, i: Int -> this.toast(resources.getString(R.string.alert_second_negative)) }
        //Q: What is mean "_" in this code ?   A: We Say To Kotlin This Parameter is never Used.
        alert.setPositiveButton(resources.getString(R.string.alert_second_positive)) { _: DialogInterface?, _: Int -> this.toast(resources.getString(R.string.alert_second_positive)) }
        alert.show()
    }


    private fun initialize() {
        // this "!!" for Confirm (isn't NullObject)
        ac_second_txt?.text = (this.title)
        // If This Object Get Null Value , Then You Must change "!!" to "?"
        ac_second_txt?.text = intent.getStringExtra(MainActivity.INPUT_VALUE)
    }
}