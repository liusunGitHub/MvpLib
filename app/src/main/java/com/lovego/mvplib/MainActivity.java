package com.lovego.mvplib;

import android.os.Bundle;
import android.provider.Settings;
import android.view.KeyEvent;
import android.widget.TextView;

import com.lovego.mvplib.base.BaseActivity;
import com.lovego.mvplib.splsh.ISplshActivityContract;
import com.lovego.mvplib.splsh.SplshTimerPresenter;

@ViewInject(mainLayoutId = R.layout.activity_main)
public class MainActivity extends BaseActivity implements ISplshActivityContract.Iview{
    private ISplshActivityContract.IPresenter splshTimerPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        splshTimerPresenter = new SplshTimerPresenter(this);
        splshTimerPresenter.setData();

    }


    @Override
    public void setTvTimer(String s) {
        ((TextView)findViewById(R.id.tv)).setText(s);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            finish();
            System.exit(0);
            return super.onKeyDown(keyCode, event);
        }
        return super.onKeyDown(keyCode, event);
    }
}
