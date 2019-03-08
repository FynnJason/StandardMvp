package com.fynnjason.mvp;

import android.view.View;
import android.widget.TextView;

import com.fynnjason.fmvp.activity.BaseMvpActivity;

public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainView {

    private TextView tvtext;

    @Override
    public void initView() {
        tvtext = findViewById(R.id.tv_text);
    }

    @Override
    public void loadData() {
        findViewById(R.id.btn_click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.setText();
            }
        });
    }

    @Override
    public MainPresenter getPresenter() {
        return new MainPresenter();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    public void upText(String s) {
        tvtext.setText(s);
        showToast(s);
    }
}
