package com.cs.user.ui.activity


import android.os.Bundle
import com.cs.base.common.AppManager
import com.cs.base.ui.activity.BaseMvpActivity
import com.cs.user.R
import com.cs.user.presenter.RegistPresenter
import com.cs.user.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_regisit.*
import org.jetbrains.anko.toast
/*
    注册界面
 */
class RegisitActivity : BaseMvpActivity<RegistPresenter>(), RegisterView {

    private var pressTime :Long = 0
    override fun onRegisterResult(result: String) {
        toast(result)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regisit)

        initView()

    }

    private fun initView() {
        mPresenter = RegistPresenter()  //实例化presenter
        mPresenter.mView = this  //实例化mview
        mPresenter.mActivity = this  //实例化activity
        lifecycle.addObserver(mPresenter)
        mBtnRegister.setOnClickListener {
            mPresenter.register("13567594934", "123456", "123456")
            // mPresenter.login( )
        }
        mBtnTest.setOnClickListener{
            finish()
        }
    }

    override fun onBackPressed() {

        val time=System.currentTimeMillis()
        if (time-pressTime>2000){
            toast("再按一次退出程序")
            pressTime=time
        }else{
            AppManager.instance.exitApp(this)
        }
    }


}
