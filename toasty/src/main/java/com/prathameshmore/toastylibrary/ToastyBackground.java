package com.prathameshmore.toastylibrary;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

public class ToastyBackground {

    public Drawable toastyBackground(String color) {
        RoundRectShape rectShape = new RoundRectShape(new float[] {75.0F, 75.0F, 75.0F, 75.0F, 75.0F, 75.0F, 75.0F, 75.0F},null,null);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(rectShape);
        shapeDrawable.getPaint().setColor(Color.parseColor(color));
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;

    }

}
