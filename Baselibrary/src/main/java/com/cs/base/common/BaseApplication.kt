package com.cs.base.common

import android.app.Application
import android.content.Context
import com.cs.base.injection.module.AppModule


/**
 *Create by Chenshuai
 *Date 2018/8/22 21:26
 *Descripton
 */
class BaseApplication : Application() {
    lateinit var appModule: AppModule

    override fun onCreate() {
        super.onCreate()
        appModule= AppModule(this)

    }

    /**
     * 全局伴生对象
     */
    companion object {
        lateinit var context: Context
    }

}