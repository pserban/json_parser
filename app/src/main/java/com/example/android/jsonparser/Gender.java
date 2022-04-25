package com.example.android.jsonparser;

public enum Gender {
    MALE(2),
    FEMALE(1);

    private final int mGender;

    private Gender(int gender) {
        this.mGender = gender;
    }
}
