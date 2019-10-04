/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* The version of the OpenAPI document: 3.5
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package net.thefletcher.tbaapi.v3client.models

import net.thefletcher.tbaapi.v3client.models.EventDistrictPointsPoints
import net.thefletcher.tbaapi.v3client.models.EventDistrictPointsTiebreakers

import com.squareup.moshi.Json
/**
 * 
 * @param points Points gained for each team at the event. Stored as a key-value pair with the team key as the key, and an object describing the points as its value.
 * @param tiebreakers Tiebreaker values for each team at the event. Stored as a key-value pair with the team key as the key, and an object describing the tiebreaker elements as its value.
 */

data class EventDistrictPoints (
    /* Points gained for each team at the event. Stored as a key-value pair with the team key as the key, and an object describing the points as its value. */
    @Json(name = "points")
    val points: kotlin.collections.Map<kotlin.String, EventDistrictPointsPoints>,
    /* Tiebreaker values for each team at the event. Stored as a key-value pair with the team key as the key, and an object describing the tiebreaker elements as its value. */
    @Json(name = "tiebreakers")
    val tiebreakers: kotlin.collections.Map<kotlin.String, EventDistrictPointsTiebreakers>? = null
) 



