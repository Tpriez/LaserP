package com.jayco.laserprinting;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Mengly on 2016-07-18.
 */
public class myView extends View {
    Paint paint;
    Bitmap mBitmap;
    Canvas mCanvas;
    public myView (Context context) {
        super (context);
        init(context);

    }

    public myView (Context context, AttributeSet attrs) {
        super (context, attrs);

        init(context);
    }
    private void init(Context context){
        paint=new Paint ();
        paint.setAntiAlias (true);
    }

    @Override
    protected void onSizeChanged (int w, int h, int oldw, int oldh) {
        if(w>0&&h>0){
            mBitmap = Bitmap.createBitmap(w,h,Bitmap.Config.ARGB_8888);
            mCanvas = new Canvas ();
            mCanvas.setBitmap (mBitmap);
            draw1();
        }
        super.onSizeChanged (w, h, oldw, oldh);
    }

    private void draw1(){

        paint.setStyle (Paint.Style.FILL);
        paint.setColor(Color.RED);
        mCanvas.drawRect (100,100,200,200,paint);

        paint.setStyle (Paint.Style.STROKE);
        paint.setARGB(128,0,255,0);
        paint.setStrokeWidth (10.0f);
        mCanvas.drawRect (100,100,200,200,paint);

        paint.setStyle (Paint.Style.STROKE);
        paint.setColor(Color.BLUE);

        DashPathEffect effect = new DashPathEffect (new float[]{5,5},1);
        paint.setPathEffect (effect);
        mCanvas.drawLine (100,300,500,500,paint);

        ShapeDrawable drawable1 = new ShapeDrawable ();
        RectShape shape1= new RectShape ();
        shape1.resize (200,200);
        drawable1.setShape (shape1);
        drawable1.setBounds (300,100,500,300);

        drawable1.draw (mCanvas);

        LinearGradient gradient1 = new LinearGradient (0,0,0,200,Color.RED,Color.YELLOW, Shader.TileMode.CLAMP);
        paint.setShader (gradient1);

        shape1.resize (300,300);
        drawable1.setBounds (400,300,700,600);
        drawable1.draw (mCanvas);

    }
    @Override
    protected void onDraw (Canvas canvas) {
        super.onDraw (canvas);
        if(mBitmap!=null){
            canvas.drawBitmap (mBitmap,0,0,null);
        }
    }
}