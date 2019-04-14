package com.lovego.mvplib.splsh;

import com.lovego.mvplib.ILifeCircle;
import com.lovego.mvplib.IMvpView;
import com.lovego.mvplib.MvpControler;

/**
 * Created by lgs on 2019/4/7.
 */

public interface ISplshActivityContract {
    interface Iview extends IMvpView{
        void setTvTimer(String s);
    }


    interface IPresenter extends ILifeCircle{
        void setData();
    }

    Iview emptyView = new Iview() {

        @Override
        public void setTvTimer(String s) {

        }

        @Override
        public MvpControler getMvpControler() {
            return null;
        }
    };
}
