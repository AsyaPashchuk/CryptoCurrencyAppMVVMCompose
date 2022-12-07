package com.example.cryptocurrencyappmvvmcompose.presentation.coin_detail

import com.example.cryptocurrencyappmvvmcompose.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)