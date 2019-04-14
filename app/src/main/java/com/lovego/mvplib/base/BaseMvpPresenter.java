package com.lovego.mvplib.base;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.lovego.mvplib.IMvpView;
import com.lovego.mvplib.presenter.LifeCircleMvpPresenter;

/**
 * Created by lgs on 2019/4/7.
 */

public abstract class BaseMvpPresenter<T extends IMvpView> extends LifeCircleMvpPresenter<T> {


    public BaseMvpPresenter(IMvpView iMvpView) {
        super(iMvpView);
    }

    @Override
    public void onCreate(Bundle savedInstanceState, Intent intent, Bundle getArgument) {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onRestart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("SplshTimerPresenter", "base onDestroy");

    }

    @Override
    public void onNewIntent(Intent intent) {

    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

    }


}
