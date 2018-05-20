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

import net.thefletcher.tbaapi.v3client.models.District_List

/**
 * 
 * @param key TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event.
 * @param name Official name of event on record either provided by FIRST or organizers of offseason event.
 * @param event_code Event short code, as provided by FIRST.
 * @param event_type Event Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/event_type.py#L2
 * @param district The district this event is in, may be null.
 * @param city City, town, village, etc. the event is located in.
 * @param state_prov State or Province the event is located in.
 * @param country Country the event is located in.
 * @param start_date Event start date in `yyyy-mm-dd` format.
 * @param end_date Event end date in `yyyy-mm-dd` format.
 * @param year Year the event data is for.
 */
data class Event_Simple (
    /* TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event. */
    val key: kotlin.String,
    /* Official name of event on record either provided by FIRST or organizers of offseason event. */
    val name: kotlin.String,
    /* Event short code, as provided by FIRST. */
    val event_code: kotlin.String,
    /* Event Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/event_type.py#L2 */
    val event_type: kotlin.Int,
    /* Event start date in `yyyy-mm-dd` format. */
    val start_date: java.time.LocalDateTime,
    /* Event end date in `yyyy-mm-dd` format. */
    val end_date: java.time.LocalDateTime,
    /* Year the event data is for. */
    val year: kotlin.Int,
    /* The district this event is in, may be null. */
    val district: District_List? = null,
    /* City, town, village, etc. the event is located in. */
    val city: kotlin.String? = null,
    /* State or Province the event is located in. */
    val state_prov: kotlin.String? = null,
    /* Country the event is located in. */
    val country: kotlin.String? = null
) {

}

