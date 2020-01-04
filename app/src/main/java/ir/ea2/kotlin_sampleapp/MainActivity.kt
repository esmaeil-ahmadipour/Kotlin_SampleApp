package ir.ea2.kotlin_sampleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ir.ea2.kotlin_sampleapp.util.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Goodbye findViewById ! We Now Bind View Object On RunTime! (by Using plugin: 'kotlin-android-extensions' in header of file build.gradle)
        ac_main_btn.setOnClickListener {

            //Using ContextExtensions From Package util .
            this.toast(resources.getString(R.string.toast_test_message))

            ac_main_txt.text = "Hello Beautiful World :)"
        }
    }
}
