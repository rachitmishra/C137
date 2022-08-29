package com.rachitmishra.c137.ui.screens.contacts

import com.rachitmishra.c137.ui.design.C137ScrollToTop

import android.content.res.Configuration
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

data class Contact(val firstName: String, val lastName: String)

@Composable
fun ContactsList(
    contacts: List<Contact>, modifier: Modifier = Modifier
) {
    Box(modifier) {
        val listState = rememberLazyListState()
        val scope = rememberCoroutineScope()

        LazyColumn(
            state = listState, modifier = Modifier.fillMaxWidth(), contentPadding = PaddingValues(bottom = 60.dp)
        ) {
            val grouped = contacts.groupBy { it.firstName[0] }.toSortedMap()
            for ((initial, groupedContacts) in grouped) {
                item {
                    ContactListHeader(initial)
                }
                items(groupedContacts) { contact ->
                    ContactListItem(contact = contact, modifier = Modifier.fillMaxWidth())
                }
            }
        }

        val showButton = listState.firstVisibleItemIndex > 0
        AnimatedVisibility(
            visible = showButton, enter = fadeIn(), exit = fadeOut(), modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            C137ScrollToTop(onClick = {
                scope.launch {
                    listState.scrollToItem(0, 0)
                }
            })
        }
    }
}

@Composable
private fun ContactListHeader(initial: Char, modifier: Modifier = Modifier) {
    Text(
        text = initial.toString(),
        modifier = Modifier
            .background(color = Color.LightGray)
            .padding(12.dp, 4.dp)
            .fillMaxWidth()
    )
}

@Composable
private fun ContactListItem(contact: Contact, modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .padding(12.dp, 8.dp)
            .fillMaxWidth()
    ) {
        Text(text = contact.firstName)
        Text(text = contact.lastName)
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)

@Composable
fun PreviewContactsList() {
    val contacts = listOf(
        Contact("Raj", "Kumar"),
        Contact("Rachit", "Mishra"),
        Contact("Rashi", "Pandey"),
        Contact("Bhavya", "Pandey"),
        Contact("Sharanya", "Mishra"),
        Contact("Shruti", "Mishra"),
        Contact("Ashutosh", "Mishra"),
        Contact("Praveen", "Mishra"),
        Contact("Prakash", "Pandey"),
        Contact("Nishant", "Sharma"),
        Contact("Naveen", "Mishra"),
        Contact("Utkarsh", "Tiwari"),
        Contact("Rakhi", "Priyadarshini"),
    )
    Surface(modifier = Modifier.background(color = Color.Black)) {
        ContactsList(contacts)
    }
}
