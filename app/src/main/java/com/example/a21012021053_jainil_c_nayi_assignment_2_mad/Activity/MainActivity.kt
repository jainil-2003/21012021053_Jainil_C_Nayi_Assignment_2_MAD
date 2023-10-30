package com.example.a21012021053_jainil_c_nayi_assignment_2_mad.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.a21012021053_jainil_c_nayi_assignment_2_mad.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonadd = findViewById<Button>(R.id.btnadd)
        val edittextno1 = findViewById<TextView>(R.id.edtNo1)
        val buttonsub = findViewById<Button>(R.id.btnsub)
        val edittextno2 = findViewById<TextView>(R.id.edtNo2)
        val buttonmul = findViewById<Button>(R.id.btnmul)
        val buttondiv = findViewById<Button>(R.id.btndiv)

        buttonadd.setOnClickListener{
            if(edittextno1.text.toString()!="" && edittextno2.text.toString()!=""){

                val no1 = edittextno1.text.toString().toInt()
                val no2 = edittextno2.text.toString().toInt()

                val sum = no1+no2
                Toast.makeText(this,"The Sum Is $sum" , Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(this,"Please Fill All the Required Blanks" , Toast.LENGTH_LONG).show();
            }
        }
            buttonsub.setOnClickListener{
                if(edittextno1.text.toString()!="" && edittextno2.text.toString()!=""){

                    val no1 = edittextno1.text.toString().toInt()
                    val no2 = edittextno2.text.toString().toInt()


                    var sub : Int
                    if(no1>no2){
                        sub = no1-no2
                    }else{
                            sub = no2-no1
                    }
                    Toast.makeText(this,"The Differance Is $sub" , Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(this,"Please Fill All the Required Blanks" , Toast.LENGTH_LONG).show();
                }
            }
        buttonmul.setOnClickListener{
            if(edittextno1.text.toString()!="" && edittextno2.text.toString()!=""){

                val no1 = edittextno1.text.toString().toInt()
                val no2 = edittextno2.text.toString().toInt()


                val mul = no1*no2
                Toast.makeText(this,"The Product Is $mul" , Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(this,"Please Fill All the Required Blanks" , Toast.LENGTH_LONG).show();
            }
        }
        buttondiv.setOnClickListener{
            if(edittextno1.text.toString()!="" && edittextno2.text.toString()!=""){

                val no1 = edittextno1.text.toString().toInt()
                val no2 = edittextno2.text.toString().toInt()
                var div : Int
                if(no2==0){
                    div = 0
                    Toast.makeText(this,"A number Can't be Divided By Zero As Produces Infinite Solution" , Toast.LENGTH_LONG).show();
                }else{
                    div = no1/no2
                }


                Toast.makeText(this,"The Division Is $div" , Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(this,"Please Fill All the Required Blanks" , Toast.LENGTH_LONG).show();
            }
        }
    }
}