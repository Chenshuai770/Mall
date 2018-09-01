package com.cs.base.injection.module

import android.content.Context
import com.cs.base.common.BaseApplication

/**
 *Create by Chenshuai
 *Date 2018/8/22 21:34
 *Descripton
 */

class AppModule(private val context: BaseApplication) {

    fun provideContext():Context{
        return this.context
    }
}