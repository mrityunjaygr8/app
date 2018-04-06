package gr8.mrityunjay.app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View){
        val myToast = Toast.makeText(this, getString(R.string.toast_string), Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View){
        val showCountTextView = findViewById<TextView>(R.id.count_string)
        val countString = showCountTextView.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++
        showCountTextView.text = count.toString()
    }

    fun randomMe(view: View){
        val randomIntent = Intent(this,SecondActivity::class.java)
        val countString = findViewById<TextView>(R.id.count_string)
        val count = Integer.parseInt(countString.text.toString())
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
        startActivity(randomIntent)
    }
}