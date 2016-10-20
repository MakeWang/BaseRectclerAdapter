package com.zmc.meile.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * 所有Activity的父类
 * zmc
 */
public abstract class BaseActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutId());
        ButterKnife.bind(this);
        initData();
        initListener();

    }

    /**
     * 加载布局
     *
     * @return
     */
    public abstract int setLayoutId();

    /**
     * 初始化数据
     */
    public void initData() {}
    /**
     * 监听事件
     */
    public void initListener() {}
}
