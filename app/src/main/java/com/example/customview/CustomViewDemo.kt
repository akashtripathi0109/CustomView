package com.example.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CustomViewDemo(context: Context?, attrs: AttributeSet?) : View(context, attrs) {
    val paint= Paint(Paint.ANTI_ALIAS_FLAG)
    val faceColor= Color.CYAN
    val borderSize=4.0f
    val borderColor= Color.BLACK
    var size=320
    val paint1= Paint(Paint.ANTI_ALIAS_FLAG)
    val faceColor1= Color.BLUE
    val paint2= Paint(Paint.ANTI_ALIAS_FLAG)
    val faceColor2= Color.DKGRAY
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        drawFace(canvas)
    }
    fun drawFace(canvas: Canvas?) {
        paint.color = faceColor
        paint.style = Paint.Style.FILL_AND_STROKE
        paint1.color = faceColor1
        paint1.style = Paint.Style.FILL_AND_STROKE
        paint2.color = faceColor2
        paint2.style = Paint.Style.FILL_AND_STROKE
        val radius = size / 2f

        canvas?.drawCircle(520/ 2f, 520 / 2f, radius + 100, paint2)
        canvas?.drawCircle(490 / 2f, 490 / 2f, radius + 50, paint1)
        canvas?.drawCircle(480 / 2f, 480 / 2f, radius, paint)

    }
    //Single circle with stroke
//        paint.color=borderColor
//        paint.style= Paint.Style.STROKE
//        paint.strokeWidth=borderSize
//        canvas?.drawCircle(size/2f,size/2f,radius-borderSize,paint)
//    val paint=Paint(Paint.ANTI_ALIAS_FLAG)
//    val faceColor=Color.CYAN
//    val borderSize=4.0f
//    val borderColor=Color.BLACK
//    var size=320
//    override fun onDraw(canvas: Canvas?) {
//        super.onDraw(canvas)
//        drawFace(canvas)
//    }
//    fun drawFace(canvas: Canvas?){
//        paint.color=faceColor
//        paint.style=Paint.Style.FILL
//        val radius=size/2f
//        canvas?.drawCircle(size/2f,size/2f,radius,paint)
//        paint.color=borderColor
//        paint.style=Paint.Style.STROKE
//        paint.strokeWidth=borderSize
//        canvas?.drawCircle(size/2f,size/2f,radius-borderSize,paint)
//    }
}