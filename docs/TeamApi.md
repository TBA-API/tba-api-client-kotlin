# TeamApi

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDistrictRankings**](TeamApi.md#getDistrictRankings) | **GET** /district/{district_key}/rankings | 
[**getDistrictTeams**](TeamApi.md#getDistrictTeams) | **GET** /district/{district_key}/teams | 
[**getDistrictTeamsKeys**](TeamApi.md#getDistrictTeamsKeys) | **GET** /district/{district_key}/teams/keys | 
[**getDistrictTeamsSimple**](TeamApi.md#getDistrictTeamsSimple) | **GET** /district/{district_key}/teams/simple | 
[**getEventTeams**](TeamApi.md#getEventTeams) | **GET** /event/{event_key}/teams | 
[**getEventTeamsKeys**](TeamApi.md#getEventTeamsKeys) | **GET** /event/{event_key}/teams/keys | 
[**getEventTeamsSimple**](TeamApi.md#getEventTeamsSimple) | **GET** /event/{event_key}/teams/simple | 
[**getEventTeamsStatuses**](TeamApi.md#getEventTeamsStatuses) | **GET** /event/{event_key}/teams/statuses | 
[**getTeam**](TeamApi.md#getTeam) | **GET** /team/{team_key} | 
[**getTeamAwards**](TeamApi.md#getTeamAwards) | **GET** /team/{team_key}/awards | 
[**getTeamAwardsByYear**](TeamApi.md#getTeamAwardsByYear) | **GET** /team/{team_key}/awards/{year} | 
[**getTeamDistricts**](TeamApi.md#getTeamDistricts) | **GET** /team/{team_key}/districts | 
[**getTeamEventAwards**](TeamApi.md#getTeamEventAwards) | **GET** /team/{team_key}/event/{event_key}/awards | 
[**getTeamEventMatches**](TeamApi.md#getTeamEventMatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
[**getTeamEventMatchesKeys**](TeamApi.md#getTeamEventMatchesKeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
[**getTeamEventMatchesSimple**](TeamApi.md#getTeamEventMatchesSimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
[**getTeamEventStatus**](TeamApi.md#getTeamEventStatus) | **GET** /team/{team_key}/event/{event_key}/status | 
[**getTeamEvents**](TeamApi.md#getTeamEvents) | **GET** /team/{team_key}/events | 
[**getTeamEventsByYear**](TeamApi.md#getTeamEventsByYear) | **GET** /team/{team_key}/events/{year} | 
[**getTeamEventsByYearKeys**](TeamApi.md#getTeamEventsByYearKeys) | **GET** /team/{team_key}/events/{year}/keys | 
[**getTeamEventsByYearSimple**](TeamApi.md#getTeamEventsByYearSimple) | **GET** /team/{team_key}/events/{year}/simple | 
[**getTeamEventsKeys**](TeamApi.md#getTeamEventsKeys) | **GET** /team/{team_key}/events/keys | 
[**getTeamEventsSimple**](TeamApi.md#getTeamEventsSimple) | **GET** /team/{team_key}/events/simple | 
[**getTeamEventsStatusesByYear**](TeamApi.md#getTeamEventsStatusesByYear) | **GET** /team/{team_key}/events/{year}/statuses | 
[**getTeamMatchesByYear**](TeamApi.md#getTeamMatchesByYear) | **GET** /team/{team_key}/matches/{year} | 
[**getTeamMatchesByYearKeys**](TeamApi.md#getTeamMatchesByYearKeys) | **GET** /team/{team_key}/matches/{year}/keys | 
[**getTeamMatchesByYearSimple**](TeamApi.md#getTeamMatchesByYearSimple) | **GET** /team/{team_key}/matches/{year}/simple | 
[**getTeamMediaByTag**](TeamApi.md#getTeamMediaByTag) | **GET** /team/{team_key}/media/tag/{media_tag} | 
[**getTeamMediaByTagYear**](TeamApi.md#getTeamMediaByTagYear) | **GET** /team/{team_key}/media/tag/{media_tag}/{year} | 
[**getTeamMediaByYear**](TeamApi.md#getTeamMediaByYear) | **GET** /team/{team_key}/media/{year} | 
[**getTeamRobots**](TeamApi.md#getTeamRobots) | **GET** /team/{team_key}/robots | 
[**getTeamSimple**](TeamApi.md#getTeamSimple) | **GET** /team/{team_key}/simple | 
[**getTeamSocialMedia**](TeamApi.md#getTeamSocialMedia) | **GET** /team/{team_key}/social_media | 
[**getTeamYearsParticipated**](TeamApi.md#getTeamYearsParticipated) | **GET** /team/{team_key}/years_participated | 
[**getTeams**](TeamApi.md#getTeams) | **GET** /teams/{page_num} | 
[**getTeamsByYear**](TeamApi.md#getTeamsByYear) | **GET** /teams/{year}/{page_num} | 
[**getTeamsByYearKeys**](TeamApi.md#getTeamsByYearKeys) | **GET** /teams/{year}/{page_num}/keys | 
[**getTeamsByYearSimple**](TeamApi.md#getTeamsByYearSimple) | **GET** /teams/{year}/{page_num}/simple | 
[**getTeamsKeys**](TeamApi.md#getTeamsKeys) | **GET** /teams/{page_num}/keys | 
[**getTeamsSimple**](TeamApi.md#getTeamsSimple) | **GET** /teams/{page_num}/simple | 


<a name="getDistrictRankings"></a>
# **getDistrictRankings**
> kotlin.Array&lt;DistrictRanking&gt; getDistrictRankings()



Gets a list of team district rankings for the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<DistrictRanking> = apiInstance.getDistrictRankings()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getDistrictRankings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getDistrictRankings")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;DistrictRanking&gt;**](DistrictRanking.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictTeams"></a>
# **getDistrictTeams**
> kotlin.Array&lt;Team&gt; getDistrictTeams()



Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<Team> = apiInstance.getDistrictTeams()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getDistrictTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getDistrictTeams")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Team&gt;**](Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictTeamsKeys"></a>
# **getDistrictTeamsKeys**
> kotlin.Array&lt;kotlin.String&gt; getDistrictTeamsKeys()



Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getDistrictTeamsKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getDistrictTeamsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getDistrictTeamsKeys")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictTeamsSimple"></a>
# **getDistrictTeamsSimple**
> kotlin.Array&lt;TeamSimple&gt; getDistrictTeamsSimple()



Gets a short-form list of &#x60;Team&#x60; objects that competed in events in the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<TeamSimple> = apiInstance.getDistrictTeamsSimple()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getDistrictTeamsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getDistrictTeamsSimple")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;TeamSimple&gt;**](TeamSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventTeams"></a>
# **getEventTeams**
> kotlin.Array&lt;Team&gt; getEventTeams()



Gets a list of &#x60;Team&#x60; objects that competed in the given event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<Team> = apiInstance.getEventTeams()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getEventTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getEventTeams")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Team&gt;**](Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventTeamsKeys"></a>
# **getEventTeamsKeys**
> kotlin.Array&lt;kotlin.String&gt; getEventTeamsKeys()



Gets a list of &#x60;Team&#x60; keys that competed in the given event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getEventTeamsKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getEventTeamsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getEventTeamsKeys")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventTeamsSimple"></a>
# **getEventTeamsSimple**
> kotlin.Array&lt;TeamSimple&gt; getEventTeamsSimple()



Gets a short-form list of &#x60;Team&#x60; objects that competed in the given event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<TeamSimple> = apiInstance.getEventTeamsSimple()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getEventTeamsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getEventTeamsSimple")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;TeamSimple&gt;**](TeamSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventTeamsStatuses"></a>
# **getEventTeamsStatuses**
> kotlin.collections.Map&lt;kotlin.String, TeamEventStatus&gt; getEventTeamsStatuses()



Gets a key-value list of the event statuses for teams competing at the given event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.collections.Map<kotlin.String, TeamEventStatus> = apiInstance.getEventTeamsStatuses()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getEventTeamsStatuses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getEventTeamsStatuses")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.Map&lt;kotlin.String, TeamEventStatus&gt;**](TeamEventStatus.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeam"></a>
# **getTeam**
> Team getTeam()



Gets a &#x60;Team&#x60; object for the team referenced by the given key.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : Team = apiInstance.getTeam()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeam")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Team**](Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamAwards"></a>
# **getTeamAwards**
> kotlin.Array&lt;Award&gt; getTeamAwards()



Gets a list of awards the given team has won.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<Award> = apiInstance.getTeamAwards()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamAwards")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamAwards")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Award&gt;**](Award.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamAwardsByYear"></a>
# **getTeamAwardsByYear**
> kotlin.Array&lt;Award&gt; getTeamAwardsByYear()



Gets a list of awards the given team has won in a given year.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<Award> = apiInstance.getTeamAwardsByYear()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamAwardsByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamAwardsByYear")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Award&gt;**](Award.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamDistricts"></a>
# **getTeamDistricts**
> kotlin.Array&lt;DistrictList&gt; getTeamDistricts()



Gets an array of districts representing each year the team was in a district. Will return an empty array if the team was never in a district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<DistrictList> = apiInstance.getTeamDistricts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamDistricts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamDistricts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;DistrictList&gt;**](DistrictList.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventAwards"></a>
# **getTeamEventAwards**
> kotlin.Array&lt;Award&gt; getTeamEventAwards()



Gets a list of awards the given team won at the given event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<Award> = apiInstance.getTeamEventAwards()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventAwards")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventAwards")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Award&gt;**](Award.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventMatches"></a>
# **getTeamEventMatches**
> kotlin.Array&lt;Match&gt; getTeamEventMatches()



Gets a list of matches for the given team and event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<Match> = apiInstance.getTeamEventMatches()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventMatches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventMatches")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Match&gt;**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventMatchesKeys"></a>
# **getTeamEventMatchesKeys**
> kotlin.Array&lt;kotlin.String&gt; getTeamEventMatchesKeys()



Gets a list of match keys for matches for the given team and event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamEventMatchesKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventMatchesKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventMatchesKeys")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventMatchesSimple"></a>
# **getTeamEventMatchesSimple**
> kotlin.Array&lt;Match&gt; getTeamEventMatchesSimple()



Gets a short-form list of matches for the given team and event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<Match> = apiInstance.getTeamEventMatchesSimple()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventMatchesSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventMatchesSimple")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Match&gt;**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventStatus"></a>
# **getTeamEventStatus**
> TeamEventStatus getTeamEventStatus()



Gets the competition rank and status of the team at the given event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : TeamEventStatus = apiInstance.getTeamEventStatus()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventStatus")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TeamEventStatus**](TeamEventStatus.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEvents"></a>
# **getTeamEvents**
> kotlin.Array&lt;Event&gt; getTeamEvents()



Gets a list of all events this team has competed at.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<Event> = apiInstance.getTeamEvents()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEvents")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Event&gt;**](Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventsByYear"></a>
# **getTeamEventsByYear**
> kotlin.Array&lt;Event&gt; getTeamEventsByYear()



Gets a list of events this team has competed at in the given year.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<Event> = apiInstance.getTeamEventsByYear()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventsByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventsByYear")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Event&gt;**](Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventsByYearKeys"></a>
# **getTeamEventsByYearKeys**
> kotlin.Array&lt;kotlin.String&gt; getTeamEventsByYearKeys()



Gets a list of the event keys for events this team has competed at in the given year.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamEventsByYearKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventsByYearKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventsByYearKeys")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventsByYearSimple"></a>
# **getTeamEventsByYearSimple**
> kotlin.Array&lt;EventSimple&gt; getTeamEventsByYearSimple()



Gets a short-form list of events this team has competed at in the given year.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<EventSimple> = apiInstance.getTeamEventsByYearSimple()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventsByYearSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventsByYearSimple")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;EventSimple&gt;**](EventSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventsKeys"></a>
# **getTeamEventsKeys**
> kotlin.Array&lt;kotlin.String&gt; getTeamEventsKeys()



Gets a list of the event keys for all events this team has competed at.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamEventsKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventsKeys")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventsSimple"></a>
# **getTeamEventsSimple**
> kotlin.Array&lt;EventSimple&gt; getTeamEventsSimple()



Gets a short-form list of all events this team has competed at.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<EventSimple> = apiInstance.getTeamEventsSimple()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventsSimple")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;EventSimple&gt;**](EventSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventsStatusesByYear"></a>
# **getTeamEventsStatusesByYear**
> kotlin.collections.Map&lt;kotlin.String, TeamEventStatus&gt; getTeamEventsStatusesByYear()



Gets a key-value list of the event statuses for events this team has competed at in the given year.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.collections.Map<kotlin.String, TeamEventStatus> = apiInstance.getTeamEventsStatusesByYear()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamEventsStatusesByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamEventsStatusesByYear")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.Map&lt;kotlin.String, TeamEventStatus&gt;**](TeamEventStatus.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamMatchesByYear"></a>
# **getTeamMatchesByYear**
> kotlin.Array&lt;Match&gt; getTeamMatchesByYear()



Gets a list of matches for the given team and year.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<Match> = apiInstance.getTeamMatchesByYear()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamMatchesByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamMatchesByYear")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Match&gt;**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamMatchesByYearKeys"></a>
# **getTeamMatchesByYearKeys**
> kotlin.Array&lt;kotlin.String&gt; getTeamMatchesByYearKeys()



Gets a list of match keys for matches for the given team and year.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamMatchesByYearKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamMatchesByYearKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamMatchesByYearKeys")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamMatchesByYearSimple"></a>
# **getTeamMatchesByYearSimple**
> kotlin.Array&lt;MatchSimple&gt; getTeamMatchesByYearSimple()



Gets a short-form list of matches for the given team and year.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<MatchSimple> = apiInstance.getTeamMatchesByYearSimple()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamMatchesByYearSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamMatchesByYearSimple")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;MatchSimple&gt;**](MatchSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamMediaByTag"></a>
# **getTeamMediaByTag**
> kotlin.Array&lt;Media&gt; getTeamMediaByTag()



Gets a list of Media (videos / pictures) for the given team and tag.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<Media> = apiInstance.getTeamMediaByTag()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamMediaByTag")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamMediaByTag")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Media&gt;**](Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamMediaByTagYear"></a>
# **getTeamMediaByTagYear**
> kotlin.Array&lt;Media&gt; getTeamMediaByTagYear()



Gets a list of Media (videos / pictures) for the given team, tag and year.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<Media> = apiInstance.getTeamMediaByTagYear()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamMediaByTagYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamMediaByTagYear")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Media&gt;**](Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamMediaByYear"></a>
# **getTeamMediaByYear**
> kotlin.Array&lt;Media&gt; getTeamMediaByYear()



Gets a list of Media (videos / pictures) for the given team and year.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<Media> = apiInstance.getTeamMediaByYear()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamMediaByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamMediaByYear")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Media&gt;**](Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamRobots"></a>
# **getTeamRobots**
> kotlin.Array&lt;TeamRobot&gt; getTeamRobots()



Gets a list of year and robot name pairs for each year that a robot name was provided. Will return an empty array if the team has never named a robot.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<TeamRobot> = apiInstance.getTeamRobots()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamRobots")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamRobots")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;TeamRobot&gt;**](TeamRobot.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamSimple"></a>
# **getTeamSimple**
> TeamSimple getTeamSimple()



Gets a &#x60;Team_Simple&#x60; object for the team referenced by the given key.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : TeamSimple = apiInstance.getTeamSimple()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamSimple")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TeamSimple**](TeamSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamSocialMedia"></a>
# **getTeamSocialMedia**
> kotlin.Array&lt;Media&gt; getTeamSocialMedia()



Gets a list of Media (social media) for the given team.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<Media> = apiInstance.getTeamSocialMedia()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamSocialMedia")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamSocialMedia")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Media&gt;**](Media.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamYearsParticipated"></a>
# **getTeamYearsParticipated**
> kotlin.Array&lt;kotlin.Int&gt; getTeamYearsParticipated()



Gets a list of years in which the team participated in at least one competition.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getTeamYearsParticipated()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamYearsParticipated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamYearsParticipated")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Array&lt;kotlin.Int&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeams"></a>
# **getTeams**
> kotlin.Array&lt;Team&gt; getTeams()



Gets a list of &#x60;Team&#x60; objects, paginated in groups of 500.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<Team> = apiInstance.getTeams()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeams")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Team&gt;**](Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamsByYear"></a>
# **getTeamsByYear**
> kotlin.Array&lt;Team&gt; getTeamsByYear()



Gets a list of &#x60;Team&#x60; objects that competed in the given year, paginated in groups of 500.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<Team> = apiInstance.getTeamsByYear()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamsByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamsByYear")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Team&gt;**](Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamsByYearKeys"></a>
# **getTeamsByYearKeys**
> kotlin.Array&lt;kotlin.String&gt; getTeamsByYearKeys()



Gets a list Team Keys that competed in the given year, paginated in groups of 500.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamsByYearKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamsByYearKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamsByYearKeys")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamsByYearSimple"></a>
# **getTeamsByYearSimple**
> kotlin.Array&lt;TeamSimple&gt; getTeamsByYearSimple()



Gets a list of short form &#x60;Team_Simple&#x60; objects that competed in the given year, paginated in groups of 500.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<TeamSimple> = apiInstance.getTeamsByYearSimple()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamsByYearSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamsByYearSimple")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;TeamSimple&gt;**](TeamSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamsKeys"></a>
# **getTeamsKeys**
> kotlin.Array&lt;kotlin.String&gt; getTeamsKeys()



Gets a list of Team keys, paginated in groups of 500. (Note, each page will not have 500 teams, but will include the teams within that range of 500.)

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamsKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamsKeys")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamsSimple"></a>
# **getTeamsSimple**
> kotlin.Array&lt;TeamSimple&gt; getTeamsSimple()



Gets a list of short form &#x60;Team_Simple&#x60; objects, paginated in groups of 500.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.Array<TeamSimple> = apiInstance.getTeamsSimple()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeamsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeamsSimple")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;TeamSimple&gt;**](TeamSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

