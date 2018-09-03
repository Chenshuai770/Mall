package com.cs.base.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.cs.base.common.AppManager
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity


/**
LifeCycleOwner 生命周期拥有者，即Activity与Fragment（也可自定义，但局限性大）
LifeCycleObserver 生命周期观察者，可以是任何类，常见的有mvp的p，自定义View等
AppCompatActivity与V4中的Fragment都已默认实现了LifeCyclerOwner接口，
所以可以直接使用。LifeCyclerOwner接口很简单，如下:
 */
open class BaseActivity : RxAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppManager.instance.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        AppManager.instance.exitApp(this)
    }

}
