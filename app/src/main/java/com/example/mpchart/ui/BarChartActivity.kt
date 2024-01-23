package com.example.mpchart.ui


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mpchart.R
import com.github.mikephil.charting.animation.Easing
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.utils.ColorTemplate


class BarChartActivity : AppCompatActivity() {
    private lateinit var barChart: BarChart
    private var information: ArrayList<BarEntry> = ArrayList<BarEntry>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bar_chart)

        barChart = findViewById(R.id.bar_chart)

        //store info in Arraylist
        information.add(BarEntry(2010f, 2000f))
        information.add(BarEntry(2011f, 2022f))
        information.add(BarEntry(2012f, 2021f))
        information.add(BarEntry(2013f, 2020f))
        information.add(BarEntry(2014f, 2019f))
        information.add(BarEntry(2015f, 2018f))
        information.add(BarEntry(2016f, 2017f))

        //value pass in barDataSet
        val barDataSet = BarDataSet(information, "Report")

        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS, 230)
        // barDataSet.setValueTextColors(Color.BLACK)
        barDataSet.valueTextSize = 20f

        //barDataSet pass in BarData
        val barData = BarData(barDataSet)

        //data set In Chart
        barChart.setFitBars(true)
        barChart.data = barData
        barChart.description.text = "Bar Report Demo"

        //Animation
        barChart.animateY(2000)


    }
}