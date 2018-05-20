/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* OpenAPI spec version: 3.03.1
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package net.thefletcher.tbaapi.v3client.models

import net.thefletcher.tbaapi.v3client.models.WLT_Record

/**
 * 
 * @param dq Number of times disqualified.
 * @param matches_played Number of matches played by this team.
 * @param qual_average The average match score during qualifications. Year specific. May be null if not relevant for a given year.
 * @param rank The team's rank at the event as provided by FIRST.
 * @param record 
 * @param extra_stats Additional special data on the team's performance calculated by TBA.
 * @param sort_orders Additional year-specific information, may be null. See parent `sort_order_info` for details.
 * @param team_key The team with this rank.
 */
data class Event_Ranking_rankings (
    /* Number of times disqualified. */
    val dq: kotlin.Int,
    /* Number of matches played by this team. */
    val matches_played: kotlin.Int,
    /* The team's rank at the event as provided by FIRST. */
    val rank: kotlin.Int,
    val record: WLT_Record,
    /* The team with this rank. */
    val team_key: kotlin.String,
    /* The average match score during qualifications. Year specific. May be null if not relevant for a given year. */
    val qual_average: kotlin.Int? = null,
    /* Additional special data on the team's performance calculated by TBA. */
    val extra_stats: kotlin.Array<java.math.BigDecimal>? = null,
    /* Additional year-specific information, may be null. See parent `sort_order_info` for details. */
    val sort_orders: kotlin.Array<java.math.BigDecimal>? = null
) {

}

