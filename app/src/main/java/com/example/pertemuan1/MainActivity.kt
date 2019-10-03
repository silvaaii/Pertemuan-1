package com.example.pertemuan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_jumlah.setOnClickListener{
            var panjang = et_panjang.text.toString()
            var lebar = et_lebar.text.toString()
           if(panjang.equals("")&& lebar.equals(""))
               Toast.makeText(this, "Tidak Boleh Kosong", Toast .LENGTH_SHORT)
               calculate(panjang, lebar)
            else
               tv_hasil.text="Data Harus Terisi"
        }
    }

    private fun calculate (panjang:String, lebar:String){
        var hasil = panjang.toInt() * lebar.toInt()
        tv_hasil.text = hasil.toString()
    }

}
