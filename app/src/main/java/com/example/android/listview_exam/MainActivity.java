
package com.example.android.listview_exam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

/**
 * ListView 연습
 */

public class MainActivity extends AppCompatActivity {
    private List<People> mData;
    private CustomAdapter mAdapter;
    private GridView mListView;

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
        mData.add(new People(R.drawable.leva3, "읭읭3", "010-8843-3973"));

        for (int i = 1; i == mData.size(); i++) {
            mData.add(new People(R.mipmap.ic_launcher, "아무개" + i, "010-0000-0000"));
        }
    }

    private void initAdapter() {
        mAdapter = new CustomAdapter(getApplicationContext(), mData);

    }

    private void initListView() {
        GridView mListView = (GridView) findViewById(R.id.list_view);
        mListView.setAdapter(mAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // item이 클릭 되었을 때 동작하는 부분
                // Toast.makeText(getApplicationContext(), "position : " +
                // position, Toast.LENGTH_SHORT).show();
                //
                // 암시적 인텐트
                // 전화걸기
                // Uri uri = Uri.parse("tel: " +
                // mData.get(position).getPhoneNumber());
                // Intent intent = new Intent(Intent.ACTION_DIAL, uri);

                // 화면이동
                // 명시적 인텐트


                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);

                People people = mData.get(position);

                intent.putExtra("image", people.getImageResourceId());
                intent.putExtra("name", people.getName());
                intent.putExtra("phoneNumber", people.getPhoneNumber());

                startActivity(intent);

            }
        });
    }

}
