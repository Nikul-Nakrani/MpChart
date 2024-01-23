package com.example.mpchart.ui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mpchart.R
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.utils.ColorTemplate
import java.security.KeyStore.Entry

class LineChartActivity : AppCompatActivity() {
    private lateinit var lineChart: LineChart
    private var information = ArrayList<com.github.mikephil.charting.data.Entry>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_line_chart)

        lineChart = findViewById(R.id.line_chart)

        //store info in arraylist
        information.add(com.github.mikephil.charting.data.Entry(10F, 80F))
        information.add(com.github.mikephil.charting.data.Entry(50F, 90F))
        information.add(com.github.mikephil.charting.data.Entry(100F, 100F))
        information.add(com.github.mikephil.charting.data.Entry(150F, 70F))
        information.add(com.github.mikephil.charting.data.Entry(500F, 120F))

        // value pass in barDataSet
        val lineDataset = LineDataSet(information, "Report")
        lineDataset.setColors(ColorTemplate.COLORFUL_COLORS, 255)
        //  lineDataset.setValueTextColors(Color.BLACK)
        lineDataset.valueTextSize = 20f

        //barDataSet pass in BarData
        val lineData = LineData(lineDataset)

        //data set In Chart
        lineChart.data = lineData

        //animation
        lineChart.animateY(2000)


    }
}