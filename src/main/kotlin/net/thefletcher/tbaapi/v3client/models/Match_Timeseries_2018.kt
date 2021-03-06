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
 * Timeseries data for the 2018 game *FIRST* POWER UP. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This model is currently under active development and may change at any time, including in breaking ways.
 * @param event_key TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event.
 * @param match_id Match ID consisting of the level, match number, and set number, eg `qm45` or `f1m1`.
 * @param mode Current mode of play, can be `pre_match`, `auto`, `telop`, or `post_match`.
 * @param play 
 * @param time_remaining Amount of time remaining in the match, only valid during `auto` and `teleop` modes.
 * @param blue_auto_quest 1 if the blue alliance is credited with the AUTO QUEST, 0 if not.
 * @param blue_boost_count Number of POWER CUBES in the BOOST section of the blue alliance VAULT.
 * @param blue_boost_played Returns 1 if the blue alliance BOOST was played, or 0 if not played.
 * @param blue_current_powerup Name of the current blue alliance POWER UP being played, or `null`.
 * @param blue_face_the_boss 1 if the blue alliance is credited with FACING THE BOSS, 0 if not.
 * @param blue_force_count Number of POWER CUBES in the FORCE section of the blue alliance VAULT.
 * @param blue_force_played Returns 1 if the blue alliance FORCE was played, or 0 if not played.
 * @param blue_levitate_count Number of POWER CUBES in the LEVITATE section of the blue alliance VAULT.
 * @param blue_levitate_played Returns 1 if the blue alliance LEVITATE was played, or 0 if not played.
 * @param blue_powerup_time_remaining Number of seconds remaining in the blue alliance POWER UP time, or 0 if none is active.
 * @param blue_scale_owned 1 if the blue alliance owns the SCALE, 0 if not.
 * @param blue_score Current score for the blue alliance.
 * @param blue_switch_owned 1 if the blue alliance owns their SWITCH, 0 if not.
 * @param red_auto_quest 1 if the red alliance is credited with the AUTO QUEST, 0 if not.
 * @param red_boost_count Number of POWER CUBES in the BOOST section of the red alliance VAULT.
 * @param red_boost_played Returns 1 if the red alliance BOOST was played, or 0 if not played.
 * @param red_current_powerup Name of the current red alliance POWER UP being played, or `null`.
 * @param red_face_the_boss 1 if the red alliance is credited with FACING THE BOSS, 0 if not.
 * @param red_force_count Number of POWER CUBES in the FORCE section of the red alliance VAULT.
 * @param red_force_played Returns 1 if the red alliance FORCE was played, or 0 if not played.
 * @param red_levitate_count Number of POWER CUBES in the LEVITATE section of the red alliance VAULT.
 * @param red_levitate_played Returns 1 if the red alliance LEVITATE was played, or 0 if not played.
 * @param red_powerup_time_remaining Number of seconds remaining in the red alliance POWER UP time, or 0 if none is active.
 * @param red_scale_owned 1 if the red alliance owns the SCALE, 0 if not.
 * @param red_score Current score for the red alliance.
 * @param red_switch_owned 1 if the red alliance owns their SWITCH, 0 if not.
 */
data class Match_Timeseries_2018 (
    /* TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event. */
    val event_key: kotlin.String? = null,
    /* Match ID consisting of the level, match number, and set number, eg `qm45` or `f1m1`. */
    val match_id: kotlin.String? = null,
    /* Current mode of play, can be `pre_match`, `auto`, `telop`, or `post_match`. */
    val mode: kotlin.String? = null,
    val play: kotlin.Int? = null,
    /* Amount of time remaining in the match, only valid during `auto` and `teleop` modes. */
    val time_remaining: kotlin.Int? = null,
    /* 1 if the blue alliance is credited with the AUTO QUEST, 0 if not. */
    val blue_auto_quest: kotlin.Int? = null,
    /* Number of POWER CUBES in the BOOST section of the blue alliance VAULT. */
    val blue_boost_count: kotlin.Int? = null,
    /* Returns 1 if the blue alliance BOOST was played, or 0 if not played. */
    val blue_boost_played: kotlin.Int? = null,
    /* Name of the current blue alliance POWER UP being played, or `null`. */
    val blue_current_powerup: kotlin.String? = null,
    /* 1 if the blue alliance is credited with FACING THE BOSS, 0 if not. */
    val blue_face_the_boss: kotlin.Int? = null,
    /* Number of POWER CUBES in the FORCE section of the blue alliance VAULT. */
    val blue_force_count: kotlin.Int? = null,
    /* Returns 1 if the blue alliance FORCE was played, or 0 if not played. */
    val blue_force_played: kotlin.Int? = null,
    /* Number of POWER CUBES in the LEVITATE section of the blue alliance VAULT. */
    val blue_levitate_count: kotlin.Int? = null,
    /* Returns 1 if the blue alliance LEVITATE was played, or 0 if not played. */
    val blue_levitate_played: kotlin.Int? = null,
    /* Number of seconds remaining in the blue alliance POWER UP time, or 0 if none is active. */
    val blue_powerup_time_remaining: kotlin.String? = null,
    /* 1 if the blue alliance owns the SCALE, 0 if not. */
    val blue_scale_owned: kotlin.Int? = null,
    /* Current score for the blue alliance. */
    val blue_score: kotlin.Int? = null,
    /* 1 if the blue alliance owns their SWITCH, 0 if not. */
    val blue_switch_owned: kotlin.Int? = null,
    /* 1 if the red alliance is credited with the AUTO QUEST, 0 if not. */
    val red_auto_quest: kotlin.Int? = null,
    /* Number of POWER CUBES in the BOOST section of the red alliance VAULT. */
    val red_boost_count: kotlin.Int? = null,
    /* Returns 1 if the red alliance BOOST was played, or 0 if not played. */
    val red_boost_played: kotlin.Int? = null,
    /* Name of the current red alliance POWER UP being played, or `null`. */
    val red_current_powerup: kotlin.String? = null,
    /* 1 if the red alliance is credited with FACING THE BOSS, 0 if not. */
    val red_face_the_boss: kotlin.Int? = null,
    /* Number of POWER CUBES in the FORCE section of the red alliance VAULT. */
    val red_force_count: kotlin.Int? = null,
    /* Returns 1 if the red alliance FORCE was played, or 0 if not played. */
    val red_force_played: kotlin.Int? = null,
    /* Number of POWER CUBES in the LEVITATE section of the red alliance VAULT. */
    val red_levitate_count: kotlin.Int? = null,
    /* Returns 1 if the red alliance LEVITATE was played, or 0 if not played. */
    val red_levitate_played: kotlin.Int? = null,
    /* Number of seconds remaining in the red alliance POWER UP time, or 0 if none is active. */
    val red_powerup_time_remaining: kotlin.String? = null,
    /* 1 if the red alliance owns the SCALE, 0 if not. */
    val red_scale_owned: kotlin.Int? = null,
    /* Current score for the red alliance. */
    val red_score: kotlin.Int? = null,
    /* 1 if the red alliance owns their SWITCH, 0 if not. */
    val red_switch_owned: kotlin.Int? = null
) {

}

