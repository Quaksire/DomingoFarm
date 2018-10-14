package com.quaksire.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.quaksire.database.dao.BuildingDAO
import com.quaksire.database.dao.PlayerDAO
import com.quaksire.database.entity.BuildingEntity
import com.quaksire.database.entity.PlayerEntity

/**
 * Created by Julio.
 */
@Database(entities = [PlayerEntity::class, BuildingEntity::class], version = 1)
abstract class FarmerDatabase: RoomDatabase() {
    abstract fun playerDAO(): PlayerDAO

    abstract fun buildingDAO(): BuildingDAO
}