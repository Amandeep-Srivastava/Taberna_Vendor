package com.amandeep.srivastava.tabernavendor;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Inventory extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                menuItem.setChecked(true);
                mDrawerLayout.closeDrawers();
                int id = menuItem.getItemId();
                switch(id){
                    case R.id.homes:
                        Intent intent = new Intent("android.intent.action.MAINS");
                        startActivity(intent);
                        return true;
                    case R.id.sales:
                        Intent intent1 = new Intent("android.intent.action.SALES");
                        startActivity(intent1);
                        return true;
                    case R.id.inventory:
                        Intent intent2 = new Intent("android.intent.action.INVENTORY");
                        startActivity(intent2);
                        return true;
                    case R.id.logout:
                        Intent intent3 = new Intent("android.intent.action.LOGOUT");
                        startActivity(intent3);
                        return true;
                }
                return true;
            }
        });
    }
}
