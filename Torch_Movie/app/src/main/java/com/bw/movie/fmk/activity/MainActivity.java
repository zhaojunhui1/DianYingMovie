package com.bw.movie.fmk.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.bw.movie.R;
import com.bw.movie.fmk.base.BasefActivity;

public class MainActivity extends BasefActivity {

    private TextView miao;
    private SharedPreferences sp;
    private int time = 3;

    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 0){
                if (time>0){
                    time--;
                    miao.setText(time+"s");
                    handler.sendEmptyMessageDelayed(0,1000);
                }else{
                    //存值
                    sp.edit().putBoolean("flag",true).commit();
                    Intent intent = new Intent(MainActivity.this, YinDaoActivity.class);
                    startActivity(intent);
                    handler.removeCallbacksAndMessages(null);
                    finish();
                }
            }
        }
    };

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        miao = fvd(R.id.miao);
    }

    @Override
    protected void initData() {
        sp = getSharedPreferences("key",MODE_PRIVATE);
        boolean flag = sp.getBoolean("flag", false);
        if (flag){
            Intent intent = new Intent(MainActivity.this, YinDaoActivity.class);
            startActivity(intent);
            finish();
        }else{
            handler.sendEmptyMessageDelayed(0,1000);
        }
    }
}
