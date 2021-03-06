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

import net.thefletcher.tbaapi.v3client.models.WLT_Record

/**
 * 
 * @param current_level_record 
 * @param level 
 * @param playoff_average 
 * @param record 
 * @param status 
 */
data class Elimination_Alliance_status (
    val current_level_record: WLT_Record? = null,
    val level: kotlin.String? = null,
    val playoff_average: kotlin.Double? = null,
    val record: WLT_Record? = null,
    val status: kotlin.String? = null
) {

}

