package jp.techacademy.norio.masuda.calcapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val VALUE1 = intent.getFloatExtra("VALUE1",0.0f)



        textView.text = "${VALUE1}"

    }
}