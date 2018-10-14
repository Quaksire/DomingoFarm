package com.quaksire.database.migration

import android.content.ContentValues
import androidx.room.OnConflictStrategy
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.quaksire.model.Building
import com.quaksire.model.BuildingType

/**
 * Created by Julio.
 */
class Migration0_1 : Migration(0,1) {
    override fun migrate(database: SupportSQLiteDatabase) {
        defineBuildings()
            .forEach { contentValues -> database.insert("BuildingEntity",  OnConflictStrategy.REPLACE, contentValues) }
    }

    private fun createContentValue(building: Building): ContentValues {
        val contentValue = ContentValues()
        contentValue.put("buildingType", building.buildingTye.toString())
        contentValue.put("name", building.name)
        contentValue.put("level", building.level)
        contentValue.put("requiredTimeToUpdate", building.requiredTimeToUpdate)
        contentValue.put("cost", building.cost)
        contentValue.put("produceUnits", building.produceUnits)
        contentValue.put("consumeUnits", building.consumeUnits)
        contentValue.put("capacity", building.capacity)
        contentValue.put("playerRequiredLevel", building.playerRequiredLevel)
        return contentValue
    }

    private fun defineBuildings(): List<ContentValues> {
        val buildings = arrayListOf<ContentValues>()

        // Almond tree land
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Almonds",1, 30, 10, 1, 0, 0, 1)))
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Almonds",2, 100, 100, 5, 0, 0, 3)))
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Almonds",3, 200, 500, 20, 0, 0, 5)))
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Almonds",4, 500, 1000, 50, 0, 0, 7)))
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Almonds",5, 1000, 5000, 200, 0, 0, 9)))

        // Olives tree land
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Olives",1, 30, 10, 1, 0, 0, 1)))
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Olives",2, 100, 100, 5, 0, 0, 3)))
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Olives",3, 200, 500, 20, 0, 0, 5)))
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Olives",4, 500, 1000, 50, 0, 0, 7)))
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Olives",5, 1000, 5000, 200, 0, 0, 9)))

        // Oranges
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Oranges",1, 30, 10, 1, 0, 0, 1)))
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Oranges",2, 100, 100, 5, 0, 0, 3)))
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Oranges",3, 200, 500, 20, 0, 0, 5)))
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Oranges",4, 500, 1000, 50, 0, 0, 7)))
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Oranges",5, 1000, 5000, 200, 0, 0, 9)))

        // Apples
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Apples",1, 30, 10, 1, 0, 0, 1)))
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Apples",2, 100, 100, 5, 0, 0, 3)))
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Apples",3, 200, 500, 20, 0, 0, 5)))
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Apples",4, 500, 1000, 50, 0, 0, 7)))
        buildings.add(createContentValue(Building(BuildingType.PRODUCTION, "Apples",5, 1000, 5000, 200, 0, 0, 9)))

        // Olive oil press
        buildings.add(createContentValue(Building(BuildingType.FACTORY, "Olive oil press",1, 30, 10, 1, 3, 50, 1)))
        buildings.add(createContentValue(Building(BuildingType.FACTORY, "Olive oil press",2, 100, 100, 5, 15, 150, 3)))
        buildings.add(createContentValue(Building(BuildingType.FACTORY, "Olive oil press",3, 200, 500, 20, 60, 300, 5)))
        buildings.add(createContentValue(Building(BuildingType.FACTORY, "Olive oil press",4, 500, 1000, 50, 150, 900, 7)))
        buildings.add(createContentValue(Building(BuildingType.FACTORY, "Olive oil press",5, 1000, 5000, 200, 600, 1400, 9)))

        // Warehouse
        buildings.add(createContentValue(Building(BuildingType.STORAGE, "Warehouse",1, 30, 10, 0, 0, 200, 1)))
        buildings.add(createContentValue(Building(BuildingType.STORAGE, "Warehouse",2, 100, 100, 0, 0, 500, 3)))
        buildings.add(createContentValue(Building(BuildingType.STORAGE, "Warehouse",3, 200, 500, 0, 0, 3000, 5)))
        buildings.add(createContentValue(Building(BuildingType.STORAGE, "Warehouse",4, 500, 1000, 0, 0, 5000, 7)))
        buildings.add(createContentValue(Building(BuildingType.STORAGE, "Warehouse",5, 1000, 5000, 0, 0, 10000, 9)))

        return buildings
    }
}