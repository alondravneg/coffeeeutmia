package com.example.eutimiacoffee

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity(), View.OnClickListener {
  // Push
    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var buttonClear: Button
    lateinit var nameField: TextInputEditText
    lateinit var emailField: TextInputEditText
    lateinit var phoneField: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Set up buttons
        button1 = findViewById(R.id.button_Close)
        button1.setOnClickListener(this)

        button2 = findViewById(R.id.button_Submit)
        button2.setOnClickListener(this)

        button3 = findViewById(R.id.button_Close)
        button3.setOnClickListener(this)

        buttonClear = findViewById(R.id.button_Clea)
        buttonClear.setOnClickListener(this)

        // Set up input fields
        nameField = findViewById(R.id.name_LastName)
        emailField = findViewById(R.id.email)
        phoneField = findViewById(R.id.phone)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.app_name)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Toast.makeText(this, "Bienvenido :)", Toast.LENGTH_SHORT).show()
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.button_Submit -> {
                Toast.makeText(this, "¡Registro exitoso!", Toast.LENGTH_SHORT).show()
            }
            R.id.button_Close -> {
                Toast.makeText(this, "¡Adiós!", Toast.LENGTH_SHORT).show()
                finish()  // Close the activity
            }
            R.id.button_Clea -> {
                // Clear all text input fields
                nameField.text?.clear()
                emailField.text?.clear()
                phoneField.text?.clear()
                Toast.makeText(this, "Campos borrados", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
