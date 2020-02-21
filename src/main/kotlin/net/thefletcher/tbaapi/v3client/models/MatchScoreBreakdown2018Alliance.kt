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
 * @param adjustPoints 
 * @param autoOwnershipPoints 
 * @param autoPoints 
 * @param autoQuestRankingPoint 
 * @param autoRobot1 
 * @param autoRobot2 
 * @param autoRobot3 
 * @param autoRunPoints 
 * @param autoScaleOwnershipSec 
 * @param autoSwitchAtZero 
 * @param autoSwitchOwnershipSec 
 * @param endgamePoints 
 * @param endgameRobot1 
 * @param endgameRobot2 
 * @param endgameRobot3 
 * @param faceTheBossRankingPoint 
 * @param foulCount 
 * @param foulPoints 
 * @param rp 
 * @param techFoulCount 
 * @param teleopOwnershipPoints 
 * @param teleopPoints 
 * @param teleopScaleBoostSec 
 * @param teleopScaleForceSec 
 * @param teleopScaleOwnershipSec 
 * @param teleopSwitchBoostSec 
 * @param teleopSwitchForceSec 
 * @param teleopSwitchOwnershipSec 
 * @param totalPoints 
 * @param vaultBoostPlayed 
 * @param vaultBoostTotal 
 * @param vaultForcePlayed 
 * @param vaultForceTotal 
 * @param vaultLevitatePlayed 
 * @param vaultLevitateTotal 
 * @param vaultPoints 
 * @param tbaGameData Unofficial TBA-computed value of the FMS provided GameData given to the alliance teams at the start of the match. 3 Character String containing `L` and `R` only. The first character represents the near switch, the 2nd the scale, and the 3rd the far, opposing, switch from the alliance's perspective. An `L` in a position indicates the platform on the left will be lit for the alliance while an `R` will indicate the right platform will be lit for the alliance. See also [WPI Screen Steps](https://wpilib.screenstepslive.com/s/currentCS/m/getting_started/l/826278-2018-game-data-details).
 */

data class MatchScoreBreakdown2018Alliance (
    @Json(name = "adjustPoints")
    val adjustPoints: kotlin.Int? = null,
    @Json(name = "autoOwnershipPoints")
    val autoOwnershipPoints: kotlin.Int? = null,
    @Json(name = "autoPoints")
    val autoPoints: kotlin.Int? = null,
    @Json(name = "autoQuestRankingPoint")
    val autoQuestRankingPoint: kotlin.Boolean? = null,
    @Json(name = "autoRobot1")
    val autoRobot1: kotlin.String? = null,
    @Json(name = "autoRobot2")
    val autoRobot2: kotlin.String? = null,
    @Json(name = "autoRobot3")
    val autoRobot3: kotlin.String? = null,
    @Json(name = "autoRunPoints")
    val autoRunPoints: kotlin.Int? = null,
    @Json(name = "autoScaleOwnershipSec")
    val autoScaleOwnershipSec: kotlin.Int? = null,
    @Json(name = "autoSwitchAtZero")
    val autoSwitchAtZero: kotlin.Boolean? = null,
    @Json(name = "autoSwitchOwnershipSec")
    val autoSwitchOwnershipSec: kotlin.Int? = null,
    @Json(name = "endgamePoints")
    val endgamePoints: kotlin.Int? = null,
    @Json(name = "endgameRobot1")
    val endgameRobot1: kotlin.String? = null,
    @Json(name = "endgameRobot2")
    val endgameRobot2: kotlin.String? = null,
    @Json(name = "endgameRobot3")
    val endgameRobot3: kotlin.String? = null,
    @Json(name = "faceTheBossRankingPoint")
    val faceTheBossRankingPoint: kotlin.Boolean? = null,
    @Json(name = "foulCount")
    val foulCount: kotlin.Int? = null,
    @Json(name = "foulPoints")
    val foulPoints: kotlin.Int? = null,
    @Json(name = "rp")
    val rp: kotlin.Int? = null,
    @Json(name = "techFoulCount")
    val techFoulCount: kotlin.Int? = null,
    @Json(name = "teleopOwnershipPoints")
    val teleopOwnershipPoints: kotlin.Int? = null,
    @Json(name = "teleopPoints")
    val teleopPoints: kotlin.Int? = null,
    @Json(name = "teleopScaleBoostSec")
    val teleopScaleBoostSec: kotlin.Int? = null,
    @Json(name = "teleopScaleForceSec")
    val teleopScaleForceSec: kotlin.Int? = null,
    @Json(name = "teleopScaleOwnershipSec")
    val teleopScaleOwnershipSec: kotlin.Int? = null,
    @Json(name = "teleopSwitchBoostSec")
    val teleopSwitchBoostSec: kotlin.Int? = null,
    @Json(name = "teleopSwitchForceSec")
    val teleopSwitchForceSec: kotlin.Int? = null,
    @Json(name = "teleopSwitchOwnershipSec")
    val teleopSwitchOwnershipSec: kotlin.Int? = null,
    @Json(name = "totalPoints")
    val totalPoints: kotlin.Int? = null,
    @Json(name = "vaultBoostPlayed")
    val vaultBoostPlayed: kotlin.Int? = null,
    @Json(name = "vaultBoostTotal")
    val vaultBoostTotal: kotlin.Int? = null,
    @Json(name = "vaultForcePlayed")
    val vaultForcePlayed: kotlin.Int? = null,
    @Json(name = "vaultForceTotal")
    val vaultForceTotal: kotlin.Int? = null,
    @Json(name = "vaultLevitatePlayed")
    val vaultLevitatePlayed: kotlin.Int? = null,
    @Json(name = "vaultLevitateTotal")
    val vaultLevitateTotal: kotlin.Int? = null,
    @Json(name = "vaultPoints")
    val vaultPoints: kotlin.Int? = null,
    /* Unofficial TBA-computed value of the FMS provided GameData given to the alliance teams at the start of the match. 3 Character String containing `L` and `R` only. The first character represents the near switch, the 2nd the scale, and the 3rd the far, opposing, switch from the alliance's perspective. An `L` in a position indicates the platform on the left will be lit for the alliance while an `R` will indicate the right platform will be lit for the alliance. See also [WPI Screen Steps](https://wpilib.screenstepslive.com/s/currentCS/m/getting_started/l/826278-2018-game-data-details). */
    @Json(name = "tba_gameData")
    val tbaGameData: kotlin.String? = null
) 



