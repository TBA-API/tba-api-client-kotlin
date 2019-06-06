/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* The version of the OpenAPI document: 3.04.1
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package net.thefletcher.tbaapi.v3client.models


import com.squareup.moshi.Json
/**
 * A year-specific event insight object expressed as a JSON string, separated in to `qual` and `playoff` fields. See also Event_Insights_2016, Event_Insights_2017, etc.
 * @param qual Inights for the qualification round of an event
 * @param playoff Insights for the playoff round of an event
 */
data class EventInsights (
    /* Inights for the qualification round of an event */
    @Json(name = "qual")
    val qual: kotlin.Any? = null,
    /* Insights for the playoff round of an event */
    @Json(name = "playoff")
    val playoff: kotlin.Any? = null
) {

}

