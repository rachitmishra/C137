package com.rachitmishra.c137.ui.screens.gameplay

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.paging.LoadState
import androidx.paging.PagingData
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import coil.compose.AsyncImage
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import com.rachitmishra.c137.R
import com.rachitmishra.c137.data.Team
import com.rachitmishra.c137.ui.design.C137ScrollToTop
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch


@Composable
fun ErrorView(onRetry: (() -> Unit)? = null) {
    Column {
        Image(painter = painterResource(id = R.drawable.ic_error), contentDescription = "Error")
        Text(text = "삐뽀삐뽀 삐뽀삐뽀 삐뽀삐뽀 삐뽀삐뽀")
        Button(onClick = { onRetry?.invoke() }) {
            Text(text = "Retry")
        }
    }
}

@Composable
fun ProgressView() {
    Column {
        CircularProgressIndicator()
        Text(text = "삐뽀삐뽀 ...")
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Teams(teams: Flow<PagingData<Team>>, isRefreshing: Boolean, scope: CoroutineScope, onRefresh: () -> Unit) {
    val pagedTeams = teams.collectAsLazyPagingItems()
    val teamState = rememberLazyListState()
    val showScrollToTop = teamState.firstVisibleItemIndex > 0
    Box {
        SwipeRefresh(
            state = rememberSwipeRefreshState(isRefreshing),
            onRefresh = { onRefresh() },
        ) {
            LazyColumn(state = teamState, modifier = Modifier.padding(0.dp)) {
                stickyHeader {
                    Header()
                    TeamHeader(0)
                }
                items(pagedTeams) { team ->
                    team?.let {
                        Team(team.name, team.user.id, team.user.profilePic, team.points, team.rank, team.rankChange)
                    }
                    Divider(color = Color.LightGray)
                }
                when (pagedTeams.loadState.append) {
                    is LoadState.NotLoading -> Unit
                    LoadState.Loading -> {
                        item { ProgressView() }
                    }
                    is LoadState.Error -> {
                        item {
                            ErrorView(onRefresh)
                        }
                    }
                }
            }
        }

        AnimatedVisibility(
            visible = showScrollToTop,
            enter = fadeIn(),
            exit = fadeOut(),
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(10.dp)
        ) {
            C137ScrollToTop(onClick = {
                scope.launch {
                    teamState.animateScrollToItem(0, 0)
                }
            })
        }
    }
}

@Composable
fun Team(name: String, userId: Int, profileUrl: String, points: Float, rank: Int, rankChange: String) {
    Row(
        modifier = Modifier
            .background(
                if (userId == 1) {
                    colorResource(id = R.color.yellow)
                } else {
                    Color.White
                }
            )
            .padding(8.dp)
    ) {
        AsyncImage(
            model = profileUrl,
            contentDescription = name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .width(36.dp)
                .height(36.dp)
        )
        Column(verticalArrangement = Arrangement.Center) {
            Text(
                text = name,
                modifier = Modifier
                    .fillMaxWidth(0.64f)
                    .padding(8.dp, 0.dp),
                style = MaterialTheme.typography.bodyLarge,
                maxLines = 1
            )
            if (rank == 1) {
                Text(
                    text = "Winner!", modifier = Modifier
                        .fillMaxWidth(0.64f)
                        .padding(8.dp, 0.dp),
                    color = colorResource(id = R.color.positive),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
        Text(
            text = points.toString(),
            modifier = Modifier
                .padding(8.dp, 0.dp)
                .align(Alignment.CenterVertically)
                .fillMaxWidth(0.5f),
            style = MaterialTheme.typography.bodyMedium,
        )
        Row(
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .fillMaxWidth(1f),
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                text = rank.toString(),
                modifier = Modifier
                    .padding(8.dp, 0.dp, 2.dp, 0.dp),
                style = MaterialTheme.typography.bodyMedium,
            )
            when (rankChange) {
                "INC" -> Icon(
                    painter = painterResource(id = R.drawable.ic_up), contentDescription = "Rank",
                    tint = colorResource(id = R.color.positive)
                )
                else -> Icon(
                    painter = painterResource(id = R.drawable.ic_down), contentDescription = "Rank",
                    tint = colorResource(id = R.color.negative)
                )
            }

        }
    }
}

@Composable
fun Header(onFilter: (() -> Unit)? = null, onCompare: (() -> Unit)? = null, onDownload: (() -> Unit)? = null) {
    Divider(color = Color.LightGray)
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(Color.White)
            .padding(8.dp, 4.dp, 8.dp, 0.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Text(text = "Last updated at 20 overs", style = MaterialTheme.typography.bodySmall)
        Spacer(modifier = Modifier.weight(1.0f))
        Row(horizontalArrangement = Arrangement.End) {
            IconButton(
                onClick = { onFilter?.invoke() },
                Modifier
                    .padding(4.dp)
                    .height(24.dp)
                    .width(24.dp)
                    .align(Alignment.CenterVertically)
                    .padding(0.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_social), contentDescription = "Filter"
                )
            }
            IconButton(
                onClick = { onCompare?.invoke() },
                Modifier
                    .padding(4.dp)
                    .height(24.dp)
                    .width(24.dp)
                    .align(Alignment.CenterVertically)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_compare), contentDescription = "Compare"
                )
            }
            IconButton(
                onClick = { onDownload?.invoke() },
                Modifier
                    .padding(4.dp)
                    .height(24.dp)
                    .width(24.dp)
                    .align(Alignment.CenterVertically)
                    .padding(0.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_download), contentDescription = "Download"
                )
            }
        }
    }
    Divider(color = Color.LightGray)
}

@Composable
fun Banner() {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(0.dp, 0.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .background(colorResource(id = R.color.teal_700))
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Filter is applied",
                    color = colorResource(id = R.color.white),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
        Divider()
    }
}

@Composable
fun TeamHeader(teamCount: Int) {
    Column(Modifier.background(Color.White)) {
        Row(
            modifier = Modifier
                .padding(8.dp, 4.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "All Teams ($teamCount)",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .padding(0.dp, 2.dp)
            )
            Text(
                text = "Points",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier
                    .fillMaxWidth(0.6f)
                    .padding(0.dp, 2.dp)
            )
            Text(text = "Rank", style = MaterialTheme.typography.bodySmall, modifier = Modifier.padding(4.dp, 2.dp))
        }
        Divider(color = Color.LightGray)
    }
}

