
package com.example.android.listview_exam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> mData;
    private ArrayAdapter<String> mAdapter;
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
            mData.add("Item" + i);
        }
    }

    private void initAdapter() {
        mAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,
                mData);
    }

    private void initListView() {
        ListView mListView = (ListView)findViewById(R.id.list_view);
        mListView.setAdapter(mAdapter);
    }

}
