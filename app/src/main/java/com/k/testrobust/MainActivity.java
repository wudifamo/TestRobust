package com.k.testrobust;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.meituan.robust.Patch;
import com.meituan.robust.PatchExecutor;
import com.meituan.robust.RobustCallBack;

import java.util.List;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				new PatchExecutor(MainActivity.this, new PatchManipulateImp(), new RobustCallBack() {
					@Override
					public void onPatchListFetched(boolean result, boolean isNet, List<Patch> patches) {
						Log.i("---", "onPatchListFetched");
					}

					@Override
					public void onPatchFetched(boolean result, boolean isNet, Patch patch) {
						Log.i("---", "onPatchFetched");
					}

					@Override
					public void onPatchApplied(boolean result, Patch patch) {
						Log.i("---", "applied");
					}

					@Override
					public void logNotify(String log, String where) {
						Log.i("---", "logNotify");
					}

					@Override
					public void exceptionNotify(Throwable throwable, String where) {
						Log.i("---", "exceptionNotify");
					}
				}).start();
			}
		});

		findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this,SecondActivity.class));
			}
		});
	}

}
