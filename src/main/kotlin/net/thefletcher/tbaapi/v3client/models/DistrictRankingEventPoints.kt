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


import com.squareup.moshi.Json
/**
 * 
 * @param districtCmp `true` if this event is a District Championship event.
 * @param total Total points awarded at this event.
 * @param alliancePoints Points awarded for alliance selection.
 * @param elimPoints Points awarded for elimination match performance.
 * @param awardPoints Points awarded for event awards.
 * @param eventKey TBA Event key for this event.
 * @param qualPoints Points awarded for qualification match performance.
 */
data class DistrictRankingEventPoints (
    /* `true` if this event is a District Championship event. */
    @Json(name = "district_cmp")
    val districtCmp: kotlin.Boolean,
    /* Total points awarded at this event. */
    @Json(name = "total")
    val total: kotlin.Int,
    /* Points awarded for alliance selection. */
    @Json(name = "alliance_points")
    val alliancePoints: kotlin.Int,
    /* Points awarded for elimination match performance. */
    @Json(name = "elim_points")
    val elimPoints: kotlin.Int,
    /* Points awarded for event awards. */
    @Json(name = "award_points")
    val awardPoints: kotlin.Int,
    /* TBA Event key for this event. */
    @Json(name = "event_key")
    val eventKey: kotlin.String,
    /* Points awarded for qualification match performance. */
    @Json(name = "qual_points")
    val qualPoints: kotlin.Int
)


