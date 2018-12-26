package com.attrknife.attrknife;

import java.lang.reflect.Method;

public final class AttrKnife {

    @SuppressWarnings("unchecked")
    public static void bind(Object target, Object attrs) {
        try {
            String cla = target.getClass().getName() + "_ViewBinder";
            Class clazz = Class.forName(cla);
            Object instance = clazz.newInstance();
            Method bind = clazz.getMethod("bind", Object.class, Object.class);
            bind.invoke(instance, target, attrs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
