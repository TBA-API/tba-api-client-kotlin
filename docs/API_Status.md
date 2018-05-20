
# API_Status

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**current_season** | **kotlin.Int** | Year of the current FRC season. | 
**max_season** | **kotlin.Int** | Maximum FRC season year for valid queries. | 
**is_datafeed_down** | **kotlin.Boolean** | True if the entire FMS API provided by FIRST is down. | 
**down_events** | **kotlin.Array&lt;kotlin.String&gt;** | An array of strings containing event keys of any active events that are no longer updating. | 
**ios** | [**API_Status_App_Version**](API_Status_App_Version.md) |  | 
**android** | [**API_Status_App_Version**](API_Status_App_Version.md) |  | 



