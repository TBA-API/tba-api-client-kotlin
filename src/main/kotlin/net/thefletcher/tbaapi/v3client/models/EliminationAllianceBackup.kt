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
 * Backup team called in, may be null.
 * @param &#x60;in&#x60; Team key that was called in as the backup.
 * @param &#x60;out&#x60; Team key that was replaced by the backup team.
 */
data class EliminationAllianceBackup (
    /* Team key that was called in as the backup. */
    @Json(name = "in")
    val `in`: kotlin.String? = null,
    /* Team key that was replaced by the backup team. */
    @Json(name = "out")
    val `out`: kotlin.String? = null
) {

}

