package com.mamunsproject.coinmarketcap_api

data class CryptoModel(
    val `data`: List<Data>,
    val status: Status
)