/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* The version of the OpenAPI document: 3.5
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package net.thefletcher.tbaapi.v3client.models


import com.squareup.moshi.Json
/**
 * The `Media` object contains a reference for most any media associated with a team or event on TBA.
 * @param key TBA identifier for this media.
 * @param type String type of the media element.
 * @param foreignKey The key used to identify this media on the media site.
 * @param details If required, a JSON dict of additional media information.
 * @param preferred True if the media is of high quality.
 * @param directUrl Direct URL to the media.
 * @param viewUrl The URL that leads to the full web page for the media, if one exists.
 */

data class Media (
    /* TBA identifier for this media. */
    @Json(name = "key")
    val key: kotlin.String,
    /* String type of the media element. */
    @Json(name = "type")
    val type: Media.Type,
    /* The key used to identify this media on the media site. */
    @Json(name = "foreign_key")
    val foreignKey: kotlin.String? = null,
    /* If required, a JSON dict of additional media information. */
    @Json(name = "details")
    val details: kotlin.Any? = null,
    /* True if the media is of high quality. */
    @Json(name = "preferred")
    val preferred: kotlin.Boolean? = null,
    /* Direct URL to the media. */
    @Json(name = "direct_url")
    val directUrl: kotlin.String? = null,
    /* The URL that leads to the full web page for the media, if one exists. */
    @Json(name = "view_url")
    val viewUrl: kotlin.String? = null
) 


{

    /**
    * String type of the media element.
    * Values: youtube,cdphotothread,imgur,facebookMinusProfile,youtubeMinusChannel,twitterMinusProfile,githubMinusProfile,instagramMinusProfile,periscopeMinusProfile,grabcad,instagramMinusImage,externalMinusLink,avatar
    */
    
    enum class Type(val value: kotlin.String){
    
        @Json(name = "youtube") youtube("youtube"),
    
        @Json(name = "cdphotothread") cdphotothread("cdphotothread"),
    
        @Json(name = "imgur") imgur("imgur"),
    
        @Json(name = "facebook-profile") facebookMinusProfile("facebook-profile"),
    
        @Json(name = "youtube-channel") youtubeMinusChannel("youtube-channel"),
    
        @Json(name = "twitter-profile") twitterMinusProfile("twitter-profile"),
    
        @Json(name = "github-profile") githubMinusProfile("github-profile"),
    
        @Json(name = "instagram-profile") instagramMinusProfile("instagram-profile"),
    
        @Json(name = "periscope-profile") periscopeMinusProfile("periscope-profile"),
    
        @Json(name = "grabcad") grabcad("grabcad"),
    
        @Json(name = "instagram-image") instagramMinusImage("instagram-image"),
    
        @Json(name = "external-link") externalMinusLink("external-link"),
    
        @Json(name = "avatar") avatar("avatar");
    

    }

}

