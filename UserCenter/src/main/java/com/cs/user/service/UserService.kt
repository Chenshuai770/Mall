package com.cs.user.service

import io.reactivex.Flowable
import io.reactivex.Observable


/**
 *Create by Chenshuai
 *Date 2018/8/19 11:49
 *Descripton
 */
interface UserService {
    fun regisiter(mobile: String, verfyCode: String, pwd: String): Observable<Boolean>
}

/*
fun main(args: Array<String>) {
    Observable.just("one", "two", "three", "four", "five")
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(Observer);
}*/
