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
 * Insights for FIRST STEAMWORKS qualification and elimination matches.
 * @param averageFoulScore Average foul score.
 * @param averageFuelPoints Average fuel points scored.
 * @param averageFuelPointsAuto Average fuel points scored during auto.
 * @param averageFuelPointsTeleop Average fuel points scored during teleop.
 * @param averageHighGoals Average points scored in the high goal.
 * @param averageHighGoalsAuto Average points scored in the high goal during auto.
 * @param averageHighGoalsTeleop Average points scored in the high goal during teleop.
 * @param averageLowGoals Average points scored in the low goal.
 * @param averageLowGoalsAuto Average points scored in the low goal during auto.
 * @param averageLowGoalsTeleop Average points scored in the low goal during teleop.
 * @param averageMobilityPointsAuto Average mobility points scored during auto.
 * @param averagePointsAuto Average points scored during auto.
 * @param averagePointsTeleop Average points scored during teleop.
 * @param averageRotorPoints Average rotor points scored.
 * @param averageRotorPointsAuto Average rotor points scored during auto.
 * @param averageRotorPointsTeleop Average rotor points scored during teleop.
 * @param averageScore Average score.
 * @param averageTakeoffPointsTeleop Average takeoff points scored during teleop.
 * @param averageWinMargin Average margin of victory.
 * @param averageWinScore Average winning score.
 * @param highKpa An array with three values, kPa scored, match key from the match with the high kPa, and the name of the match
 * @param highScore An array with three values, high score, match key from the match with the high score, and the name of the match
 * @param kpaAchieved An array with three values, number of times kPa bonus achieved, number of opportunities to bonus, and percentage.
 * @param mobilityCounts An array with three values, number of times mobility bonus achieved, number of opportunities to bonus, and percentage.
 * @param rotor1Engaged An array with three values, number of times rotor 1 engaged, number of opportunities to engage, and percentage.
 * @param rotor1EngagedAuto An array with three values, number of times rotor 1 engaged in auto, number of opportunities to engage in auto, and percentage.
 * @param rotor2Engaged An array with three values, number of times rotor 2 engaged, number of opportunities to engage, and percentage.
 * @param rotor2EngagedAuto An array with three values, number of times rotor 2 engaged in auto, number of opportunities to engage in auto, and percentage.
 * @param rotor3Engaged An array with three values, number of times rotor 3 engaged, number of opportunities to engage, and percentage.
 * @param rotor4Engaged An array with three values, number of times rotor 4 engaged, number of opportunities to engage, and percentage.
 * @param takeoffCounts An array with three values, number of times takeoff was counted, number of opportunities to takeoff, and percentage.
 * @param unicornMatches An array with three values, number of times a unicorn match (Win + kPa & Rotor Bonuses) occured, number of opportunities to have a unicorn match, and percentage.
 */
data class EventInsights2017 (
    /* Average foul score. */
    val averageFoulScore: kotlin.Float,
    /* Average fuel points scored. */
    val averageFuelPoints: kotlin.Float,
    /* Average fuel points scored during auto. */
    val averageFuelPointsAuto: kotlin.Float,
    /* Average fuel points scored during teleop. */
    val averageFuelPointsTeleop: kotlin.Float,
    /* Average points scored in the high goal. */
    val averageHighGoals: kotlin.Float,
    /* Average points scored in the high goal during auto. */
    val averageHighGoalsAuto: kotlin.Float,
    /* Average points scored in the high goal during teleop. */
    val averageHighGoalsTeleop: kotlin.Float,
    /* Average points scored in the low goal. */
    val averageLowGoals: kotlin.Float,
    /* Average points scored in the low goal during auto. */
    val averageLowGoalsAuto: kotlin.Float,
    /* Average points scored in the low goal during teleop. */
    val averageLowGoalsTeleop: kotlin.Float,
    /* Average mobility points scored during auto. */
    val averageMobilityPointsAuto: kotlin.Float,
    /* Average points scored during auto. */
    val averagePointsAuto: kotlin.Float,
    /* Average points scored during teleop. */
    val averagePointsTeleop: kotlin.Float,
    /* Average rotor points scored. */
    val averageRotorPoints: kotlin.Float,
    /* Average rotor points scored during auto. */
    val averageRotorPointsAuto: kotlin.Float,
    /* Average rotor points scored during teleop. */
    val averageRotorPointsTeleop: kotlin.Float,
    /* Average score. */
    val averageScore: kotlin.Float,
    /* Average takeoff points scored during teleop. */
    val averageTakeoffPointsTeleop: kotlin.Float,
    /* Average margin of victory. */
    val averageWinMargin: kotlin.Float,
    /* Average winning score. */
    val averageWinScore: kotlin.Float,
    /* An array with three values, kPa scored, match key from the match with the high kPa, and the name of the match */
    val highKpa: kotlin.Array<kotlin.String>,
    /* An array with three values, high score, match key from the match with the high score, and the name of the match */
    val highScore: kotlin.Array<kotlin.String>,
    /* An array with three values, number of times kPa bonus achieved, number of opportunities to bonus, and percentage. */
    val kpaAchieved: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times mobility bonus achieved, number of opportunities to bonus, and percentage. */
    val mobilityCounts: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times rotor 1 engaged, number of opportunities to engage, and percentage. */
    val rotor1Engaged: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times rotor 1 engaged in auto, number of opportunities to engage in auto, and percentage. */
    val rotor1EngagedAuto: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times rotor 2 engaged, number of opportunities to engage, and percentage. */
    val rotor2Engaged: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times rotor 2 engaged in auto, number of opportunities to engage in auto, and percentage. */
    val rotor2EngagedAuto: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times rotor 3 engaged, number of opportunities to engage, and percentage. */
    val rotor3Engaged: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times rotor 4 engaged, number of opportunities to engage, and percentage. */
    val rotor4Engaged: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times takeoff was counted, number of opportunities to takeoff, and percentage. */
    val takeoffCounts: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times a unicorn match (Win + kPa & Rotor Bonuses) occured, number of opportunities to have a unicorn match, and percentage. */
    val unicornMatches: kotlin.Array<kotlin.Float>
) {

}

