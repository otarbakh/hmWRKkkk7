package com.example.hmwrk7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import com.example.hmwrk7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener {

            val editTextChild = EditText(this)

            if (binding.btnCheckbox.isChecked) {
                binding.parentLinearLayout.addView(editTextChild, binding.parentLinearLayout.childCount - 1
                )
                editTextChild.inputType = InputType.TYPE_CLASS_TEXT
            } else {
                binding.parentLinearLayout.addView(editTextChild, binding.parentLinearLayout.childCount - 1
                )
                editTextChild.inputType = InputType.TYPE_CLASS_NUMBER
            }
        }
    }
}