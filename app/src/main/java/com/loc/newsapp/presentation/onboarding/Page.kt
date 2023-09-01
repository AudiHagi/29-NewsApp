package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Explore the Latest News",
        description = "Dive into a world of up-to-date news and stay informed about global happenings.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Multiple Sources, One App",
        description = "Access news stories from a variety of trusted sources, all conveniently in one app.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Your News, Your Way",
        description = "Create your personalized newsfeed by selecting your preferred topics.",
        image = R.drawable.onboarding3
    )
)
