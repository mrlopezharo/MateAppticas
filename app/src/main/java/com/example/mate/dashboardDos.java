package com.example.mate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Radar;
import com.anychart.core.radar.series.Line;
import com.anychart.data.Mapping;
import com.anychart.data.Set;
import com.anychart.enums.Align;
import com.anychart.enums.MarkerType;

import java.util.ArrayList;
import java.util.List;

public class dashboardDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_dos);




        














        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        //anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Radar radar = AnyChart.radar();

        radar.title("Estadisticas de progreso");

        radar.yScale().minimum(0d);
        radar.yScale().minimumGap(0d);
        radar.yScale().ticks().interval(50d);

        radar.xAxis().labels().padding(5d, 5d, 5d, 5d);

        radar.legend()
                .align(Align.CENTER)
                .enabled(true);

        List<DataEntry> data = new ArrayList<>();



        int usuario= 2;




        switch (usuario){
            case 1:
/*

                data.add(new CustomDataEntry("Agilidad", 50, 90, 99));
                data.add(new CustomDataEntry("Sumas", 55, 80, 95));
                data.add(new CustomDataEntry("Restas", 45, 80, 95));
                data.add(new CustomDataEntry("Multiplicacion", 65, 70, 95));
                data.add(new CustomDataEntry("Division", 35, 60, 80));
                data.add(new CustomDataEntry("Tiempo", 20, 60, 90));

*/
            case 2:

                data.add(new CustomDataEntry("Agilidad", 170, 185, 190));
                data.add(new CustomDataEntry("Sumas", 181, 182, 185));
                data.add(new CustomDataEntry("Restas", 170, 173, 182));
                data.add(new CustomDataEntry("Multiplicacion", 165, 170, 177));
                data.add(new CustomDataEntry("Division", 148, 150, 160));
                data.add(new CustomDataEntry("Tiempo", 168, 168, 170));


                break;

        }



        Set set = Set.instantiate();
        set.data(data);
        Mapping shamanData = set.mapAs("{ x: 'x', value: 'value' }");
        Mapping warriorData = set.mapAs("{ x: 'x', value: 'value2' }");
        Mapping priestData = set.mapAs("{ x: 'x', value: 'value3' }");

        Line shamanLine = radar.line(shamanData);
        shamanLine.name("Tu");
        shamanLine.markers()
                .enabled(true)
                .type(MarkerType.CIRCLE)
                .size(3d);

        Line warriorLine = radar.line(warriorData);
        warriorLine.name("Meta");
        warriorLine.markers()
                .enabled(true)
                .type(MarkerType.CIRCLE)
                .size(3d);

        Line priestLine = radar.line(priestData);
        priestLine.name("Mejor puntuacion");
        priestLine.markers()
                .enabled(true)
                .type(MarkerType.CIRCLE)
                .size(3d);

        radar.tooltip().format("Value: {%Value}");

        anyChartView.setChart(radar);


    }

    private class CustomDataEntry extends ValueDataEntry {
        public CustomDataEntry(String x, Number value, Number value2, Number value3) {
            super(x, value);
            setValue("value2", value2);
            setValue("value3", value3);
        }
    }

    public void onClick(View view){
        Intent intent = new Intent(this, dashboardTres.class);
        startActivity(intent);
    }



}
