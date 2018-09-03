package com.cs.base.wedgets

import android.app.Dialog
import android.content.Context
import android.graphics.drawable.AnimationDrawable
import android.view.Gravity
import android.widget.ImageView
import com.cs.base.R
import org.jetbrains.anko.find

/**
 *Create by Chenshuai
 *Date 2018/9/2 21:45
 *Descripton 加载对话框封装
 */
class ProgressLoading private constructor(context: Context,theme:Int):Dialog(context,theme) {
    companion object {
        private lateinit var mDialog: ProgressLoading
        private var animDrawable:AnimationDrawable?=null


        fun create(context: Context): ProgressLoading {
            //样式引入
            mDialog= ProgressLoading(context, R.style.LightProgressDialog)
            //设置布局
            mDialog.setContentView(R.layout.progress_dialog)
            mDialog.setCancelable(true)//返回键可取消
            mDialog.setCanceledOnTouchOutside(false)//点击外部不可以取消

            var lp = mDialog.window.attributes
            lp.dimAmount=0.5f //dialog背景透明度
            lp.gravity=Gravity.CENTER
            //设置属性
            mDialog.window.attributes=lp
            //获取动画视图 ankoyongf
            val loadingView= mDialog.find<ImageView>(R.id.iv_loading)
            animDrawable=loadingView.background as AnimationDrawable

            return mDialog
        }

    }
    /*
        显示加载对话框，动画开始
     */
    fun showLoading() {
        super.show()
        animDrawable?.start()
    }

    /*
        隐藏加载对话框，动画停止
     */
    fun hideLoading(){
        super.dismiss()
        animDrawable?.stop()
    }
}