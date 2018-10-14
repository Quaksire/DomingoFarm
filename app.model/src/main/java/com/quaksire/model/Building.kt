package com.quaksire.model

/**
 * Created by Julio.
 */
data class Building (
    val buildingTye: BuildingType,
    val name: String,
    val level: Int,
    val requiredTimeToUpdate: Long,
    val cost: Int,
    val produceUnits: Int,
    val consumeUnits: Int,
    val capacity: Int,
    val playerRequiredLevel: Int)