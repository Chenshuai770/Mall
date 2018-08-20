package com.cs.user.service

import io.reactivex.Flowable
import io.reactivex.Observable


/**
 *Create by Chenshuai
 *Date 2018/8/19 11:49
 *Descripton
 */
interface UserService {
    fun regisiter(mobile: String, pwd: String, verfyCode: String): Observable<Boolean>
}


