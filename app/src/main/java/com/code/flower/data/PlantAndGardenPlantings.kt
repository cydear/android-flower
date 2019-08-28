package com.code.flower.data

import androidx.room.Embedded
import androidx.room.Relation

/**
 * [类功能说明]
 *
 * @author lary.huang
 * @version v 1.4.8 2019-08-28 XLXZ Exp $
 * @email huangyang@xianglin.cn
 */
class PlantAndGardenPlantings {
    @Embedded
    lateinit var plant: Plant

    @Relation(parentColumn = "id", entityColumn = "plant_id")
    var gardenPlantings: List<GardenPlanting> = arrayListOf()
}