package com.example.rm.recyclerview2;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class PessoaViewHolder extends RecyclerView.ViewHolder {

    TextView nameView;
    TextView ageView;
    TextView photoIdView;

    public PessoaViewHolder(View itemView) {
        super(itemView);
        nameView = (TextView) itemView.findViewById(R.id.tv_name);
        ageView = (TextView) itemView.findViewById(R.id.tv_age);
        photoIdView = (TextView) itemView.findViewById(R.id.tv_photoId);
        itemView.getContext();
        gradient("#f50505");
    }

    void gradient(String color){

        ShapeDrawable mDrawable = new ShapeDrawable(new RectShape());
        mDrawable.getPaint().setShader(new LinearGradient(0,0,1200      ,0,
                Color.parseColor(color),
                Color.parseColor("#fefefe"),
                Shader.TileMode.CLAMP));

        int sdk = android.os.Build.VERSION.SDK_INT;
        if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            itemView.setBackgroundDrawable(mDrawable);
        } else {
            itemView.setBackground(mDrawable);
        }

    }
}
