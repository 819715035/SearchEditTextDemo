# SearchEditTextDemo
自定义搜索框

预览图(转换后有一点点失真):

<img src="https://github.com/wenwenwen888/SearchEditTextDemo/blob/master/preview/1.gif" width="30%" height="30%">

1,没有点击时(搜索icon在中间)

2,点击时(搜索icon在左侧)

3,输入文字时(右侧删除icon出现)

4,点击搜索(触发搜索方法,同时隐藏软键盘)

Usage
--------

With Gradle:
```groovy
  compile 'com.wenwenwen888:searchedittext:1.0.0'
```

需要修改内容可以下载library自己修改

How to use
--------
Add to your layout

```xml
 <com.wyt.searchedittext.SearchEditText
        android:id="@+id/searchEditText"
        app:drawableDel="@drawable/edit_delete"   //delete icon
        android:layout_width="match_parent"
        android:layout_height="40dp"
        android:layout_margin="10dp"
        android:background="@drawable/search_edit_bg"   //背景可以自己更换,也可以用自带的
        android:drawableLeft="@drawable/search"      //搜索 icon
        android:drawablePadding="5dp"
        android:gravity="center_vertical"
        android:hint="搜索"                       //hint
        android:imeOptions="actionSearch"
        android:padding="5dp"
        android:singleLine="true"
        android:textSize="16sp" />
```

Add to your activity

```java
 SearchEditText searchEditText = (SearchEditText) findViewById(R.id.searchEditText);
 
 searchEditText.setOnSearchClickListener(this);//监听搜索事件
 
 @Override
    public void onSearchClick(View view) {
    
        String keyword = searchEditText.getText().toString();
        
        if (!TextUtils.isEmpty(keyword)) {
            //在这里处理逻辑
            Toast.makeText(this, keyword, Toast.LENGTH_SHORT).show();
        }
    }
 ```
 
# License

    Copyright 2016 wenwenwen888

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
        http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
