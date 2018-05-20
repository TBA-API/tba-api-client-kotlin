
# Event_Ranking_rankings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dq** | **kotlin.Int** | Number of times disqualified. | 
**matches_played** | **kotlin.Int** | Number of matches played by this team. | 
**qual_average** | **kotlin.Int** | The average match score during qualifications. Year specific. May be null if not relevant for a given year. |  [optional]
**rank** | **kotlin.Int** | The team&#39;s rank at the event as provided by FIRST. | 
**record** | [**WLT_Record**](WLT_Record.md) |  | 
**extra_stats** | [**kotlin.Array&lt;java.math.BigDecimal&gt;**](java.math.BigDecimal.md) | Additional special data on the team&#39;s performance calculated by TBA. |  [optional]
**sort_orders** | [**kotlin.Array&lt;java.math.BigDecimal&gt;**](java.math.BigDecimal.md) | Additional year-specific information, may be null. See parent &#x60;sort_order_info&#x60; for details. |  [optional]
**team_key** | **kotlin.String** | The team with this rank. | 



