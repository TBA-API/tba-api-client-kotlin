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

import net.thefletcher.tbaapi.v3client.models.Team_Event_Status_rank_ranking
import net.thefletcher.tbaapi.v3client.models.Team_Event_Status_rank_sort_order_info

/**
 * 
 * @param num_teams Number of teams ranked.
 * @param ranking 
 * @param sort_order_info Ordered list of names corresponding to the elements of the `sort_orders` array.
 * @param status 
 */
data class Team_Event_Status_rank (
    /* Number of teams ranked. */
    val num_teams: kotlin.Int? = null,
    val ranking: Team_Event_Status_rank_ranking? = null,
    /* Ordered list of names corresponding to the elements of the `sort_orders` array. */
    val sort_order_info: kotlin.Array<Team_Event_Status_rank_sort_order_info>? = null,
    val status: kotlin.String? = null
) {

}

