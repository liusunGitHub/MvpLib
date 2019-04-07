package com.lovego.mvplib;

import android.content.Intent;
import android.os.Bundle;

/**
 * mvp P层生命周期
 */

public interface ILifeCircle {
    void onCreate(Bundle savedInstanceState,Intent intent,Bundle getArguments);
    void onResume();
    void onRestart();
    void onStop();
    void onDestroy();
    void onNewIntent(Intent intent);
    void onActivityResult(int requestCode, int resultCode, Intent data);
    void attachView(IMvpView iMvpView);

}
