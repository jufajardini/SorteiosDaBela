package com.jufajardini.sorteiosdabela.data;

import android.content.Context;
import android.content.SharedPreferences;

import com.jufajardini.sorteiosdabela.R;

// esta classe serve para armazenar valores que serão úteis para todo o app de modo mais seguro
public class SecurityPreferences {
    private SharedPreferences mSharedPreferences;

    public SecurityPreferences(Context mContext){
        this.mSharedPreferences = mContext.getSharedPreferences("SorteiosDaBela", Context.MODE_PRIVATE);
    }

    // stores the answer about repeating numbers in the drawing
    public void storeString (String key, String value){
        this.mSharedPreferences.edit().putString(key, value).apply();
    }

    // stores range values
    public void storeInt (String key, int value){
        this.mSharedPreferences.edit().putInt(key, value).apply();
    }

    // returns a string, for this app, that stores answer about draw repetition
    public String getStoredString (String key) {
        return this.mSharedPreferences.getString(key, "");
    }

    // returns and int, usually for range start or end
    public int getStoredInt (String key){
        return this.mSharedPreferences.getInt(key, -1);
    }
}
