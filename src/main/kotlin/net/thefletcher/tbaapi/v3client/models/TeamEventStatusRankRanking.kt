/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* OpenAPI spec version: 3.04.1
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package net.thefletcher.tbaapi.v3client.models

import net.thefletcher.tbaapi.v3client.models.WLTRecord

/**
 * 
 * @param matchesPlayed Number of matches played.
 * @param qualAverage For some years, average qualification score. Can be null.
 * @param sortOrders Ordered list of values used to determine the rank. See the `sort_order_info` property for the name of each value.
 * @param record 
 * @param rank Relative rank of this team.
 * @param dq Number of matches the team was disqualified for.
 * @param teamKey TBA team key for this rank.
 */
data class TeamEventStatusRankRanking (
    /* Number of matches played. */
    val matchesPlayed: kotlin.Int? = null,
    /* For some years, average qualification score. Can be null. */
    val qualAverage: kotlin.Double? = null,
    /* Ordered list of values used to determine the rank. See the `sort_order_info` property for the name of each value. */
    val sortOrders: kotlin.Array<java.math.BigDecimal>? = null,
    val record: WLTRecord? = null,
    /* Relative rank of this team. */
    val rank: kotlin.Int? = null,
    /* Number of matches the team was disqualified for. */
    val dq: kotlin.Int? = null,
    /* TBA team key for this rank. */
    val teamKey: kotlin.String? = null
) {

}

