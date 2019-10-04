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

import net.thefletcher.tbaapi.v3client.models.WLTRecord

import com.squareup.moshi.Json
/**
 * Playoff status for this team, may be null if the team did not make playoffs, or playoffs have not begun.
 * @param level The highest playoff level the team reached.
 * @param currentLevelRecord 
 * @param record 
 * @param status Current competition status for the playoffs.
 * @param playoffAverage The average match score during playoffs. Year specific. May be null if not relevant for a given year.
 */

data class TeamEventStatusPlayoff (
    /* The highest playoff level the team reached. */
    @Json(name = "level")
    val level: TeamEventStatusPlayoff.Level? = null,
    @Json(name = "current_level_record")
    val currentLevelRecord: WLTRecord? = null,
    @Json(name = "record")
    val record: WLTRecord? = null,
    /* Current competition status for the playoffs. */
    @Json(name = "status")
    val status: TeamEventStatusPlayoff.Status? = null,
    /* The average match score during playoffs. Year specific. May be null if not relevant for a given year. */
    @Json(name = "playoff_average")
    val playoffAverage: kotlin.Int? = null
) 


{

    /**
    * The highest playoff level the team reached.
    * Values: qm,ef,qf,sf,f
    */
    
    enum class Level(val value: kotlin.String){
    
        @Json(name = "qm") qm("qm"),
    
        @Json(name = "ef") ef("ef"),
    
        @Json(name = "qf") qf("qf"),
    
        @Json(name = "sf") sf("sf"),
    
        @Json(name = "f") f("f");
    

    }

    /**
    * Current competition status for the playoffs.
    * Values: won,eliminated,playing
    */
    
    enum class Status(val value: kotlin.String){
    
        @Json(name = "won") won("won"),
    
        @Json(name = "eliminated") eliminated("eliminated"),
    
        @Json(name = "playing") playing("playing");
    

    }

}

