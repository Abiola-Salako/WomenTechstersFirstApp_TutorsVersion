package com.wtm.womentechstersfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var createNAButton: Button = findViewById(R.id.createNewAccount)
        createNAButton.setOnClickListener {
            var i = Intent(this, CreateNewAccountActivity::class.java)
            startActivity(i)
        }

        val forgotPasswordBtn: Button = findViewById(R.id.forgottenPassword)
        forgotPasswordBtn.setOnClickListener {
            var i = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(i)
        }

        val loginBtn:Button = findViewById(R.id.loginButton)
        val nameEdt:EditText=findViewById(R.id.username)
        val passEdt:EditText=findViewById(R.id.password)
        loginBtn.setOnClickListener {
            val userNameEntered: String = nameEdt.text.toString()
            val passwordEntered: String = passEdt.text.toString()
            var messageRead = "";

            if(userNameEntered.isEmpty() ||
                passwordEntered.isEmpty()){
                messageRead = "Error! both username and password are required"
            }else{
                var i = Intent(this, HomeActivity::class.java)
                startActivity(i)
            }
              Snackbar
                  .make(findViewById(R.id.layoutTwo),
                      messageRead,
                      Snackbar.LENGTH_LONG
                  )
                  .show()
            }
        }


    }
