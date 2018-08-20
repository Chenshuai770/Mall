package com.cs.user.data.repository

import com.cs.base.data.net.RetrofitFactory
import com.cs.base.data.protocol.BaseResp
import com.cs.user.data.api.UserApi
import com.cs.user.data.protocol.RegisterReq
import io.reactivex.Observable

/**
 *Create by Chenshuai
 *Date 2018/8/20 8:25
 *Descripton
 */
class UserRepository {
    fun regisiter(mobile: String, pwd: String, verfyCode: String): Observable<BaseResp<String>>{
        return RetrofitFactory.instance.create(UserApi::class.java).register(RegisterReq(mobile,pwd,verfyCode))
    }

}