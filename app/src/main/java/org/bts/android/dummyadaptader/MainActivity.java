package org.bts.android.dummyadaptader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.bts.android.dummyadaptader.adapters.MyListAdapter;
import org.bts.android.dummyadaptader.data.Item;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] mListValues = {"Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2", "Android", "iPhone", "WindowsMobile"};

        Item[] listItem = new Item[mListValues.length];

        for (int idx = 0; idx < mListValues.length; idx++) {
            listItem[idx] = new Item("","","");
        }

        final ListView mListView = (ListView) this.findViewById(R.id.list_main_activity);

//        mListView.setAdapter(new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1,
//                mListValues));

        mListView.setAdapter(new MyListAdapter(this, 0, listItem));

        mListView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Element " + position + ", with ID = " + id,Toast.LENGTH_SHORT).show();


    }
}
