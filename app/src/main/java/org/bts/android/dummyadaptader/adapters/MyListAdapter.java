package org.bts.android.dummyadaptader.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.bts.android.dummyadaptader.R;
import org.bts.android.dummyadaptader.data.Item;

/**
 * Created by pedrodelmonte on 13/03/17.
 */

public class MyListAdapter extends ArrayAdapter<Item> {

    String[] mListValues = {"Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2", "Android", "iPhone", "WindowsMobile"};

    private Context mContext;


    public MyListAdapter(Context context, int resource, Item[] objects) {
        super(context, resource, objects);

        this.mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater mInflater = (LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = mInflater.inflate(R.layout.row_layout, null);

        TextView rowBodyTv = (TextView) rowView.findViewById(R.id.tv_body_row_layout);
        rowBodyTv.setText("Body text of the element in position " + position);

        TextView rowTitleTv = (TextView) rowView.findViewById(R.id.tv_title_row_layout);
        rowTitleTv.setText(mListValues[position]);

        return rowView;
    }


}
