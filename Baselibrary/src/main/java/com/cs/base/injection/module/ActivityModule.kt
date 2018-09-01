package com.cs.base.injection.module

import android.app.Activity
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity

/**
 *Create by Chenshuai
 *Date 2018/8/22 21:56
 *Descripton
 */

class ActivityModule(private val activity:RxAppCompatActivity) {

    fun provideActivity(): RxAppCompatActivity {
        return this.activity
    }
}