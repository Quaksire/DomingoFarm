package com.quaksire.database.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.quaksire.database.entity.PlayerEntity

/**
 * Created by Julio.
 */
interface PlayerDAO {
    @Query("SELECT * from PlayerEntity")
    fun getAll(): List<PlayerEntity>

    @Insert(onConflict = REPLACE)
    fun insert(playerEntity: PlayerEntity)

    @Query("DELETE from PlayerEntity")
    fun deleteAll()
}