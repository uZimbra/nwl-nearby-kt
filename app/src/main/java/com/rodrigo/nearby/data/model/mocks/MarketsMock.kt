package com.rodrigo.nearby.data.model.mocks

import com.rodrigo.nearby.data.model.Market

val marketsMock = listOf(
    Market(
        id = "1",
        categoryId = "1",
        name = "Bistrô Gourmet",
        description = "Ambiente aconchegante com pratos internacionais e carta de vinhos selecionada.",
        coupons = 5,
        latitude = -8.05428,
        longitude = -34.8813,
        address = "Rua da Harmonia, 123 - Recife, PE, 52060-250",
        phone = "(81) 99876-5432",
        cover = "https://images.unsplash.com/photo-1551022378-2fa7c28a1516?w=400&h=300"
    ),

    Market(
        id = "2",
        categoryId = "2",
        name = "Café Central",
        description = "Café com cortes nobres e buffet variado. Experiência completa para os amantes de carne.",
        coupons = 10,
        latitude = -8.157065332372301,
        longitude = -34.92003720343677,
        address = "Av. Agamenon Magalhães, 900 - Prazeres, Jaboatão dos Guararapes - PE, 54230-640",
        phone = "(11) 94002-8922",
        cover = "https://images.unsplash.com/photo-1498654896293-37aacf113fd9?w=400&h=300"
    ),

    Market(
        id = "3",
        categoryId = "3",
        name = "Pizzaria Napoli",
        description = "Pizza artesanal com ingredientes frescos e sabores exclusivos.",
        coupons = 8,
        latitude = -8.1123,
        longitude = -34.9234,
        address = "Rua das Acácias, 321 - Boa Viagem, Recife - PE, 51020-400",
        phone = "(81) 98765-4321",
        cover = "https://images.unsplash.com/photo-1594007659357-107a5f27c216?w=400&h=300"
    ),

    Market(
        id = "4",
        categoryId = "4",
        name = "Sushi Zen",
        description = "Restaurante japonês com pratos tradicionais e modernos.",
        coupons = 12,
        latitude = -8.055,
        longitude = -34.870,
        address = "Av. Boa Viagem, 400 - Recife, PE, 51020-020",
        phone = "(81) 91234-5678",
        cover = "https://images.unsplash.com/photo-1546069901-eacef0df6022?w=400&h=300"
    ),

    Market(
        id = "5",
        categoryId = "5",
        name = "Churrascaria Gaúcha",
        description = "Carnes nobres assadas no fogo de chão com um buffet completo.",
        coupons = 7,
        latitude = -8.060,
        longitude = -34.882,
        address = "Rua Domingos Ferreira, 250 - Recife, PE, 51011-050",
        phone = "(81) 92345-6789",
        cover = "https://images.unsplash.com/photo-1604908810289-38d0b2a4e4ff?w=400&h=300"
    )
)