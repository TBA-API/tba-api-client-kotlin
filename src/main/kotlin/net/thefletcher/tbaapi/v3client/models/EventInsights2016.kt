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
 * Insights for FIRST Stronghold qualification and elimination matches.
 * @param lowBar For the Low Bar - An array with three values, number of times damaged, number of opportunities to damage, and percentage.
 * @param aChevalDeFrise For the Cheval De Frise - An array with three values, number of times damaged, number of opportunities to damage, and percentage.
 * @param aPortcullis For the Portcullis - An array with three values, number of times damaged, number of opportunities to damage, and percentage.
 * @param bRamparts For the Ramparts - An array with three values, number of times damaged, number of opportunities to damage, and percentage.
 * @param bMoat For the Moat - An array with three values, number of times damaged, number of opportunities to damage, and percentage.
 * @param cSallyPort For the Sally Port - An array with three values, number of times damaged, number of opportunities to damage, and percentage.
 * @param cDrawbridge For the Drawbridge - An array with three values, number of times damaged, number of opportunities to damage, and percentage.
 * @param dRoughTerrain For the Rough Terrain - An array with three values, number of times damaged, number of opportunities to damage, and percentage.
 * @param dRockWall For the Rock Wall - An array with three values, number of times damaged, number of opportunities to damage, and percentage.
 * @param averageHighGoals Average number of high goals scored.
 * @param averageLowGoals Average number of low goals scored.
 * @param breaches An array with three values, number of times breached, number of opportunities to breach, and percentage.
 * @param scales An array with three values, number of times scaled, number of opportunities to scale, and percentage.
 * @param challenges An array with three values, number of times challenged, number of opportunities to challenge, and percentage.
 * @param captures An array with three values, number of times captured, number of opportunities to capture, and percentage.
 * @param averageWinScore Average winning score.
 * @param averageWinMargin Average margin of victory.
 * @param averageScore Average total score.
 * @param averageAutoScore Average autonomous score.
 * @param averageCrossingScore Average crossing score.
 * @param averageBoulderScore Average boulder score.
 * @param averageTowerScore Average tower score.
 * @param averageFoulScore Average foul score.
 * @param highScore An array with three values, high score, match key from the match with the high score, and the name of the match.
 */
data class EventInsights2016 (
    /* For the Low Bar - An array with three values, number of times damaged, number of opportunities to damage, and percentage. */
    val lowBar: kotlin.Array<kotlin.Float>,
    /* For the Cheval De Frise - An array with three values, number of times damaged, number of opportunities to damage, and percentage. */
    val aChevalDeFrise: kotlin.Array<kotlin.Float>,
    /* For the Portcullis - An array with three values, number of times damaged, number of opportunities to damage, and percentage. */
    val aPortcullis: kotlin.Array<kotlin.Float>,
    /* For the Ramparts - An array with three values, number of times damaged, number of opportunities to damage, and percentage. */
    val bRamparts: kotlin.Array<kotlin.Float>,
    /* For the Moat - An array with three values, number of times damaged, number of opportunities to damage, and percentage. */
    val bMoat: kotlin.Array<kotlin.Float>,
    /* For the Sally Port - An array with three values, number of times damaged, number of opportunities to damage, and percentage. */
    val cSallyPort: kotlin.Array<kotlin.Float>,
    /* For the Drawbridge - An array with three values, number of times damaged, number of opportunities to damage, and percentage. */
    val cDrawbridge: kotlin.Array<kotlin.Float>,
    /* For the Rough Terrain - An array with three values, number of times damaged, number of opportunities to damage, and percentage. */
    val dRoughTerrain: kotlin.Array<kotlin.Float>,
    /* For the Rock Wall - An array with three values, number of times damaged, number of opportunities to damage, and percentage. */
    val dRockWall: kotlin.Array<kotlin.Float>,
    /* Average number of high goals scored. */
    val averageHighGoals: kotlin.Float,
    /* Average number of low goals scored. */
    val averageLowGoals: kotlin.Float,
    /* An array with three values, number of times breached, number of opportunities to breach, and percentage. */
    val breaches: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times scaled, number of opportunities to scale, and percentage. */
    val scales: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times challenged, number of opportunities to challenge, and percentage. */
    val challenges: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times captured, number of opportunities to capture, and percentage. */
    val captures: kotlin.Array<kotlin.Float>,
    /* Average winning score. */
    val averageWinScore: kotlin.Float,
    /* Average margin of victory. */
    val averageWinMargin: kotlin.Float,
    /* Average total score. */
    val averageScore: kotlin.Float,
    /* Average autonomous score. */
    val averageAutoScore: kotlin.Float,
    /* Average crossing score. */
    val averageCrossingScore: kotlin.Float,
    /* Average boulder score. */
    val averageBoulderScore: kotlin.Float,
    /* Average tower score. */
    val averageTowerScore: kotlin.Float,
    /* Average foul score. */
    val averageFoulScore: kotlin.Float,
    /* An array with three values, high score, match key from the match with the high score, and the name of the match. */
    val highScore: kotlin.Array<kotlin.String>
) {

}
