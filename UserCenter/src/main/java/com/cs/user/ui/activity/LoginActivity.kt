package com.cs.user.ui.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cs.user.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        mBtnlogin.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                var intent = Intent(this@LoginActivity,RegisitActivity::class.java)
                startActivity(intent)
            }
        })
    }
}
