## 自定义View属性的Butterknife

学习ButterKnife写的一个获取自定义属性的项目，让获取自定义属性更方便快捷，一个注解就搞定。

## 使用示例

```java

```

```xml
<com.simple.attrbutterknife.CustomView
        android:layout_width="match_parent"
        android:layout_height="100dp"
        app:test_boolean="false"
        app:test_color="@android:color/holo_blue_bright"
        app:test_dimension="@dimen/activity_horizontal_margin"
        app:test_float="22"
        app:test_integer="13"
        app:test_string="测试string"
        app:test_string2="测试string2" />
```

## 输出结果
```shell
E/CustomView: testString==测试string
E/CustomView: testString2==测试string2
E/CustomView: testBoolean==false
E/CustomView: testDimension==32.0
E/CustomView: testColor==-16720385
E/CustomView: testFloat==22.0
E/CustomView: testInteger==13
```

## 暂时支持的注解

* `AttrString`
* `AttrBool`
* `AttrDimen`
* `AttrFloat`
* `AttrColor`
* `AttrInt`

## 引入依赖

```java
dependencies {
     compile 'com.simplepeng:attrbutter_library:1.1.0'
     annotationProcessor 'com.simplepeng:attrbutter_compiler:1.1.0'
}
```

