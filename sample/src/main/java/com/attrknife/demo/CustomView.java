package com.attrknife.demo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.AttrRes;
import android.support.annotation.StyleRes;
import android.support.annotation.StyleableRes;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import attrknife.annotation.AttrBool;
import attrknife.annotation.AttrColor;
import attrknife.annotation.AttrDimen;
import attrknife.annotation.AttrDrawable;
import attrknife.annotation.AttrFloat;
import attrknife.annotation.AttrInt;
import attrknife.annotation.AttrString;

import com.attrknife.attrknife.AttrKnife;

public class CustomView extends View {

    @AttrString(R.styleable.CustomView_test_string)
    String testString;

    @AttrBool(R.styleable.CustomView_test_boolean)
    boolean testBoolean;

    @AttrDimen(R.styleable.CustomView_test_dimension)
    float testDimension;

    @AttrColor(R.styleable.CustomView_test_color)
    int testColor;

    @AttrFloat(R.styleable.CustomView_test_float)
    float testFloat;

    @AttrInt(R.styleable.CustomView_test_integer)
    int testInteger;

    @AttrDrawable(R.styleable.CustomView_test_drawable)
    Drawable testDrawable;

    public CustomView(Context context) {
        this(context, null);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);

//        TypedArray obtainStyledAttributes(@StyleableRes int[] attrs)
//        TypedArray obtainStyledAttributes(@StyleRes int resid, @StyleableRes int[] attrs)
//        TypedArray obtainStyledAttributes(AttributeSet set, @StyleableRes int[] attrs)
//        TypedArray obtainStyledAttributes(AttributeSet set, @StyleableRes int[] attrs, @AttrRes int defStyleAttr,
//                                          @StyleRes int defStyleRes)

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.CustomView);
        AttrKnife.bind(this, ta);


        Log.e("CustomView", "testString == " + testString);
        Log.e("CustomView", "testBoolean == " + testBoolean);
        Log.e("CustomView", "testDimension == " + testDimension);
        Log.e("CustomView", "testColor == " + testColor);
        Log.e("CustomView", "testFloat == " + testFloat);
        Log.e("CustomView", "testInteger == " + testInteger);
        setBackground(testDrawable);

//        try {
//            testString = ta.getString(R.styleable.CustomView_test_string);
//            testString2 = ta.getString(R.styleable.CustomView_test_string2);
//            testBoolean = ta.getBoolean(R.styleable.CustomView_test_boolean, false);
//            testDimension = ta.getDimension(R.styleable.CustomView_test_dimension, 19);
//        testDrawable = ta.getDrawable(R.styleable.CustomView_test_drawable);
//            testColor = ta.getColor(R.styleable.CustomView_test_color, Color.BLACK);
//            testFloat = ta.getFloat(R.styleable.CustomView_test_float, 10);
//            testInteger = ta.getInteger(R.styleable.CustomView_test_integer, 10);
//        } finally {
//            ta.recycle();
//        }
    }

}
