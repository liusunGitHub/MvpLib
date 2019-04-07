package com.lovego.mvplib.presenter;

import com.lovego.mvplib.ILifeCircle;
import com.lovego.mvplib.IMvpView;
import com.lovego.mvplib.MvpControler;

import java.lang.ref.WeakReference;

/**
 * Created by lgs on 2019/4/7.
 */

public abstract class LifeCircleMvpPresenter<T> implements ILifeCircle {
    protected WeakReference<T> weakReference;

    public LifeCircleMvpPresenter(IMvpView iMvpView) {
        super();
        attachView(iMvpView);
        MvpControler mvpControler = iMvpView.getMvpControler();
        if (mvpControler != null) {
            mvpControler.savePresenter(this);
        }

    }

    @Override
    public void attachView(IMvpView iMvpView) {
        if (weakReference == null) {
            weakReference = new WeakReference(iMvpView);
        } else {
            T view = (T) weakReference.get();
            if (view != iMvpView) {
                weakReference = new WeakReference(iMvpView);
            }
        }

    }

    @Override
    public void onDestroy() {
        weakReference = null;
    }

    protected T getView() {
        T view = weakReference != null ? weakReference.get() : null;
        if (view == null) {
            return getEmptyView();
        }
        return view;
    }

    protected abstract T getEmptyView();
}
