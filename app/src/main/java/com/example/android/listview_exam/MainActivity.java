
package com.example.android.listview_exam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private List<Map<String, String>> mData;
    private SimpleAdapter mAdapter;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. 데이터 준비
        initData();

        // 2. 어뎁터 준비
        initAdapter();

        // 3. List view에 어뎁터 장착

        initListView();

    }

    private void initData() {
        mData = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            Map<String, String> data = new HashMap<>();
            data.put("item", "item" + i);
            data.put("subitem", "Sub Item" + i);
            mData.add(data);
        }
    }

    private void initAdapter() {
        mAdapter = new SimpleAdapter(getApplicationContext(), mData,
                android.R.layout.simple_list_item_2, new String[] {
                        "item", "subitem"
                }, new int[] {
                        android.R.id.text1, android.R.id.text2
                });

    }

    private void initListView() {
        ListView mListView = (ListView) findViewById(R.id.list_view);
        mListView.setAdapter(mAdapter);
    }

}
