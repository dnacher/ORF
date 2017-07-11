package com.orfapp.cs246.orf.com.orfapp.controller;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.orfapp.cs246.orf.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;


/**
 * Created by joshnestman on 6/27/17.
 */

public class Graph extends AppCompatActivity {

    LineChart lineChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph);

        lineChart = (LineChart) findViewById(R.id.lineChart);

        ArrayList<Entry> goal = new ArrayList<>();
        ArrayList<Entry> actual = new ArrayList<>();

        double x = 0.0;
        float g = 100;
        float a = 20;
        int numDataPoints = 100;

        for (int i = 0; i < numDataPoints; i++) {
            x = x + 1;
            float xEntry = Float.parseFloat(String.valueOf(x));
            goal.add(new Entry(xEntry, g));
            actual.add(new Entry(xEntry, a));


        }
        ArrayList<ILineDataSet> lineDataSets = new ArrayList<>();
        LineDataSet lineDataSet1 = new LineDataSet(goal,"goal");
        LineDataSet lineDataSet2 = new LineDataSet(actual,"actual");

        lineDataSet1.setDrawCircles(false);
        lineDataSet1.setColors(Color.RED);
        lineDataSet2.setDrawCircles(false);
        lineDataSet2.setColors(Color.BLUE);

        lineDataSets.add(lineDataSet1);
        lineDataSets.add(lineDataSet2);

        lineChart.setData(new LineData(lineDataSets));
        lineChart.setVisibleXRangeMaximum(65f);
    }
}
