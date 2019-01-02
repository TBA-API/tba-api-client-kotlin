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

import net.thefletcher.tbaapi.v3client.models.API_Status_App_Version

/**
 * 
 * @param current_season Year of the current FRC season.
 * @param max_season Maximum FRC season year for valid queries.
 * @param is_datafeed_down True if the entire FMS API provided by FIRST is down.
 * @param down_events An array of strings containing event keys of any active events that are no longer updating.
 * @param ios 
 * @param android 
 */
data class API_Status (
    /* Year of the current FRC season. */
    val current_season: kotlin.Int,
    /* Maximum FRC season year for valid queries. */
    val max_season: kotlin.Int,
    /* True if the entire FMS API provided by FIRST is down. */
    val is_datafeed_down: kotlin.Boolean,
    /* An array of strings containing event keys of any active events that are no longer updating. */
    val down_events: kotlin.Array<kotlin.String>,
    val ios: API_Status_App_Version,
    val android: API_Status_App_Version
) {

}

