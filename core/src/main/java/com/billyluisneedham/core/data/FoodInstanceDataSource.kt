package com.billyluisneedham.core.data

import com.billyluisneedham.core.domain.FoodInstance

interface FoodInstanceDataSource {

    suspend fun add(foodInstance: FoodInstance)
    suspend fun getAll(foodInstance: FoodInstance): List<FoodInstance>
    suspend fun delete(foodInstance: FoodInstance)
    suspend fun update(foodInstance: FoodInstance)

}