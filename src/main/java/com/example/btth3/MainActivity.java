package com.example.btth3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView txt1 ;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.selection);
//1. Khởi tạo dữ liệu cho mảng arr (còn gọi là data source)
        final String arr1[] = {"Iphone 7", "SamSung Galaxy S7",
                "Nokia Lumia 730", "Sony Xperia XZ","HTC One E9"};
//2. Khai báo Adapter và gán Data source vào ArrayAdapter
        ArrayAdapter<String> adapter1 =
                new
                        ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr1);
//3. Khai báo Listview và đưa Adapter vào ListView
        ListView lv1 = findViewById(R.id.lv1);
        lv1.setAdapter(adapter1);
//4. Viết sự kiện khi Click vào một dòng trên ListView
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                txt1.setText("Vị trí " + position + " : " + arr1[position]);
            }
        });
    }
}
