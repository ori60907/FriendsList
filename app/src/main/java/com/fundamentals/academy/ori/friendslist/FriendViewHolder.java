package com.fundamentals.academy.ori.friendslist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by User on 20/11/2017.
 */

public class FriendViewHolder {
    public TextView friend_name, friend_funfact;

    public static FriendViewHolder OnCreateFriendViewHolder(View view, ViewGroup parent, LayoutInflater mInflater){
        view = mInflater.inflate(R.layout.friend_list_item, parent);
        FriendViewHolder view_holder = new FriendViewHolder();
        view_holder.friend_name = view.findViewById(R.id.friend_name_tv);
        view_holder.friend_funfact = view.findViewById(R.id.friend_funfact_tv);
        view.setTag(view_holder);
        return view_holder;
    }
}
