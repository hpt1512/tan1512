package com.example.baikiemtra4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MonAnAdapter extends BaseAdapter {

    Context myContext337;
    int myLayout337;
    List<MonAn> arrayMonAn337;

    public MonAnAdapter(Context context, int layout , List<MonAn> monAnList){
        myContext337 = context;
        myLayout337 = layout;
        arrayMonAn337 = monAnList;
    }
    @Override
    public int getCount() {
        return arrayMonAn337.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) myContext337.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout337, null);

        TextView txtTen = (TextView) convertView.findViewById(R.id.textViewTen);
        txtTen.setText(arrayMonAn337.get(position).ten);
        TextView txtGia = (TextView) convertView.findViewById(R.id.textViewGia);
        txtGia.setText(arrayMonAn337.get(position).gia);
        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.imageviewHinh);
        imgHinh.setImageResource(arrayMonAn337.get(position).hinh);
        return convertView;
    }
}
