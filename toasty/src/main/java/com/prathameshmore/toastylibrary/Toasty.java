package com.prathameshmore.toastylibrary;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.prathameshmore.toastylibrary.ToastyBackground;

public class Toasty  extends ToastyBackground {

     // White color for text
    private Context context;
    private View view;
    private LayoutInflater layoutInflater;
    private Toast toast;

    public static final int LENGTH_SHORT = 0;
    public static final int LENGTH_LONG = 1;
    public static final int TOP = Gravity.TOP;
    public static final int BOTTOM = Gravity.BOTTOM;
    public static final int CENTER = Gravity.CENTER;
    public static final int LEFT = Gravity.START;
    public static final int RIGHT = Gravity.END;
    private static final int Y = 50;


    public Toasty(Context context) {
        this.context = context;

    }

    private void init() {
        toast = new Toast(context);
        createView();
    }

    public void primaryToasty(Context context, String text, int duration, int position) {
        toastyType(context,text, duration, Colors.PRIMARY, position, Colors.TEXT_COLOR);
    }

    public void secondaryToasty(Context context, String text, int duration, int position) {
        toastyType(context, text, duration, Colors.SECONDARY, position, Colors.TEXT_COLOR);
    }

    public void infoToasty(Context context, String text, int duration, int position) {
        toastyType(context, text, duration, Colors.INFO, position,Colors.TEXT_COLOR);
    }

    public void lightToasty(Context context, String text, int duration, int position) {
        toastyType(context, text, duration, Colors.LIGHT, position,Colors.DARK_TEXT);
    }

    public void darkToasty(Context context, String text, int duration, int position) {
        toastyType(context, text, duration, Colors.DARK, position,Colors.TEXT_COLOR);
    }

    public void successToasty(Context context, String text, int duration, int position) {
        toastyType(context, text, duration, Colors.SUCCESS, position,Colors.TEXT_COLOR);
    }

    public void dangerToasty(Context context, String text, int duration, int position) {
        toastyType(context, text, duration, Colors.DANGER, position,Colors.TEXT_COLOR);
    }

    public void warningToasty(Context context, String text, int duration, int position) {
        toastyType(context, text,duration, Colors.WARNING, position,Colors.TEXT_COLOR);
    }

    private void createView() {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.toasty_layout, null);
    }

    private Toast toastyType(Context context, String text, int duration, String type, int position, String textColor) {
        init();
        TextView toastyText = view.findViewById(R.id.text);
        LinearLayout linearLayout =  view.findViewById(R.id.linear_layout);
        linearLayout.setBackground(toastyBackground(type));
        toastyText.setTextColor(Color.parseColor(textColor));
        toastyText.setText(text);
        toast.setDuration(duration);
        toast.setGravity(position,0,Toasty.Y);
        toast.setView(view);
        toast.show();
        return toast;
    }

}
