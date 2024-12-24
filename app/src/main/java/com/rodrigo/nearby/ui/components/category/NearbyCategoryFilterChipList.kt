package com.rodrigo.nearby.ui.components.category

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rodrigo.nearby.data.model.NearbyCategory

@Composable
fun NearbyCategoryFilterChipList(
    modifier: Modifier = Modifier,
    categories: List<NearbyCategory>,
    onSelectedCategoryChanged: (NearbyCategory) -> Unit,
) {
    var selectedCategoryId by remember { mutableStateOf(categories.firstOrNull()?.id.orEmpty()) }

    LaunchedEffect(key1 = selectedCategoryId) {
        val selectedCategoryOrNull = categories.find { it.id == selectedCategoryId }
        selectedCategoryOrNull?.let {
            onSelectedCategoryChanged(it)
        }
    }

    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 24.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(categories, key = {it.id}) { item ->
            NearbyCategoryFilterChip(
                category = item,
                isSelected = item.id == selectedCategoryId,
                onClick = { isSelected ->
                    if (isSelected)
                        selectedCategoryId = item.id
                }
            )
        }
    }
}

@Preview
@Composable
private fun NearbyCategoryFilterChipListPreview() {
    NearbyCategoryFilterChipList(
        modifier = Modifier.fillMaxWidth(),
        categories = listOf(
            NearbyCategory(
                id = "1",
                name = "Alimentação"
            ),
            NearbyCategory(
                id = "2",
                name = "Cinema"
            ),
            NearbyCategory(
                id = "3",
                name = "Farmácia"
            ),
            NearbyCategory(
                id = "4",
                name = "Supermercado"
            ),
        ),
        onSelectedCategoryChanged = {}
    )
}