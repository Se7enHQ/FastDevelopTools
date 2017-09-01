package com.seven.fastdeveloptools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * @Time:2017年9月1日14:24:36
 * @Description协同开发测试
 * @updata:再次提交测试，成功了宋炎就是小傻吊
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        Toast.makeText(MainActivity.this, "宋炎小SB", Toast.LENGTH_LONG);
        Toast.makeText(MainActivity.this, "宋炎小SB", Toast.LENGTH_LONG);

    }

}
