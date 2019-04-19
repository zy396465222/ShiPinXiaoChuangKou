package com.example.lenovo.shipinxiaochuangkou;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.lenovo.shipinxiaochuangkou.xiao.TinyWindowPlayActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 小窗口播放
     */
    private Button mBtnA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtnA = (Button) findViewById(R.id.btn_a);
        mBtnA.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btn_a:
                startActivity(new Intent(MainActivity.this, TinyWindowPlayActivity.class));

                break;
        }
    }
}
