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

import net.thefletcher.tbaapi.v3client.models.DistrictRankingEventPoints

import com.squareup.moshi.Json
/**
 * Rank of a team in a district.
 * @param teamKey TBA team key for the team.
 * @param rank Numerical rank of the team, 1 being top rank.
 * @param rookieBonus Any points added to a team as a result of the rookie bonus.
 * @param pointTotal Total district points for the team.
 * @param eventPoints List of events that contributed to the point total for the team.
 */
data class DistrictRanking (
    /* TBA team key for the team. */
    @Json(name = "team_key")
    val teamKey: kotlin.String,
    /* Numerical rank of the team, 1 being top rank. */
    @Json(name = "rank")
    val rank: kotlin.Int,
    /* Total district points for the team. */
    @Json(name = "point_total")
    val pointTotal: kotlin.Int,
    /* Any points added to a team as a result of the rookie bonus. */
    @Json(name = "rookie_bonus")
    val rookieBonus: kotlin.Int? = null,
    /* List of events that contributed to the point total for the team. */
    @Json(name = "event_points")
    val eventPoints: kotlin.Array<DistrictRankingEventPoints>? = null
) {

}

