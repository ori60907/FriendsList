package com.fundamentals.academy.ori.friendslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView friends_list_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        friends_list_view = (ListView) findViewById(R.id.friends_lv);

        FriendsBaseAdapter adapter = new FriendsBaseAdapter(this, Friend.generateFriendList());
        friends_list_view.setAdapter(adapter);

    }
}
