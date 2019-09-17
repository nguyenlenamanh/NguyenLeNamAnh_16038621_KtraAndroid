package com.example.student.nlna_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvHoaHau;
    private ArrayList<HoaHau> hoaHaus;
    private CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvHoaHau = findViewById(R.id.lvHoaHau);
        hoaHaus = new ArrayList<>();
        hoaHaus.add(new HoaHau("Kỳ Duyên",R.drawable.kyduyen, "1990", R.drawable.ukflag));
        hoaHaus.add(new HoaHau("Đặng Thu Thảo",R.drawable.dangthuthao, "1995", R.drawable.ukflag));
        hoaHaus.add(new HoaHau("Nguyễn Thị Huyền",R.drawable.huyen, "1989", R.drawable.ukflag));
        hoaHaus.add(new HoaHau("Thanh Huyền",R.drawable.thanhhuyen, "1979", R.drawable.ukflag));
        hoaHaus.add(new HoaHau("Đỗ Mỹ Linh",R.drawable.mylinh, "1972", R.drawable.ukflag));
        hoaHaus.add(new HoaHau("Kỳ Duyên",R.drawable.kyduyen, "1990", R.drawable.ukflag));
        hoaHaus.add(new HoaHau("Đặng Thu Thảo",R.drawable.dangthuthao, "1995", R.drawable.ukflag));
        hoaHaus.add(new HoaHau("Nguyễn Thị Huyền",R.drawable.huyen, "1989", R.drawable.ukflag));
        hoaHaus.add(new HoaHau("Thanh Huyền",R.drawable.thanhhuyen, "1979", R.drawable.ukflag));
        hoaHaus.add(new HoaHau("Đỗ Mỹ Linh",R.drawable.mylinh, "1972", R.drawable.ukflag));

        customAdapter = new CustomAdapter(this, R.layout.listview_item, hoaHaus);
        lvHoaHau.setAdapter(customAdapter);
    }
}
