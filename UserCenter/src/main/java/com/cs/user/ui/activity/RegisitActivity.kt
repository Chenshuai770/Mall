package com.cs.user.ui.activity


import android.os.Bundle
import android.util.Log
import com.cs.base.ui.activity.BaseMvpActivity
import com.cs.user.R
import com.cs.user.presenter.RegistPresenter
import com.cs.user.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_regisit.*
import org.jetbrains.anko.toast

class RegisitActivity : BaseMvpActivity<RegistPresenter>(), RegisterView {

    override fun onRegisterResult(result: Boolean, msg: String) {
        if (result) {
            toast("注册成功")
        } else {
            toast(msg)
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regisit)
        mPresenter = RegistPresenter()  //实例化presenter
        mPresenter.mView = this  //实例化mview
        mPresenter.activity = this  //实例化activity
        lifecycle.addObserver(mPresenter)
        mBtnRegister.setOnClickListener {
            //mPresenter.register("13567594939", "123456", "123456")

            mPresenter.login( )

        }
        mBtnTest.setOnClickListener {
            finish()

        }
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy", "onDestroy")
    }


}
