package com.cs.user.ui.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide
import com.cs.base.ext.OnClick
import com.cs.user.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    private val url = "http://p3.pstatp.com/origin/pgc-image/15220293999066398493c24";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        /*mBtnlogin.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                var intent = Intent(this@LoginActivity,RegisitActivity::class.java)
                startActivity(intent)
            }
        })*/


        Glide.with(this).load(url).into(mIvLoginImage)

        mBtnlogin.OnClick(View.OnClickListener {
            var intent = Intent(this@LoginActivity, RegisitActivity::class.java)
            startActivity(intent)
            /*val mDialog=ProgressLoading.create(this)
            mDialog.showLoading()*/

        })
    }
}
