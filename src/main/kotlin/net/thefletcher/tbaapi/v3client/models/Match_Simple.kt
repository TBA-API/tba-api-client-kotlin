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

import net.thefletcher.tbaapi.v3client.models.Match_Simple_alliances

/**
 * 
 * @param key TBA match key with the format `yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER]`, where `yyyy` is the year, and `EVENT_CODE` is the event code of the event, `COMP_LEVEL` is (qm, ef, qf, sf, f), and `MATCH_NUMBER` is the match number in the competition level. A set number may append the competition level if more than one match in required per set.
 * @param comp_level The competition level the match was played at.
 * @param set_number The set number in a series of matches where more than one match is required in the match series.
 * @param match_number The match number of the match in the competition level.
 * @param alliances 
 * @param winning_alliance The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie.
 * @param event_key Event key of the event the match was played at.
 * @param time UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the scheduled match time, as taken from the published schedule.
 * @param predicted_time UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the TBA predicted match start time.
 * @param actual_time UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of actual match start time.
 */
data class Match_Simple (
    /* TBA match key with the format `yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER]`, where `yyyy` is the year, and `EVENT_CODE` is the event code of the event, `COMP_LEVEL` is (qm, ef, qf, sf, f), and `MATCH_NUMBER` is the match number in the competition level. A set number may append the competition level if more than one match in required per set. */
    val key: kotlin.String,
    /* The competition level the match was played at. */
    val comp_level: Match_Simple.CompLevel,
    /* The set number in a series of matches where more than one match is required in the match series. */
    val set_number: kotlin.Int,
    /* The match number of the match in the competition level. */
    val match_number: kotlin.Int,
    /* Event key of the event the match was played at. */
    val event_key: kotlin.String,
    val alliances: Match_Simple_alliances? = null,
    /* The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie. */
    val winning_alliance: Match_Simple.WinningAlliance? = null,
    /* UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the scheduled match time, as taken from the published schedule. */
    val time: kotlin.Long? = null,
    /* UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the TBA predicted match start time. */
    val predicted_time: kotlin.Long? = null,
    /* UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of actual match start time. */
    val actual_time: kotlin.Long? = null
) {

    /**
    * The competition level the match was played at.
    * Values: qm,ef,qf,sf,f
    */
    enum class CompLevel(val value: kotlin.Any){
    
        qm("qm"),
    
        ef("ef"),
    
        qf("qf"),
    
        sf("sf"),
    
        f("f");
    
    }

    /**
    * The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie.
    * Values: red,blue
    */
    enum class WinningAlliance(val value: kotlin.Any){
    
        red("red"),
    
        blue("blue");
    
    }

}

