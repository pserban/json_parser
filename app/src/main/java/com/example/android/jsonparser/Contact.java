package com.example.android.jsonparser;

public class Contact  {
    private String mID;
    private String mName;
    private String mEmail;
    private String mAddress;
    private Gender mGender;
    private String mMobilePhone;

    public Contact(String id, String name, String email, String address, Gender gender, String mobilePhone) {
        mID = id;
        mName = name;
        mEmail = email;
        mAddress = address;
        mGender = gender;
        mMobilePhone = mobilePhone;
    }

    public String getID() { return mID; }
    public String getName() { return mName; }
    public String getEmail() { return mEmail; }
    public String getAddress() { return mAddress; }
    public Gender getGender() { return mGender; }
    public String getMobilePhone() { return mMobilePhone; }
}
