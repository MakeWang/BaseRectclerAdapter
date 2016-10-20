package com.zmc.meile.common;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * 所有Fragment的父类
 * zmc
 */
public abstract class BaseFragment extends Fragment {


    private View mRootView;
    protected Context mContext;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        mRootView =inflater.inflate(setLayoutId(),container,false);
        ButterKnife.bind(this,mRootView);
        this.mContext=getActivity();
        initData(savedInstanceState);
        initListener();
        return mRootView;


    }

    /**
     * 加载布局
     * @return
     */
    public abstract int setLayoutId();
    /**
     * 初始化数据
     * @param savedInstanceState
     */
    protected  abstract void  initData(Bundle savedInstanceState);

    /**
     * 监听事件
     */
    public void initListener() {
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        //解绑
        ButterKnife.unbind(this);
    }
}
