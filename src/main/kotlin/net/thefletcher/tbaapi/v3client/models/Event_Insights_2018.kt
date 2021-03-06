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
 * Insights for FIRST Power Up qualification and elimination matches.
 * @param auto_quest_achieved An array with three values, number of times auto quest was completed, number of opportunities to complete the auto quest, and percentage.
 * @param average_boost_played Average number of boost power up scored (out of 3).
 * @param average_endgame_points Average endgame points.
 * @param average_force_played Average number of force power up scored (out of 3).
 * @param average_foul_score Average foul score.
 * @param average_points_auto Average points scored during auto.
 * @param average_points_teleop Average points scored during teleop.
 * @param average_run_points_auto Average mobility points scored during auto.
 * @param average_scale_ownership_points Average scale ownership points scored.
 * @param average_scale_ownership_points_auto Average scale ownership points scored during auto.
 * @param average_scale_ownership_points_teleop Average scale ownership points scored during teleop.
 * @param average_score Average score.
 * @param average_switch_ownership_points Average switch ownership points scored.
 * @param average_switch_ownership_points_auto Average switch ownership points scored during auto.
 * @param average_switch_ownership_points_teleop Average switch ownership points scored during teleop.
 * @param average_vault_points Average value points scored.
 * @param average_win_margin Average margin of victory.
 * @param average_win_score Average winning score.
 * @param boost_played_counts An array with three values, number of times a boost power up was played, number of opportunities to play a boost power up, and percentage.
 * @param climb_counts An array with three values, number of times a climb occurred, number of opportunities to climb, and percentage.
 * @param face_the_boss_achieved An array with three values, number of times an alliance faced the boss, number of opportunities to face the boss, and percentage.
 * @param force_played_counts An array with three values, number of times a force power up was played, number of opportunities to play a force power up, and percentage.
 * @param high_score An array with three values, high score, match key from the match with the high score, and the name of the match
 * @param levitate_played_counts An array with three values, number of times a levitate power up was played, number of opportunities to play a levitate power up, and percentage.
 * @param run_counts_auto An array with three values, number of times a team scored mobility points in auto, number of opportunities to score mobility points in auto, and percentage.
 * @param scale_neutral_percentage Average scale neutral percentage.
 * @param scale_neutral_percentage_auto Average scale neutral percentage during auto.
 * @param scale_neutral_percentage_teleop Average scale neutral percentage during teleop.
 * @param switch_owned_counts_auto An array with three values, number of times a switch was owned during auto, number of opportunities to own a switch during auto, and percentage.
 * @param unicorn_matches An array with three values, number of times a unicorn match (Win + Auto Quest + Face the Boss) occurred, number of opportunities to have a unicorn match, and percentage.
 * @param winning_opp_switch_denial_percentage_teleop Average opposing switch denail percentage for the winning alliance during teleop.
 * @param winning_own_switch_ownership_percentage Average own switch ownership percentage for the winning alliance.
 * @param winning_own_switch_ownership_percentage_auto Average own switch ownership percentage for the winning alliance during auto.
 * @param winning_own_switch_ownership_percentage_teleop Average own switch ownership percentage for the winning alliance during teleop.
 * @param winning_scale_ownership_percentage Average scale ownership percentage for the winning alliance.
 * @param winning_scale_ownership_percentage_auto Average scale ownership percentage for the winning alliance during auto.
 * @param winning_scale_ownership_percentage_teleop Average scale ownership percentage for the winning alliance during teleop.
 */
