package ir.ea2.kotlin_sampleapp

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number: Int = 0
    var handler: Handler = Handler()
    lateinit var runnable: Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listeners()
    }

    private fun start() {
        number = 0
        ac_main_txt.text = "Number is $number"
        //object is one SingletonObject / implement from Runnable
        runnable = object : Runnable {
            override fun run() {
                number++
                ac_main_txt.text = "Number is $number"
                handler.postDelayed(runnable, 1000)
            }
        }
        handler.postDelayed(runnable, 1000)
    }

    private fun reset() {
        handler.removeCallbacks(runnable)
        number = 0
        ac_main_txt.text = "Number is $number"
    }

    private fun listeners() {
        ac_main_btn_reset.setOnClickListener() { reset() }
        ac_main_btn_start.setOnClickListener() { start() }
    }
}