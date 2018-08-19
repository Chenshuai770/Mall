package com.cs.user.ui.activity

import android.os.Bundle
import com.cs.base.ui.activity.BaseMvpActivity
import com.cs.user.R

import com.cs.user.presenter.RegistPresenter
import com.cs.user.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_regisit.*


import org.jetbrains.anko.toast


class RegisitActivity : BaseMvpActivity<RegistPresenter>(), RegisterView {
    
    override fun onRegisterResult(result: Boolean) {
        toast("注册成功")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regisit)
        mPresenter=RegistPresenter()  //实例化presenter
        mPresenter.mView=this  //实例化mview
        mBtnTest.setOnClickListener {
           mPresenter.register("","","")

        }
    }


}
