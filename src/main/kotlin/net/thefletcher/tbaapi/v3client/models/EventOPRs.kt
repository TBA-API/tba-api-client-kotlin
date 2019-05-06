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


/**
 * OPR, DPR, and CCWM for teams at the event.
 * @param oprs A key-value pair with team key (eg `frc254`) as key and OPR as value.
 * @param dprs A key-value pair with team key (eg `frc254`) as key and DPR as value.
 * @param ccwms A key-value pair with team key (eg `frc254`) as key and CCWM as value.
 */
data class EventOPRs (
    /* A key-value pair with team key (eg `frc254`) as key and OPR as value. */
    val oprs: kotlin.collections.Map<kotlin.String, kotlin.Float>? = null,
    /* A key-value pair with team key (eg `frc254`) as key and DPR as value. */
    val dprs: kotlin.collections.Map<kotlin.String, kotlin.Float>? = null,
    /* A key-value pair with team key (eg `frc254`) as key and CCWM as value. */
    val ccwms: kotlin.collections.Map<kotlin.String, kotlin.Float>? = null
) {

}

