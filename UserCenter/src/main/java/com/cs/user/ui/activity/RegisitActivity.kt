package com.cs.user.ui.activity


import android.os.Bundle
import android.util.Log
import android.view.View
import com.cs.base.common.AppManager
import com.cs.base.ext.OnClick
import com.cs.base.ui.activity.BaseMvpActivity
import com.cs.user.R
import com.cs.user.R.id.mBtnRegister
import com.cs.user.presenter.RegistPresenter
import com.cs.user.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_regisit.*
import org.jetbrains.anko.toast

class RegisitActivity : BaseMvpActivity<RegistPresenter>(), RegisterView {

    private var pressTime :Long = 0
    override fun onRegisterResult(result: String) {
        toast(result)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regisit)
        mPresenter = RegistPresenter()  //实例化presenter
        mPresenter.mView = this  //实例化mview
        mPresenter.mActivity = this  //实例化activity
        lifecycle.addObserver(mPresenter)
        mBtnRegister.setOnClickListener {
            mPresenter.register("13567594934", "123456", "123456")
            // mPresenter.login( )

        }
        mBtnTest.OnClick(object : View.OnClickListener {
            override fun onClick(v: View?) {
                finish()
            }
        })
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy", "onDestroy")
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
