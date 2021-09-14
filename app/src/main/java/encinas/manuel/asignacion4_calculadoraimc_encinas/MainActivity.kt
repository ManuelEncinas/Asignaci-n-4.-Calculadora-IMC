package encinas.manuel.asignacion4_calculadoraimc_encinas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val weight = findViewById<EditText>(R.id.weight)
        val height = findViewById<EditText>(R.id.height)
        val resultado = findViewById<TextView>(R.id.resultado)
        val categoria = findViewById<TextView>(R.id.categoria)
        val buttonCalcularIMC = findViewById<Button>(R.id.buttonCalcularIMC)


        buttonCalcularIMC.setOnClickListener{
            val peso = weight.text.toString().toDouble()
            val altura = height.text.toString().toDouble()
            val imc = (peso/(altura*altura))
            resultado.text = imc.toString()
            categoria(imc)

        }

    }

    fun categoria(resultado:Double):String {
        val categoria = findViewById<TextView>(R.id.categoria)
        if (resultado < 18.5)
            categoria.text = "Bajo peso"
        else if (resultado >= 18.5 && resultado < 25)
            categoria.text = "Normal"
        else if (resultado >= 25 && resultado < 30)
            categoria.text = "Sobrepeso"
        else if (resultado >= 30 && resultado < 35)
            categoria.text = "Obesidad Grado 1"
        else if (resultado >= 35 && resultado < 40)
            categoria.text = "Obesidad Grado 2"
        else if (resultado >= 40)
            categoria.text = "Obesidad Grado 3"
        return categoria.toString()

    }

}