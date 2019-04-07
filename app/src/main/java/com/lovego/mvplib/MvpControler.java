package com.lovego.mvplib;

import android.content.Intent;
import android.os.Bundle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 静态代理类
 * Created by lgs on 2019/4/7.
 */

public class MvpControler implements ILifeCircle {
    private Set<ILifeCircle> lifeCircles = new HashSet<>();

    public void savePresenter(ILifeCircle iLifeCircle) {
        lifeCircles.add(iLifeCircle);
    }

    @Override
    public void onCreate(Bundle savedInstanceState, Intent intent, Bundle getArguments) {
        Iterator<ILifeCircle> iterator = this.lifeCircles.iterator();
        while (iterator.hasNext()) {
            ILifeCircle next = iterator.next();
            if (intent == null) {
                intent = new Intent();
            }
            if (getArguments == null) {
                getArguments = new Bundle();
            }
            next.onCreate(savedInstanceState, intent, getArguments);
        }


    }

    @Override
    public void onResume() {
        Iterator<ILifeCircle> iterator = this.lifeCircles.iterator();
        while (iterator.hasNext()) {
            ILifeCircle next = iterator.next();
            next.onResume();
        }


    }

    @Override
    public void onRestart() {
        Iterator<ILifeCircle> iterator = this.lifeCircles.iterator();
        while (iterator.hasNext()) {
            ILifeCircle next = iterator.next();
            next.onRestart();
        }


    }

    @Override
    public void onStop() {
        Iterator<ILifeCircle> iterator = this.lifeCircles.iterator();
        while (iterator.hasNext()) {
            ILifeCircle next = iterator.next();
            next.onStop();
        }


    }

    @Override
    public void onDestroy() {
        Iterator<ILifeCircle> iterator = this.lifeCircles.iterator();
        while (iterator.hasNext()) {
            ILifeCircle next = iterator.next();
            next.onDestroy();
        }


    }

    @Override
    public void onNewIntent(Intent intent) {
        Iterator<ILifeCircle> iterator = this.lifeCircles.iterator();
        while (iterator.hasNext()) {
            ILifeCircle next = iterator.next();
            if (intent == null) {
                intent = new Intent();
            }
            next.onNewIntent(intent);
        }


    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Iterator<ILifeCircle> iterator = this.lifeCircles.iterator();
        while (iterator.hasNext()) {
            ILifeCircle next = iterator.next();
            next.onActivityResult(requestCode,resultCode,data);
        }


    }

    @Override
    public void attachView(IMvpView iMvpView) {

    }
}
