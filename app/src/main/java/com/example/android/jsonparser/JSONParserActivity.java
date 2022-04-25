package com.example.android.jsonparser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class JSONParserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_parser);

        ArrayList<Contact> contacts = getContactsList();

        ContactAdapter adapter = new ContactAdapter(this, contacts);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

    private ArrayList<Contact> getContactsList() {
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("c200", "Ravi Tamada", "ravi@gmail.com",
                "xx-xx-xxxx,x - street, x - country", Gender.MALE, "+91 0000000000"));
        contacts.add(new Contact("c201", "Johnny Depp", "johnny_depp@gmail.com",
                "xx-xx-xxxx,x - street, x - country", Gender.MALE, "+91 0000000000"));
        contacts.add(new Contact("c202", "Leonardo Dicaprio", "leonardo_dicaprio@gmail.com",
                "xx-xx-xxxx,x - street, x - country", Gender.MALE, "+91 0000000000"));
        contacts.add(new Contact("c206", "Adele", "adele@gmail.com",
                "xx-xx-xxxx,x - street, x - country", Gender.FEMALE, "+91 0000000000"));
        contacts.add(new Contact("c2011", "Kate Winslet", "kate_winslet@gmail.com",
                "xx-xx-xxxx,x - street, x - country", Gender.FEMALE, "+91 0000000000"));

        return contacts;
    }
}