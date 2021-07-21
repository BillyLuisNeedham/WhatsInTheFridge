package com.billyluisneedham.core.domain

data class FoodInstance(
    val foodInstanceId: Long = 0,
    val foodType: FoodType,
    val enteredTimeStamp: Long,
    val expiryTimeStamp: Long,
    val quantity: Int
)