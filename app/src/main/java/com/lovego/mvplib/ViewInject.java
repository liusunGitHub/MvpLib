package com.lovego.mvplib;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by lgs on 2019/4/14.
 */

@Retention(RetentionPolicy.RUNTIME) //运行时注解
@Target(ElementType.TYPE)//类，接口注解（作用域）
public @interface ViewInject {
    int mainLayoutId() default -1;
}

