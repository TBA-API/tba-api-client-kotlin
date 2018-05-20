/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* OpenAPI spec version: 3.03.1
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package net.thefletcher.tbaapi.v3client.models


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
 * @param tba_gameData Unofficial TBA-computed value of the FMS provided GameData given to the alliance teams at the start of the match. 3 Character String containing `L` and `R` only. The first character represents the near switch, the 2nd the scale, and the 3rd the far, opposing, switch from the alliance's perspective. An `L` in a position indicates the platform on the left will be lit for the alliance while an `R` will indicate the right platform will be lit for the alliance. See also [WPI Screen Steps](https://wpilib.screenstepslive.com/s/currentCS/m/getting_started/l/826278-2018-game-data-details).
 */
data class Match_Score_Breakdown_2018_Alliance (
    val adjustPoints: kotlin.Int? = null,
    val autoOwnershipPoints: kotlin.Int? = null,
    val autoPoints: kotlin.Int? = null,
    val autoQuestRankingPoint: kotlin.Boolean? = null,
    val autoRobot1: kotlin.String? = null,
    val autoRobot2: kotlin.String? = null,
    val autoRobot3: kotlin.String? = null,
    val autoRunPoints: kotlin.Int? = null,
    val autoScaleOwnershipSec: kotlin.Int? = null,
    val autoSwitchAtZero: kotlin.Boolean? = null,
    val autoSwitchOwnershipSec: kotlin.Int? = null,
    val endgamePoints: kotlin.Int? = null,
    val endgameRobot1: kotlin.String? = null,
    val endgameRobot2: kotlin.String? = null,
    val endgameRobot3: kotlin.String? = null,
    val faceTheBossRankingPoint: kotlin.Boolean? = null,
    val foulCount: kotlin.Int? = null,
    val foulPoints: kotlin.Int? = null,
    val rp: kotlin.Int? = null,
    val techFoulCount: kotlin.Int? = null,
    val teleopOwnershipPoints: kotlin.Int? = null,
    val teleopPoints: kotlin.Int? = null,
    val teleopScaleBoostSec: kotlin.Int? = null,
    val teleopScaleForceSec: kotlin.Int? = null,
    val teleopScaleOwnershipSec: kotlin.Int? = null,
    val teleopSwitchBoostSec: kotlin.Int? = null,
    val teleopSwitchForceSec: kotlin.Int? = null,
    val teleopSwitchOwnershipSec: kotlin.Int? = null,
    val totalPoints: kotlin.Int? = null,
    val vaultBoostPlayed: kotlin.Int? = null,
    val vaultBoostTotal: kotlin.Int? = null,
    val vaultForcePlayed: kotlin.Int? = null,
    val vaultForceTotal: kotlin.Int? = null,
    val vaultLevitatePlayed: kotlin.Int? = null,
    val vaultLevitateTotal: kotlin.Int? = null,
    val vaultPoints: kotlin.Int? = null,
    /* Unofficial TBA-computed value of the FMS provided GameData given to the alliance teams at the start of the match. 3 Character String containing `L` and `R` only. The first character represents the near switch, the 2nd the scale, and the 3rd the far, opposing, switch from the alliance's perspective. An `L` in a position indicates the platform on the left will be lit for the alliance while an `R` will indicate the right platform will be lit for the alliance. See also [WPI Screen Steps](https://wpilib.screenstepslive.com/s/currentCS/m/getting_started/l/826278-2018-game-data-details). */
    val tba_gameData: kotlin.String? = null
) {

}

