package com.hautec.hiotcloud.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * MVP架构Activity基类
 */
public abstract class BaseActivity<V extends BaseView, P extends BasePresenter> extends AppCompatActivity implements BaseView {
    private P presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
        presenter.setView(this);
    }
    public abstract P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.destory();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
