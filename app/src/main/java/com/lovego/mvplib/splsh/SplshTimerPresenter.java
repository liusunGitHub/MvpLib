package com.lovego.mvplib.splsh;

import android.content.Intent;
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
    public void onNewIntent(Intent intent) {

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

    }

    public void setData(){
        getView().setTvTimer("1234");
    }

    @Override
    protected ISplshActivityContract.Iview getEmptyView() {
        return ISplshActivityContract.emptyView;
    }

}
