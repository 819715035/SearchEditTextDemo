package com.wyt.searchedittextdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity implements SearchEditText.OnSearchClickListener {

    private SearchEditText searchEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchEditText = (SearchEditText) findViewById(R.id.searchEditText);

        //搜索事件
        searchEditText.setOnSearchClickListener(this);
    }

    /**
     * 搜索事件
     */
    @Override
    public void onSearchClick(View view) {
        String keyword = searchEditText.getText().toString();
        if (!keyword.equals("")) {
            //在这里处理逻辑
            Toast.makeText(this, keyword, Toast.LENGTH_SHORT).show();
        }
    }
}
