
# Event_Simple

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



