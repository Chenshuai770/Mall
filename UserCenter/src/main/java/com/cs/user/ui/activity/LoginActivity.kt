package com.cs.user.ui.activity

import android.content.Intent
import android.os.Bundle
import com.cs.base.ui.activity.BaseActivity
import com.cs.user.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {
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


        //Glide.with(this).load(url).into(mIvLoginImage)

       /* mBtnlogin.OnClick{

        }*/


        mBtnlogin.setOnClickListener {
            var intent = Intent(this@LoginActivity, RegisitActivity1::class.java)
            startActivity(intent)
        }

       /* mBtnlogin.onClick(listener = View.OnClickListener {
            var intent = Intent(this@LoginActivity, RegisitActivity1::class.java)
            startActivity(intent)
        })*/

    }
}
