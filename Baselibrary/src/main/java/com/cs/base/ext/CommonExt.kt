package com.cs.base.ext

import android.view.View
import android.widget.Button
import android.widget.EditText
import com.cs.base.data.protocol.BaseResp
import com.cs.base.rx.BaseFuncBoolean
import com.cs.base.rx.BaseFunction
import com.cs.base.rx.BaseSubscriber
import com.cs.base.wedgets.DefaultTextWatcher
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

//todo 网络请求的封装
fun <T> Observable<T>.execute(subscriber: BaseSubscriber<T>, activity: RxAppCompatActivity) {

    return this.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .compose(activity.bindUntilEvent(ActivityEvent.DESTROY))
            .subscribe(subscriber)
}


//todo flatmap的封装
fun <T> Observable<BaseResp<T>>.convert(): Observable<T> {
    return this.flatMap(BaseFunction())
}

//todo flatmap的封装
fun <T> Observable<BaseResp<T>>.convertBoolean(): Observable<Boolean> {
    return this.flatMap(BaseFuncBoolean())
}


/*
    扩展Button可用性
 */
fun Button.enable(et: EditText, method: () -> Boolean) {
    val btn = this
    et.addTextChangedListener(object : DefaultTextWatcher() {
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            btn.isEnabled = method()
        }
    })
}

/*
    扩展点击事件
 */
fun View.onClick(listener: View.OnClickListener): View {
    setOnClickListener(listener)
    return this
}



