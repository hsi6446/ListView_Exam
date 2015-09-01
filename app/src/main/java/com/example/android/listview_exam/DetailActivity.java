package com.example.android.listview_exam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private ImageView mImageView;
    private TextView mNameTextView;
    private TextView mPhoneNumberTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mImageView = (ImageView)findViewById(R.id.imageId);
        mNameTextView = (TextView)findViewById(R.id.name);
        mPhoneNumberTextView = (TextView)findViewById(R.id.phoneNumber);



        //누군가로부터 실행이 되었을 때
        if (getIntent() != null) {
            //나를 호출한 Activity에서 보낸 값
            int imageRes = getIntent().getIntExtra("image", -1);
            String nameRes = getIntent().getStringExtra("name");
            String phoneNumberRes = getIntent().getStringExtra("phoneNumber");

            // 이 값들을 셋팅
            mImageView.setImageResource(imageRes);
            mNameTextView.setText(nameRes);
            mPhoneNumberTextView.setText(phoneNumberRes);
        }
    }



}
