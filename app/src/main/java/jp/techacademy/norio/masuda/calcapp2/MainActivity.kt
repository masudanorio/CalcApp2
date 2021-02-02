package jp.techacademy.norio.masuda.calcapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.util.Log
import com.google.android.material.snackbar.Snackbar;


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1_id.setOnClickListener(this)
        button2_id.setOnClickListener(this)
        button3_id.setOnClickListener(this)
        button4_id.setOnClickListener(this)

    }

    override fun onClick(v: View) {

        var total = 0.0f
        val mySnackbar = Snackbar.make(v, "数字を入力してからボタンを押してください。",Snackbar.LENGTH_SHORT)
        val intent = Intent(this, SecondActivity::class.java)


    try {
        when (v.id) {
            R.id.button1_id -> {total = editText1.text.toString().toFloat() + editText2.text.toString().toFloat()}
            R.id.button2_id -> {total = editText1.text.toString().toFloat() - editText2.text.toString().toFloat()}
            R.id.button3_id -> {total = editText1.text.toString().toFloat() * editText2.text.toString().toFloat()}
            R.id.button4_id -> {total = editText1.text.toString().toFloat() / editText2.text.toString().toFloat()}

        }

        intent.putExtra("VALUE1", total)
        startActivity(intent)

    }catch (e : NumberFormatException){

        mySnackbar.show()
    }



    }
}




