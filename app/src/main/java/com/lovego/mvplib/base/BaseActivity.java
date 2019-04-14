package com.lovego.mvplib.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.lovego.mvplib.ViewInject;
import com.lovego.mvplib.view.LifeCircleMvpActivity;

/**
 * Created by lgs on 2019/4/14.
 */

public class BaseActivity extends LifeCircleMvpActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewInject annotation = this.getClass().getAnnotation(ViewInject.class);
        if (annotation != null) {
            int layoutId = annotation.mainLayoutId();
            if (layoutId > 0) {
                setContentView(layoutId);
            }
        }
    }
}
