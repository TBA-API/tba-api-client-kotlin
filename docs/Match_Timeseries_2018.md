
# Match_Timeseries_2018

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_key** | **kotlin.String** | TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event. |  [optional]
**match_id** | **kotlin.String** | Match ID consisting of the level, match number, and set number, eg &#x60;qm45&#x60; or &#x60;f1m1&#x60;. |  [optional]
**mode** | **kotlin.String** | Current mode of play, can be &#x60;pre_match&#x60;, &#x60;auto&#x60;, &#x60;telop&#x60;, or &#x60;post_match&#x60;. |  [optional]
**play** | **kotlin.Int** |  |  [optional]
**time_remaining** | **kotlin.Int** | Amount of time remaining in the match, only valid during &#x60;auto&#x60; and &#x60;teleop&#x60; modes. |  [optional]
**blue_auto_quest** | **kotlin.Int** | 1 if the blue alliance is credited with the AUTO QUEST, 0 if not. |  [optional]
**blue_boost_count** | **kotlin.Int** | Number of POWER CUBES in the BOOST section of the blue alliance VAULT. |  [optional]
**blue_boost_played** | **kotlin.Int** | Returns 1 if the blue alliance BOOST was played, or 0 if not played. |  [optional]
**blue_current_powerup** | **kotlin.String** | Name of the current blue alliance POWER UP being played, or &#x60;null&#x60;. |  [optional]
**blue_face_the_boss** | **kotlin.Int** | 1 if the blue alliance is credited with FACING THE BOSS, 0 if not. |  [optional]
**blue_force_count** | **kotlin.Int** | Number of POWER CUBES in the FORCE section of the blue alliance VAULT. |  [optional]
**blue_force_played** | **kotlin.Int** | Returns 1 if the blue alliance FORCE was played, or 0 if not played. |  [optional]
**blue_levitate_count** | **kotlin.Int** | Number of POWER CUBES in the LEVITATE section of the blue alliance VAULT. |  [optional]
**blue_levitate_played** | **kotlin.Int** | Returns 1 if the blue alliance LEVITATE was played, or 0 if not played. |  [optional]
**blue_powerup_time_remaining** | **kotlin.String** | Number of seconds remaining in the blue alliance POWER UP time, or 0 if none is active. |  [optional]
**blue_scale_owned** | **kotlin.Int** | 1 if the blue alliance owns the SCALE, 0 if not. |  [optional]
**blue_score** | **kotlin.Int** | Current score for the blue alliance. |  [optional]
**blue_switch_owned** | **kotlin.Int** | 1 if the blue alliance owns their SWITCH, 0 if not. |  [optional]
**red_auto_quest** | **kotlin.Int** | 1 if the red alliance is credited with the AUTO QUEST, 0 if not. |  [optional]
**red_boost_count** | **kotlin.Int** | Number of POWER CUBES in the BOOST section of the red alliance VAULT. |  [optional]
**red_boost_played** | **kotlin.Int** | Returns 1 if the red alliance BOOST was played, or 0 if not played. |  [optional]
**red_current_powerup** | **kotlin.String** | Name of the current red alliance POWER UP being played, or &#x60;null&#x60;. |  [optional]
**red_face_the_boss** | **kotlin.Int** | 1 if the red alliance is credited with FACING THE BOSS, 0 if not. |  [optional]
**red_force_count** | **kotlin.Int** | Number of POWER CUBES in the FORCE section of the red alliance VAULT. |  [optional]
**red_force_played** | **kotlin.Int** | Returns 1 if the red alliance FORCE was played, or 0 if not played. |  [optional]
**red_levitate_count** | **kotlin.Int** | Number of POWER CUBES in the LEVITATE section of the red alliance VAULT. |  [optional]
**red_levitate_played** | **kotlin.Int** | Returns 1 if the red alliance LEVITATE was played, or 0 if not played. |  [optional]
**red_powerup_time_remaining** | **kotlin.String** | Number of seconds remaining in the red alliance POWER UP time, or 0 if none is active. |  [optional]
**red_scale_owned** | **kotlin.Int** | 1 if the red alliance owns the SCALE, 0 if not. |  [optional]
**red_score** | **kotlin.Int** | Current score for the red alliance. |  [optional]
**red_switch_owned** | **kotlin.Int** | 1 if the red alliance owns their SWITCH, 0 if not. |  [optional]



