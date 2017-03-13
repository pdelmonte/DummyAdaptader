package org.bts.android.dummyadaptader.adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import org.bts.android.dummyadaptader.data.Item;

/**
 * Created by pedrodelmonte on 13/03/17.
 */

public class MyListAdapter extends ArrayAdapter<Item> {


    public MyListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull Item[] objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
