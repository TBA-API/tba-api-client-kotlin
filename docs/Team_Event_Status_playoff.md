
# Team_Event_Status_playoff

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**level** | [**inline**](#LevelEnum) | The highest playoff level the team reached. |  [optional]
**current_level_record** | [**WLT_Record**](WLT_Record.md) |  |  [optional]
**record** | [**WLT_Record**](WLT_Record.md) |  |  [optional]
**status** | [**inline**](#StatusEnum) | Current competition status for the playoffs. |  [optional]
**playoff_average** | **kotlin.Int** | The average match score during playoffs. Year specific. May be null if not relevant for a given year. |  [optional]


<a name="LevelEnum"></a>
## Enum: level
Name | Value
---- | -----
level | qm, ef, qf, sf, f


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | won, eliminated, playing



