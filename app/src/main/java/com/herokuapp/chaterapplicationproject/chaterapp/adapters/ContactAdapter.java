package com.herokuapp.chaterapplicationproject.chaterapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.herokuapp.chaterapplicationproject.chaterapp.R;
import com.herokuapp.chaterapplicationproject.chaterapp.pojo.ContactObject;

import java.util.List;

/**
 * Created by klu shvartsman on 04/08/2016.
 * Contact Adapter for thew recycler list
 */
public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder> {

    private List<ContactObject> contacts;

    @Override
    public ContactAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ContactAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ContactAdapterViewHolder extends RecyclerView.ViewHolder
    {
        private TextView tv_contact;
        private ImageView iv_contact;

        public ContactAdapterViewHolder(View itemView) {
            super(itemView);
            this.tv_contact = (TextView)itemView.findViewById(R.id.tv_contact);
            this.iv_contact = (ImageView)itemView.findViewById(R.id.iv_contact);
        }
    }
}
