package com.lovego.mvplib.splsh;

import android.util.Log;

import com.lovego.mvplib.IMvpView;
import com.lovego.mvplib.base.BaseMvpPresenter;

/**
 * Created by lgs on 2019/4/7.
 */

public class SplshTimerPresenter extends BaseMvpPresenter<ISplshActivityContract.Iview> implements ISplshActivityContract.IPresenter {


    public SplshTimerPresenter(ISplshActivityContract.Iview iview) {
        super(iview);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("SplshTimerPresenter", "重写onDestroy");
    }

    @Override
    protected ISplshActivityContract.Iview getEmptyView() {
        return ISplshActivityContract.emptyView;
    }

}
