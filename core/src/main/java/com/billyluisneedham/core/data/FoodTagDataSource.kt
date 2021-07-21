package com.billyluisneedham.core.data

import com.billyluisneedham.core.domain.FoodTag
import com.billyluisneedham.core.domain.FoodType
import com.billyluisneedham.core.domain.TagType

interface FoodTagDataSource {

    suspend fun add(foodTag: FoodTag)
    suspend fun getAllAssociatedFoodTypesOf(tagType: TagType): List<FoodType>
    suspend fun getAllAssociatedTagTypesOf(foodType: FoodType): List<TagType>
    suspend fun delete(foodTag: FoodTag)

}