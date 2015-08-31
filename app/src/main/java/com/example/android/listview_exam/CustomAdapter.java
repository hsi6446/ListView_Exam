
package com.example.android.listview_exam;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by student on 2015-08-31. People data를 다루는 어뎁터
 */

public class CustomAdapter extends BaseAdapter {

    private List<People> mData;

    public CustomAdapter(Context context, List<People> data) {
        mData = data;
    }



    // 리스트뷰에 표시할 item의 갯수
    @Override
    public int getCount() {
        return mData.size();
    }

    //해당 포지션에 위치하는 item을 리턴받음
    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    //해당 포지션에 위치하는 item의 ID
    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     *
     * @param position 포지션
     * @param convertView 포지션의 View
     * @param parent 부모
     * @return 완성 된 레이아웃
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }


}
