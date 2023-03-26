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
import android.widget.Button;

import com.example.imtoken.adapter.GiaoDichAdapter;
import com.example.imtoken.model.GiaoDich;
import com.example.imtoken.my_interface.IClickItemGdList;

import java.util.ArrayList;
import java.util.List;

public class    MainActivityUsdtOut extends AppCompatActivity {

    private Button btnqrcode;

    private RecyclerView rcvGd;
    private GiaoDichAdapter GiaoDichAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_usdt_out);
        //Đổi màu thanh status bar
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(Color.parseColor("#fafafa"));
        //Đổi màu chữ status bar
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        rcvGd = findViewById(R.id.rcvGd);
        GiaoDichAdapter = new GiaoDichAdapter(this, new IClickItemGdList() {
            @Override
            public void onClickItemGd(GiaoDich giaoDich) {
                onClickGoTo(giaoDich);
            }
        });

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvGd.setLayoutManager(linearLayoutManager);

        GiaoDichAdapter.setData(getListGd());
        rcvGd.setHasFixedSize(true);
        rcvGd.setAdapter(GiaoDichAdapter);


        btnqrcode = findViewById(R.id.btnQrCode);
        btnqrcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityUsdtOut.this, MainActivityScan.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
            }
        });

    }

    private List<GiaoDich> getListGd() {
        List<GiaoDich> list = new ArrayList<>();
        list.add(new GiaoDich(1,R.drawable.out, "0x3828...f27a87", "08/10/2022 06:36:21", "-24,386"));
        list.add(new GiaoDich(2,R.drawable.out, "0x37d9...ead8aa", "08/10/2022 06:11:32", "-54,055"));
        list.add(new GiaoDich(3,R.drawable.out, "0xcb8f...aaf5ce", "08/10/2022 06:05:51", "-18,671"));
        list.add(new GiaoDich(4,R.drawable.out, "0xd4d8...8b83d2", "08/09/2022 11:04:03", "-29,596"));
        list.add(new GiaoDich(5,R.drawable.out, "0xd4d8...8b83d2", "08/08/2022 14:34:59", "-44,610"));
        list.add(new GiaoDich(6, R.drawable.out, "0xa499...bddbfe", "08/08/2022 10:27:40", "-99,466"));
        list.add(new GiaoDich(7, R.drawable.out, "0xa499...bddbfe", "08/08/2022 07:56:55", "-35,053"));
        list.add(new GiaoDich(8, R.drawable.out, "0x23dc...da4fc3", "08/07/2022 15:09:01", "-82,909"));
        list.add(new GiaoDich(9, R.drawable.out, "0x23dc...da4fc3", "08/06/2022 14:49:90", "-82,349"));
        list.add(new GiaoDich(10, R.drawable.out, "0xd4d8...8b83d2", "08/05/2022 12:58:28", "-43,273"));
        list.add(new GiaoDich(11, R.drawable.out, "0x23dc...da4fc3", "08/04/2022 07:37:59", "-98,868"));
        list.add(new GiaoDich(12, R.drawable.out, "0xf50a...e7665b", "08/03/2022 06:25:24", "-21,177"));
        list.add(new GiaoDich(13, R.drawable.out, "0x23dc...da4fc3", "08/02/2022 11:47:43", "-73,566"));
        list.add(new GiaoDich(14, R.drawable.out, "0x0bdf...2140b2", "08/02/2022 11:46:08", "-31,691"));
        list.add(new GiaoDich(15, R.drawable.out, "0xd4d8...8b83d2", "08/01/2022 13:03:26", "-68,423"));
        list.add(new GiaoDich(16, R.drawable.out, "0x1fcd...b73287", "08/01/2022 05:28:23", "-85,958"));
        list.add(new GiaoDich(17, R.drawable.out, "0x23dc...da4fc3", "07/31/2022 14:28:41", "-54,055"));
        list.add(new GiaoDich(18, R.drawable.out, "0xd3h4...d20dw1", "07/30/2022 06:36:21", "-100,676"));
        list.add(new GiaoDich(19, R.drawable.out, "0xf028...2j03k3", "07/29/2022 11:26:50", "-17,023"));
        list.add(new GiaoDich(20, R.drawable.out, "0x9d48...k12cct", "07/29/2022 08:12:34", "-132,870"));
        list.add(new GiaoDich(21, R.drawable.out, "0x25g6...f29f4r", "07/28/2022 05:53:28", "-10,618"));
        list.add(new GiaoDich(22, R.drawable.out, "0x2e4d...d4t6g1", "07/27/2022 10:11:32", "-54,654"));
        list.add(new GiaoDich(23, R.drawable.out, "0xfj32...dw2312", "07/27/2022 07:36:21", "-24,346"));
        list.add(new GiaoDich(24, R.drawable.out, "0x3828...f27a87", "07/26/2022 22:50:18", "-200,312"));
        list.add(new GiaoDich(25, R.drawable.out, "0x2e4f...12d5fg", "07/26/2022 09:23:29", "-143,657"));
        list.add(new GiaoDich(26, R.drawable.out, "0xd3ds...g5d356", "07/25/2022 06:12:21", "-29,746"));
        list.add(new GiaoDich(27, R.drawable.out, "0x37d9...ead8aa", "07/25/2022 06:11:32", "-54,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xd3s2...f9d4d3", "07/24/2022 22:56:04", "-150,000"));
        list.add(new GiaoDich(3, R.drawable.out, "0x3es1...gt4rfv", "07/24/2022 12:36:34", "-73,642"));
        list.add(new GiaoDich(4, R.drawable.out, "0xdsg4...6yy4gf", "07/24/2022 06:42:21", "-93,839"));
        list.add(new GiaoDich(5, R.drawable.out, "0x4rf4...5tl3fg", "07/23/2022 21:17:56", "-50,000"));
        list.add(new GiaoDich(1, R.drawable.out, "0x134f...75hgf5", "07/22/2022 19:36:31", "-31,322"));
        list.add(new GiaoDich(2, R.drawable.out, "0xf44h...5t4g6b", "07/22/2022 06:11:32", "-58,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xm5f9...53rdv5", "07/21/2022 17:51:16", "-38,254"));
        list.add(new GiaoDich(4, R.drawable.out, "0x5mg3...f5f3dd", "07/21/2022 09:33:42", "-22,917"));
        list.add(new GiaoDich(5, R.drawable.out, "0x5ttd...4w3efu", "07/21/2022 06:16:12", "-161,297"));
        list.add(new GiaoDich(1, R.drawable.out, "0xgt4r...gf5gr5", "07/21/2022 04:38:29", "-35,386"));
        list.add(new GiaoDich(2, R.drawable.out, "0x37d9...6hfe5t", "07/20/2022 12:11:32", "-54,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xf4d3...kh3g1d", "07/20/2022 05:36:43", "-84,092"));
        list.add(new GiaoDich(3, R.drawable.out, "0xg4w2...ds3e2c", "07/19/2022 22:54:12", "-12,372"));
        list.add(new GiaoDich(4, R.drawable.out, "0x5fd3...fs1e9c", "07/18/2022 21:42:41", "-75,052"));
        list.add(new GiaoDich(5, R.drawable.out, "0xfd3d...f6fsg7", "07/18/2022 09:31:35", "-68,320"));
        list.add(new GiaoDich(1, R.drawable.out, "0x4rvh...bf5tg5", "07/18/2022 06:36:54", "-71,813"));
        list.add(new GiaoDich(2, R.drawable.out, "0x6yf3...24gdt6", "07/17/2022 22:11:32", "-73,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xfd3d...gd4gj6", "07/17/2022 07:32:21", "-56,386"));
        list.add(new GiaoDich(4, R.drawable.out, "0xfr2g...gd2t6y", "07/16/2022 10:35:34", "-200,000"));
        list.add(new GiaoDich(5, R.drawable.out, "0x6yvr...h5fe7j", "07/15/2022 08:12:21", "-142,232"));
        list.add(new GiaoDich(1, R.drawable.out, "0xgr5t...hd0m4e", "07/14/2022 22:35:54", "-84,601"));
        list.add(new GiaoDich(2, R.drawable.out, "0xgd5y...gd5td1", "07/13/2022 23:11:32", "-180,650"));
        list.add(new GiaoDich(3, R.drawable.out, "0xhff5...54nt25", "07/13/2022 09:42:24", "-21,432"));
        list.add(new GiaoDich(3, R.drawable.out, "0x8uh5...fd9e1d", "07/13/2022 04:03:21", "-132,352"));
        list.add(new GiaoDich(4, R.drawable.out, "0x85tr...1d4tgh", "07/12/2022 12:21:52", "-10,012"));
        list.add(new GiaoDich(5, R.drawable.out, "0x24fh...fj3rtc", "07/11/2022 14:36:32", "-31,867"));

        list.add(new GiaoDich(1,R.drawable.out, "0x3828...f27a87", "07/10/2022 06:36:21", "-24,386"));
        list.add(new GiaoDich(2,R.drawable.out, "0x37d9...ead8aa", "07/10/2022 06:11:32", "-54,055"));
        list.add(new GiaoDich(3,R.drawable.out, "0xcb8f...aaf5ce", "07/10/2022 06:05:51", "-18,671"));
        list.add(new GiaoDich(4,R.drawable.out, "0xd4d8...8b83d2", "07/09/2022 11:04:03", "-29,596"));
        list.add(new GiaoDich(5,R.drawable.out, "0xd4d8...8b83d2", "07/08/2022 14:34:59", "-44,610"));
        list.add(new GiaoDich(6, R.drawable.out, "0xa499...bddbfe", "07/08/2022 10:27:40", "-99,466"));
        list.add(new GiaoDich(7, R.drawable.out, "0xa499...bddbfe", "07/08/2022 07:56:55", "-35,053"));
        list.add(new GiaoDich(8, R.drawable.out, "0x23dc...da4fc3", "07/07/2022 15:09:01", "-82,909"));
        list.add(new GiaoDich(9, R.drawable.out, "0x23dc...da4fc3", "07/06/2022 14:49:90", "-82,349"));
        list.add(new GiaoDich(10, R.drawable.out, "0xd4d8...8b83d2", "07/05/2022 12:58:28", "-43,273"));
        list.add(new GiaoDich(11, R.drawable.out, "0x23dc...da4fc3", "07/04/2022 07:37:59", "-98,868"));
        list.add(new GiaoDich(12, R.drawable.out, "0xf50a...e7665b", "07/03/2022 06:25:24", "-21,177"));
        list.add(new GiaoDich(13, R.drawable.out, "0x23dc...da4fc3", "07/02/2022 11:47:43", "-73,566"));
        list.add(new GiaoDich(14, R.drawable.out, "0x0bdf...2140b2", "07/02/2022 11:46:08", "-31,691"));
        list.add(new GiaoDich(15, R.drawable.out, "0xd4d8...8b83d2", "07/01/2022 13:03:26", "-68,423"));
        list.add(new GiaoDich(16, R.drawable.out, "0x1fcd...b73287", "07/01/2022 05:28:23", "-85,958"));
        list.add(new GiaoDich(18, R.drawable.out, "0xd3h4...d20dw1", "06/30/2022 06:36:21", "-100,676"));
        list.add(new GiaoDich(19, R.drawable.out, "0xf028...2j03k3", "06/29/2022 11:26:50", "-17,023"));
        list.add(new GiaoDich(20, R.drawable.out, "0x9d48...k12cct", "06/29/2022 08:12:34", "-132,870"));
        list.add(new GiaoDich(21, R.drawable.out, "0x25g6...f29f4r", "06/28/2022 05:53:28", "-10,618"));
        list.add(new GiaoDich(22, R.drawable.out, "0x2e4d...d4t6g1", "06/27/2022 10:11:32", "-54,654"));
        list.add(new GiaoDich(23, R.drawable.out, "0xfj32...dw2312", "06/27/2022 07:36:21", "-24,346"));
        list.add(new GiaoDich(24, R.drawable.out, "0x3828...f27a87", "06/26/2022 22:50:18", "-200,312"));
        list.add(new GiaoDich(25, R.drawable.out, "0x2e4f...12d5fg", "06/26/2022 09:23:29", "-143,657"));
        list.add(new GiaoDich(26, R.drawable.out, "0xd3ds...g5d356", "06/25/2022 06:12:21", "-29,746"));
        list.add(new GiaoDich(27, R.drawable.out, "0x37d9...ead8aa", "06/25/2022 06:11:32", "-54,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xd3s2...f9d4d3", "06/24/2022 22:56:04", "-150,000"));
        list.add(new GiaoDich(3, R.drawable.out, "0x3es1...gt4rfv", "06/24/2022 12:36:34", "-73,642"));
        list.add(new GiaoDich(4, R.drawable.out, "0xdsg4...6yy4gf", "06/24/2022 06:42:21", "-93,839"));
        list.add(new GiaoDich(5, R.drawable.out, "0x4rf4...5tl3fg", "06/23/2022 21:17:56", "-50,000"));
        list.add(new GiaoDich(1, R.drawable.out, "0x134f...75hgf5", "06/22/2022 19:36:31", "-31,322"));
        list.add(new GiaoDich(2, R.drawable.out, "0xf44h...5t4g6b", "06/22/2022 06:11:32", "-58,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xm5f9...53rdv5", "06/21/2022 17:51:16", "-38,254"));
        list.add(new GiaoDich(4, R.drawable.out, "0x5mg3...f5f3dd", "06/21/2022 09:33:42", "-22,917"));
        list.add(new GiaoDich(5, R.drawable.out, "0x5ttd...4w3efu", "06/21/2022 06:16:12", "-161,297"));
        list.add(new GiaoDich(1, R.drawable.out, "0xgt4r...gf5gr5", "06/21/2022 04:38:29", "-35,386"));
        list.add(new GiaoDich(2, R.drawable.out, "0x37d9...6hfe5t", "06/20/2022 12:11:32", "-54,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xf4d3...kh3g1d", "06/20/2022 05:36:43", "-84,092"));
        list.add(new GiaoDich(3, R.drawable.out, "0xg4w2...ds3e2c", "06/19/2022 22:54:12", "-12,372"));
        list.add(new GiaoDich(4, R.drawable.out, "0x5fd3...fs1e9c", "06/18/2022 21:42:41", "-75,052"));
        list.add(new GiaoDich(5, R.drawable.out, "0xfd3d...f6fsg7", "06/18/2022 09:31:35", "-68,320"));
        list.add(new GiaoDich(1, R.drawable.out, "0x4rvh...bf5tg5", "06/18/2022 06:36:54", "-71,813"));
        list.add(new GiaoDich(2, R.drawable.out, "0x6yf3...24gdt6", "06/17/2022 22:11:32", "-73,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xfd3d...gd4gj6", "06/17/2022 07:32:21", "-56,386"));
        list.add(new GiaoDich(4, R.drawable.out, "0xfr2g...gd2t6y", "06/16/2022 10:35:34", "-200,000"));
        list.add(new GiaoDich(5, R.drawable.out, "0x6yvr...h5fe7j", "06/15/2022 08:12:21", "-142,232"));
        list.add(new GiaoDich(1, R.drawable.out, "0xgr5t...hd0m4e", "06/14/2022 22:35:54", "-84,601"));
        list.add(new GiaoDich(2, R.drawable.out, "0xgd5y...gd5td1", "06/13/2022 23:11:32", "-180,650"));
        list.add(new GiaoDich(3, R.drawable.out, "0xhff5...54nt25", "06/13/2022 09:42:24", "-21,432"));
        list.add(new GiaoDich(3, R.drawable.out, "0x8uh5...fd9e1d", "06/13/2022 04:03:21", "-132,352"));
        list.add(new GiaoDich(4, R.drawable.out, "0x85tr...1d4tgh", "06/12/2022 12:21:52", "-10,012"));
        list.add(new GiaoDich(5, R.drawable.out, "0x24fh...fj3rtc", "06/11/2022 14:36:32", "-31,867"));

        list.add(new GiaoDich(1,R.drawable.out, "0x3828...f27a87", "06/10/2022 06:36:21", "-24,386"));
        list.add(new GiaoDich(2,R.drawable.out, "0x37d9...ead8aa", "06/10/2022 06:11:32", "-54,055"));
        list.add(new GiaoDich(3,R.drawable.out, "0xcb8f...aaf5ce", "06/10/2022 06:05:51", "-18,671"));
        list.add(new GiaoDich(4,R.drawable.out, "0xd4d8...8b83d2", "06/09/2022 11:04:03", "-29,596"));
        list.add(new GiaoDich(5,R.drawable.out, "0xd4d8...8b83d2", "06/08/2022 14:34:59", "-44,610"));
        list.add(new GiaoDich(6, R.drawable.out, "0xa499...bddbfe", "06/08/2022 10:27:40", "-99,466"));
        list.add(new GiaoDich(7, R.drawable.out, "0xa499...bddbfe", "06/08/2022 07:56:55", "-35,053"));
        list.add(new GiaoDich(8, R.drawable.out, "0x23dc...da4fc3", "06/07/2022 15:09:01", "-82,909"));
        list.add(new GiaoDich(9, R.drawable.out, "0x23dc...da4fc3", "06/06/2022 14:49:90", "-82,349"));
        list.add(new GiaoDich(10, R.drawable.out, "0xd4d8...8b83d2", "06/05/2022 12:58:28", "-43,273"));
        list.add(new GiaoDich(11, R.drawable.out, "0x23dc...da4fc3", "06/04/2022 07:37:59", "-98,868"));
        list.add(new GiaoDich(12, R.drawable.out, "0xf50a...e7665b", "06/03/2022 06:25:24", "-21,177"));
        list.add(new GiaoDich(13, R.drawable.out, "0x23dc...da4fc3", "06/02/2022 11:47:43", "-73,566"));
        list.add(new GiaoDich(14, R.drawable.out, "0x0bdf...2140b2", "06/02/2022 11:46:08", "-31,691"));
        list.add(new GiaoDich(15, R.drawable.out, "0xd4d8...8b83d2", "06/01/2022 13:03:26", "-68,423"));
        list.add(new GiaoDich(16, R.drawable.out, "0x1fcd...b73287", "06/01/2022 05:28:23", "-85,958"));
        list.add(new GiaoDich(17, R.drawable.out, "0x23dc...da4fc3", "05/31/2022 14:28:41", "-54,055"));
        list.add(new GiaoDich(18, R.drawable.out, "0xd3h4...d20dw1", "05/30/2022 06:36:21", "-100,676"));
        list.add(new GiaoDich(19, R.drawable.out, "0xf028...2j03k3", "05/29/2022 11:26:50", "-17,023"));
        list.add(new GiaoDich(20, R.drawable.out, "0x9d48...k12cct", "05/29/2022 08:12:34", "-132,870"));
        list.add(new GiaoDich(21, R.drawable.out, "0x25g6...f29f4r", "05/28/2022 05:53:28", "-10,618"));
        list.add(new GiaoDich(22, R.drawable.out, "0x2e4d...d4t6g1", "05/27/2022 10:11:32", "-54,654"));
        list.add(new GiaoDich(23, R.drawable.out, "0xfj32...dw2312", "05/27/2022 07:36:21", "-24,346"));
        list.add(new GiaoDich(24, R.drawable.out, "0x3828...f27a87", "05/26/2022 22:50:18", "-200,312"));
        list.add(new GiaoDich(25, R.drawable.out, "0x2e4f...12d5fg", "05/26/2022 09:23:29", "-143,657"));
        list.add(new GiaoDich(26, R.drawable.out, "0xd3ds...g5d356", "05/25/2022 06:12:21", "-29,746"));
        list.add(new GiaoDich(27, R.drawable.out, "0x37d9...ead8aa", "05/25/2022 06:11:32", "-54,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xd3s2...f9d4d3", "05/24/2022 22:56:04", "-150,000"));
        list.add(new GiaoDich(3, R.drawable.out, "0x3es1...gt4rfv", "05/24/2022 12:36:34", "-73,642"));
        list.add(new GiaoDich(4, R.drawable.out, "0xdsg4...6yy4gf", "05/24/2022 06:42:21", "-93,839"));
        list.add(new GiaoDich(5, R.drawable.out, "0x4rf4...5tl3fg", "05/23/2022 21:17:56", "-50,000"));
        list.add(new GiaoDich(1, R.drawable.out, "0x134f...75hgf5", "05/22/2022 19:36:31", "-31,322"));
        list.add(new GiaoDich(2, R.drawable.out, "0xf44h...5t4g6b", "05/22/2022 06:11:32", "-58,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xm5f9...53rdv5", "05/21/2022 17:51:16", "-38,254"));
        list.add(new GiaoDich(4, R.drawable.out, "0x5mg3...f5f3dd", "05/21/2022 09:33:42", "-22,917"));
        list.add(new GiaoDich(5, R.drawable.out, "0x5ttd...4w3efu", "05/21/2022 06:16:12", "-161,297"));
        list.add(new GiaoDich(1, R.drawable.out, "0xgt4r...gf5gr5", "05/21/2022 04:38:29", "-35,386"));
        list.add(new GiaoDich(2, R.drawable.out, "0x37d9...6hfe5t", "05/20/2022 12:11:32", "-54,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xf4d3...kh3g1d", "05/20/2022 05:36:43", "-84,092"));
        list.add(new GiaoDich(3, R.drawable.out, "0xg4w2...ds3e2c", "05/19/2022 22:54:12", "-12,372"));
        list.add(new GiaoDich(4, R.drawable.out, "0x5fd3...fs1e9c", "05/18/2022 21:42:41", "-75,052"));
        list.add(new GiaoDich(5, R.drawable.out, "0xfd3d...f6fsg7", "05/18/2022 09:31:35", "-68,320"));
        list.add(new GiaoDich(1, R.drawable.out, "0x4rvh...bf5tg5", "05/18/2022 06:36:54", "-71,813"));
        list.add(new GiaoDich(2, R.drawable.out, "0x6yf3...24gdt6", "05/17/2022 22:11:32", "-73,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xfd3d...gd4gj6", "05/17/2022 07:32:21", "-56,386"));
        list.add(new GiaoDich(4, R.drawable.out, "0xfr2g...gd2t6y", "05/16/2022 10:35:34", "-200,000"));
        list.add(new GiaoDich(5, R.drawable.out, "0x6yvr...h5fe7j", "05/15/2022 08:12:21", "-142,232"));
        list.add(new GiaoDich(1, R.drawable.out, "0xgr5t...hd0m4e", "05/14/2022 22:35:54", "-84,601"));
        list.add(new GiaoDich(2, R.drawable.out, "0xgd5y...gd5td1", "05/13/2022 23:11:32", "-180,650"));
        list.add(new GiaoDich(3, R.drawable.out, "0xhff5...54nt25", "05/13/2022 09:42:24", "-21,432"));
        list.add(new GiaoDich(3, R.drawable.out, "0x8uh5...fd9e1d", "05/13/2022 04:03:21", "-132,352"));
        list.add(new GiaoDich(4, R.drawable.out, "0x85tr...1d4tgh", "05/12/2022 12:21:52", "-10,012"));
        list.add(new GiaoDich(5, R.drawable.out, "0x24fh...fj3rtc", "05/11/2022 14:36:32", "-31,867"));

        list.add(new GiaoDich(1,R.drawable.out, "0x3828...f27a87", "05/10/2022 06:36:21", "-24,386"));
        list.add(new GiaoDich(2,R.drawable.out, "0x37d9...ead8aa", "05/10/2022 06:11:32", "-54,055"));
        list.add(new GiaoDich(3,R.drawable.out, "0xcb8f...aaf5ce", "05/10/2022 06:05:51", "-18,671"));
        list.add(new GiaoDich(4,R.drawable.out, "0xd4d8...8b83d2", "05/09/2022 11:04:03", "-29,596"));
        list.add(new GiaoDich(5,R.drawable.out, "0xd4d8...8b83d2", "05/08/2022 14:34:59", "-44,610"));
        list.add(new GiaoDich(6, R.drawable.out, "0xa499...bddbfe", "05/08/2022 10:27:40", "-99,466"));
        list.add(new GiaoDich(7, R.drawable.out, "0xa499...bddbfe", "05/08/2022 07:56:55", "-35,053"));
        list.add(new GiaoDich(8, R.drawable.out, "0x23dc...da4fc3", "05/07/2022 15:09:01", "-82,909"));
        list.add(new GiaoDich(9, R.drawable.out, "0x23dc...da4fc3", "05/06/2022 14:49:90", "-82,349"));
        list.add(new GiaoDich(10, R.drawable.out, "0xd4d8...8b83d2", "05/05/2022 12:58:28", "-43,273"));
        list.add(new GiaoDich(11, R.drawable.out, "0x23dc...da4fc3", "05/04/2022 07:37:59", "-98,868"));
        list.add(new GiaoDich(12, R.drawable.out, "0xf50a...e7665b", "05/03/2022 06:25:24", "-21,177"));
        list.add(new GiaoDich(13, R.drawable.out, "0x23dc...da4fc3", "05/02/2022 11:47:43", "-73,566"));
        list.add(new GiaoDich(14, R.drawable.out, "0x0bdf...2140b2", "05/02/2022 11:46:08", "-31,691"));
        list.add(new GiaoDich(15, R.drawable.out, "0xd4d8...8b83d2", "05/01/2022 13:03:26", "-68,423"));
        list.add(new GiaoDich(16, R.drawable.out, "0x1fcd...b73287", "05/01/2022 05:28:23", "-85,958"));
        list.add(new GiaoDich(18, R.drawable.out, "0xd3h4...d20dw1", "04/30/2022 06:36:21", "-100,676"));
        list.add(new GiaoDich(19, R.drawable.out, "0xf028...2j03k3", "04/29/2022 11:26:50", "-17,023"));
        list.add(new GiaoDich(20, R.drawable.out, "0x9d48...k12cct", "04/29/2022 08:12:34", "-132,870"));
        list.add(new GiaoDich(21, R.drawable.out, "0x25g6...f29f4r", "04/28/2022 05:53:28", "-10,618"));
        list.add(new GiaoDich(22, R.drawable.out, "0x2e4d...d4t6g1", "04/27/2022 10:11:32", "-54,654"));
        list.add(new GiaoDich(23, R.drawable.out, "0xfj32...dw2312", "04/27/2022 07:36:21", "-24,346"));
        list.add(new GiaoDich(24, R.drawable.out, "0x3828...f27a87", "04/26/2022 22:50:18", "-200,312"));
        list.add(new GiaoDich(25, R.drawable.out, "0x2e4f...12d5fg", "04/26/2022 09:23:29", "-143,657"));
        list.add(new GiaoDich(26, R.drawable.out, "0xd3ds...g5d356", "04/25/2022 06:12:21", "-29,746"));
        list.add(new GiaoDich(27, R.drawable.out, "0x37d9...ead8aa", "04/25/2022 06:11:32", "-54,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xd3s2...f9d4d3", "04/24/2022 22:56:04", "-150,000"));
        list.add(new GiaoDich(3, R.drawable.out, "0x3es1...gt4rfv", "04/24/2022 12:36:34", "-73,642"));
        list.add(new GiaoDich(4, R.drawable.out, "0xdsg4...6yy4gf", "04/24/2022 06:42:21", "-93,839"));
        list.add(new GiaoDich(5, R.drawable.out, "0x4rf4...5tl3fg", "04/23/2022 21:17:56", "-50,000"));
        list.add(new GiaoDich(1, R.drawable.out, "0x134f...75hgf5", "04/22/2022 19:36:31", "-31,322"));
        list.add(new GiaoDich(2, R.drawable.out, "0xf44h...5t4g6b", "04/22/2022 06:11:32", "-58,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xm5f9...53rdv5", "04/21/2022 17:51:16", "-38,254"));
        list.add(new GiaoDich(4, R.drawable.out, "0x5mg3...f5f3dd", "04/21/2022 09:33:42", "-22,917"));
        list.add(new GiaoDich(5, R.drawable.out, "0x5ttd...4w3efu", "04/21/2022 06:16:12", "-161,297"));
        list.add(new GiaoDich(1, R.drawable.out, "0xgt4r...gf5gr5", "04/21/2022 04:38:29", "-35,386"));
        list.add(new GiaoDich(2, R.drawable.out, "0x37d9...6hfe5t", "04/20/2022 12:11:32", "-54,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xf4d3...kh3g1d", "04/20/2022 05:36:43", "-84,092"));
        list.add(new GiaoDich(3, R.drawable.out, "0xg4w2...ds3e2c", "04/19/2022 22:54:12", "-12,372"));
        list.add(new GiaoDich(4, R.drawable.out, "0x5fd3...fs1e9c", "04/18/2022 21:42:41", "-75,052"));
        list.add(new GiaoDich(5, R.drawable.out, "0xfd3d...f6fsg7", "04/18/2022 09:31:35", "-68,320"));
        list.add(new GiaoDich(1, R.drawable.out, "0x4rvh...bf5tg5", "04/18/2022 06:36:54", "-71,813"));
        list.add(new GiaoDich(2, R.drawable.out, "0x6yf3...24gdt6", "04/17/2022 22:11:32", "-73,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xfd3d...gd4gj6", "04/17/2022 07:32:21", "-56,386"));
        list.add(new GiaoDich(4, R.drawable.out, "0xfr2g...gd2t6y", "04/16/2022 10:35:34", "-200,000"));
        list.add(new GiaoDich(5, R.drawable.out, "0x6yvr...h5fe7j", "04/15/2022 08:12:21", "-142,232"));
        list.add(new GiaoDich(1, R.drawable.out, "0xgr5t...hd0m4e", "04/14/2022 22:35:54", "-84,601"));
        list.add(new GiaoDich(2, R.drawable.out, "0xgd5y...gd5td1", "04/13/2022 23:11:32", "-180,650"));
        list.add(new GiaoDich(3, R.drawable.out, "0xhff5...54nt25", "04/13/2022 09:42:24", "-21,432"));
        list.add(new GiaoDich(3, R.drawable.out, "0x8uh5...fd9e1d", "04/13/2022 04:03:21", "-132,352"));
        list.add(new GiaoDich(4, R.drawable.out, "0x85tr...1d4tgh", "04/12/2022 12:21:52", "-10,012"));
        list.add(new GiaoDich(5, R.drawable.out, "0x24fh...fj3rtc", "04/11/2022 14:36:32", "-31,867"));

        list.add(new GiaoDich(1,R.drawable.out, "0x3828...f27a87", "04/10/2022 06:36:21", "-24,386"));
        list.add(new GiaoDich(2,R.drawable.out, "0x37d9...ead8aa", "04/10/2022 06:11:32", "-54,055"));
        list.add(new GiaoDich(3,R.drawable.out, "0xcb8f...aaf5ce", "04/10/2022 06:05:51", "-18,671"));
        list.add(new GiaoDich(4,R.drawable.out, "0xd4d8...8b83d2", "04/09/2022 11:04:03", "-29,596"));
        list.add(new GiaoDich(5,R.drawable.out, "0xd4d8...8b83d2", "04/08/2022 14:34:59", "-44,610"));
        list.add(new GiaoDich(6, R.drawable.out, "0xa499...bddbfe", "04/08/2022 10:27:40", "-99,466"));
        list.add(new GiaoDich(7, R.drawable.out, "0xa499...bddbfe", "04/08/2022 07:56:55", "-35,053"));
        list.add(new GiaoDich(8, R.drawable.out, "0x23dc...da4fc3", "04/07/2022 15:09:01", "-82,909"));
        list.add(new GiaoDich(9, R.drawable.out, "0x23dc...da4fc3", "04/06/2022 14:49:90", "-82,349"));
        list.add(new GiaoDich(10, R.drawable.out, "0xd4d8...8b83d2", "04/05/2022 12:58:28", "-43,273"));
        list.add(new GiaoDich(11, R.drawable.out, "0x23dc...da4fc3", "04/04/2022 07:37:59", "-98,868"));
        list.add(new GiaoDich(12, R.drawable.out, "0xf50a...e7665b", "04/03/2022 06:25:24", "-21,177"));
        list.add(new GiaoDich(13, R.drawable.out, "0x23dc...da4fc3", "04/02/2022 11:47:43", "-73,566"));
        list.add(new GiaoDich(14, R.drawable.out, "0x0bdf...2140b2", "04/02/2022 11:46:08", "-31,691"));
        list.add(new GiaoDich(15, R.drawable.out, "0xd4d8...8b83d2", "04/01/2022 13:03:26", "-68,423"));
        list.add(new GiaoDich(16, R.drawable.out, "0x1fcd...b73287", "04/01/2022 05:28:23", "-85,958"));
        list.add(new GiaoDich(17, R.drawable.out, "0x23dc...da4fc3", "03/31/2022 14:28:41", "-54,055"));
        list.add(new GiaoDich(18, R.drawable.out, "0xd3h4...d20dw1", "03/30/2022 06:36:21", "-100,676"));
        list.add(new GiaoDich(19, R.drawable.out, "0xf028...2j03k3", "03/29/2022 11:26:50", "-17,023"));
        list.add(new GiaoDich(20, R.drawable.out, "0x9d48...k12cct", "03/29/2022 08:12:34", "-132,870"));
        list.add(new GiaoDich(21, R.drawable.out, "0x25g6...f29f4r", "03/28/2022 05:53:28", "-10,618"));
        list.add(new GiaoDich(22, R.drawable.out, "0x2e4d...d4t6g1", "03/27/2022 10:11:32", "-54,654"));
        list.add(new GiaoDich(23, R.drawable.out, "0xfj32...dw2312", "03/27/2022 07:36:21", "-24,346"));
        list.add(new GiaoDich(24, R.drawable.out, "0x3828...f27a87", "03/26/2022 22:50:18", "-200,312"));
        list.add(new GiaoDich(25, R.drawable.out, "0x2e4f...12d5fg", "03/26/2022 09:23:29", "-143,657"));
        list.add(new GiaoDich(26, R.drawable.out, "0xd3ds...g5d356", "03/25/2022 06:12:21", "-29,746"));
        list.add(new GiaoDich(27, R.drawable.out, "0x37d9...ead8aa", "03/25/2022 06:11:32", "-54,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xd3s2...f9d4d3", "03/24/2022 22:56:04", "-150,000"));
        list.add(new GiaoDich(3, R.drawable.out, "0x3es1...gt4rfv", "03/24/2022 12:36:34", "-73,642"));
        list.add(new GiaoDich(4, R.drawable.out, "0xdsg4...6yy4gf", "03/24/2022 06:42:21", "-93,839"));
        list.add(new GiaoDich(5, R.drawable.out, "0x4rf4...5tl3fg", "03/23/2022 21:17:56", "-50,000"));
        list.add(new GiaoDich(1, R.drawable.out, "0x134f...75hgf5", "03/22/2022 19:36:31", "-31,322"));
        list.add(new GiaoDich(2, R.drawable.out, "0xf44h...5t4g6b", "03/22/2022 06:11:32", "-58,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xm5f9...53rdv5", "03/21/2022 17:51:16", "-38,254"));
        list.add(new GiaoDich(4, R.drawable.out, "0x5mg3...f5f3dd", "03/21/2022 09:33:42", "-22,917"));
        list.add(new GiaoDich(5, R.drawable.out, "0x5ttd...4w3efu", "03/21/2022 06:16:12", "-161,297"));
        list.add(new GiaoDich(1, R.drawable.out, "0xgt4r...gf5gr5", "03/21/2022 04:38:29", "-35,386"));
        list.add(new GiaoDich(2, R.drawable.out, "0x37d9...6hfe5t", "03/20/2022 12:11:32", "-54,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xf4d3...kh3g1d", "03/20/2022 05:36:43", "-84,092"));
        list.add(new GiaoDich(3, R.drawable.out, "0xg4w2...ds3e2c", "03/19/2022 22:54:12", "-12,372"));
        list.add(new GiaoDich(4, R.drawable.out, "0x5fd3...fs1e9c", "03/18/2022 21:42:41", "-75,052"));
        list.add(new GiaoDich(5, R.drawable.out, "0xfd3d...f6fsg7", "03/18/2022 09:31:35", "-68,320"));
        list.add(new GiaoDich(1, R.drawable.out, "0x4rvh...bf5tg5", "03/18/2022 06:36:54", "-71,813"));
        list.add(new GiaoDich(2, R.drawable.out, "0x6yf3...24gdt6", "03/17/2022 22:11:32", "-73,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xfd3d...gd4gj6", "03/17/2022 07:32:21", "-56,386"));
        list.add(new GiaoDich(4, R.drawable.out, "0xfr2g...gd2t6y", "03/16/2022 10:35:34", "-200,000"));
        list.add(new GiaoDich(5, R.drawable.out, "0x6yvr...h5fe7j", "03/15/2022 08:12:21", "-142,232"));
        list.add(new GiaoDich(1, R.drawable.out, "0xgr5t...hd0m4e", "03/14/2022 22:35:54", "-84,601"));
        list.add(new GiaoDich(2, R.drawable.out, "0xgd5y...gd5td1", "03/13/2022 23:11:32", "-180,650"));
        list.add(new GiaoDich(3, R.drawable.out, "0xhff5...54nt25", "03/13/2022 09:42:24", "-21,432"));
        list.add(new GiaoDich(3, R.drawable.out, "0x8uh5...fd9e1d", "03/13/2022 04:03:21", "-132,352"));
        list.add(new GiaoDich(4, R.drawable.out, "0x85tr...1d4tgh", "03/12/2022 12:21:52", "-10,012"));
        list.add(new GiaoDich(5, R.drawable.out, "0x24fh...fj3rtc", "03/11/2022 14:36:32", "-31,867"));

        list.add(new GiaoDich(1,R.drawable.out, "0x3828...f27a87", "03/10/2022 06:36:21", "-24,386"));
        list.add(new GiaoDich(2,R.drawable.out, "0x37d9...ead8aa", "03/10/2022 06:11:32", "-54,055"));
        list.add(new GiaoDich(3,R.drawable.out, "0xcb8f...aaf5ce", "03/10/2022 06:05:51", "-18,671"));
        list.add(new GiaoDich(4,R.drawable.out, "0xd4d8...8b83d2", "03/09/2022 11:04:03", "-29,596"));
        list.add(new GiaoDich(5,R.drawable.out, "0xd4d8...8b83d2", "03/08/2022 14:34:59", "-44,610"));
        list.add(new GiaoDich(6, R.drawable.out, "0xa499...bddbfe", "03/08/2022 10:27:40", "-99,466"));
        list.add(new GiaoDich(7, R.drawable.out, "0xa499...bddbfe", "03/08/2022 07:56:55", "-35,053"));
        list.add(new GiaoDich(8, R.drawable.out, "0x23dc...da4fc3", "03/07/2022 15:09:01", "-82,909"));
        list.add(new GiaoDich(9, R.drawable.out, "0x23dc...da4fc3", "03/06/2022 14:49:90", "-82,349"));
        list.add(new GiaoDich(10, R.drawable.out, "0xd4d8...8b83d2", "03/05/2022 12:58:28", "-43,273"));
        list.add(new GiaoDich(11, R.drawable.out, "0x23dc...da4fc3", "03/04/2022 07:37:59", "-98,868"));
        list.add(new GiaoDich(12, R.drawable.out, "0xf50a...e7665b", "03/03/2022 06:25:24", "-21,177"));
        list.add(new GiaoDich(13, R.drawable.out, "0x23dc...da4fc3", "03/02/2022 11:47:43", "-73,566"));
        list.add(new GiaoDich(14, R.drawable.out, "0x0bdf...2140b2", "03/02/2022 11:46:08", "-31,691"));
        list.add(new GiaoDich(15, R.drawable.out, "0xd4d8...8b83d2", "03/01/2022 13:03:26", "-68,423"));
        list.add(new GiaoDich(16, R.drawable.out, "0x1fcd...b73287", "03/01/2022 05:28:23", "-85,958"));
        list.add(new GiaoDich(21, R.drawable.out, "0x25g6...f29f4r", "02/28/2022 05:53:28", "-10,618"));
        list.add(new GiaoDich(22, R.drawable.out, "0x2e4d...d4t6g1", "02/27/2022 10:11:32", "-54,654"));
        list.add(new GiaoDich(23, R.drawable.out, "0xfj32...dw2312", "02/27/2022 07:36:21", "-24,346"));
        list.add(new GiaoDich(24, R.drawable.out, "0x3828...f27a87", "02/26/2022 22:50:18", "-200,312"));
        list.add(new GiaoDich(25, R.drawable.out, "0x2e4f...12d5fg", "02/26/2022 09:23:29", "-143,657"));
        list.add(new GiaoDich(26, R.drawable.out, "0xd3ds...g5d356", "02/25/2022 06:12:21", "-29,746"));
        list.add(new GiaoDich(27, R.drawable.out, "0x37d9...ead8aa", "02/25/2022 06:11:32", "-54,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xd3s2...f9d4d3", "02/24/2022 22:56:04", "-150,000"));
        list.add(new GiaoDich(3, R.drawable.out, "0x3es1...gt4rfv", "02/24/2022 12:36:34", "-73,642"));
        list.add(new GiaoDich(4, R.drawable.out, "0xdsg4...6yy4gf", "02/24/2022 06:42:21", "-93,839"));
        list.add(new GiaoDich(5, R.drawable.out, "0x4rf4...5tl3fg", "02/23/2022 21:17:56", "-50,000"));
        list.add(new GiaoDich(1, R.drawable.out, "0x134f...75hgf5", "02/22/2022 19:36:31", "-31,322"));
        list.add(new GiaoDich(2, R.drawable.out, "0xf44h...5t4g6b", "02/22/2022 06:11:32", "-58,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xm5f9...53rdv5", "02/21/2022 17:51:16", "-38,254"));
        list.add(new GiaoDich(4, R.drawable.out, "0x5mg3...f5f3dd", "02/21/2022 09:33:42", "-22,917"));
        list.add(new GiaoDich(5, R.drawable.out, "0x5ttd...4w3efu", "02/21/2022 06:16:12", "-161,297"));
        list.add(new GiaoDich(1, R.drawable.out, "0xgt4r...gf5gr5", "02/21/2022 04:38:29", "-35,386"));
        list.add(new GiaoDich(2, R.drawable.out, "0x37d9...6hfe5t", "02/20/2022 12:11:32", "-54,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xf4d3...kh3g1d", "02/20/2022 05:36:43", "-84,092"));
        list.add(new GiaoDich(3, R.drawable.out, "0xg4w2...ds3e2c", "02/19/2022 22:54:12", "-12,372"));
        list.add(new GiaoDich(4, R.drawable.out, "0x5fd3...fs1e9c", "02/18/2022 21:42:41", "-75,052"));
        list.add(new GiaoDich(5, R.drawable.out, "0xfd3d...f6fsg7", "02/18/2022 09:31:35", "-68,320"));
        list.add(new GiaoDich(1, R.drawable.out, "0x4rvh...bf5tg5", "02/18/2022 06:36:54", "-71,813"));
        list.add(new GiaoDich(2, R.drawable.out, "0x6yf3...24gdt6", "02/17/2022 22:11:32", "-73,055"));
        list.add(new GiaoDich(3, R.drawable.out, "0xfd3d...gd4gj6", "02/17/2022 07:32:21", "-56,386"));
        list.add(new GiaoDich(4, R.drawable.out, "0xfr2g...gd2t6y", "02/16/2022 10:35:34", "-200,000"));

        list.add(new GiaoDich(5, R.drawable.out, "0x2e39...ccb07e", "02/13/2022 20:14:16", "-41,462"));
        list.add(new GiaoDich(1, R.drawable.out, "0x88b4...9dc9f1", "02/13/2022 15:44:39", "-15,314"));
        list.add(new GiaoDich(2, R.drawable.out, "0x0ed6...d444c6", "02/13/2022 15:18:55", "-200,000"));
        list.add(new GiaoDich(3, R.drawable.out, "0x6cf6...395aac", "02/13/2022 14:58:05", "-30,628"));
        list.add(new GiaoDich(3, R.drawable.out, "0x0cfa...d63cfa", "02/13/2022 14:13:20", "-22,971"));
        list.add(new GiaoDich(4, R.drawable.out, "0x23dc...da4fc3", "02/13/2022 00:02:32", "-332,573"));
        list.add(new GiaoDich(5, R.drawable.out, "0xaa...eaee0d", "02/12/2022 21:40:48", "-135,628"));

//Giao dịch 1
        list.add(new GiaoDich(100, R.drawable.out, "0xab13...67b99a", "02/12/2022 21:38:37", "-46,317"));
        list.add(new GiaoDich(1,R.drawable.out, "0x95e5...84465d", "02/12/2022 20:38:31", "-50,000"));
        list.add(new GiaoDich(1, R.drawable.out, "0x95e5...84465d", "02/12/2022 20:27:49", "-50,000"));
        list.add(new GiaoDich(2, R.drawable.out, "0xaa08...eaee0d", "02/12/2022 19:29:04", "-46,012"));
        list.add(new GiaoDich(3, R.drawable.out, "0x92cb...58ceed", "02/12/2022 18:45:04", "-15,384"));
        list.add(new GiaoDich(1, R.drawable.out, "0x4ef5...fb3052", "02/12/2022 15:22:35", "-80,000"));
        list.add(new GiaoDich(2, R.drawable.out, "0x2e39...ccb07e", "02/12/2022 14:35:55", "-30,675"));
        list.add(new GiaoDich(3, R.drawable.out, "0x88b4...9dc9f1", "02/12/2022 14:19:24", "-23,006"));
        //Dữ liệu giả

        list.add(new GiaoDich(1,R.drawable.out, "0x3828...f27a87", "02/11/2022 06:36:21", "-24,386"));
        list.add(new GiaoDich(2,R.drawable.out, "0x37d9...ead8aa", "02/11/2022 06:11:32", "-54,055"));
        list.add(new GiaoDich(3,R.drawable.out, "0xcb8f...aaf5ce", "02/10/2022 06:05:51", "-18,671"));
        list.add(new GiaoDich(4,R.drawable.out, "0xd4d8...8b83d2", "02/09/2022 11:04:03", "-29,596"));
        list.add(new GiaoDich(5,R.drawable.out, "0xd4d8...8b83d2", "02/08/2022 14:34:59", "-44,610"));
        list.add(new GiaoDich(6, R.drawable.out, "0xa499...bddbfe", "02/08/2022 10:27:40", "-99,466"));
        list.add(new GiaoDich(7, R.drawable.out, "0xa499...bddbfe", "02/08/2022 07:56:55", "-35,053"));
        list.add(new GiaoDich(8, R.drawable.out, "0x23dc...da4fc3", "02/07/2022 15:09:01", "-82,909"));
        list.add(new GiaoDich(9, R.drawable.out, "0x23dc...da4fc3", "02/06/2022 14:49:90", "-82,349"));
        list.add(new GiaoDich(10, R.drawable.out, "0xd4d8...8b83d2", "02/05/2022 12:58:28", "-43,273"));
        list.add(new GiaoDich(11, R.drawable.out, "0x23dc...da4fc3", "02/04/2022 07:37:59", "-98,868"));
        list.add(new GiaoDich(12, R.drawable.out, "0xf50a...e7665b", "02/03/2022 06:25:24", "-21,177"));
        list.add(new GiaoDich(13, R.drawable.out, "0x23dc...da4fc3", "02/02/2022 11:47:43", "-73,566"));
        list.add(new GiaoDich(14, R.drawable.out, "0x0bdf...2140b2", "02/02/2022 11:46:08", "-31,691"));
        list.add(new GiaoDich(15, R.drawable.out, "0xd4d8...8b83d2", "02/01/2022 13:03:26", "-68,423"));
        list.add(new GiaoDich(16, R.drawable.out, "0x1fcd...b73287", "02/01/2022 05:28:23", "-85,958"));
        list.add(new GiaoDich(17, R.drawable.out, "0x23dc...da4fc3", "01/31/2022 14:28:41", "-54,055"));
        list.add(new GiaoDich(18, R.drawable.out, "0xd3h4...d20dw1", "01/30/2022 06:36:21", "-100,676"));
        list.add(new GiaoDich(19, R.drawable.out, "0xf028...2j03k3", "01/29/2022 11:26:50", "-17,023"));
        list.add(new GiaoDich(20, R.drawable.out, "0x9d48...k12cct", "01/29/2022 08:12:34", "-132,870"));
        list.add(new GiaoDich(21, R.drawable.out, "0x25g6...f29f4r", "01/28/2022 05:53:28", "-10,618"));
        list.add(new GiaoDich(22, R.drawable.out, "0x2e4d...d4t6g1", "01/27/2022 10:11:32", "-54,654"));
        list.add(new GiaoDich(23, R.drawable.out, "0xfj32...dw2312", "01/27/2022 07:36:21", "-24,346"));
        list.add(new GiaoDich(24, R.drawable.out, "0x3828...f27a87", "01/26/2022 22:50:18", "-200,312"));
        list.add(new GiaoDich(25, R.drawable.out, "0x2e4f...12d5fg", "01/26/2022 09:23:29", "-143,657"));
        list.add(new GiaoDich(26, R.drawable.out, "0xd3ds...g5d356", "01/26/2022 06:12:21", "-29,746"));

        //Dữ liệu thật
        list.add(new GiaoDich(1,R.drawable.out, "0x6af3...216e0e", "01/25/2022 18:05:40", "-30,817"));
        list.add(new GiaoDich(1, R.drawable.out, "0x6af3...216e0e", "01/25/2022 14:17:30", "-46,255"));
        list.add(new GiaoDich(2, R.drawable.out, "0x6af3...216e0e", "01/25/2022 14:14:51", "-46,225"));
        list.add(new GiaoDich(1,R.drawable.out, "0x6af3...216e0e", "01/25/2022 14:10:50", "-100,000"));
        list.add(new GiaoDich(1, R.drawable.out, "0x6af3...216e0e", "01/25/2022 11:16:44", "-15,408"));
        list.add(new GiaoDich(2, R.drawable.out, "0x6af3...216e0e", "01/25/2022 10:37:47", "-42,225"));
        list.add(new GiaoDich(3, R.drawable.out, "0xaa08...eaee0d", "01/24/2022 22:12:05", "-276,393"));
        list.add(new GiaoDich(1, R.drawable.out, "0xaa08...eaee0d", "01/24/2022 22:10:38", "-75,219"));
        list.add(new GiaoDich(2, R.drawable.out, "0xaa08...eaee0d", "01/24/2022 22:08:06", "-35,343"));
        list.add(new GiaoDich(3, R.drawable.out, "0xaa08...eaee0d", "01/24/2022 22:06:15", "-61,824"));
        //Giao dịch 2
        list.add(new GiaoDich(111,R.drawable.out, "0xab13...67b99a", "01/24/2022 16:52:09", "-154,560"));
        list.add(new GiaoDich(1, R.drawable.out, "0xaa08...eaee0d", "01/24/2022 16:04:09", "-77,280"));
        list.add(new GiaoDich(2, R.drawable.out, "0x8d47...1e077c", "01/24/2022 15:52:36", "-15,456"));
        list.add(new GiaoDich(3, R.drawable.out, "0x23dc...da4fc3", "01/23/2022 12:36:21", "-241,546"));
        list.add(new GiaoDich(1, R.drawable.out, "0x0df7...58825a", "01/23/2022 19:52:45", "-19,427"));
        list.add(new GiaoDich(2, R.drawable.out, "0x95e5...84465d", "01/23/2022 19:14:19", "-100,000"));
        list.add(new GiaoDich(3, R.drawable.out, "0x4ef5...fb3052", "01/23/2022 13:16:07", "-100,000"));
        return list;
    }

    private void onClickGoTo(GiaoDich giaoDich) {
        if (giaoDich.getGiaoDichId() == 100) {
            Intent intent = new Intent(MainActivityUsdtOut.this, MainActivityGD1.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
        } else if (giaoDich.getGiaoDichId() == 111) {
            Intent intent = new Intent(MainActivityUsdtOut.this, MainActivityGD2.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
        }
    }
}