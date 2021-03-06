/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* The version of the OpenAPI document: 3.8.0
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
 * @param minAppVersion Internal use - Minimum application version required to correctly connect and process data.
 * @param latestAppVersion Internal use - Latest application version available.
 */

data class APIStatusAppVersion (
    /* Internal use - Minimum application version required to correctly connect and process data. */
    @Json(name = "min_app_version")
    val minAppVersion: kotlin.Int,
    /* Internal use - Latest application version available. */
    @Json(name = "latest_app_version")
    val latestAppVersion: kotlin.Int
)

