package com.cs.user.service.iml

import com.cs.user.data.repository.UserRepository
import com.cs.user.service.UserService
import io.reactivex.Observable


/**
 *Create by Chenshuai
 *Date 2018/8/19 12:54
 *Descripton
 */
class UserServiceIml:UserService {
    override fun regisiter(mobile: String, pwd: String, verfyCode: String): Observable<Boolean> {
        val repository=UserRepository()
        return repository.regisiter(mobile, pwd, verfyCode)
                .flatMap {

                    if (it.status!=0){

                    }
                    return@flatMap Observable.just(true)
                }



    }

}
