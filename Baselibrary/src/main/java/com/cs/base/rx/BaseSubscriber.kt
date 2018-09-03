package com.cs.base.rx

import com.cs.base.presenter.view.BaseView
import io.reactivex.Observer
import io.reactivex.disposables.Disposable


/**
 *Create by Chenshuai
 *Date 2018/8/19 15:09
 *Descripton 抽象出来,一直会复用到
 */
open class BaseSubscriber<T>(val baseView: BaseView): Observer<T>{
    override fun onComplete() {
        baseView.hideLoading()
    }

    override fun onSubscribe(d: Disposable) {
    }

    override fun onNext(t: T) {
    }

    override fun onError(e: Throwable) {
        baseView.hideLoading()
    }

}

