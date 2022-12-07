package com.example.cryptocurrencyappmvvmcompose.domain.repository

import com.example.cryptocurrencyappmvvmcompose.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencyappmvvmcompose.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}