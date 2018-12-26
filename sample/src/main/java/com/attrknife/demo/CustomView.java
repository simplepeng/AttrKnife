package com.attrknife.demo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.AttrRes;
import android.support.annotation.StyleRes;
import android.support.annotation.StyleableRes;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import attrknife.annotation.AttrBool;
import attrknife.annotation.AttrColor;
import attrknife.annotation.AttrDimen;
import attrknife.annotation.AttrFloat;
import attrknife.annotation.AttrInt;
import attrknife.annotation.AttrString;

import com.attrknife.attrknife.AttrKnife;

public class CustomView extends View {

    @AttrString(R.styleable.CustomView_test_string)
    String testString;

    @AttrString(R.styleable.CustomView_test_string2)
    String testString2;

    @AttrBool(id = R.styleable.CustomView_test_boolean)
    boolean testBoolean;

    @AttrDimen(id = R.styleable.CustomView_test_dimension)
    float testDimension;

    @AttrColor(id = R.styleable.CustomView_test_color)
    int testColor;

    @AttrFloat(id = R.styleable.CustomView_test_float)
    float testFloat;

    @AttrInt(id = R.styleable.CustomView_test_integer)
    int testInteger;

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


        Log.e("CustomView", "testString==" + testString);
        Log.e("CustomView", "testString2==" + testString2);
        Log.e("CustomView", "testBoolean==" + testBoolean);
        Log.e("CustomView", "testDimension==" + testDimension);
        Log.e("CustomView", "testColor==" + testColor);
        Log.e("CustomView", "testFloat==" + testFloat);
        Log.e("CustomView", "testInteger==" + testInteger);


//        try {
//            testString = ta.getString(R.styleable.CustomView_test_string);
//            testString2 = ta.getString(R.styleable.CustomView_test_string2);
//            testBoolean = ta.getBoolean(R.styleable.CustomView_test_boolean, false);
//            testDimension = ta.getDimension(R.styleable.CustomView_test_dimension, 19);
//            testColor = ta.getColor(R.styleable.CustomView_test_color, Color.BLACK);
//            testFloat = ta.getFloat(R.styleable.CustomView_test_float, 10);
//            testInteger = ta.getInteger(R.styleable.CustomView_test_integer, 10);
//        } finally {
//            ta.recycle();
//        }
    }

}
