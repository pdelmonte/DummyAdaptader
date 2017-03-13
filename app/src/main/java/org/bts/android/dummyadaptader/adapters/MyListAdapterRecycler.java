package org.bts.android.dummyadaptader.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.bts.android.dummyadaptader.R;

/**
 * Created by pedrodelmonte on 13/03/17.
 */

public class MyListAdapterRecycler extends RecyclerView.Adapter<MyListAdapterRecycler.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView icon_ImgView;
        public TextView title_TxtView;
        public TextView body_TxtView;

        public ViewHolder(View itemView){
            super(itemView);

            //this.icon_ImgView = itemView.findViewById();

        }

    }
}
