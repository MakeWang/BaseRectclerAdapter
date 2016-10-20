package com.zmc.meile;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.zmc.meile.common.BaseActivity;

import butterknife.Bind;

/**
 *
 */
public class MainActivity   extends BaseActivity{


    @Bind(R.id.ceshi)
    Button ceShi;

    @Override
    public int setLayoutId() {
        return R.layout.main_layout;
    }


    /**
     * 初始化数据
     */
    @Override
    public void initData() {

    }

    /**
     * 监听事件
     */
    @Override
    public void initListener() {

    }
}
