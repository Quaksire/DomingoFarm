package com.quaksire.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Julio.
 */
@Entity(tableName = "BuildingEntity")
class BuildingEntity(
    @PrimaryKey(autoGenerate = true) var id: Long?,
    @ColumnInfo(name = "name") var buildingTye: String,
    @ColumnInfo(name = "name") var level: Int,
    @ColumnInfo(name = "name") var requiredLevel: Int
    )