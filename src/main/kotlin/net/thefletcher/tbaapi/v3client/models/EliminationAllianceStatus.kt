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
 * @param playoffAverage 
 * @param level 
 * @param record 
 * @param currentLevelRecord 
 * @param status 
 */
data class EliminationAllianceStatus (
    val playoffAverage: kotlin.Double? = null,
    val level: kotlin.String? = null,
    val record: WLTRecord? = null,
    val currentLevelRecord: WLTRecord? = null,
    val status: kotlin.String? = null
) {

}
