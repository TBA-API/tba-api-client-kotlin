
# Match_Simple

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | TBA match key with the format &#x60;yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER]&#x60;, where &#x60;yyyy&#x60; is the year, and &#x60;EVENT_CODE&#x60; is the event code of the event, &#x60;COMP_LEVEL&#x60; is (qm, ef, qf, sf, f), and &#x60;MATCH_NUMBER&#x60; is the match number in the competition level. A set number may append the competition level if more than one match in required per set. | 
**comp_level** | [**inline**](#Comp_levelEnum) | The competition level the match was played at. | 
**set_number** | **kotlin.Int** | The set number in a series of matches where more than one match is required in the match series. | 
**match_number** | **kotlin.Int** | The match number of the match in the competition level. | 
**alliances** | [**Match_Simple_alliances**](Match_Simple_alliances.md) |  |  [optional]
**winning_alliance** | [**inline**](#Winning_allianceEnum) | The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie. |  [optional]
**event_key** | **kotlin.String** | Event key of the event the match was played at. | 
**time** | **kotlin.Long** | UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the scheduled match time, as taken from the published schedule. |  [optional]
**predicted_time** | **kotlin.Long** | UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the TBA predicted match start time. |  [optional]
**actual_time** | **kotlin.Long** | UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of actual match start time. |  [optional]


<a name="Comp_levelEnum"></a>
## Enum: comp_level
Name | Value
---- | -----
comp_level | qm, ef, qf, sf, f


<a name="Winning_allianceEnum"></a>
## Enum: winning_alliance
Name | Value
---- | -----
winning_alliance | red, blue



