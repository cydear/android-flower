package com.code.flower.data

/**
 * [类功能说明]
 *
 * @author lary.huang
 * @version v 1.4.8 2019-08-28 XLXZ Exp $
 * @email huangyang@xianglin.cn
 */
class PlantRepository private constructor(private val plantDao: PlantDao) {
    fun getPlants() = plantDao.getPlants()

    fun getPlant(plantId: String) = plantDao.getPlant(plantId)

    fun getPlantWithGrowZoneNumber(growZoneNumber: Int) =
        plantDao.getPlantsWithGrowZoneNumber(growZoneNumber)

    companion object {
        @Volatile
        private var instance: PlantRepository? = null

        fun getInstance(plantDao: PlantDao) = instance ?: PlantRepository(plantDao).also {
            instance = it
        }
    }
}