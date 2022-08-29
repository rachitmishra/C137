package com.rachitmishra.c137.ui.screens.gameplay

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.rachitmishra.c137.data.TeamsDataSource
import com.rachitmishra.c137.data.TeamsRepo

class GameplayViewModel(repo: TeamsRepo = TeamsRepo()) : ViewModel() {
    val teamsPager = Pager(PagingConfig(pageSize = 20)) {
        TeamsDataSource(repo)
    }.flow.cachedIn(viewModelScope)

    fun reload() {

    }
}
