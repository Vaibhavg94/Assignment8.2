package com.vaibhav.assignment82;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

class SharedPrefManager {
    private static SharedPreferences getSharedPref(Context mContext) {
        return mContext.getSharedPreferences("settings", Context.MODE_PRIVATE);
    }

    static void setStringPrefVal(Context mContext, String key, String value) {
        Editor edit = getSharedPref(mContext).edit();
        edit.putString(key, value);
        edit.apply();
    }

    static void setIntPrefVal(Context mContext, String key, int value) {
        Editor edit = getSharedPref(mContext).edit();
        edit.putInt(key, value);
        edit.apply();
    }

    static String getPrefVal(Context mContext, String key) {
        SharedPreferences pref = getSharedPref(mContext);
        String val = "";
        if (pref.contains(key))
            val = pref.getString(key, "");
        else
            val = "";
        return val;
    }

    static int getIntPrefVal(Context mContext, String key) {
        SharedPreferences pref = getSharedPref(mContext);
        int val = 0;
        if (pref.contains(key)) val = pref.getInt(key, 0);
        return val;
    }
}
