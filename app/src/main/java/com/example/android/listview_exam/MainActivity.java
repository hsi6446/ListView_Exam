
package com.example.android.listview_exam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<People> mData;
    private CustomAdapter mAdapter;
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
        mData.add(new People(R.drawable.leva1, "읭읭", "010-8613-8412"));
        mData.add(new People(R.drawable.leva2, "읭읭2", "010-4761-9273"));

        for (int i = 1; i <= 30; i++) {
            mData.add(new People(R.mipmap.ic_launcher, "아무개" + i, "010-0000-0000"));
        }
    }

    private void initAdapter() {
        mAdapter = new CustomAdapter(getApplicationContext(), mData);


    }

    private void initListView() {
        ListView mListView = (ListView) findViewById(R.id.list_view);
        mListView.setAdapter(mAdapter);
    }

}
