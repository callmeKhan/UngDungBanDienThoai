package com.nguyenminhtri.ungdungbandienthoai.view.giohang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.nguyenminhtri.ungdungbandienthoai.R;
import com.nguyenminhtri.ungdungbandienthoai.view.giohang.custom.custom_listview_spgiohang;

import java.util.ArrayList;

public class ActivityGioHang extends AppCompatActivity {
custom_listview_spgiohang adapter=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gio_hang);
        TextView txt_title=findViewById(R.id.txt_title);


      ArrayList<String> list=new ArrayList<>();
      list.add("sản phẩm thứ nhất");
      list.add("sản phẩm thứ hai");
        list.add("sản phẩm thứ ba");
        list.add("sản phẩm thứ tư");
        list.add("sản phẩm thứ năm");
        list.add("sản phẩm thứ sáu");
        list.add("sản phẩm thứ bảy");

      ListView lv=(ListView) findViewById(R.id.listview_DonHang);
        adapter=new custom_listview_spgiohang(this,R.layout.custom_listview_spgiohang,list);
      lv.setAdapter(adapter);
    }
}
