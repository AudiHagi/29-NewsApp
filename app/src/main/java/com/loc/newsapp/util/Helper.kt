package com.loc.newsapp.util

import java.text.SimpleDateFormat
import java.util.Locale

fun convertDateFormat(inputDateString: String): String {
    val inputFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US)
    val outputFormat = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US)

    val date = inputFormat.parse(inputDateString)
    return outputFormat.format(date)
}
