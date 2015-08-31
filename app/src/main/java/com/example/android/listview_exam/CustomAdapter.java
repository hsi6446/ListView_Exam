
package com.example.android.listview_exam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by student on 2015-08-31. People data를 다루는 어뎁터
 */

public class CustomAdapter extends BaseAdapter {

    private List<People> mData;
    private Context mContext;

    public CustomAdapter(Context context, List<People> data) {
        mData = data;
        mContext = context;
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
        ViewHolder viewHolder;

        // 1. 레이아웃 구성


        //convertView 처음 로딩될 때 초기화 과정을 거쳐서 viewHolder 에 저장
        if(convertView == null) {
            View rootView = LayoutInflater.from(mContext).inflate(R.layout.item_people, parent, false);
        } else {
            //convertView 가 다시 로딩 될 때에는 viewHolder 에서 꺼내와서 재사용
            //이점 : 속도가 빠르다.
        }

        // 2. 레이아웃에 데이터를 바인딩

        // 3. 완성된 view 를 리턴

        return null;
    }


    static class ViewHolder {
        ImageView imageView;
        TextView name;
        TextView phone;
    }


}
