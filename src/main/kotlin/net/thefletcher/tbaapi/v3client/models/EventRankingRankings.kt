/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* The version of the OpenAPI document: 3.8.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package net.thefletcher.tbaapi.v3client.models

import net.thefletcher.tbaapi.v3client.models.WLTRecord

import com.squareup.moshi.Json
/**
 * 
 * @param matchesPlayed Number of matches played by this team.
 * @param record 
 * @param rank The team's rank at the event as provided by FIRST.
 * @param dq Number of times disqualified.
 * @param teamKey The team with this rank.
 * @param qualAverage The average match score during qualifications. Year specific. May be null if not relevant for a given year.
 * @param extraStats Additional special data on the team's performance calculated by TBA.
 * @param sortOrders Additional year-specific information, may be null. See parent `sort_order_info` for details.
 */

data class EventRankingRankings (
    /* Number of matches played by this team. */
    @Json(name = "matches_played")
    val matchesPlayed: kotlin.Int,
    @Json(name = "record")
    val record: WLTRecord,
    /* The team's rank at the event as provided by FIRST. */
    @Json(name = "rank")
    val rank: kotlin.Int,
    /* Number of times disqualified. */
    @Json(name = "dq")
    val dq: kotlin.Int,
    /* The team with this rank. */
    @Json(name = "team_key")
    val teamKey: kotlin.String,
    /* The average match score during qualifications. Year specific. May be null if not relevant for a given year. */
    @Json(name = "qual_average")
    val qualAverage: kotlin.Int? = null,
    /* Additional special data on the team's performance calculated by TBA. */
    @Json(name = "extra_stats")
    val extraStats: kotlin.Array<java.math.BigDecimal>? = null,
    /* Additional year-specific information, may be null. See parent `sort_order_info` for details. */
    @Json(name = "sort_orders")
    val sortOrders: kotlin.Array<java.math.BigDecimal>? = null
)

