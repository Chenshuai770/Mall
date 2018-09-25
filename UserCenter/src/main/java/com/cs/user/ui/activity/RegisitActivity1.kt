package com.cs.user.ui.activity

import android.os.Bundle
import android.view.View
import com.cs.base.ext.enable
import com.cs.base.ui.activity.BaseMvpActivity
import com.cs.user.R
import com.cs.user.presenter.RegistPresenter
import com.cs.user.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register1.*
import org.jetbrains.anko.toast


/**
 * Created by ChenShuai on 2018/9/21/021.
 */
class RegisitActivity1 : BaseMvpActivity<RegistPresenter>(), RegisterView, View.OnClickListener {


    override fun onRegisterResult(result: String) {
        toast(result)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register1)
        initView()
    }

    /*
        初始化视图
     */
    private fun initView() {
        mPresenter = RegistPresenter()  //实例化presenter
        mPresenter.mView = this  //实例化mview
        mPresenter.mActivity = this  //实例化activity
        lifecycle.addObserver(mPresenter)

        //判断是否可用,代码逻辑简单了很多
        mRegisterBtn.enable(mMobileEt,{isBtnEnable()})
        mRegisterBtn.enable(mVerifyCodeEt,{isBtnEnable()})
        mRegisterBtn.enable(mPwdEt,{isBtnEnable()})
        mRegisterBtn.enable(mPwdConfirmEt,{isBtnEnable()})

        mVerifyCodeBtn.setOnClickListener(this)
        mRegisterBtn.setOnClickListener(this)

    }


    /*
       判断按钮是否可用
    */
    private fun isBtnEnable(): Boolean {
        return mMobileEt.text.isNullOrEmpty().not() &&
                mVerifyCodeEt.text.isNullOrEmpty().not() &&
                mPwdEt.text.isNullOrEmpty().not() &&
                mPwdConfirmEt.text.isNullOrEmpty().not()
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.mVerifyCodeBtn -> {
                mVerifyCodeBtn.requestSendVerifyNumber()
                toast("发送验证成功")
            }

            R.id.mRegisterBtn -> {
                mPresenter.register(mMobileEt.text.toString(),mPwdEt.text.toString(),mVerifyCodeEt.text.toString())
            }
        }
    }
}