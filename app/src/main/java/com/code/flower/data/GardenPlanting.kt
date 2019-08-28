package com.code.flower.data

import androidx.room.*
import java.util.*

/**
 * [类功能说明]
 *
 * @author lary.huang
 * @version v 1.4.8 2019-08-27 XLXZ Exp $
 * @email huangyang@xianglin.cn
 */
@Entity(
    tableName = "garden_plantings",
    foreignKeys = [ForeignKey(
        entity = Plant::class,
        parentColumns = ["id"],
        childColumns = ["plant_id"]
    )],
    indices = [Index("plant_id")]
)
data class GardenPlanting(
    @ColumnInfo(name = "plant_id")
    val plantId: String,
    @ColumnInfo(name = "plant_date")
    val plantDate: Calendar = Calendar.getInstance(),
    @ColumnInfo(name = "last_watering_date")
    val lastWarningsDate: Calendar = Calendar.getInstance()
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var gardenPlantingId: Long = 0
}