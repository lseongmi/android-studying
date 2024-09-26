package com.example.a20240829

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main_0924)


        //lateinit =  변수를 선언할 때 반드시 초기화를 해주어야 하는데
        // 해당 변수가 언제 초기화될지는 알 수 없지만 반드시 초기화가 되고
        // 이후에 사용된다는 것이 보장될 경우 lateinit을 사용
        lateinit var edit1 : EditText;
        lateinit var edit2 : EditText;
        lateinit var btn1 : Button;
        lateinit var btn2 : Button;
        lateinit var btn3 : Button;
        lateinit var btn4 : Button;
        lateinit var txtresult : TextView;
        lateinit var num1 : String;
        lateinit var num2 : String;
        //? = null값을 허용해도 된다는 뜻
        var result : Int?= null




        title = "간단계산기"
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        txtresult = findViewById(R.id.txtresult);

        btn1.setOnTouchListener { view, motionEvent ->
             num1 = edit1.text.toString();
             num2 = edit2.text.toString();
            result = Integer.parseInt(num1) + Integer.parseInt(num2)
            txtresult.text = "계산결과: " + result.toString()
            false
        }

        btn2.setOnTouchListener { view, motionEvent ->
            num1 = edit1.text.toString();
            num2 = edit2.text.toString();
            result = Integer.parseInt(num1) - Integer.parseInt(num2)
            txtresult.text = "계산결과: " + result.toString()
            false
        }

        btn3.setOnTouchListener { view, motionEvent ->
            num1 = edit1.text.toString();
            num2 = edit2.text.toString();
            result = Integer.parseInt(num1) / Integer.parseInt(num2)
            txtresult.text = "계산결과: " + result.toString()
            false
        }
        btn4.setOnTouchListener { view, motionEvent ->
            num1 = edit1.text.toString();
            num2 = edit2.text.toString();
            result = Integer.parseInt(num1) * Integer.parseInt(num2)
            txtresult.text = "계산결과: " + result.toString()
            false
        }

    }
}
