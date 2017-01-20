package com.amandeep.srivastava.tabernavendor;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aman on 21-01-2017.
 */

public class TwoFragment extends Fragment {
    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_two, container, false);
        LineChart lineChart = (LineChart)rootView.findViewById(R.id.lineChart);
        List<Entry> entries = new ArrayList<Entry>();
        entries.add(new Entry(0,0));
        entries.add(new Entry(1,47));
        entries.add(new Entry(2,32));
        entries.add(new Entry(3,5));
        entries.add(new Entry(4,22));
        entries.add(new Entry(5,13));
        entries.add(new Entry(6,44));
        entries.add(new Entry(7,23));
        entries.add(new Entry(8,56));
        entries.add(new Entry(9,74));
        entries.add(new Entry(10,103));
        entries.add(new Entry(11,22));
        entries.add(new Entry(12,31));
        entries.add(new Entry(13,19));
        entries.add(new Entry(14,95));
        entries.add(new Entry(15,87));
        entries.add(new Entry(16,69));
        entries.add(new Entry(17,44));
        entries.add(new Entry(18,31));
        entries.add(new Entry(19,11));
        entries.add(new Entry(20,0));
        entries.add(new Entry(21,7));
        entries.add(new Entry(22,18));
        entries.add(new Entry(23,19));
        entries.add(new Entry(24,47));
        entries.add(new Entry(25,74));
        entries.add(new Entry(26,71));
        entries.add(new Entry(27,33));
        entries.add(new Entry(28,19));
        entries.add(new Entry(29,54));
        entries.add(new Entry(30,63));

        XAxis xAxis = lineChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        lineChart.setDescription(null);
        lineChart.getLegend().setEnabled(false);

        LineDataSet dataSet = new LineDataSet(entries,"Daily Sales"); // add entries to dataset
        dataSet.setColor(R.color.PIred);
        dataSet.setValueTextColor(R.color.PIyellow);
        LineData lineData = new LineData(dataSet);
        lineChart.setData(lineData);
        lineChart.animateXY(2400,2400);




        return rootView;
    }
}
