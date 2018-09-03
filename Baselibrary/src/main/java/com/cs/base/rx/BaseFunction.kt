package com.cs.base.rx

import com.cs.base.data.protocol.BaseResp
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.functions.Function

/**
 *Create by Chenshuai
 *Date 2018/9/2 15:26
 *Descripton
 */
class BaseFunction<T>:Function<BaseResp<T>,Observable<T>> {
    override fun apply(t: BaseResp<T>): Observable<T>? {
        if (t.status!=0){
            return Observable.error(BaseException(t.status,t.message))
        }
        return Observable.just(t.data)
    }
}