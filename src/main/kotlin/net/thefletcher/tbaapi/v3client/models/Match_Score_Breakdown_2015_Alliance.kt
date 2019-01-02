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
 * @param auto_points 
 * @param teleop_points 
 * @param container_points 
 * @param tote_points 
 * @param litter_points 
 * @param foul_points 
 * @param adjust_points 
 * @param total_points 
 * @param foul_count 
 * @param tote_count_far 
 * @param tote_count_near 
 * @param tote_set 
 * @param tote_stack 
 * @param container_count_level1 
 * @param container_count_level2 
 * @param container_count_level3 
 * @param container_count_level4 
 * @param container_count_level5 
 * @param container_count_level6 
 * @param container_set 
 * @param litter_count_container 
 * @param litter_count_landfill 
 * @param litter_count_unprocessed 
 * @param robot_set 
 */
data class Match_Score_Breakdown_2015_Alliance (
    val auto_points: kotlin.Int? = null,
    val teleop_points: kotlin.Int? = null,
    val container_points: kotlin.Int? = null,
    val tote_points: kotlin.Int? = null,
    val litter_points: kotlin.Int? = null,
    val foul_points: kotlin.Int? = null,
    val adjust_points: kotlin.Int? = null,
    val total_points: kotlin.Int? = null,
    val foul_count: kotlin.Int? = null,
    val tote_count_far: kotlin.Int? = null,
    val tote_count_near: kotlin.Int? = null,
    val tote_set: kotlin.Boolean? = null,
    val tote_stack: kotlin.Boolean? = null,
    val container_count_level1: kotlin.Int? = null,
    val container_count_level2: kotlin.Int? = null,
    val container_count_level3: kotlin.Int? = null,
    val container_count_level4: kotlin.Int? = null,
    val container_count_level5: kotlin.Int? = null,
    val container_count_level6: kotlin.Int? = null,
    val container_set: kotlin.Boolean? = null,
    val litter_count_container: kotlin.Int? = null,
    val litter_count_landfill: kotlin.Int? = null,
    val litter_count_unprocessed: kotlin.Int? = null,
    val robot_set: kotlin.Boolean? = null
) {

}

