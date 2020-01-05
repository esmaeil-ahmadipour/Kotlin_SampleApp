package ir.ea2.kotlin_sampleapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import ir.ea2.kotlin_sampleapp.util.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var context: Context = this
    companion object {
        // Final Variable Used As Key For Intent.putExtra.
        const val INPUT_VALUE = "INPUT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ac_main_toolbar.title = resources.getString(R.string.app_name)
        setSupportActionBar(ac_main_toolbar)
        listeners()
    }

    private fun listeners() {
        // Goodbye findViewById ! We Now Bind View Object On RunTime! (by Using plugin: 'kotlin-android-extensions' in header of file build.gradle)
        ac_main_btn.setOnClickListener {
            //Using ContextExtensions From Package util .
            this.toast(resources.getString(R.string.toast_test_message))
            ac_main_txt.text = "Hello Beautiful World :)"
            startSecondActivity()
        }
    }
    //Inflate Layer PopupMenu :
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.popup_menu, menu)
        return true
    }

    //When Click On One Item :
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        super.onOptionsItemSelected(item)
        when (item?.itemId) {
            R.id.menu_item_1 -> this.toast(item.title)
            R.id.menu_item_2 -> this.toast(item.title)
            R.id.menu_item_3 -> this.toast(item.title)
            R.id.menu_item_4 -> this.toast(item.title)
            R.id.menu_icon_search -> this.toast(item.title)
        }
        return true
    }
    private fun startSecondActivity() {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(INPUT_VALUE, ac_main_edt.text.toString())
        startActivity(intent)
    }
}