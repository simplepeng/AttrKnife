## 自定义View属性的Butterknife

学习ButterKnife写的一个获取自定义属性的项目，让获取自定义属性更方便快捷，一个注解就搞定。

## 引入依赖

```java
dependencies {
    implementation 'com.simple:attrknife:1.1.1'
    annotationProcessor 'com.simple:attrknife-compiler:1.1.1'
}
```

## 使用示例

```java
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
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.CustomView);
        AttrKnife.bind(this, ta);

        Log.e("CustomView", "testString == " + testString);
        Log.e("CustomView", "testBoolean == " + testBoolean);
        Log.e("CustomView", "testDimension == " + testDimension);
        Log.e("CustomView", "testColor == " + testColor);
        Log.e("CustomView", "testFloat == " + testFloat);
        Log.e("CustomView", "testInteger == " + testInteger);
        setBackground(testDrawable);
     }

}
```

```xml
<com.attrknife.demo.CustomView
        android:layout_width="100dp"
        android:layout_height="100dp"
        app:test_boolean="false"
        app:test_color="@android:color/holo_blue_bright"
        app:test_dimension="16dp"
        app:test_drawable="@android:color/holo_red_dark"
        app:test_float="22"
        app:test_integer="13"
        app:test_string="测试string" />
```

**切记：被注解的字段不要加`private`**

## 输出结果

```java
testString == 测试string
testBoolean == false
testDimension == 56.0
testColor == -16720385
testFloat == 22.0
testInteger == 13
```

## 支持的注解

* `AttrString`
* `AttrBool`
* `AttrDimen`
* `AttrFloat`
* `AttrColor`
* `AttrInt`
* `AttrDrawable`

## 版本迭代

* 1.1.1 - 重构，增加注解`AttrDrawable`