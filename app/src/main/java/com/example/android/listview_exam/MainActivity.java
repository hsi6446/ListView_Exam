
package com.example.android.listview_exam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * ListView 연습
 */

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

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // item이 클릭 되었을 때 동작하는 부분
                Toast.makeText(getApplicationContext(), "position : " + position, Toast.LENGTH_SHORT).show();

                Uri uri = Uri.parse("tel: " + mData.get(position).getPhoneNumber());
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);

                startActivity(intent);


            }
        });
    }


}
