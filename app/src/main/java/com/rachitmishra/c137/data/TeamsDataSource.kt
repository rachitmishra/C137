package com.rachitmishra.c137.data

import androidx.paging.PagingSource
import androidx.paging.PagingState
import coil.network.HttpException
import java.io.IOException

class TeamsDataSource(
    private val repo: TeamsRepo
) : PagingSource<Int, Team>() {

    override fun getRefreshKey(state: PagingState<Int, Team>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Team> {
        return try {
            val nextPageNumber = params.key ?: 1
            val resp = repo.getTeams(nextPageNumber, 10)
            LoadResult.Page(
                data = resp.teams,
                prevKey = null,
                nextKey = if (resp.teams.isNotEmpty()) resp.page + 1 else null
            )
        } catch (exception: IOException) {
            return LoadResult.Error(exception)
        } catch (exception: HttpException) {
            return LoadResult.Error(exception)
        }
    }
}
