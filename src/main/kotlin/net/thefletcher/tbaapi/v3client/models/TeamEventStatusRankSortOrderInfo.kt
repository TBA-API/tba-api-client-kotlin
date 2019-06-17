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
 * @param precision The number of digits of precision used for this value, eg `2` would correspond to a value of `101.11` while `0` would correspond to `101`.
 * @param name The descriptive name of the value used to sort the ranking.
 */
data class TeamEventStatusRankSortOrderInfo (
    /* The number of digits of precision used for this value, eg `2` would correspond to a value of `101.11` while `0` would correspond to `101`. */
    @Json(name = "precision")
    val precision: kotlin.Int? = null,
    /* The descriptive name of the value used to sort the ranking. */
    @Json(name = "name")
    val name: kotlin.String? = null
) {

}

