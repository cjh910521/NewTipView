package com.example.chenjianghua.tipview;

import android.content.Context;
import android.graphics.Color;

/**
 * Created by ${chenyn} on 2017/7/13.
 */

public class TipItem {
    private String title;
    private int itemWidth;
    private int textColor = Color.WHITE;

    public TipItem(String title, Context context, int widthDp) {
        this.title = title;
        this.itemWidth = DensityUtil.dip2px(context, widthDp);
    }

    public int getItemWidth() {
        return itemWidth;
    }

    public void setItemWidth(int itemWidth) {
        this.itemWidth = itemWidth;
    }

    public String getTitle() {
        return title;
    }

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
