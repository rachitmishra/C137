package com.rachitmishra.c137.ui.screens.gameplay

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.rachitmishra.c137.ui.design.C137Tab
import com.rachitmishra.c137.ui.design.theme.C137Theme
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun GameplayScreen(
) {
    val pagerState = rememberPagerState(
        initialPage = 0,
    )
    val coroutineScope = rememberCoroutineScope()
    val gameplayViewModel = GameplayViewModel()
    val tabIndex = pagerState.currentPage
    val tabTitles = Tabs.map.values
    Column(modifier = Modifier.fillMaxWidth()) {
        ScrollableTabRow(
            containerColor = Color.White,
            selectedTabIndex = tabIndex, edgePadding = 0.dp,
            divider = {
                Divider(color = Color.White)
            },
            indicator = {
                Box(
                    Modifier
                        .tabIndicatorOffset(it[tabIndex])
                        .height(2.dp)
                        .border(1.dp, Color.Red)
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .shadow(elevation = 2.dp, spotColor = Color.Gray),
        ) {
            tabTitles.forEachIndexed { index, title ->
                C137Tab(text = title, selected = tabIndex == index, onClick = {
                    coroutineScope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                })
            }
        }
        HorizontalPager(
            count = Tabs.values().size, state = pagerState, modifier = Modifier.weight(1f)
        ) { index: Int ->
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                when (Tabs.valueOf(Tabs.map.getOrDefault(index, Tabs.Teams.name))) {
                    Tabs.Teams -> {
                        Teams(
                            teams = gameplayViewModel.teamsPager,
                            scope = coroutineScope,
                            isRefreshing = false,
                            onRefresh = gameplayViewModel::reload
                        )
                    }
                    else -> {}
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    C137Theme {
        GameplayScreen()
    }
}
