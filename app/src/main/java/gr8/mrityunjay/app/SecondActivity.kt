package gr8.mrityunjay.app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.random_desc
import kotlinx.android.synthetic.main.activity_second.random_number
import java.util.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    fun showRandomNumber(){
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        val random = Random()
        var randomInt = 0
        if (count > 0)
            randomInt = random.nextInt(count + 1)

        random_number.text = Integer.toString(randomInt)
        random_desc.text = getString(R.string.random_desc, count)
    }
}
