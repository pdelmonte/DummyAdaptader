package org.bts.android.dummyadaptader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.bts.android.dummyadaptader.adapters.MyListAdapterRecycler;
import org.bts.android.dummyadaptader.data.Item;

import java.util.ArrayList;
import java.util.List;

public class MainActivityRecycler extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        final RecyclerView mRecyclerView = (RecyclerView) this.findViewById(R.id.recycler_view_list_activity_main_recycler);

        String[] mListValues = {"Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2", "Android", "iPhone", "WindowsMobile"};

        List<Item> listItem = new ArrayList<>();

        for (int idx = 0; idx < mListValues.length; idx++) {
            listItem.add(new Item("", mListValues[idx],"A specific body for RecyclerView Objects"));
        }

        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mRecyclerView.setAdapter(new MyListAdapterRecycler(this, (ArrayList<Item>) listItem));
    }
}
