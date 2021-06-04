package com.example.ss5recyclerview;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter {
    List<Contact> listContact;
    private Activity activity;

    public ContactAdapter(List<Contact> listContact, Activity activity) {
        this.listContact = listContact;
        this.activity = activity;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = activity.getLayoutInflater().inflate(R.layout.item_contact, parent, false);
        ConTactHolder holder = new ConTactHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ConTactHolder conTactHolder = (ConTactHolder) holder;
        Contact data = listContact.get(position);
        conTactHolder.ivAvatar.setImageResource(data.getAvatar());
        conTactHolder.tvName.setText(data.getName());
        conTactHolder.tvPhone.setText(data.getPhone());

    }

    @Override
    public int getItemCount() {
        if (activity != null){
            return listContact.size();

        }else {
            return 0;
        }
    }

    public class ConTactHolder extends RecyclerView.ViewHolder {
        ImageView ivAvatar;
        TextView tvName;
        TextView tvPhone;

        public ConTactHolder(@NonNull View view) {
            super(view);
            ivAvatar = itemView.findViewById(R.id.ivAvatar);
            tvName = itemView.findViewById(R.id.tvUser);
            tvPhone = itemView.findViewById(R.id.tvPhone);

        }
    }
}
