package com.example.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View

class ArcDemo1(context: Context?): View(context) {
    var p= Paint()
    var x=100
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        p.color= Color.CYAN
        //rectangle
        canvas?.drawRect(100f,100f,500f,500f,p)

        //fan
        canvas?.drawArc(500f, 500f, 800f, 800f, x.toFloat(),30f,true, p)
        canvas?.drawArc(500f, 500f, 800f, 800f, (x+120).toFloat(),30f,true, p)
        canvas?.drawArc(500f, 500f, 800f, 800f, (x+240).toFloat(),30f,true, p)

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN->startFan()
            MotionEvent.ACTION_UP->stopFan()
        }
        return true
    }

    fun startFan() {
        x=x+40
        invalidate()

    }

    fun stopFan() {

    }


}