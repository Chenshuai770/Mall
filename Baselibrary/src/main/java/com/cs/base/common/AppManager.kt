package com.cs.base.common

import android.app.Activity
import android.app.ActivityManager
import android.content.Context
import java.util.*

/**
 *Create by Chenshuai
 *Date 2018/9/2 18:06
 *Descripton
 */
class AppManager private constructor() {

    private val activityStack: Stack<Activity> = Stack()

    //todo 伴生对象 不能直接加载
    companion object {
        val instance: AppManager by lazy { AppManager() }
    }

    /**
     * 入栈
     */
    fun addActivity(activity: Activity): Unit {
        activityStack.add(activity)
    }

    /**
     * 出栈
     */
    fun finishActivity(activity: Activity): Unit {
        activity.finish()
        activityStack.remove(activity)
    }

    /**
     * 当前栈顶的activity
     */
    fun currentActivity(): Activity {
        return activityStack.lastElement()
    }

    /**
     * 清理栈
     */
    fun finishAllActivity(){
        for (activity in activityStack){
            activity.finish()
        }
        activityStack.clear()
    }
    fun exitApp(context: Context){
        finishAllActivity()
        var activityManager = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        activityManager.killBackgroundProcesses(context.packageName)
        System.exit(0)

    }

}