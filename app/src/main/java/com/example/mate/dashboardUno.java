package com.example.mate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;
import com.anychart.enums.Align;
import com.anychart.enums.LegendLayout;

import java.util.ArrayList;
import java.util.List;

public class dashboardUno extends AppCompatActivity {


    AnyChartView anyChartView;
    String[] months = {"Suma","Resta","Multiplicacion","Division"};


    int usuario = 2;

    int[] earnings = {0,0,0,0};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_uno);


        switch(usuario){
            case 1:
                earnings = new int[]{260, 240, 250, 150};
                break;
            case 2:
                earnings = new int[]{260, 260, 240, 240};
                break;

        }








        anyChartView = findViewById(R.id.any_chart_view);


        Pie pie = AnyChart.pie();
        List<DataEntry> dataEntries = new ArrayList<>();

        for(int i = 0; i<months.length;i++){

            dataEntries.add(new ValueDataEntry(months[i], earnings[i]));
        }








        pie.title("Dominio Basico");

        pie.labels().position("outside");

        pie.legend().title().enabled(true);
        pie.legend().title()
                .text("Operaciones")
                .padding(0d, 0d, 10d, 0d);

        pie.legend()
                .position("center-bottom")
                .itemsLayout(LegendLayout.HORIZONTAL)
                .align(Align.CENTER);





        pie.data(dataEntries);
        anyChartView.setChart(pie);



    }

    public void onClick(View view){
        Intent intent = new Intent(this, dashboardDos.class);
        startActivity(intent);
    }






}
