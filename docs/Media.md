
# Media

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | TBA identifier for this media. | 
**type** | [**inline**](#TypeEnum) | String type of the media element. | 
**foreign_key** | **kotlin.String** | The key used to identify this media on the media site. |  [optional]
**details** | [**kotlin.Any**](kotlin.Any.md) | If required, a JSON dict of additional media information. |  [optional]
**preferred** | **kotlin.Boolean** | True if the media is of high quality. |  [optional]
**direct_url** | **kotlin.String** | Direct URL to the media. |  [optional]
**view_url** | **kotlin.String** | The URL that leads to the full web page for the media, if one exists. |  [optional]


<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | youtube, cdphotothread, imgur, facebook-profile, youtube-channel, twitter-profile, github-profile, instagram-profile, periscope-profile, grabcad, instagram-image, external-link, avatar



