package com.example.android.jsonparser;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {

    public ContactAdapter(Context context, List<Contact> contacts) {
        super(context, 0, contacts);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Contact} object located at this position in the list
        Contact currentContact = getItem(position);

        // Find the email TextView
        TextView emailTextView = listItemView.findViewById(R.id.email);
        // Get the email and set the corresponding TextView
        emailTextView.setText(currentContact.getEmail());

        // Find the mobile phone TextView
        TextView mobileTextView = listItemView.findViewById(R.id.mobile);
        // Get the mobile and set the TextView
        mobileTextView.setText(currentContact.getMobilePhone());

        return listItemView;
    }
}
