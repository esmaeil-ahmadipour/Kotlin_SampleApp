package ir.ea2.kotlin_sampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Goodbye findViewById ! We Now Bind View Object On RunTime! (by Using plugin: 'kotlin-android-extensions' in header of file build.gradle)
        ac_main_btn.setOnClickListener{Toast.makeText(this,resources.getString(R.string.toast_test_message),LENGTH_LONG).show()
        ac_main_txt.text="Hello Beautiful World :)"
        }
    }


}
