package com.code.flower.data

import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext

/**
 * [类功能说明]
 *
 * @author lary.huang
 * @version v 1.4.8 2019-08-28 XLXZ Exp $
 * @email huangyang@xianglin.cn
 */
class GardenPlantingRepository private constructor(private val gardenPlantingDao: GardenPlantingDao) {
    suspend fun createGardenPlanting(plantId: String) {
        withContext(IO) {
            val gardenPlanting = GardenPlanting(plantId)
            gardenPlantingDao.insertGardenPlanting(gardenPlanting)
        }
    }

    suspend fun removeGardenPlanting(gardenPlanting: GardenPlanting) {
        withContext(IO) {
            gardenPlantingDao.deleteGardenPlanting(gardenPlanting)
        }
    }

    suspend fun getGardenPlantingForResult(plantId: String) =
        gardenPlantingDao.getGardenPlantingForResult(plantId)

    fun getGardenPlantings() = gardenPlantingDao.getGardenPlantings()

    fun getPlantAndGardenPlantings() = gardenPlantingDao.getPlantAndGardenPlantings()

    companion object {
        @Volatile
        private var instance: GardenPlantingRepository? = null

        fun getInstance(gardenPlantingDao: GardenPlantingDao) =
            instance ?: GardenPlantingRepository(gardenPlantingDao).also {
                instance = it
            }
    }
}