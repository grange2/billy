package com.springspirit.billyclient;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

/**
 * Created by grange on 2016. 9. 20..
 */
public class CustomView extends View {
    public CustomView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.LTGRAY);

        Paint paint = new Paint();
//        paint.setColor(Color.BLUE);
//        canvas.drawCircle(100,100,50,paint);
//
//        paint.setColor(0x5000ffff);
//        canvas.drawCircle(300,300,300,paint);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sba);
        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT));
        canvas.drawRect(10,10,600,600,paint);
//        canvas.drawBitmap(bitmap,100,100,null);
    }

    //    @Override
//    protected void onDraw(Canvas canvas)
//    {
//        canvas.drawColor(Color.GREEN);
//
//        Paint paint = new Paint();
//        paint.setColor(Color.BLUE);
//        canvas.drawCircle(100,100,50,paint);
//
//        paint.setColor(Color.RED);
//        canvas.drawCircle(200,200,70,paint);
//
//    }
}
