package com.fynnjason.mvp;

import android.view.View;
import android.widget.TextView;

import com.fynnjason.fmvp.fragment.BaseMvpFragment;

public class MainFragment extends BaseMvpFragment<MainPresenter> implements MainView {

    @Override
    public MainPresenter getPresenter() {
        return new MainPresenter();
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_activity;
    }

    private TextView mTextView;

    @Override
    public void initView() {
        mTextView = mView.findViewById(R.id.tv_text);
    }

    @Override
    public void loadData() {
        mView.findViewById(R.id.btn_click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.setText();
            }
        });
    }

    @Override
    public void upText(String s) {
        mTextView.setText(s);
        showToast(s);
    }
}
