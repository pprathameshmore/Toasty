package com.prathameshmore.toastylibrary;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
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


    public Toasty(Context context) {
        this.context = context;
    }

    public void primaryToasty(Context context, String text, int duration) {
        toastyType(context,text, duration, Colors.PRIMARY).show();
    }

    public void secondaryToasty(Context context, String text, int duration) {
        toastyType(context, text, duration, Colors.SECONDARY).show();
    }

    public void infoToasty(Context context, String text, int duration) {
        toastyType(context, text, duration, Colors.INFO).show();
    }

    public void lightToasty(Context context, String text, int duration) {
        toastyType(context, text, duration, Colors.LIGHT).show();
    }

    public void darkToasty(Context context, String text, int duration) {
        toastyType(context, text, duration, Colors.DARK).show();
    }

    public void successToasty(Context context, String text, int duration) {
        toastyType(context, text, duration, Colors.SUCCESS).show();
    }

    public void dangerToasty(Context context, String text, int duration) {
        toastyType(context, text, duration, Colors.DANGER).show();
    }

    public void warningToasty(Context context, String text, int duration) {
        toastyType(context, text,duration, Colors.WARNING).show();
    }

    private void createView() {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.toasty_layout, null);
    }

    private Toast toastyType(Context context, String text, int duration, String type) {
        Toast toast = new Toast(context);
        createView();
        TextView toastyText = view.findViewById(R.id.text);
        LinearLayout linearLayout =  view.findViewById(R.id.linear_layout);
        linearLayout.setBackground(toastyBackground(type));
        toastyText.setTextColor(Color.parseColor(Colors.TEXT_COLOR));
        toastyText.setText(text);
        toast.setDuration(duration);
        toast.setView(view);
        return toast;
    }







}
