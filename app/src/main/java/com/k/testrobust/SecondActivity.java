package com.k.testrobust;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

	@Override
//	@Modify
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		TextView textView2 = (TextView) findViewById(R.id.textView2);
		textView2.setText("1132132131");
//		textView2.setText(getInfo());
	}

//	@Add
//	public String getInfo(){
//		return "aaaaaaaa";
//	}
}