data class Event_Insights_2018 (
    /* An array with three values, number of times auto quest was completed, number of opportunities to complete the auto quest, and percentage. */
    val auto_quest_achieved: kotlin.Array<kotlin.Float>,
    /* Average number of boost power up scored (out of 3). */
    val average_boost_played: kotlin.Float,
    /* Average endgame points. */
    val average_endgame_points: kotlin.Float,
    /* Average number of force power up scored (out of 3). */
    val average_force_played: kotlin.Float,
    /* Average foul score. */
    val average_foul_score: kotlin.Float,
    /* Average points scored during auto. */
    val average_points_auto: kotlin.Float,
    /* Average points scored during teleop. */
    val average_points_teleop: kotlin.Float,
    /* Average mobility points scored during auto. */
    val average_run_points_auto: kotlin.Float,
    /* Average scale ownership points scored. */
    val average_scale_ownership_points: kotlin.Float,
    /* Average scale ownership points scored during auto. */
    val average_scale_ownership_points_auto: kotlin.Float,
    /* Average scale ownership points scored during teleop. */
    val average_scale_ownership_points_teleop: kotlin.Float,
    /* Average score. */
    val average_score: kotlin.Float,
    /* Average switch ownership points scored. */
    val average_switch_ownership_points: kotlin.Float,
    /* Average switch ownership points scored during auto. */
    val average_switch_ownership_points_auto: kotlin.Float,
    /* Average switch ownership points scored during teleop. */
    val average_switch_ownership_points_teleop: kotlin.Float,
    /* Average value points scored. */
    val average_vault_points: kotlin.Float,
    /* Average margin of victory. */
    val average_win_margin: kotlin.Float,
    /* Average winning score. */
    val average_win_score: kotlin.Float,
    /* An array with three values, number of times a boost power up was played, number of opportunities to play a boost power up, and percentage. */
    val boost_played_counts: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times a climb occurred, number of opportunities to climb, and percentage. */
    val climb_counts: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times an alliance faced the boss, number of opportunities to face the boss, and percentage. */
    val face_the_boss_achieved: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times a force power up was played, number of opportunities to play a force power up, and percentage. */
    val force_played_counts: kotlin.Array<kotlin.Float>,
    /* An array with three values, high score, match key from the match with the high score, and the name of the match */
    val high_score: kotlin.Array<kotlin.String>,
    /* An array with three values, number of times a levitate power up was played, number of opportunities to play a levitate power up, and percentage. */
    val levitate_played_counts: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times a team scored mobility points in auto, number of opportunities to score mobility points in auto, and percentage. */
    val run_counts_auto: kotlin.Array<kotlin.Float>,
    /* Average scale neutral percentage. */
    val scale_neutral_percentage: kotlin.Float,
    /* Average scale neutral percentage during auto. */
    val scale_neutral_percentage_auto: kotlin.Float,
    /* Average scale neutral percentage during teleop. */
    val scale_neutral_percentage_teleop: kotlin.Float,
    /* An array with three values, number of times a switch was owned during auto, number of opportunities to own a switch during auto, and percentage. */
    val switch_owned_counts_auto: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times a unicorn match (Win + Auto Quest + Face the Boss) occurred, number of opportunities to have a unicorn match, and percentage. */
    val unicorn_matches: kotlin.Array<kotlin.Float>,
    /* Average opposing switch denail percentage for the winning alliance during teleop. */
    val winning_opp_switch_denial_percentage_teleop: kotlin.Float,
    /* Average own switch ownership percentage for the winning alliance. */
    val winning_own_switch_ownership_percentage: kotlin.Float,
    /* Average own switch ownership percentage for the winning alliance during auto. */
    val winning_own_switch_ownership_percentage_auto: kotlin.Float,
    /* Average own switch ownership percentage for the winning alliance during teleop. */
    val winning_own_switch_ownership_percentage_teleop: kotlin.Float,
    /* Average scale ownership percentage for the winning alliance. */
    val winning_scale_ownership_percentage: kotlin.Float,
    /* Average scale ownership percentage for the winning alliance during auto. */
    val winning_scale_ownership_percentage_auto: kotlin.Float,
    /* Average scale ownership percentage for the winning alliance during teleop. */
    val winning_scale_ownership_percentage_teleop: kotlin.Float
) {

}

