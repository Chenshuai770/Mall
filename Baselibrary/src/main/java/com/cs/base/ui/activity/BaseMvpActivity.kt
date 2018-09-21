package com.cs.base.ui.activity

import android.os.Bundle
import com.cs.base.injection.module.ActivityModule
import com.cs.base.presenter.BasePresenter
import com.cs.base.presenter.view.BaseView
import com.cs.base.wedgets.ProgressLoading
import org.jetbrains.anko.toast


open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {

    lateinit var mPresenter: T

    lateinit var activityModule: ActivityModule

    private lateinit var mLoadingDialog:ProgressLoading


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityModule = ActivityModule(this)
        mLoadingDialog= ProgressLoading.create(this)

    }
    /*
        显示加载框，默认实现
     */
    override fun showLoading() {
        mLoadingDialog.showLoading()
    }

    /*
    隐藏加载框，默认实现
     */
    override fun hideLoading() {
        mLoadingDialog.hideLoading()
    }

    /*
        错误信息提示，默认实现
     */
    override fun onError(text:String) {
        toast(text)
    }


}