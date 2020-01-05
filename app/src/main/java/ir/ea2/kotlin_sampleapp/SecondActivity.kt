package ir.ea2.kotlin_sampleapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private var txtView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        txtView = findViewById(R.id.ac_second_txt)
        // this "!!" for Confirm (isn't NullObject)
        // If This Object Get Null Value , Then You Must change "!!" to "?"
        txtView!!.text=(this.title)
    }
}