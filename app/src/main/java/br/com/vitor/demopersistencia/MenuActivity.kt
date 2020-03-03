package br.com.vitor.demopersistencia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        btSharedPreferences.setOnClickListener {
            startActivity(Intent(this, FormActivity::class.java))
        }

        btDatabase.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        btClose.setOnClickListener {
            finish()
        }
    }
}
