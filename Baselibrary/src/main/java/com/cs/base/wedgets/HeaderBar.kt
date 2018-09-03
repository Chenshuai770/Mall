package com.cs.base.wedgets

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import com.cs.base.R
import kotlinx.android.synthetic.main.layout_header_bar.view.*

/**
 *Create by Chenshuai
 *Date 2018/9/2 21:17
 *Descripton
 */
class HeaderBar @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private var isShowBack=true
    private var titleText:String?=null
    private var rightText:String?=null

    init {
        val typedArray=context.obtainStyledAttributes(attrs,R.styleable.HeaderBar)
        isShowBack=typedArray.getBoolean(R.styleable.HeaderBar_isShowBack,true)
        titleText=typedArray.getString(R.styleable.HeaderBar_titleText)
        rightText=typedArray.getString(R.styleable.HeaderBar_rightText)

        //todo 初始化视图
        initView()
        typedArray.recycle()
    }

    private fun initView() {
        View.inflate(context,R.layout.layout_header_bar,this)
        mLeftIv.visibility=if (isShowBack) View.VISIBLE else View.GONE

        titleText?.let {
            mTitleTv.text=it
        }
        rightText?.let {
            mRightTv.text=it
            mRightTv.visibility= View.VISIBLE
        }

    }


}