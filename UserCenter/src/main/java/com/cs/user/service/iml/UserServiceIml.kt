package com.cs.user.service.iml

import com.cs.user.service.UserService
import io.reactivex.Flowable
import io.reactivex.Observable


/**
 *Create by Chenshuai
 *Date 2018/8/19 12:54
 *Descripton
 */
class UserServiceIml:UserService {
    override fun regisiter(mobile: String, verfyCode: String, pwd: String): Observable<Boolean> {
        return Observable.just(true)
    }

}