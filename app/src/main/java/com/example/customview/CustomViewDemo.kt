//package com.example.customview
//
//import android.graphics.Color
//import android.graphics.Paint
//
//class CustomViewDemo {
//    var paint: `val` = Paint(Paint.ANTI_ALIAS_FLAG)
//    var faceColor: `val` = Color.CYAN
//    var borderSize: `val` = 4.0f
//    var borderColor: `val` = Color.BLACK
//    var size: `var` = 320
//    var paint1: `val` = Paint(Paint.ANTI_ALIAS_FLAG)
//    var faceColor1: `val` = Color.BLUE
//    var paint2: `val` = Paint(Paint.ANTI_ALIAS_FLAG)
//    var faceColor2: `val` = Color.DKGRAY
//    var `fun`: override? = null
//    fun onDraw() {
//        super.onDraw(canvas)
//        drawFace(canvas)
//    }
//
//    fun drawFace(): `fun` {
//        paint.color = faceColor
//        paint.style = Paint.Style.FILL_AND_STROKE
//        paint1.color = faceColor1
//        paint1.style = Paint.Style.FILL_AND_STROKE
//        paint2.color = faceColor2
//        paint2.style = Paint.Style.FILL_AND_STROKE
//        val radius: `val` = size / 2f
//        if (canvas)
//            drawCircle(520 / 2f, 520 / 2f, radius + 100, paint2)
//        if (canvas)
//            drawCircle(490 / 2f, 490 / 2f, radius + 50, paint1)
//        if (canvas)
//            drawCircle(480 / 2f, 480 / 2f, radius, paint)
//    } //Single circle with stroke
//    //        paint.color=borderColor
//    //        paint.style= Paint.Style.STROKE
//    //        paint.strokeWidth=borderSize
//    //        canvas?.drawCircle(size/2f,size/2f,radius-borderSize,paint)
//    //    val paint=Paint(Paint.ANTI_ALIAS_FLAG)
//    //    val faceColor=Color.CYAN
//    //    val borderSize=4.0f
//    //    val borderColor=Color.BLACK
//    //    var size=320
//    //    override fun onDraw(canvas: Canvas?) {
//    //        super.onDraw(canvas)
//    //        drawFace(canvas)
//    //    }
//    //    fun drawFace(canvas: Canvas?){
//    //        paint.color=faceColor
//    //        paint.style=Paint.Style.FILL
//    //        val radius=size/2f
//    //        canvas?.drawCircle(size/2f,size/2f,radius,paint)
//    //        paint.color=borderColor
//    //        paint.style=Paint.Style.STROKE
//    //        paint.strokeWidth=borderSize
//    //        canvas?.drawCircle(size/2f,size/2f,radius-borderSize,paint)
//    //    }
//}

package com.example.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class CustomViewDemo(context: Context, attrs: AttributeSet?) : View(context, attrs) {
    // Use init blocks to initialize properties
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val paint1 = Paint(Paint.ANTI_ALIAS_FLAG)
    private val paint2 = Paint(Paint.ANTI_ALIAS_FLAG)
    private var faceColor = Color.CYAN
    private var faceColor1 = Color.BLUE
    private var faceColor2 = Color.DKGRAY
    private var borderSize = 4.0f
    private var borderColor = Color.BLACK
    private var size = 320
    private val mouthPath = Path()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        drawFace(canvas)
        drawEyes(canvas)
        drawMouth(canvas)
    }

    private fun drawFace(canvas: Canvas) {
        paint.color = faceColor
        paint.style = Paint.Style.FILL_AND_STROKE
        paint1.color = faceColor1
        paint1.style = Paint.Style.FILL_AND_STROKE
        paint2.color = faceColor2
        paint2.style = Paint.Style.FILL_AND_STROKE

        val radius = size / 2f
//        canvas.drawCircle(520 / 2f, 520 / 2f, radius + 100, paint2)
//        canvas.drawCircle(490 / 2f, 490 / 2f, radius + 50, paint1)
        canvas.drawCircle(350 / 2f, 350 / 2f, radius, paint)

        // Uncomment this code to draw a circle with stroke
//         paint.color = borderColor
//         paint.style = Paint.Style.STROKE
//         paint.strokeWidth = borderSize
//         canvas.drawCircle(size / 2f, size / 2f, radius - borderSize, paint)
    }

    fun drawEyes(canvas: Canvas?){
        paint.color =Color.BLACK
        paint.style = Paint.Style.FILL
        val leftEye = RectF(size*0.32f, size*0.23f, size*0.43f, size*0.50f)
        canvas?.drawOval(leftEye, paint)
        val rightEye = RectF(size*0.57f, size*0.23f, size*0.68f, size*0.50f)
        canvas?.drawOval(rightEye, paint)
    }

    fun drawMouth(canvas: Canvas?){
        mouthPath.moveTo(size*0.22f, size*0.7f)
        mouthPath.quadTo(size*0.50f,size*0.40f,size*0.78f,size*0.70f)
        mouthPath.quadTo(size*0.50f,size*0.50f,size*0.22f,size*0.70f)
        paint.color =Color.BLACK
        paint.style=Paint.Style.FILL
        canvas?.drawPath(mouthPath,paint)
    }
}
