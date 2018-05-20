
# Event

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event. | 
**name** | **kotlin.String** | Official name of event on record either provided by FIRST or organizers of offseason event. | 
**event_code** | **kotlin.String** | Event short code, as provided by FIRST. | 
**event_type** | **kotlin.Int** | Event Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/event_type.py#L2 | 
**district** | [**District_List**](District_List.md) | The district this event is in, may be null. |  [optional]
**city** | **kotlin.String** | City, town, village, etc. the event is located in. |  [optional]
**state_prov** | **kotlin.String** | State or Province the event is located in. |  [optional]
**country** | **kotlin.String** | Country the event is located in. |  [optional]
**start_date** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Event start date in &#x60;yyyy-mm-dd&#x60; format. | 
**end_date** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Event end date in &#x60;yyyy-mm-dd&#x60; format. | 
**year** | **kotlin.Int** | Year the event data is for. | 
**short_name** | **kotlin.String** | Same as &#x60;name&#x60; but doesn&#39;t include event specifiers, such as &#39;Regional&#39; or &#39;District&#39;. May be null. |  [optional]
**event_type_string** | **kotlin.String** | Event Type, eg Regional, District, or Offseason. | 
**week** | **kotlin.Int** | Week of the event relative to the first official season event, zero-indexed. Only valid for Regionals, Districts, and District Championships. Null otherwise. (Eg. A season with a week 0 &#39;preseason&#39; event does not count, and week 1 events will show 0 here. Seasons with a week 0.5 regional event will show week 0 for those event(s) and week 1 for week 1 events and so on.) |  [optional]
**address** | **kotlin.String** | Address of the event&#39;s venue, if available. |  [optional]
**postal_code** | **kotlin.String** | Postal code from the event address. |  [optional]
**gmaps_place_id** | **kotlin.String** | Google Maps Place ID for the event address. |  [optional]
**gmaps_url** | **kotlin.String** | Link to address location on Google Maps. |  [optional]
**lat** | **kotlin.Double** | Latitude for the event address. |  [optional]
**lng** | **kotlin.Double** | Longitude for the event address. |  [optional]
**location_name** | **kotlin.String** | Name of the location at the address for the event, eg. Blue Alliance High School. |  [optional]
**timezone** | **kotlin.String** | Timezone name. |  [optional]
**website** | **kotlin.String** | The event&#39;s website, if any. |  [optional]
**first_event_id** | **kotlin.String** | The FIRST internal Event ID, used to link to the event on the FRC webpage. |  [optional]
**first_event_code** | **kotlin.String** | Public facing event code used by FIRST (on frc-events.firstinspires.org, for example) |  [optional]
**webcasts** | [**kotlin.Array&lt;Webcast&gt;**](Webcast.md) |  |  [optional]
**division_keys** | **kotlin.Array&lt;kotlin.String&gt;** | An array of event keys for the divisions at this event. |  [optional]
**parent_event_key** | **kotlin.String** | The TBA Event key that represents the event&#39;s parent. Used to link back to the event from a division event. It is also the inverse relation of &#x60;divison_keys&#x60;. |  [optional]
**playoff_type** | **kotlin.Int** | Playoff Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/playoff_type.py#L4, or null. |  [optional]
**playoff_type_string** | **kotlin.String** | String representation of the &#x60;playoff_type&#x60;, or null. |  [optional]



