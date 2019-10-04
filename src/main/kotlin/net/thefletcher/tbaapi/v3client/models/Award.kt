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

import net.thefletcher.tbaapi.v3client.models.AwardRecipient

import com.squareup.moshi.Json
/**
 * 
 * @param name The name of the award as provided by FIRST. May vary for the same award type.
 * @param awardType Type of award given. See https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/award_type.py#L6
 * @param eventKey The event_key of the event the award was won at.
 * @param recipientList A list of recipients of the award at the event. May have either a team_key or an awardee, both, or neither (in the case the award wasn't awarded at the event).
 * @param year The year this award was won.
 */

data class Award (
    /* The name of the award as provided by FIRST. May vary for the same award type. */
    @Json(name = "name")
    val name: kotlin.String,
    /* Type of award given. See https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/award_type.py#L6 */
    @Json(name = "award_type")
    val awardType: kotlin.Int,
    /* The event_key of the event the award was won at. */
    @Json(name = "event_key")
    val eventKey: kotlin.String,
    /* A list of recipients of the award at the event. May have either a team_key or an awardee, both, or neither (in the case the award wasn't awarded at the event). */
    @Json(name = "recipient_list")
    val recipientList: kotlin.Array<AwardRecipient>,
    /* The year this award was won. */
    @Json(name = "year")
    val year: kotlin.Int
) 



