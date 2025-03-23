package com.rodrigo.nearby.ui.components.market_details

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rodrigo.nearby.R
import com.rodrigo.nearby.data.model.Market
import com.rodrigo.nearby.data.model.mocks.marketsMock
import com.rodrigo.nearby.ui.theme.Gray400
import com.rodrigo.nearby.ui.theme.Gray500
import com.rodrigo.nearby.ui.theme.Typography

@Composable
fun MarketDetailsInfos(modifier: Modifier = Modifier, market: Market) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Informações", style = Typography.headlineSmall, color = Gray400)
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.ic_ticket),
                    tint = Gray500,
                    contentDescription = "Ícone cupons"
                )
                Text(
                    text = "${market.coupons} cupons disponíveis",
                    style = Typography.labelMedium,
                    color = Gray500
                )
            }

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.ic_map_pin),
                    tint = Gray500,
                    contentDescription = "Ícone endereço"
                )
                Text(
                    text = market.address,
                    style = Typography.labelMedium,
                    color = Gray500
                )
            }

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.ic_phone),
                    tint = Gray500,
                    contentDescription = "Ícone telefone"
                )
                Text(
                    text = market.phone,
                    style = Typography.labelMedium,
                    color = Gray500
                )
            }

        }
    }
}

@Preview
@Composable
private fun MarketDetailsInfosPreview() {
    MarketDetailsInfos(
        modifier = Modifier.fillMaxWidth(),
        market = marketsMock.first()
    )
}