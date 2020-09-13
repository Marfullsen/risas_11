package com.risas_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Obtenemos la referencia al botón.
        val btn11 = findViewById<Button>(R.id.btn11)
        btn11.setOnClickListener {
            // your code to perform when the user clicks on the button
            MusicManager.getInstance().play(this, R.raw.es11)

            //MyActivity.getInstance().(this, R.raw.de01)
            Toast.makeText(this@MainActivity, "11 Risas.", Toast.LENGTH_SHORT).show()
        }
    }
}
