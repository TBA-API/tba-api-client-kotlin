
# Award

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the award as provided by FIRST. May vary for the same award type. | 
**award_type** | **kotlin.Int** | Type of award given. See https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/award_type.py#L6 | 
**event_key** | **kotlin.String** | The event_key of the event the award was won at. | 
**recipient_list** | [**kotlin.Array&lt;Award_Recipient&gt;**](Award_Recipient.md) | A list of recipients of the award at the event. Either team_key and/or awardee for individual awards. | 
**year** | **kotlin.Int** | The year this award was won. | 



