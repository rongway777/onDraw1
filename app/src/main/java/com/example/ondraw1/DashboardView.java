package com.example.ondraw1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DashboardView extends View {

    private final static float OPEN_ANGLE = 120f;
    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    {
        paint.setStrokeWidth(Utils.dp2dx(3f));
        paint.setStyle(Paint.Style.STROKE);

    }
    public DashboardView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DashboardView(Context context) {
        super(context);
    }

    /**
     * 仪表盘开口角度：120°
     */
    @Override
    protected void onDraw(Canvas canvas) {

        canvas.drawArc(
                getWidth()/2f-Utils.dp2dx(150),
                getHeight()/2f-Utils.dp2dx(150),
                getWidth()/2f+Utils.dp2dx(150),
                getHeight()/2f+Utils.dp2dx(150),
                90 + OPEN_ANGLE/2,//根据坐标系，得到起始角度
                360 - OPEN_ANGLE,//要画多少度
                false,//true:起始位置和终点位置要不要和原点连起来。
                paint);
    }
}
