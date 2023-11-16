package com.example.calculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView
import javax.script.ScriptEngine
import javax.script.ScriptEngineManager

class MainActivity : AppCompatActivity() {
    private lateinit var expression:TextView
    private lateinit var result:TextView
    private lateinit var percent:Button
    private lateinit var clear:Button
    private lateinit var back:Button
    private lateinit var delete:Button
    private lateinit var multiply:Button
    private lateinit var minus1:Button
    private lateinit var plus1:Button
    private lateinit var equal:Button
    private lateinit var dot:Button
    private lateinit var zero2:Button
    private lateinit var zero:Button
    private lateinit var one:Button
    private lateinit var two:Button
    private lateinit var three:Button
    private lateinit var four:Button
    private lateinit var five:Button
    private lateinit var six:Button
    private lateinit var seven:Button
    private lateinit var eight:Button
    private lateinit var nine:Button





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        expression = findViewById(R.id.main)
        result = findViewById(R.id.main2)

        percent = findViewById(R.id.percent)
        clear = findViewById(R.id.clear)
        back = findViewById(R.id.back)
        delete = findViewById(R.id.delete)
        multiply = findViewById(R.id.multiply)
        minus1 = findViewById(R.id.minus1)
        plus1 = findViewById(R.id.plus1)
        equal = findViewById(R.id.equal)
        dot = findViewById(R.id.dot)
        zero2 = findViewById(R.id.zero2)
        zero = findViewById(R.id.zero)
        one = findViewById(R.id.one)
        two = findViewById(R.id.two)
        three = findViewById(R.id.three)
        four = findViewById(R.id.four)
        five = findViewById(R.id.five)
        six = findViewById(R.id.six)
        seven = findViewById(R.id.seven)
        eight = findViewById(R.id.eight)
        nine = findViewById(R.id.nine)

        expression.movementMethod = ScrollingMovementMethod()
        expression.isActivated = true
        expression.isPressed = true
        var str:String

        clear.setOnClickListener{
            expressionText("0")
            expression.textSize = 60F
            result.textSize = 30F
            resultText()

        }


        back.setOnClickListener{
            if (expression.text.toString().isNotEmpty()){
                val lastIndex = expression.text.toString().lastIndex
                str = expression.text.toString().substring(0,lastIndex)
                expressionText(str)
                resultText()
            }

        }

        percent.setOnClickListener{

            if (expression.text.toString().endsWith("%")
                ||expression.text.toString().endsWith("/")
                ||expression.text.toString().endsWith("*")
                ||expression.text.toString().endsWith("+")
                ||expression.text.toString().endsWith("-")
                ||expression.text.toString().endsWith(".")){
                str = expression.text.toString()
                expressionText(str)

            }
            else{
                str = expression.text.toString() + "%"
                expressionText(str)
            }

        }

        delete.setOnClickListener{
            if (expression.text.toString().endsWith("%")
                ||expression.text.toString().endsWith("/")
                ||expression.text.toString().endsWith("*")
                ||expression.text.toString().endsWith("+")
                ||expression.text.toString().endsWith("-")
                ||expression.text.toString().endsWith(".")){
                str = expression.text.toString()
                expressionText(str)

            }
            else{
                str = expression.text.toString() + "/"
                expressionText(str)
            }

        }
        multiply.setOnClickListener{

            if (expression.text.toString().endsWith("%")
                ||expression.text.toString().endsWith("/")
                ||expression.text.toString().endsWith("*")
                ||expression.text.toString().endsWith("+")
                ||expression.text.toString().endsWith("-")
                ||expression.text.toString().endsWith(".")){
                str = expression.text.toString()
                expressionText(str)

            }
            else{
                str = expression.text.toString() + "*"
                expressionText(str)
            }

        }
        minus1.setOnClickListener{
            if (expression.text.toString().endsWith("%")
                ||expression.text.toString().endsWith("/")
                ||expression.text.toString().endsWith("*")
                ||expression.text.toString().endsWith("+")
                ||expression.text.toString().endsWith("-")
                ||expression.text.toString().endsWith(".")){
                str = expression.text.toString()
                expressionText(str)

            }
            else{
                str = expression.text.toString() + "-"
                expressionText(str)
            }


        }
        plus1.setOnClickListener{
            if (expression.text.toString().endsWith("%")
                ||expression.text.toString().endsWith("/")
                ||expression.text.toString().endsWith("*")
                ||expression.text.toString().endsWith("+")
                ||expression.text.toString().endsWith("-")
                ||expression.text.toString().endsWith(".")){
                str = expression.text.toString()
                expressionText(str)

            }
            else{
                str = expression.text.toString() + "+"
                expressionText(str)
            }

        }
        equal.setOnClickListener{
            expression.textSize = 30F
            result.textSize = 60F


        }
        dot.setOnClickListener{
            if (expression.text.toString().endsWith("%")
                ||expression.text.toString().endsWith("/")
                ||expression.text.toString().endsWith("*")
                ||expression.text.toString().endsWith("+")
                ||expression.text.toString().endsWith("-")
                ||expression.text.toString().endsWith(".")){
                str = expression.text.toString()
                expressionText(str)

            }
            else{
                str = expression.text.toString() + "."
                expressionText(str)
            }

        }
        zero2.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","")+"00"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "00"
                expressionText(str)
                resultText()
            }

        }
        zero.setOnClickListener{

            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","") + "0"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "0"
                expressionText(str)
                resultText()
            }
        }
        one.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","")+"1"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "1"
                expressionText(str)
                resultText()
            }

        }
        two.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","")+"2"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "2"
                expressionText(str)
                resultText()
            }

        }
        three.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","")+"3"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "3"
                expressionText(str)
                resultText()
            }

        }
        four.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","")+"4"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "4"
                expressionText(str)
                resultText()
            }

        }
        five.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","")+"5"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "5"
                expressionText(str)
                resultText()
            }

        }
        six.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","")+"6"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "6"
                expressionText(str)
                resultText()
            }

        }
        seven.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","")+"7"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "7"
                expressionText(str)
                resultText()
            }

        }
        eight.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","")+"8"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "8"
                expressionText(str)
                resultText()
            }


        }
        nine.setOnClickListener{
            if (expression.text.toString().startsWith("0")){
                str = expression.text.toString().replace("0","")+"9"
                expressionText(str)
                resultText()
            }
            else{
                str = expression.text.toString() + "9"
                expressionText(str)
                resultText()
            }

        }








    }
    private fun expressionText(str:String){
        expression.text = str
    }
    private fun resultText(){
        val exp = expression.text.toString()
        val engine :ScriptEngine = ScriptEngineManager().getEngineByName("rhino")
        try {
            val res = engine.eval(exp)
            if (res.toString().endsWith("0")){
                result.text = "=" + res.toString().replace(".0","")
            }
            else{
                result.text = "= $res"

            }
        }catch (e:Exception){
            expression.text = expression.text.toString()
            result.text = expression.text.toString()
        }

    }

}