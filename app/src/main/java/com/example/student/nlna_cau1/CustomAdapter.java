package com.example.student.nlna_cau1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<HoaHau> {
    Context context;
    int resource;
    ArrayList<HoaHau> hoaHaus;

    public CustomAdapter(@NonNull Context context, int resource, ArrayList<HoaHau> hoaHaus) {
        super(context, resource, hoaHaus);

        this.context = context;
        this.resource = resource;
        this.hoaHaus = hoaHaus;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(resource,null);

            viewHolder = new ViewHolder();

            viewHolder.imgAvatar = convertView.findViewById(R.id.imgAvatar);
            viewHolder.imgCountry = convertView.findViewById(R.id.imgCountry);

            viewHolder.tvName = convertView.findViewById(R.id.tvName);
            viewHolder.tvYear = convertView.findViewById(R.id.tvYear);

            convertView.setTag(viewHolder);

            Log.d("TAGG","Created" + position);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

       /* convertView = LayoutInflater.from(context).inflate(resource,null);
        ImageView imgCountry = convertView.findViewById(R.id.imgCountry);
        ImageView imgAvatar = convertView.findViewById(R.id.imgAvatar);

        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvYear = convertView.findViewById(R.id.tvYear);*/

      /*  imgCountry.setImageResource(hoaHau.getCountry());
        imgAvatar.setImageResource(hoaHau.getAvatar());
        tvYear.setText(hoaHau.getYear());
        tvName.setText(hoaHau.getName());
        Log.d("TAGG","Created" + position);*/

        HoaHau hoaHau = hoaHaus.get(position);

        viewHolder.imgCountry.setImageResource(hoaHau.getCountry());
        viewHolder.imgAvatar.setImageResource(hoaHau.getAvatar());
        viewHolder.tvYear.setText(hoaHau.getYear());
        viewHolder.tvName.setText(hoaHau.getName());

        return convertView;
    }

    public class ViewHolder {
        ImageView imgAvatar, imgCountry;
        TextView tvName, tvYear;
    }
}
