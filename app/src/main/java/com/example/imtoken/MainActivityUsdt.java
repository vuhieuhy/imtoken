package com.example.imtoken;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.imtoken.adapter.GiaoDichAdapter;
import com.example.imtoken.model.GiaoDich;
import com.example.imtoken.my_interface.IClickItemGdList;

import java.util.ArrayList;
import java.util.List;

public class MainActivityUsdt extends AppCompatActivity {

    private RecyclerView rcvGd;
    private com.example.imtoken.adapter.GiaoDichAdapter GiaoDichAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_usdt);
        //Đổi màu thanh status bar
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(Color.parseColor("#fafafa"));
        //Đổi màu chữ status bar
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        rcvGd = findViewById(R.id.lvgd);
        GiaoDichAdapter = new GiaoDichAdapter(this, new IClickItemGdList() {
            @Override
            public void onClickItemGd(GiaoDich giaoDich) {

            }
        });

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvGd.setLayoutManager(linearLayoutManager);

        GiaoDichAdapter.setData(getListGd());
        rcvGd.setHasFixedSize(true);
        rcvGd.setAdapter(GiaoDichAdapter);

        final ImageView imvfooter = findViewById(R.id.imv2);

        imvfooter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityUsdt.this, MainActivityScan.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
            }
        });


        final ImageView imvout = findViewById(R.id.imvout);
        imvout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityUsdt.this, MainActivityUsdtOut.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_in);
            }
        });

    }

    private List<GiaoDich> getListGd(){
        List<GiaoDich> list = new ArrayList<>();
        list.add(new GiaoDich(1,R.drawable.out, "0x3828...f27a87", "08/10/2022 06:36:21", "-24,386"));
        list.add(new GiaoDich(2,R.drawable.out, "0x37d9...ead8aa", "08/10/2022 06:11:32", "-54,055"));
        list.add(new GiaoDich(3,R.drawable.out, "0xcb8f...aaf5ce", "08/10/2022 06:05:51", "-18,671"));
        list.add(new GiaoDich(4,R.drawable.out, "0xd4d8...8b83d2", "08/09/2022 11:04:03", "-29,596"));
        list.add(new GiaoDich(5,R.drawable.out, "0xd4d8...8b83d2", "08/08/2022 14:34:59", "-44,610"));
        list.add(new GiaoDich(6, R.drawable.in, "0xa499...bddbfe", "08/08/2022 10:27:40", "-99,466"));

        return list;
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.right, R.anim.left);
    }
}