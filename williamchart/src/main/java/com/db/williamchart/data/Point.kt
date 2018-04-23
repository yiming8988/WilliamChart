package com.db.williamchart.data

data class Point(
        override val label: String,
        override val value: Float,
        override var x: Float = 0F,
        override var y: Float = 0F) : ChartEntry