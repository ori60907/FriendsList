package com.fundamentals.academy.ori.friendslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by User on 20/11/2017.
 */

public class FriendsBaseAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<Friend> friends_array;
    private LayoutInflater mInflater;

    public FriendsBaseAdapter(Context context, ArrayList<Friend> friends){
        friends_array = friends;
        mContext = context;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return friends_array.size();
    }

    @Override
    public Object getItem(int position) {
        return friends_array.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Friend friend_data;
        FriendViewHolder viewHolder;

        friend_data = (Friend) getItem(position);

        if (null == view){
            viewHolder = FriendViewHolder.OnCreateFriendViewHolder(view, viewGroup, mInflater);

        }
        else{
            viewHolder = (FriendViewHolder) view.getTag();
        }

        viewHolder.friend_name.setText(friend_data.getName());
        viewHolder.friend_funfact.setText(friend_data.getFunFact());

        return view;
    }
}
