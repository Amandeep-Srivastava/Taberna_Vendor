package com.amandeep.srivastava.tabernavendor;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PieChart pieChart = (PieChart)findViewById(R.id.pieChart);
        List<PieEntry> entries = new ArrayList<>();

        entries.add(new PieEntry(19.1f, "Gadgets"));
        entries.add(new PieEntry(17.3f, "Appliances"));
        entries.add(new PieEntry(3.7f, "Books"));
        entries.add(new PieEntry(20.7f, "Office"));
        entries.add(new PieEntry(5.8f, "Toys"));
        entries.add(new PieEntry(33.4f, "Daily Use"));

        PieDataSet set = new PieDataSet(entries, "Sales for this Month");
        PieData data = new PieData(set);
        pieChart.setData(data);
        pieChart.setHoleRadius(30f);
        pieChart.getLegend().setEnabled(false);
        pieChart.setDescription(null);
        pieChart.setEntryLabelColor(Color.BLACK);
        pieChart.setTransparentCircleRadius(0);
        pieChart.setCenterTextSize(15f);
        data.setValueTextSize(20f);
        pieChart.setCenterText("Monthly Sales");
        pieChart.setHoleColor(Color.parseColor("#4667A8"));
        set.setColors(new int[] {R.color.PIyellow, R.color.PIgreen, R.color.PIblue,R.color.PIred, R.color.PIpurple,R.color.PIgray}, this);
        pieChart.animateXY(1400,1400);

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
                        Intent intent = new Intent("android.intent.action.HOME");
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
