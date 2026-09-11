package com.dxfmarket.app
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "DXF Market - dxf-directline READY!\nAdmin: wawirehamisi40@gmail.com\nM-Pesa Live!"
        tv.textSize = 20f
        tv.setPadding(50, 100, 50, 50)
        setContentView(tv)
    }
}
