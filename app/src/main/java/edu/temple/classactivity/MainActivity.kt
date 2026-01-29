package edu.temple.classactivity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textField = findViewById<TextView>(R.id.textField)
        val button1 = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val checkBox = findViewById<CheckBox>(R.id.checkBox)

        checkBox.setOnCheckedChangeListener { _, isChecked ->
            button1.isEnabled = isChecked
            button2.isEnabled = isChecked
        }

        // Button 1 changes text
        button1.setOnClickListener {
            if (!checkBox.isChecked) return@setOnClickListener
            textField.text = "Button 1 clicked"
        }

        // Button 2 changes text
        button2.setOnClickListener {
            if (!checkBox.isChecked) return@setOnClickListener
            textField.text = "Button 2 clicked"
        }
    }
}