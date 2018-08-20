package com.cs.user.service.iml

import com.cs.base.data.protocol.BaseResp
import com.cs.base.rx.BaseException
import com.cs.user.data.repository.UserRepository
import com.cs.user.service.UserService
import io.reactivex.Observable
import io.reactivex.functions.Function


/**
 *Create by Chenshuai
 *Date 2018/8/19 12:54
 *Descripton
 */
class UserServiceIml : UserService {
    override fun regisiter(mobile: String, pwd: String, verfyCode: String): Observable<Boolean> {
        val repository = UserRepository()
        return repository.regisiter(mobile, pwd, verfyCode)
                .flatMap(object : Function<BaseResp<String>, Observable<Boolean>> {
                    override fun apply(t: BaseResp<String>): Observable<Boolean> {
                        if (t.status != 0) {
                            return Observable.error(BaseException(t.status, t.message))
                        }
                        return Observable.just(true)
                    }
                })


    }

}
