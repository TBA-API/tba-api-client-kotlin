/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* The version of the OpenAPI document: 3.5
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package net.thefletcher.tbaapi.v3client.models


import com.squareup.moshi.Json
/**
 * 
 * @param precision Integer expressing the number of digits of precision in the number provided in `sort_orders`.
 * @param name Name of the field used in the `extra_stats` array.
 */

data class EventRankingExtraStatsInfo (
    /* Integer expressing the number of digits of precision in the number provided in `sort_orders`. */
    @Json(name = "precision")
    val precision: java.math.BigDecimal,
    /* Name of the field used in the `extra_stats` array. */
    @Json(name = "name")
    val name: kotlin.String
) 



