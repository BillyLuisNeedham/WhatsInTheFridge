package com.billyluisneedham.core.data

import com.billyluisneedham.core.domain.TagType

interface TagTypeDataSource {

    suspend fun add(tagType: TagType)
    suspend fun getAll(): List<TagType>
    suspend fun update(tagType: TagType)
    suspend fun delete(tagType: TagType)

}