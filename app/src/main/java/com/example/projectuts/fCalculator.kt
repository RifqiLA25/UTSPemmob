package com.example.projectuts

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import java.lang.Exception
import javax.script.ScriptEngine
import javax.script.ScriptEngineManager


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fCalculator.newInstance] factory method to
 * create an instance of this fragment.
 */
class fCalculator : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var hasil1: TextView
    private lateinit var hasil2: TextView
    private lateinit var btnclr: Button
    private lateinit var btnbckspc: Button
    private lateinit var btnmdl: Button
    private lateinit var btnbagi: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button
    private lateinit var btn9: Button
    private lateinit var btnkali: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btnkrg: Button
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btnplus: Button
    private lateinit var btnkoma: Button
    private lateinit var btn0: Button
    private lateinit var btntitik: Button
    private lateinit var btnhsil: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)

        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Kode lainnya di sini
        val bbview2: View = inflater.inflate(R.layout.fragment_f_calculator, container, false)

        //pendefinisian
        hasil1 = bbview2.findViewById(R.id.hasil1)
        hasil2 = bbview2.findViewById(R.id.hasil2)
        btnclr = bbview2.findViewById(R.id.btn_clr)
        btnbckspc = bbview2.findViewById(R.id.btn_bckspc)
        btnmdl = bbview2.findViewById(R.id.btn_mdl)
        btnbagi = bbview2.findViewById(R.id.btn_bagi)
        btn7 = bbview2.findViewById(R.id.btn_7)
        btn8 = bbview2.findViewById(R.id.btn_8)
        btn9 = bbview2.findViewById(R.id.btn_9)
        btnkali = bbview2.findViewById(R.id.btn_kali)
        btn4 = bbview2.findViewById(R.id.btn_4)
        btn5 = bbview2.findViewById(R.id.btn_5)
        btn6 = bbview2.findViewById((R.id.btn_6))
        btnkrg = bbview2.findViewById(R.id.btn_krg)
        btn1 = bbview2.findViewById(R.id.btn_1)
        btn2 = bbview2.findViewById(R.id.btn_2)
        btn3 = bbview2.findViewById(R.id.btn_3)
        btnplus = bbview2.findViewById(R.id.btn_plus)
        btnkoma = bbview2.findViewById(R.id.btn_koma)
        btn0 = bbview2.findViewById(R.id.btn0)
        btntitik = bbview2.findViewById(R.id.btn_titik)
        btnhsil = bbview2.findViewById(R.id.btn_hasil)

        hasil1.movementMethod = ScrollingMovementMethod()
        hasil1.isActivated = true
        hasil1.isPressed = true

        var str: String

        btnclr.setOnClickListener {
            hasil1Text("")
            hasil1.textSize = 50F
            hasil2.textSize = 30F
            hasil2Text("")
        }
        btnbckspc.setOnClickListener {

            if (hasil1.text.toString().isNotEmpty()) {
                val lastindex = hasil1.text.toString().lastIndex
                str = hasil1.text.toString().substring(0, lastindex)
                hasil1Text(str)
                hasil2Text("")
            }

        }
        btnmdl.setOnClickListener {
            if (hasil1.text.toString().endsWith("%") || hasil1.text.toString()
                    .endsWith("/") || hasil1.text.toString().endsWith("*") || hasil1.text.toString()
                    .endsWith("+") || hasil1.text.toString().endsWith("-") || hasil1.text.toString()
                    .endsWith(".") || hasil1.text.toString().endsWith(",")
            ) {
                str = hasil1.text.toString()
                hasil1Text(str)
            } else {
                str = hasil1.text.toString() + "%"
                hasil1Text(str)
            }

        }
        btnkrg.setOnClickListener {
            if (hasil1.text.toString().endsWith("%") || hasil1.text.toString()
                    .endsWith("/") || hasil1.text.toString().endsWith("*") || hasil1.text.toString()
                    .endsWith("+") || hasil1.text.toString().endsWith("-") || hasil1.text.toString()
                    .endsWith(".") || hasil1.text.toString().endsWith(",")
            ) {
                str = hasil1.text.toString()
                hasil1Text(str)
            } else {
                str = hasil1.text.toString() + "-"
                hasil1Text(str)
            }

        }
        btnplus.setOnClickListener {
            if (hasil1.text.toString().endsWith("%") || hasil1.text.toString()
                    .endsWith("/") || hasil1.text.toString().endsWith("*") || hasil1.text.toString()
                    .endsWith("+") || hasil1.text.toString().endsWith("-") || hasil1.text.toString()
                    .endsWith(".") || hasil1.text.toString().endsWith(",")
            ) {
                str = hasil1.text.toString()
                hasil1Text(str)
            } else {
                str = hasil1.text.toString() + "+"
                hasil1Text(str)
            }

        }
        btnkali.setOnClickListener {
            if (hasil1.text.toString().endsWith("%") || hasil1.text.toString()
                    .endsWith("/") || hasil1.text.toString().endsWith("*") || hasil1.text.toString()
                    .endsWith("+") || hasil1.text.toString().endsWith("-") || hasil1.text.toString()
                    .endsWith(".") || hasil1.text.toString().endsWith(",")
            ) {
                str = hasil1.text.toString()
                hasil1Text(str)
            } else {
                str = hasil1.text.toString() + "*"
                hasil1Text(str)
            }

        }
        btnbagi.setOnClickListener {
            if (hasil1.text.toString().endsWith("%") || hasil1.text.toString()
                    .endsWith("/") || hasil1.text.toString().endsWith("*") || hasil1.text.toString()
                    .endsWith("+") || hasil1.text.toString().endsWith("-") || hasil1.text.toString()
                    .endsWith(".") || hasil1.text.toString().endsWith(",")
            ) {
                str = hasil1.text.toString()
                hasil1Text(str)
            } else {
                str = hasil1.text.toString() + "/"
                hasil1Text(str)
            }

        }
        btnhsil.setOnClickListener {
            hasil1.textSize = 30F
            hasil2.textSize = 50F

        }
        btn0.setOnClickListener {
            if (hasil1.text.toString().endsWith("0")) {
                str = hasil1.text.toString().replace("0", "") + "0"
            } else {
                str = hasil1.text.toString() + "0"
                hasil1Text(str)
                hasil2Text("")
            }
        }
        btn1.setOnClickListener {
            if (hasil1.text.toString().endsWith("0")) {
                str = hasil1.text.toString().replace("0", "") + "1"
            } else {
                str = hasil1.text.toString() + "1"
                hasil1Text(str)
                hasil2Text("")
            }

        }
        btn2.setOnClickListener {
            if (hasil1.text.toString().endsWith("0")) {
                str = hasil1.text.toString().replace("0", "") + "2"
            } else {
                str = hasil1.text.toString() + "2"
                hasil1Text(str)
                hasil2Text("")
            }

        }
        btn3.setOnClickListener {
            if (hasil1.text.toString().endsWith("0")) {
                str = hasil1.text.toString().replace("0", "") + "3"
            } else {
                str = hasil1.text.toString() + "3"
                hasil1Text(str)
                hasil2Text("")
            }

        }
        btn4.setOnClickListener {
            if (hasil1.text.toString().endsWith("0")) {
                str = hasil1.text.toString().replace("0", "") + "4"
            } else {
                str = hasil1.text.toString() + "4"
                hasil1Text(str)
                hasil2Text("")
            }

        }
        btn5.setOnClickListener {
            if (hasil1.text.toString().endsWith("0")) {
                str = hasil1.text.toString().replace("0", "") + "5"
            } else {
                str = hasil1.text.toString() + "5"
                hasil1Text(str)
                hasil2Text("")
            }

        }
        btn6.setOnClickListener {
            if (hasil1.text.toString().endsWith("0")) {
                str = hasil1.text.toString().replace("0", "") + "6"
            } else {
                str = hasil1.text.toString() + "6"
                hasil1Text(str)
                hasil2Text("")
            }

        }
        btn7.setOnClickListener {
            if (hasil1.text.toString().endsWith("0")) {
                str = hasil1.text.toString().replace("0", "") + "7"
            } else {
                str = hasil1.text.toString() + "7"
                hasil1Text(str)
                hasil2Text("")
            }

        }
        btn8.setOnClickListener {
            if (hasil1.text.toString().endsWith("0")) {
                str = hasil1.text.toString().replace("0", "") + "8"
            } else {
                str = hasil1.text.toString() + "8"
                hasil1Text(str)
                hasil2Text("")
            }

        }
        btn9.setOnClickListener {
            if (hasil1.text.toString().endsWith("0")) {
                str = hasil1.text.toString().replace("0", "") + "9"
            } else {
                str = hasil1.text.toString() + "9"
                hasil1Text(str)
                hasil2Text("")
            }

        }
        btntitik.setOnClickListener {
            if (hasil1.text.toString().endsWith("%") || hasil1.text.toString()
                    .endsWith("/") || hasil1.text.toString().endsWith("*") || hasil1.text.toString()
                    .endsWith("+") || hasil1.text.toString().endsWith("-") || hasil1.text.toString()
                    .endsWith(".") || hasil1.text.toString().endsWith(",")
            ) {
                str = hasil1.text.toString()
                hasil1Text(str)
            } else {
                str = hasil1.text.toString() + ","
                hasil1Text(str)
            }

        }
        btnkoma.setOnClickListener {
            if (hasil1.text.toString().endsWith("%") || hasil1.text.toString()
                    .endsWith("/") || hasil1.text.toString().endsWith("*") || hasil1.text.toString()
                    .endsWith("+") || hasil1.text.toString().endsWith("-") || hasil1.text.toString()
                    .endsWith(".") || hasil1.text.toString().endsWith(",")
            ) {
                str = hasil1.text.toString()
                hasil1Text(str)
            } else {
                str = hasil1.text.toString() + "."
                hasil1Text(str)
            }
        }

        return bbview2
    }

    private fun hasil1Text(str: String) {
        hasil1.text = str
    }

    private fun hasil2Text(str: String) {
        val exp = hasil1.text.toString()
        val engine: ScriptEngine = ScriptEngineManager().getEngineByName("rhino")
        try {
            val res = engine.eval(exp)
            if (res.toString().endsWith(".0")) {
                hasil2.text = "=" + res.toString().replace(".0", "")
            } else {
                hasil2.text = "=$res"
            }
        } catch (e: Exception) {
            hasil1.text = hasil1.text.toString()
            hasil2.text = hasil1.text.toString()
        }
    }

    companion object {
            // Metode untuk membuat instance fCalculator dengan argumen
            fun newInstance(param1: String, param2: String) =
                fCalculator().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
        }
}
