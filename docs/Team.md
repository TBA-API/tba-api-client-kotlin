
# Team

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | TBA team key with the format &#x60;frcXXXX&#x60; with &#x60;XXXX&#x60; representing the team number. | 
**team_number** | **kotlin.Int** | Official team number issued by FIRST. | 
**nickname** | **kotlin.String** | Team nickname provided by FIRST. |  [optional]
**name** | **kotlin.String** | Official long name registered with FIRST. | 
**city** | **kotlin.String** | City of team derived from parsing the address registered with FIRST. |  [optional]
**state_prov** | **kotlin.String** | State of team derived from parsing the address registered with FIRST. |  [optional]
**country** | **kotlin.String** | Country of team derived from parsing the address registered with FIRST. |  [optional]
**address** | **kotlin.String** | Will be NULL, for future development. |  [optional]
**postal_code** | **kotlin.String** | Postal code from the team address. |  [optional]
**gmaps_place_id** | **kotlin.String** | Will be NULL, for future development. |  [optional]
**gmaps_url** | **kotlin.String** | Will be NULL, for future development. |  [optional]
**lat** | **kotlin.Double** | Will be NULL, for future development. |  [optional]
**lng** | **kotlin.Double** | Will be NULL, for future development. |  [optional]
**location_name** | **kotlin.String** | Will be NULL, for future development. |  [optional]
**website** | **kotlin.String** | Official website associated with the team. |  [optional]
**rookie_year** | **kotlin.Int** | First year the team officially competed. | 
**motto** | **kotlin.String** | Team&#39;s motto as provided by FIRST. |  [optional]
**home_championship** | [**kotlin.Any**](kotlin.Any.md) | Location of the team&#39;s home championship each year as a key-value pair. The year (as a string) is the key, and the city is the value. |  [optional]



