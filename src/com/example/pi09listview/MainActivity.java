package com.example.pi09listview;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView mListView;
	ArrayList<String> mData = new ArrayList<String>();
	ArrayAdapter<String> mAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// 初期項目
		mData.add("abc");
		mData.add("def");
		mData.add("xyz");
		
		// ListView準備
		mListView = (ListView)findViewById(R.id.listView1);
		mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mData);
		mListView.setAdapter(mAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	// 項目追加
	public void buttonMethodAdd(View button){
		mData.add("hoge");
		mAdapter.notifyDataSetChanged();
	}
	
	// 項目削除
	public void buttonMethodDel(View button){
		if(mData.size() > 0){
			mData.remove(mData.size() - 1);
			mAdapter.notifyDataSetChanged();
		}
	}

}
