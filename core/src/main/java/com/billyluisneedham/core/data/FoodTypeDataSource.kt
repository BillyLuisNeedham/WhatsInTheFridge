package com.billyluisneedham.core.data

import com.billyluisneedham.core.domain.FoodType
import com.billyluisneedham.core.domain.TagType

interface FoodTypeDataSource {

    suspend fun add(foodType: FoodType)
    suspend fun getAll(): List<FoodType>
    suspend fun update(foodType: FoodType)
    suspend fun delete(foodType: FoodType)
    suspend fun addTag(tagType: TagType)
    suspend fun removeTag(tagType: TagType)
    suspend fun updateAverageShelfLife(latestShelfLife: Long)

}