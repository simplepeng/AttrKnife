package attrknife.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import attrknife.internal.Const;


@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface AttrInt {

    int value();

    int def() default Const.DEFAULT_INT;
}
