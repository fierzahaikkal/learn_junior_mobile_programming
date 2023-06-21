package com.example.pboandroid.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pboandroid.R;

public class NegaraAdapter extends BaseAdapter {
    TextView text1, text2;
    ImageView img;
    String[][] data;
    Activity activity;

    public NegaraAdapter(String[][] data, Activity activity) {
        super();
        this.data = data;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return data[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(activity);
            v = vi.inflate(R.layout.activity_list_view, null);
        }
        Object p = getItem(i);

        if (p != null) {
            img = v.findViewById(R.id.imgView);
            text1 = v.findViewById(R.id.text1);
            text2 = v.findViewById(R.id.text2);

            int id = activity.getResources().getIdentifier(data[i][2], "drawable", activity.getPackageName());
            @SuppressLint("UseCompatLoadingForDrawables") Drawable drawable = activity.getResources().getDrawable(id);

            img.setImageDrawable(drawable);
            text1.setText(data[i][0]);
            text2.setText(data[i][1]);
        }
        return view;
    }
}
