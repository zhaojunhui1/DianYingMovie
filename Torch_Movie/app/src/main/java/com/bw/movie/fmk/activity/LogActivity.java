package com.bw.movie.fmk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.bw.movie.R;
import com.bw.movie.fmk.base.BasefActivity;
import com.bw.movie.fmk.mvp.v.VInterface;
import com.facebook.drawee.view.SimpleDraweeView;

public class LogActivity extends BasefActivity implements VInterface.VInterfaceDengLu {

    private EditText phone;
    private EditText pwd;
    private SimpleDraweeView yanjing;
    private CheckBox jizhu;
    private TextView kuai_zhu;
    private Button denglu;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_log;
    }

    @Override
    protected void initView() {
        phone = fvd(R.id.phone);
        phone = fvd(R.id.pwd);
        yanjing = fvd(R.id.yanjing);
        jizhu = fvd(R.id.jizhu);
        kuai_zhu = fvd(R.id.kuai_zhu);
        denglu = fvd(R.id.denglu);

    }

    //数据
    @Override
    protected void initData() {

        //快速注册
       kuai_zhu.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(LogActivity.this, ZhuCeActivity.class);
               startActivity(intent);
               finish();
           }
       });
    }

    @Override
    public void showDengLu(Object object) {

    }
}
