package com.lovego.mvplib.splsh;

import com.lovego.mvplib.ILifeCircle;
import com.lovego.mvplib.IMvpView;
import com.lovego.mvplib.MvpControler;

/**
 * Created by lgs on 2019/4/7.
 */

public interface ISplshActivityContract {
    interface Iview extends IMvpView{
        void setTvTimer();
    }


    interface IPresenter extends ILifeCircle{}

    Iview emptyView = new Iview() {

        @Override
        public void setTvTimer() {

        }

        @Override
        public MvpControler getMvpControler() {
            return null;
        }
    };
}
