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
 * @param key TBA team key with the format `frcXXXX` with `XXXX` representing the team number.
 * @param teamNumber Official team number issued by FIRST.
 * @param nickname Team nickname provided by FIRST.
 * @param name Official long name registered with FIRST.
 * @param city City of team derived from parsing the address registered with FIRST.
 * @param stateProv State of team derived from parsing the address registered with FIRST.
 * @param country Country of team derived from parsing the address registered with FIRST.
 */

data class TeamSimple (
    /* TBA team key with the format `frcXXXX` with `XXXX` representing the team number. */
    @Json(name = "key")
    val key: kotlin.String,
    /* Official team number issued by FIRST. */
    @Json(name = "team_number")
    val teamNumber: kotlin.Int,
    /* Official long name registered with FIRST. */
    @Json(name = "name")
    val name: kotlin.String,
    /* Team nickname provided by FIRST. */
    @Json(name = "nickname")
    val nickname: kotlin.String? = null,
    /* City of team derived from parsing the address registered with FIRST. */
    @Json(name = "city")
    val city: kotlin.String? = null,
    /* State of team derived from parsing the address registered with FIRST. */
    @Json(name = "state_prov")
    val stateProv: kotlin.String? = null,
    /* Country of team derived from parsing the address registered with FIRST. */
    @Json(name = "country")
    val country: kotlin.String? = null
) 



