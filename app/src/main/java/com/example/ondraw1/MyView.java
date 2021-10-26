package com.example.ondraw1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyView extends View {

    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);//抗锯齿
    private float RADIUS = Utils.dp2dx(100f);//半径
    private Path path = new Path();
    private PathMeasure pathMeasure;

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        //false:不闭合。测量完整的path距离。
        //true:闭合，测量两点间的距离。
        pathMeasure = new PathMeasure(path,false);
        pathMeasure.getLength();
        //距离dis处的角度，返回的是tan值
        //pathMeasure.getPosTan(distance)
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //画一条线。单位是px
        canvas.drawLine(100f,100f,200f,200f,paint);

        //画个圆

    }
}
