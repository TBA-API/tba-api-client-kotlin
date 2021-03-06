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


/**
 * 
 * @param autoPoints 
 * @param teleopPoints 
 * @param breachPoints 
 * @param foulPoints 
 * @param capturePoints 
 * @param adjustPoints 
 * @param totalPoints 
 * @param robot1Auto 
 * @param robot2Auto 
 * @param robot3Auto 
 * @param autoReachPoints 
 * @param autoCrossingPoints 
 * @param autoBouldersLow 
 * @param autoBouldersHigh 
 * @param autoBoulderPoints 
 * @param teleopCrossingPoints 
 * @param teleopBouldersLow 
 * @param teleopBouldersHigh 
 * @param teleopBoulderPoints 
 * @param teleopDefensesBreached 
 * @param teleopChallengePoints 
 * @param teleopScalePoints 
 * @param teleopTowerCaptured 
 * @param towerFaceA 
 * @param towerFaceB 
 * @param towerFaceC 
 * @param towerEndStrength 
 * @param techFoulCount 
 * @param foulCount 
 * @param position2 
 * @param position3 
 * @param position4 
 * @param position5 
 * @param position1crossings 
 * @param position2crossings 
 * @param position3crossings 
 * @param position4crossings 
 * @param position5crossings 
 */
data class Match_Score_Breakdown_2016_Alliance (
    val autoPoints: kotlin.Int? = null,
    val teleopPoints: kotlin.Int? = null,
    val breachPoints: kotlin.Int? = null,
    val foulPoints: kotlin.Int? = null,
    val capturePoints: kotlin.Int? = null,
    val adjustPoints: kotlin.Int? = null,
    val totalPoints: kotlin.Int? = null,
    val robot1Auto: Match_Score_Breakdown_2016_Alliance.Robot1Auto? = null,
    val robot2Auto: Match_Score_Breakdown_2016_Alliance.Robot2Auto? = null,
    val robot3Auto: Match_Score_Breakdown_2016_Alliance.Robot3Auto? = null,
    val autoReachPoints: kotlin.Int? = null,
    val autoCrossingPoints: kotlin.Int? = null,
    val autoBouldersLow: kotlin.Int? = null,
    val autoBouldersHigh: kotlin.Int? = null,
    val autoBoulderPoints: kotlin.Int? = null,
    val teleopCrossingPoints: kotlin.Int? = null,
    val teleopBouldersLow: kotlin.Int? = null,
    val teleopBouldersHigh: kotlin.Int? = null,
    val teleopBoulderPoints: kotlin.Int? = null,
    val teleopDefensesBreached: kotlin.Boolean? = null,
    val teleopChallengePoints: kotlin.Int? = null,
    val teleopScalePoints: kotlin.Int? = null,
    val teleopTowerCaptured: kotlin.Int? = null,
    val towerFaceA: kotlin.String? = null,
    val towerFaceB: kotlin.String? = null,
    val towerFaceC: kotlin.String? = null,
    val towerEndStrength: kotlin.Int? = null,
    val techFoulCount: kotlin.Int? = null,
    val foulCount: kotlin.Int? = null,
    val position2: kotlin.String? = null,
    val position3: kotlin.String? = null,
    val position4: kotlin.String? = null,
    val position5: kotlin.String? = null,
    val position1crossings: kotlin.Int? = null,
    val position2crossings: kotlin.Int? = null,
    val position3crossings: kotlin.Int? = null,
    val position4crossings: kotlin.Int? = null,
    val position5crossings: kotlin.Int? = null
) {

    /**
    * 
    * Values: crossed,reached,none
    */
    enum class Robot1Auto(val value: kotlin.Any){
    
        crossed("Crossed"),
    
        reached("Reached"),
    
        none("None");
    
    }

    /**
    * 
    * Values: crossed,reached,none
    */
    enum class Robot2Auto(val value: kotlin.Any){
    
        crossed("Crossed"),
    
        reached("Reached"),
    
        none("None");
    
    }

    /**
    * 
    * Values: crossed,reached,none
    */
    enum class Robot3Auto(val value: kotlin.Any){
    
        crossed("Crossed"),
    
        reached("Reached"),
    
        none("None");
    
    }

}

