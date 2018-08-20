package com.cs.base.data.protocol

/**
 *Create by Chenshuai
 *Date 2018/8/20 8:16
 *Descripton
 */
class BaseResp<out T>(val status:Int,val message:String,val data:T)