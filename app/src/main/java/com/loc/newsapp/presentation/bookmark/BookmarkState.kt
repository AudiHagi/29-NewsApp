package com.loc.newsapp.presentation.bookmark

import com.loc.newsapp.domain.model.Article

data class BookmarkState(
    val artcles: List<Article> = emptyList()
)
