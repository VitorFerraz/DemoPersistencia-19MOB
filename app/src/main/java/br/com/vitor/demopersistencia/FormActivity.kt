package br.com.vitor.demopersistencia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.vitor.demopersistencia.sharepreferences.SharedPreferencesUtils
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        val sharedPreferences = SharedPreferencesUtils(this)
        btSave.setOnClickListener {

            sharedPreferences.save("nome",etName.text.toString())
            etName.setText("")
        }
        btGetValue.setOnClickListener {
             etName.setText("")
            etName.setText(sharedPreferences.get("nome"))
        }
        btDelete.setOnClickListener {
            sharedPreferences.delete("nome")
            etName.setText("")
        }
    }
}
