package ir.ea2.kotlin_sampleapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ir.ea2.kotlin_sampleapp.util.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
companion object{
    // Final Variable Used As Key For Intent.putExtra.
     const val INPUT_VALUE="INPUT"
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Goodbye findViewById ! We Now Bind View Object On RunTime! (by Using plugin: 'kotlin-android-extensions' in header of file build.gradle)
        ac_main_btn.setOnClickListener {
            //Using ContextExtensions From Package util .
            this.toast(resources.getString(R.string.toast_test_message))
            ac_main_txt.text = "Hello Beautiful World :)"
            startSecondActivity()
        }

    }

    private fun startSecondActivity() {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(INPUT_VALUE,ac_main_edt.text.toString())
        startActivity(intent)
    }
}
