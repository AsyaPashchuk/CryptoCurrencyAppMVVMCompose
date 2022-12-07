package com.example.cryptocurrencyappmvvmcompose.data.repository

import com.example.cryptocurrencyappmvvmcompose.data.remote.CoinPaprikaApi
import com.example.cryptocurrencyappmvvmcompose.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencyappmvvmcompose.data.remote.dto.CoinDto
import com.example.cryptocurrencyappmvvmcompose.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}