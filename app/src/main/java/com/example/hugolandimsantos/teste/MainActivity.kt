package com.example.hugolandimsantos.teste

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_convert.setOnClickListener {
            convert()
        }
    }

    private fun convert() {
        val temp: String = edt_temp.text.toString()
        if (!temp.isEmpty()) {

            val resultTemp: Int = if (rb_celsius.isChecked) {
                (temp.toInt() - 32) * 5 / 9
            } else {
                temp.toInt() * 9 / 5 + 32
            }
            tv_result.text = resultTemp.toString()
        } else {
            Toast.makeText(this, "Digite uma temperatura", Toast.LENGTH_SHORT).show()
        }
    }
}
