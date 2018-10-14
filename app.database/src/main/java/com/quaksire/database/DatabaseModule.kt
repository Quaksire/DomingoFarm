package com.quaksire.database

import android.content.Context
import androidx.room.Room
import com.quaksire.database.dao.PlayerDAO
import com.quaksire.database.migration.Migration0_1

/**
 * Created by Julio.
 */
class DatabaseModule(context: Context) {

    private val farmerDatabase = Room.databaseBuilder(context, FarmerDatabase::class.java, "farmer.db")
        .addMigrations(Migration0_1())
        .build()

    fun providePlayerDAO(): PlayerDAO {
        return farmerDatabase.playerDAO()
    }

}