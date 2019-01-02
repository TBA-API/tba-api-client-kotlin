/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* OpenAPI spec version: 3.04.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package net.thefletcher.tbaapi.v3client.models

import net.thefletcher.tbaapi.v3client.models.Match_Score_Breakdown_2017_Alliance

/**
 * See the 2017 FMS API documentation for a description of each value.
 * @param blue 
 * @param red 
 */
data class Match_Score_Breakdown_2017 (
    val blue: Match_Score_Breakdown_2017_Alliance? = null,
    val red: Match_Score_Breakdown_2017_Alliance? = null
) {

}

