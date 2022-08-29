package com.rachitmishra.c137.ui.screens.gameplay

import androidx.compose.runtime.Composable
import com.rachitmishra.c137.ui.design.theme.C137Theme

enum class Tabs {
    Teams, Stats;

    companion object {
        val map = Tabs.values().associate { it.ordinal to it.name }
    }
}

@Composable
fun GameplayApp() {
    C137Theme {
        GameplayScreen()
    }
}
