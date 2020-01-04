package ir.ea2.kotlin_sampleapp.util

import android.content.Context
import android.widget.Toast

fun Context.toast(message:CharSequence){
    Toast.makeText(this,message,Toast.LENGTH_LONG).show()
}