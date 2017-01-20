package com.amandeep.srivastava.tabernavendor;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;

import static com.amandeep.srivastava.tabernavendor.R.color.PIblue;
import static com.amandeep.srivastava.tabernavendor.R.color.PIgreen;
import static com.amandeep.srivastava.tabernavendor.R.color.PIpurple;
import static com.amandeep.srivastava.tabernavendor.R.color.PIred;
import static com.amandeep.srivastava.tabernavendor.R.color.PIyellow;


public class OneFragment extends Fragment{

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);

        PieChart pieChart = (PieChart)rootView.findViewById(R.id.pieChart);
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
        set.setColors(new int[]{R.color.PIyellow, R.color.PIgreen, R.color.PIblue,R.color.PIred, R.color.PIpurple,R.color.PIgray},getContext());
        pieChart.animateXY(1400,1400);

        return rootView;
    }

}