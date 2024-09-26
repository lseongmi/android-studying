package com.example.a20240829

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var rdoDog:RadioButton
    lateinit var rdogo:RadioButton
    lateinit var rdoTo:RadioButton
    lateinit var btnOk :Button
    lateinit var imgPet: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main2_0926)
        rdoDog = findViewById(R.id.RdoDog)
        rdogo = findViewById(R.id.RdoGO)
        rdoTo = findViewById(R.id.RdoTo)
        btnOk = findViewById(R.id.btn1)
        imgPet = findViewById(R.id.img)

        btnOk.setOnClickListener {
            if(rdoDog.isChecked)
                imgPet.setImageResource(R.drawable.gang)
            if(rdogo.isChecked)
                imgPet.setImageResource(R.drawable.go)
            if(rdoTo.isChecked)
                imgPet.setImageResource(R.drawable.to)
        }
    }


}
