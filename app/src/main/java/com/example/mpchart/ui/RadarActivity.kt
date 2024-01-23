package com.example.mpchart.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mpchart.R
import com.github.mikephil.charting.charts.RadarChart
import com.github.mikephil.charting.data.RadarData
import com.github.mikephil.charting.data.RadarDataSet
import com.github.mikephil.charting.data.RadarEntry
import com.github.mikephil.charting.utils.ColorTemplate

class RadarActivity : AppCompatActivity() {
    lateinit var radarChart: RadarChart
    var information = ArrayList<RadarEntry>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radar)

        radarChart = findViewById(R.id.radar_chart)
        information.add(RadarEntry(10f))
        information.add(RadarEntry(20f))
        information.add(RadarEntry(30f))
        information.add(RadarEntry(40f))
        information.add(RadarEntry(50f))

        val radarDataset = RadarDataSet(information, "Report")
        radarDataset.setColors(ColorTemplate.COLORFUL_COLORS, 255)
        radarDataset.valueTextSize = 20f

        val radarData = RadarData(radarDataset)

        radarChart.data = radarData
        radarChart.animateY(2000)

    }
}