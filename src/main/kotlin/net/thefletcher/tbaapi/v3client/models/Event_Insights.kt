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
 * A year-specific event insight object expressed as a JSON string, separated in to `qual` and `playoff` fields. See also Event_Insights_2016, Event_Insights_2017, etc.
 * @param qual Inights for the qualification round of an event
 * @param playoff Insights for the playoff round of an event
 */
data class Event_Insights (
    /* Inights for the qualification round of an event */
    val qual: kotlin.Any? = null,
    /* Insights for the playoff round of an event */
    val playoff: kotlin.Any? = null
) {

}

