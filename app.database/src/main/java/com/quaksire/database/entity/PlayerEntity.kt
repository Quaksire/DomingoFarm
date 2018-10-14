package com.quaksire.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Julio.
 */
@Entity(tableName = "PlayerEntity")
class PlayerEntity(
    @PrimaryKey(autoGenerate = true) var id: Long?,
    @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "created") var created: Long,
    @ColumnInfo(name = "farmerLevel") var farmerLevel: Int)