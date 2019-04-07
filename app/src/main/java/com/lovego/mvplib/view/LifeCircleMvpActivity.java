package com.lovego.mvplib.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.lovego.mvplib.IMvpView;
import com.lovego.mvplib.MvpControler;

/**
 * Created by lgs on 2019/4/7.
 */

public class LifeCircleMvpActivity extends AppCompatActivity implements IMvpView {

    private MvpControler mvpControler;


    @Override
    public MvpControler getMvpControler() {
        if (this.mvpControler == null) {
            this.mvpControler = new MvpControler();
        }
        return mvpControler;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        if (intent == null) {
            intent = new Intent();
        }
        MvpControler mvpcontroler = this.getMvpControler();
        if (mvpcontroler != null) {
            mvpcontroler.onCreate(savedInstanceState, intent, null);
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        MvpControler mvpcontroler = this.getMvpControler();
        if (mvpcontroler != null) {
            mvpcontroler.onResume();
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        MvpControler mvpcontroler = this.getMvpControler();
        if (mvpcontroler != null) {
            mvpcontroler.onRestart();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        MvpControler mvpcontroler = this.getMvpControler();
        if (mvpcontroler != null) {
            mvpcontroler.onStop();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MvpControler mvpcontroler = this.getMvpControler();
        if (mvpcontroler != null) {
            mvpcontroler.onDestroy();
        }
    }


    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        MvpControler mvpcontroler = this.getMvpControler();
        if (mvpcontroler != null) {
            mvpcontroler.onNewIntent(intent);
        }

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        MvpControler mvpcontroler = this.getMvpControler();
        if (mvpcontroler != null) {
            mvpcontroler.onActivityResult(requestCode, resultCode, data);
        }
    }
}
