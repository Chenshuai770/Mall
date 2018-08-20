package com.cs.user.data.api

import com.cs.base.data.protocol.BaseResp
import com.cs.user.data.protocol.RegisterReq
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

/**
 *Create by Chenshuai
 *Date 2018/8/20 8:18
 *Descripton
 */
interface UserApi {
    @POST("userCenter/register")
    fun register(@Body req: RegisterReq):Observable<BaseResp<String>>
}