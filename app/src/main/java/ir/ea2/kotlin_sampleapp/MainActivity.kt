package ir.ea2.kotlin_sampleapp

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG

class MainActivity : AppCompatActivity() {
private val btn:Button by lazy{
    findViewById<Button>(R.id.ac_main_btn)
}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener{Toast.makeText(this,resources.getString(R.string.toast_test_message),LENGTH_LONG).show() }
    }


}
