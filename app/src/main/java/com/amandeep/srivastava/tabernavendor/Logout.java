package com.amandeep.srivastava.tabernavendor;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Logout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent ii = new Intent(Logout.this,Login.class);
        SharedPreferences sharedPreferences = this.getSharedPreferences(getPackageName(), Context.MODE_PRIVATE);
        sharedPreferences.edit().putInt("LoggedIn",0).apply();
        finish();
        startActivity(ii);

    }
}
