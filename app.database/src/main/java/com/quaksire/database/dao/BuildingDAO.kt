package com.quaksire.database.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.quaksire.database.entity.BuildingEntity

/**
 * Created by Julio.
 */
interface BuildingDAO {
    @Query("SELECT * from BuildingEntity")
    fun getAll(): List<BuildingEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(buildEntity: BuildingEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(buildEntities: List<BuildingEntity>)

    @Query("DELETE from BuildingEntity")
    fun deleteAll()
}