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
 * 
 * @param abbreviation The short identifier for the district.
 * @param displayName The long name for the district.
 * @param key Key for this district, e.g. `2016ne`.
 * @param year Year this district participated.
 */
data class DistrictList (
    /* The short identifier for the district. */
    val abbreviation: kotlin.String,
    /* The long name for the district. */
    val displayName: kotlin.String,
    /* Key for this district, e.g. `2016ne`. */
    val key: kotlin.String,
    /* Year this district participated. */
    val year: kotlin.Int
) {

}

