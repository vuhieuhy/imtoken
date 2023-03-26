package com.example.imtoken;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityLoginHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login_home);
        //Đổi màu thanh status bar
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(Color.parseColor("#fafafa"));
        //Đổi màu chữ status bar
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        final Button button = findViewById(R.id.btndangNhap);
        final EditText editText = findViewById(R.id.edtpass);

        //editText.isCursorVisible();
        //editText.requestFocus();
        //editText.setCursorVisible(true);
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.setTextColor(Color.parseColor("#ffffff"));
                button.setBackgroundColor(Color.parseColor("#00acc1"));
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
                Intent intent = new Intent(MainActivityLoginHome.this, MainActivityHome.class);
                startActivity(intent);
            }
        });
    }

    private void showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivityLoginHome.this, R.style.AlertDialog);
        View view = LayoutInflater.from(MainActivityLoginHome.this).inflate(R.layout.dialog,findViewById(R.id.layoutdialog));
        builder.setView(view);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}