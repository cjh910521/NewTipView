package com.example.chenjianghua.tipview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RelativeLayout rootView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rootView = findViewById(R.id.rootView);
        button = findViewById(R.id.button);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int[] location = new int[2];
        view.getLocationOnScreen(location);
        float x = (float) location[0];
        float y = (float) location[1];

        List<TipItem> items = new ArrayList<>();

        items.add(new TipItem("复制", this, 60));
        items.add(new TipItem("转发", this, 60));
        items.add(new TipItem("撤回", this, 60));
        items.add(new TipItem("删除", this, 60));
        items.add(new TipItem("添加到表情", this, 110));

        new TipView.Builder(this, rootView, (int) x + view.getWidth() / 2,
                (int) y - DensityUtil.dip2px(this, 30))
                .addItems(items)
                .setOnItemClickListener(new TipListener())
                .create();
    }

    private class TipListener implements TipView.OnItemClickListener {

        @Override
        public void onItemClick(String type, int position, View v) {
            switch (type) {
                case "复制":

//                    break;
                case "转发":

//                    break;
                case "撤回":

//                    break;
                case "删除":

//                    break;
                case "添加到表情":
                    Toast.makeText(MainActivity.this, type, Toast.LENGTH_SHORT).show();
                    break;
            }
        }

        @Override
        public void dismiss() {

        }
    }


}
