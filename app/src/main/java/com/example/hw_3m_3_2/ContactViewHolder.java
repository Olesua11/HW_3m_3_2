package com.example.hw_3m_3_2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private TextView tvContactName;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);

        initView();
    }

    private void initView() {
        tvContactName = itemView.findViewById(R.id.tv_contact_name);

    }

    public void onBind(String contactName){
        tvContactName.setText(contactName);

    }
}