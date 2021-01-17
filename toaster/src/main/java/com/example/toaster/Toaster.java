package com.example.toaster;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Toaster {
    private Toast toast;
    public Toaster(Context context, String message) {
        toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.FILL_HORIZONTAL| Gravity.BOTTOM, 0, 0);
    }
    public void setBackground(String color){
        View view = toast.getView();
        int background_color = Color.parseColor(color);
        view.getBackground().setColorFilter(background_color, PorterDuff.Mode.SRC_IN);
    }
    public void setTextColor(String color){
        View view = toast.getView();
        TextView text = view.findViewById(android.R.id.message);
        int text_color = Color.parseColor(color);
        text.setTextColor(text_color);
    }

    public void show(){
        toast.show();
    }
}
