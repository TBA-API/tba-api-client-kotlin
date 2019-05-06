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

import net.thefletcher.tbaapi.v3client.models.TeamEventStatusRankRanking
import net.thefletcher.tbaapi.v3client.models.TeamEventStatusRankSortOrderInfo

/**
 * 
 * @param numTeams Number of teams ranked.
 * @param ranking 
 * @param sortOrderInfo Ordered list of names corresponding to the elements of the `sort_orders` array.
 * @param status 
 */
data class TeamEventStatusRank (
    /* Number of teams ranked. */
    val numTeams: kotlin.Int? = null,
    val ranking: TeamEventStatusRankRanking? = null,
    /* Ordered list of names corresponding to the elements of the `sort_orders` array. */
    val sortOrderInfo: kotlin.Array<TeamEventStatusRankSortOrderInfo>? = null,
    val status: kotlin.String? = null
) {

}

