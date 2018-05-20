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


/**
 * 
 * @param score Score for this alliance. Will be null or -1 for an unplayed match.
 * @param team_keys 
 * @param surrogate_team_keys TBA team keys (eg `frc254`) of any teams playing as a surrogate.
 * @param dq_team_keys TBA team keys (eg `frc254`) of any disqualified teams.
 */
data class Match_alliance (
    /* Score for this alliance. Will be null or -1 for an unplayed match. */
    val score: kotlin.Int,
    val team_keys: kotlin.Array<kotlin.String>,
    /* TBA team keys (eg `frc254`) of any teams playing as a surrogate. */
    val surrogate_team_keys: kotlin.Array<kotlin.String>? = null,
    /* TBA team keys (eg `frc254`) of any disqualified teams. */
    val dq_team_keys: kotlin.Array<kotlin.String>? = null
) {

}

