package com.code.flower.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

/**
 * [类功能说明]
 *
 * @author lary.huang
 * @version v 1.4.8 2019-08-28 XLXZ Exp $
 * @email huangyang@xianglin.cn
 */
@Dao
interface GardenPlantingDao {
    @Query("SELECT * FROM garden_plantings")
    fun getGardenPlantings(): LiveData<List<GardenPlanting>>

    @Query("SELECT * FROM garden_plantings WHERE id=:gardenPlantingId")
    fun getGardenPlanting(gardenPlantingId: Long): LiveData<List<GardenPlanting>>

    @Query("SELECT * FROM garden_plantings WHERE plant_id=:plantId")
    fun getGardenPlantingForResult(plantId: String): LiveData<List<GardenPlanting>>

    @Query("SELECT * FROM plants")
    fun getPlantAndGardenPlantings(): LiveData<List<PlantAndGardenPlantings>>

    @Insert
    fun insertGardenPlanting(gardenPlanting: GardenPlanting): Long

    @Delete
    fun deleteGardenPlanting(gardenPlanting: GardenPlanting)
}