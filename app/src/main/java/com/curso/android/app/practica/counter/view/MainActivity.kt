import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.viewModels
import com.curso.android.app.practica.counter.R
import com.curso.android.app.practica.counter.view.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var editTextNumber1: EditText
    private lateinit var editTextNumber2: EditText
    private lateinit var btnComparar: Button
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNumber1 = findViewById(R.id.editText1)
        editTextNumber2 = findViewById(R.id.editText2)
        btnComparar = findViewById(R.id.btnComparar)

        btnComparar.setOnClickListener {
            val text1 = editTextNumber1.text.toString()
            val text2 = editTextNumber2.text.toString()

            viewModel.setText1(text1)
            viewModel.setText2(text2)

            val resultado = if (viewModel.areTextsEqual()) {
                "Los textos son iguales"
            } else {
                "Los textos son diferentes"
            }
        }
    }
}
