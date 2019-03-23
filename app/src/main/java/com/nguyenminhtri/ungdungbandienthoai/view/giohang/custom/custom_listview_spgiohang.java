package com.nguyenminhtri.ungdungbandienthoai.view.giohang.custom;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.nguyenminhtri.ungdungbandienthoai.R;
import java.util.ArrayList;

public class custom_listview_spgiohang extends ArrayAdapter<String> {
    Activity context = null;
    ArrayList<String> myArray;
    int layoutId;

    public custom_listview_spgiohang(Activity context, int layoutId, ArrayList<String> arr) {
        super(context, layoutId, arr);
        this.context = context;
        this.layoutId = layoutId;
        this.myArray = arr;
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= context.getLayoutInflater();
        convertView=inflater.inflate(layoutId, null);
        if(myArray.size()>0 && position>=0)
        {
            final TextView txtdisplay=(TextView) convertView.findViewById(R.id.txt_tenSanpham);
            TextView txt_title=(TextView) convertView.findViewById(R.id.txt_title);

               txtdisplay.setText(myArray.get(position));

        }
        return convertView;
    }
}
