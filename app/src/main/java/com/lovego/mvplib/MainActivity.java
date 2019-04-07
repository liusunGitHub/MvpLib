package com.lovego.mvplib;

import android.os.Bundle;

import com.lovego.mvplib.splsh.ISplshActivityContract;
import com.lovego.mvplib.splsh.SplshTimerPresenter;
import com.lovego.mvplib.view.LifeCircleMvpActivity;

public class MainActivity extends LifeCircleMvpActivity implements ISplshActivityContract.Iview{
    private ISplshActivityContract.IPresenter splshTimerPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        splshTimerPresenter = new SplshTimerPresenter(this);

    }


    @Override
    public void setTvTimer() {

    }
}
