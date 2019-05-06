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
 * @param adjustPoints 
 * @param autoPoints 
 * @param bay1 
 * @param bay2 
 * @param bay3 
 * @param bay4 
 * @param bay5 
 * @param bay6 
 * @param bay7 
 * @param bay8 
 * @param cargoPoints 
 * @param completeRocketRankingPoint 
 * @param completedRocketFar 
 * @param completedRocketNear 
 * @param endgameRobot1 
 * @param endgameRobot2 
 * @param endgameRobot3 
 * @param foulCount 
 * @param foulPoints 
 * @param habClimbPoints 
 * @param habDockingRankingPoint 
 * @param habLineRobot1 
 * @param habLineRobot2 
 * @param habLineRobot3 
 * @param hatchPanelPoints 
 * @param lowLeftRocketFar 
 * @param lowLeftRocketNear 
 * @param lowRightRocketFar 
 * @param lowRightRocketNear 
 * @param midLeftRocketFar 
 * @param midLeftRocketNear 
 * @param midRightRocketFar 
 * @param midRightRocketNear 
 * @param preMatchBay1 
 * @param preMatchBay2 
 * @param preMatchBay3 
 * @param preMatchBay6 
 * @param preMatchBay7 
 * @param preMatchBay8 
 * @param preMatchLevelRobot1 
 * @param preMatchLevelRobot2 
 * @param preMatchLevelRobot3 
 * @param rp 
 * @param sandStormBonusPoints 
 * @param techFoulCount 
 * @param teleopPoints 
 * @param topLeftRocketFar 
 * @param topLeftRocketNear 
 * @param topRightRocketFar 
 * @param topRightRocketNear 
 * @param totalPoints 
 */
data class MatchScoreBreakdown2019Alliance (
    val adjustPoints: kotlin.Int? = null,
    val autoPoints: kotlin.Int? = null,
    val bay1: kotlin.String? = null,
    val bay2: kotlin.String? = null,
    val bay3: kotlin.String? = null,
    val bay4: kotlin.String? = null,
    val bay5: kotlin.String? = null,
    val bay6: kotlin.String? = null,
    val bay7: kotlin.String? = null,
    val bay8: kotlin.String? = null,
    val cargoPoints: kotlin.Int? = null,
    val completeRocketRankingPoint: kotlin.Boolean? = null,
    val completedRocketFar: kotlin.Boolean? = null,
    val completedRocketNear: kotlin.Boolean? = null,
    val endgameRobot1: kotlin.String? = null,
    val endgameRobot2: kotlin.String? = null,
    val endgameRobot3: kotlin.String? = null,
    val foulCount: kotlin.Int? = null,
    val foulPoints: kotlin.Int? = null,
    val habClimbPoints: kotlin.Int? = null,
    val habDockingRankingPoint: kotlin.Boolean? = null,
    val habLineRobot1: kotlin.String? = null,
    val habLineRobot2: kotlin.String? = null,
    val habLineRobot3: kotlin.String? = null,
    val hatchPanelPoints: kotlin.Int? = null,
    val lowLeftRocketFar: kotlin.String? = null,
    val lowLeftRocketNear: kotlin.String? = null,
    val lowRightRocketFar: kotlin.String? = null,
    val lowRightRocketNear: kotlin.String? = null,
    val midLeftRocketFar: kotlin.String? = null,
    val midLeftRocketNear: kotlin.String? = null,
    val midRightRocketFar: kotlin.String? = null,
    val midRightRocketNear: kotlin.String? = null,
    val preMatchBay1: kotlin.String? = null,
    val preMatchBay2: kotlin.String? = null,
    val preMatchBay3: kotlin.String? = null,
    val preMatchBay6: kotlin.String? = null,
    val preMatchBay7: kotlin.String? = null,
    val preMatchBay8: kotlin.String? = null,
    val preMatchLevelRobot1: kotlin.String? = null,
    val preMatchLevelRobot2: kotlin.String? = null,
    val preMatchLevelRobot3: kotlin.String? = null,
    val rp: kotlin.Int? = null,
    val sandStormBonusPoints: kotlin.Int? = null,
    val techFoulCount: kotlin.Int? = null,
    val teleopPoints: kotlin.Int? = null,
    val topLeftRocketFar: kotlin.String? = null,
    val topLeftRocketNear: kotlin.String? = null,
    val topRightRocketFar: kotlin.String? = null,
    val topRightRocketNear: kotlin.String? = null,
    val totalPoints: kotlin.Int? = null
) {

}
