/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* OpenAPI spec version: 3.04.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package net.thefletcher.tbaapi.v3client.models


/**
 * 
 * @param year Year this robot competed in.
 * @param robot_name Name of the robot as provided by the team.
 * @param key Internal TBA identifier for this robot.
 * @param team_key TBA team key for this robot.
 */
data class Team_Robot (
    /* Year this robot competed in. */
    val year: kotlin.Int,
    /* Name of the robot as provided by the team. */
    val robot_name: kotlin.String,
    /* Internal TBA identifier for this robot. */
    val key: kotlin.String,
    /* TBA team key for this robot. */
    val team_key: kotlin.String
) {

}

