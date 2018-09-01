package com.cs.base.ext

import com.cs.base.rx.BaseSubscriber
import com.trello.rxlifecycle2.LifecycleProvider
import com.trello.rxlifecycle2.android.ActivityEvent
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 *Create by Chenshuai
 *Date 2018/8/19 16:34
 *Descripton
 */
fun <T> Observable<T>.execute(subscriber: BaseSubscriber<T>,activity: RxAppCompatActivity) {

    return this.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .compose(activity.bindUntilEvent(ActivityEvent.DESTROY))
            .subscribe(subscriber)
}