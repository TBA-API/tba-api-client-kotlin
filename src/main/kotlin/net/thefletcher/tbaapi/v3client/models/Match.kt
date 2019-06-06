/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* The version of the OpenAPI document: 3.04.1
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package net.thefletcher.tbaapi.v3client.models

import net.thefletcher.tbaapi.v3client.models.MatchAlliances
import net.thefletcher.tbaapi.v3client.models.MatchVideos

import com.squareup.moshi.Json
/**
 * 
 * @param key TBA match key with the format `yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER]`, where `yyyy` is the year, and `EVENT_CODE` is the event code of the event, `COMP_LEVEL` is (qm, ef, qf, sf, f), and `MATCH_NUMBER` is the match number in the competition level. A set number may be appended to the competition level if more than one match in required per set.
 * @param compLevel The competition level the match was played at.
 * @param setNumber The set number in a series of matches where more than one match is required in the match series.
 * @param matchNumber The match number of the match in the competition level.
 * @param alliances 
 * @param winningAlliance The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie.
 * @param eventKey Event key of the event the match was played at.
 * @param time UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the scheduled match time, as taken from the published schedule.
 * @param actualTime UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of actual match start time.
 * @param predictedTime UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the TBA predicted match start time.
 * @param postResultTime UNIX timestamp (seconds since 1-Jan-1970 00:00:00) when the match result was posted.
 * @param scoreBreakdown Score breakdown for auto, teleop, etc. points. Varies from year to year. May be null.
 * @param videos Array of video objects associated with this match.
 */
data class Match (
    /* TBA match key with the format `yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER]`, where `yyyy` is the year, and `EVENT_CODE` is the event code of the event, `COMP_LEVEL` is (qm, ef, qf, sf, f), and `MATCH_NUMBER` is the match number in the competition level. A set number may be appended to the competition level if more than one match in required per set. */
    @Json(name = "key")
    val key: kotlin.String,
    /* The competition level the match was played at. */
    @Json(name = "comp_level")
    val compLevel: Match.CompLevel,
    /* The set number in a series of matches where more than one match is required in the match series. */
    @Json(name = "set_number")
    val setNumber: kotlin.Int,
    /* The match number of the match in the competition level. */
    @Json(name = "match_number")
    val matchNumber: kotlin.Int,
    /* Event key of the event the match was played at. */
    @Json(name = "event_key")
    val eventKey: kotlin.String,
    @Json(name = "alliances")
    val alliances: MatchAlliances? = null,
    /* The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie. */
    @Json(name = "winning_alliance")
    val winningAlliance: kotlin.String? = null,
    /* UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the scheduled match time, as taken from the published schedule. */
    @Json(name = "time")
    val time: kotlin.Long? = null,
    /* UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of actual match start time. */
    @Json(name = "actual_time")
    val actualTime: kotlin.Long? = null,
    /* UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the TBA predicted match start time. */
    @Json(name = "predicted_time")
    val predictedTime: kotlin.Long? = null,
    /* UNIX timestamp (seconds since 1-Jan-1970 00:00:00) when the match result was posted. */
    @Json(name = "post_result_time")
    val postResultTime: kotlin.Long? = null,
    /* Score breakdown for auto, teleop, etc. points. Varies from year to year. May be null. */
    @Json(name = "score_breakdown")
    val scoreBreakdown: kotlin.Any? = null,
    /* Array of video objects associated with this match. */
    @Json(name = "videos")
    val videos: kotlin.Array<MatchVideos>? = null
) {

    /**
    * The competition level the match was played at.
    * Values: qm,ef,qf,sf,f
    */
    enum class CompLevel(val value: kotlin.String){
    
        @Json(name = "qm")
        qm("qm"),
    
        @Json(name = "ef")
        ef("ef"),
    
        @Json(name = "qf")
        qf("qf"),
    
        @Json(name = "sf")
        sf("sf"),
    
        @Json(name = "f")
        f("f");
    
    }

}

