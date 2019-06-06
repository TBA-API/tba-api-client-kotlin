# EventApi

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDistrictEvents**](EventApi.md#getDistrictEvents) | **GET** /district/{district_key}/events | 
[**getDistrictEventsKeys**](EventApi.md#getDistrictEventsKeys) | **GET** /district/{district_key}/events/keys | 
[**getDistrictEventsSimple**](EventApi.md#getDistrictEventsSimple) | **GET** /district/{district_key}/events/simple | 
[**getEvent**](EventApi.md#getEvent) | **GET** /event/{event_key} | 
[**getEventAlliances**](EventApi.md#getEventAlliances) | **GET** /event/{event_key}/alliances | 
[**getEventAwards**](EventApi.md#getEventAwards) | **GET** /event/{event_key}/awards | 
[**getEventDistrictPoints**](EventApi.md#getEventDistrictPoints) | **GET** /event/{event_key}/district_points | 
[**getEventInsights**](EventApi.md#getEventInsights) | **GET** /event/{event_key}/insights | 
[**getEventMatchTimeseries**](EventApi.md#getEventMatchTimeseries) | **GET** /event/{event_key}/matches/timeseries | 
[**getEventMatches**](EventApi.md#getEventMatches) | **GET** /event/{event_key}/matches | 
[**getEventMatchesKeys**](EventApi.md#getEventMatchesKeys) | **GET** /event/{event_key}/matches/keys | 
[**getEventMatchesSimple**](EventApi.md#getEventMatchesSimple) | **GET** /event/{event_key}/matches/simple | 
[**getEventOPRs**](EventApi.md#getEventOPRs) | **GET** /event/{event_key}/oprs | 
[**getEventPredictions**](EventApi.md#getEventPredictions) | **GET** /event/{event_key}/predictions | 
[**getEventRankings**](EventApi.md#getEventRankings) | **GET** /event/{event_key}/rankings | 
[**getEventSimple**](EventApi.md#getEventSimple) | **GET** /event/{event_key}/simple | 
[**getEventTeams**](EventApi.md#getEventTeams) | **GET** /event/{event_key}/teams | 
[**getEventTeamsKeys**](EventApi.md#getEventTeamsKeys) | **GET** /event/{event_key}/teams/keys | 
[**getEventTeamsSimple**](EventApi.md#getEventTeamsSimple) | **GET** /event/{event_key}/teams/simple | 
[**getEventTeamsStatuses**](EventApi.md#getEventTeamsStatuses) | **GET** /event/{event_key}/teams/statuses | 
[**getEventsByYear**](EventApi.md#getEventsByYear) | **GET** /events/{year} | 
[**getEventsByYearKeys**](EventApi.md#getEventsByYearKeys) | **GET** /events/{year}/keys | 
[**getEventsByYearSimple**](EventApi.md#getEventsByYearSimple) | **GET** /events/{year}/simple | 
[**getTeamEventAwards**](EventApi.md#getTeamEventAwards) | **GET** /team/{team_key}/event/{event_key}/awards | 
[**getTeamEventMatches**](EventApi.md#getTeamEventMatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
[**getTeamEventMatchesKeys**](EventApi.md#getTeamEventMatchesKeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
[**getTeamEventMatchesSimple**](EventApi.md#getTeamEventMatchesSimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
[**getTeamEventStatus**](EventApi.md#getTeamEventStatus) | **GET** /team/{team_key}/event/{event_key}/status | 
[**getTeamEvents**](EventApi.md#getTeamEvents) | **GET** /team/{team_key}/events | 
[**getTeamEventsByYear**](EventApi.md#getTeamEventsByYear) | **GET** /team/{team_key}/events/{year} | 
[**getTeamEventsByYearKeys**](EventApi.md#getTeamEventsByYearKeys) | **GET** /team/{team_key}/events/{year}/keys | 
[**getTeamEventsByYearSimple**](EventApi.md#getTeamEventsByYearSimple) | **GET** /team/{team_key}/events/{year}/simple | 
[**getTeamEventsKeys**](EventApi.md#getTeamEventsKeys) | **GET** /team/{team_key}/events/keys | 
[**getTeamEventsSimple**](EventApi.md#getTeamEventsSimple) | **GET** /team/{team_key}/events/simple | 
[**getTeamEventsStatusesByYear**](EventApi.md#getTeamEventsStatusesByYear) | **GET** /team/{team_key}/events/{year}/statuses | 


<a name="getDistrictEvents"></a>
# **getDistrictEvents**
> kotlin.Array&lt;Event&gt; getDistrictEvents()



Gets a list of events in the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
try {
    val result : kotlin.Array<Event> = apiInstance.getDistrictEvents()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getDistrictEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getDistrictEvents")
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

<a name="getDistrictEventsKeys"></a>
# **getDistrictEventsKeys**
> kotlin.Array&lt;kotlin.String&gt; getDistrictEventsKeys()



Gets a list of event keys for events in the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getDistrictEventsKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getDistrictEventsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getDistrictEventsKeys")
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

<a name="getDistrictEventsSimple"></a>
# **getDistrictEventsSimple**
> kotlin.Array&lt;EventSimple&gt; getDistrictEventsSimple(districtKey)



Gets a short-form list of events in the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
try {
    val result : kotlin.Array<EventSimple> = apiInstance.getDistrictEventsSimple(districtKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getDistrictEventsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getDistrictEventsSimple")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **kotlin.String**| TBA District Key, eg &#x60;2016fim&#x60; |

### Return type

[**kotlin.Array&lt;EventSimple&gt;**](EventSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEvent"></a>
# **getEvent**
> Event getEvent()



Gets an Event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
try {
    val result : Event = apiInstance.getEvent()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEvent")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Event**](Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventAlliances"></a>
# **getEventAlliances**
> kotlin.Array&lt;EliminationAlliance&gt; getEventAlliances()



Gets a list of Elimination Alliances for the given Event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
try {
    val result : kotlin.Array<EliminationAlliance> = apiInstance.getEventAlliances()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventAlliances")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventAlliances")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;EliminationAlliance&gt;**](EliminationAlliance.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventAwards"></a>
# **getEventAwards**
> kotlin.Array&lt;Award&gt; getEventAwards()



Gets a list of awards from the given event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
try {
    val result : kotlin.Array<Award> = apiInstance.getEventAwards()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventAwards")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventAwards")
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

<a name="getEventDistrictPoints"></a>
# **getEventDistrictPoints**
> EventDistrictPoints getEventDistrictPoints()



Gets a list of team rankings for the Event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
try {
    val result : EventDistrictPoints = apiInstance.getEventDistrictPoints()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventDistrictPoints")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventDistrictPoints")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EventDistrictPoints**](EventDistrictPoints.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventInsights"></a>
# **getEventInsights**
> EventInsights getEventInsights()



Gets a set of Event-specific insights for the given Event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
try {
    val result : EventInsights = apiInstance.getEventInsights()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventInsights")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventInsights")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EventInsights**](EventInsights.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventMatchTimeseries"></a>
# **getEventMatchTimeseries**
> kotlin.Array&lt;kotlin.String&gt; getEventMatchTimeseries()



Gets an array of Match Keys for the given event key that have timeseries data. Returns an empty array if no matches have timeseries data. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This endpoint and corresponding data models are under *active development* and may change at any time, including in breaking ways.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getEventMatchTimeseries()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventMatchTimeseries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventMatchTimeseries")
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

<a name="getEventMatches"></a>
# **getEventMatches**
> kotlin.Array&lt;Match&gt; getEventMatches()



Gets a list of matches for the given event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
try {
    val result : kotlin.Array<Match> = apiInstance.getEventMatches()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventMatches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventMatches")
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

<a name="getEventMatchesKeys"></a>
# **getEventMatchesKeys**
> kotlin.Array&lt;kotlin.String&gt; getEventMatchesKeys()



Gets a list of match keys for the given event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getEventMatchesKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventMatchesKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventMatchesKeys")
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

<a name="getEventMatchesSimple"></a>
# **getEventMatchesSimple**
> kotlin.Array&lt;MatchSimple&gt; getEventMatchesSimple()



Gets a short-form list of matches for the given event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
try {
    val result : kotlin.Array<MatchSimple> = apiInstance.getEventMatchesSimple()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventMatchesSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventMatchesSimple")
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

<a name="getEventOPRs"></a>
# **getEventOPRs**
> EventOPRs getEventOPRs()



Gets a set of Event OPRs (including OPR, DPR, and CCWM) for the given Event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
try {
    val result : EventOPRs = apiInstance.getEventOPRs()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventOPRs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventOPRs")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EventOPRs**](EventOPRs.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventPredictions"></a>
# **getEventPredictions**
> kotlin.Any getEventPredictions()



Gets information on TBA-generated predictions for the given Event. Contains year-specific information. *WARNING* This endpoint is currently under development and may change at any time.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
try {
    val result : kotlin.Any = apiInstance.getEventPredictions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventPredictions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventPredictions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventRankings"></a>
# **getEventRankings**
> EventRanking getEventRankings()



Gets a list of team rankings for the Event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
try {
    val result : EventRanking = apiInstance.getEventRankings()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventRankings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventRankings")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EventRanking**](EventRanking.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventSimple"></a>
# **getEventSimple**
> EventSimple getEventSimple()



Gets a short-form Event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
try {
    val result : EventSimple = apiInstance.getEventSimple()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventSimple")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EventSimple**](EventSimple.md)

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

val apiInstance = EventApi()
try {
    val result : kotlin.Array<Team> = apiInstance.getEventTeams()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventTeams")
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

val apiInstance = EventApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getEventTeamsKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventTeamsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventTeamsKeys")
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

val apiInstance = EventApi()
try {
    val result : kotlin.Array<TeamSimple> = apiInstance.getEventTeamsSimple()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventTeamsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventTeamsSimple")
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

val apiInstance = EventApi()
try {
    val result : kotlin.collections.Map<kotlin.String, TeamEventStatus> = apiInstance.getEventTeamsStatuses()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventTeamsStatuses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventTeamsStatuses")
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

<a name="getEventsByYear"></a>
# **getEventsByYear**
> kotlin.Array&lt;Event&gt; getEventsByYear()



Gets a list of events in the given year.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
try {
    val result : kotlin.Array<Event> = apiInstance.getEventsByYear()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventsByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventsByYear")
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

<a name="getEventsByYearKeys"></a>
# **getEventsByYearKeys**
> kotlin.Array&lt;kotlin.String&gt; getEventsByYearKeys()



Gets a list of event keys in the given year.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getEventsByYearKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventsByYearKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventsByYearKeys")
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

<a name="getEventsByYearSimple"></a>
# **getEventsByYearSimple**
> kotlin.Array&lt;EventSimple&gt; getEventsByYearSimple()



Gets a short-form list of events in the given year.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
try {
    val result : kotlin.Array<EventSimple> = apiInstance.getEventsByYearSimple()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getEventsByYearSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getEventsByYearSimple")
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

<a name="getTeamEventAwards"></a>
# **getTeamEventAwards**
> kotlin.Array&lt;Award&gt; getTeamEventAwards()



Gets a list of awards the given team won at the given event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = EventApi()
try {
    val result : kotlin.Array<Award> = apiInstance.getTeamEventAwards()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventAwards")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventAwards")
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

val apiInstance = EventApi()
try {
    val result : kotlin.Array<Match> = apiInstance.getTeamEventMatches()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventMatches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventMatches")
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

val apiInstance = EventApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamEventMatchesKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventMatchesKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventMatchesKeys")
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

val apiInstance = EventApi()
try {
    val result : kotlin.Array<Match> = apiInstance.getTeamEventMatchesSimple()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventMatchesSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventMatchesSimple")
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

val apiInstance = EventApi()
try {
    val result : TeamEventStatus = apiInstance.getTeamEventStatus()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventStatus")
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

val apiInstance = EventApi()
try {
    val result : kotlin.Array<Event> = apiInstance.getTeamEvents()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEvents")
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

val apiInstance = EventApi()
try {
    val result : kotlin.Array<Event> = apiInstance.getTeamEventsByYear()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventsByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventsByYear")
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

val apiInstance = EventApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamEventsByYearKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventsByYearKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventsByYearKeys")
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

val apiInstance = EventApi()
try {
    val result : kotlin.Array<EventSimple> = apiInstance.getTeamEventsByYearSimple()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventsByYearSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventsByYearSimple")
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

val apiInstance = EventApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamEventsKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventsKeys")
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

val apiInstance = EventApi()
try {
    val result : kotlin.Array<EventSimple> = apiInstance.getTeamEventsSimple()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventsSimple")
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

val apiInstance = EventApi()
try {
    val result : kotlin.collections.Map<kotlin.String, TeamEventStatus> = apiInstance.getTeamEventsStatusesByYear()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventApi#getTeamEventsStatusesByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventApi#getTeamEventsStatusesByYear")
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

