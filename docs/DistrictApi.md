# DistrictApi

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDistrictEvents**](DistrictApi.md#getDistrictEvents) | **GET** /district/{district_key}/events | 
[**getDistrictEventsKeys**](DistrictApi.md#getDistrictEventsKeys) | **GET** /district/{district_key}/events/keys | 
[**getDistrictEventsSimple**](DistrictApi.md#getDistrictEventsSimple) | **GET** /district/{district_key}/events/simple | 
[**getDistrictRankings**](DistrictApi.md#getDistrictRankings) | **GET** /district/{district_key}/rankings | 
[**getDistrictTeams**](DistrictApi.md#getDistrictTeams) | **GET** /district/{district_key}/teams | 
[**getDistrictTeamsKeys**](DistrictApi.md#getDistrictTeamsKeys) | **GET** /district/{district_key}/teams/keys | 
[**getDistrictTeamsSimple**](DistrictApi.md#getDistrictTeamsSimple) | **GET** /district/{district_key}/teams/simple | 
[**getDistrictsByYear**](DistrictApi.md#getDistrictsByYear) | **GET** /districts/{year} | 
[**getEventDistrictPoints**](DistrictApi.md#getEventDistrictPoints) | **GET** /event/{event_key}/district_points | 
[**getTeamDistricts**](DistrictApi.md#getTeamDistricts) | **GET** /team/{team_key}/districts | 


<a name="getDistrictEvents"></a>
# **getDistrictEvents**
> kotlin.Array&lt;Event&gt; getDistrictEvents(districtKey, ifMinusModifiedMinusSince)



Gets a list of events in the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Event> = apiInstance.getDistrictEvents(districtKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DistrictApi#getDistrictEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistrictApi#getDistrictEvents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **kotlin.String**| TBA District Key, eg &#x60;2016fim&#x60; |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;Event&gt;**](Event.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictEventsKeys"></a>
# **getDistrictEventsKeys**
> kotlin.Array&lt;kotlin.String&gt; getDistrictEventsKeys(districtKey, ifMinusModifiedMinusSince)



Gets a list of event keys for events in the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getDistrictEventsKeys(districtKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DistrictApi#getDistrictEventsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistrictApi#getDistrictEventsKeys")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **kotlin.String**| TBA District Key, eg &#x60;2016fim&#x60; |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictEventsSimple"></a>
# **getDistrictEventsSimple**
> kotlin.Array&lt;EventSimple&gt; getDistrictEventsSimple(districtKey, ifMinusModifiedMinusSince)



Gets a short-form list of events in the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<EventSimple> = apiInstance.getDistrictEventsSimple(districtKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DistrictApi#getDistrictEventsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistrictApi#getDistrictEventsSimple")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **kotlin.String**| TBA District Key, eg &#x60;2016fim&#x60; |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;EventSimple&gt;**](EventSimple.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictRankings"></a>
# **getDistrictRankings**
> kotlin.Array&lt;DistrictRanking&gt; getDistrictRankings(districtKey, ifMinusModifiedMinusSince)



Gets a list of team district rankings for the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<DistrictRanking> = apiInstance.getDistrictRankings(districtKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DistrictApi#getDistrictRankings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistrictApi#getDistrictRankings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **kotlin.String**| TBA District Key, eg &#x60;2016fim&#x60; |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;DistrictRanking&gt;**](DistrictRanking.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictTeams"></a>
# **getDistrictTeams**
> kotlin.Array&lt;Team&gt; getDistrictTeams(districtKey, ifMinusModifiedMinusSince)



Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Team> = apiInstance.getDistrictTeams(districtKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DistrictApi#getDistrictTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistrictApi#getDistrictTeams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **kotlin.String**| TBA District Key, eg &#x60;2016fim&#x60; |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;Team&gt;**](Team.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictTeamsKeys"></a>
# **getDistrictTeamsKeys**
> kotlin.Array&lt;kotlin.String&gt; getDistrictTeamsKeys(districtKey, ifMinusModifiedMinusSince)



Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getDistrictTeamsKeys(districtKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DistrictApi#getDistrictTeamsKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistrictApi#getDistrictTeamsKeys")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **kotlin.String**| TBA District Key, eg &#x60;2016fim&#x60; |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictTeamsSimple"></a>
# **getDistrictTeamsSimple**
> kotlin.Array&lt;TeamSimple&gt; getDistrictTeamsSimple(districtKey, ifMinusModifiedMinusSince)



Gets a short-form list of &#x60;Team&#x60; objects that competed in events in the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<TeamSimple> = apiInstance.getDistrictTeamsSimple(districtKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DistrictApi#getDistrictTeamsSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistrictApi#getDistrictTeamsSimple")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **districtKey** | **kotlin.String**| TBA District Key, eg &#x60;2016fim&#x60; |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;TeamSimple&gt;**](TeamSimple.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictsByYear"></a>
# **getDistrictsByYear**
> kotlin.Array&lt;DistrictList&gt; getDistrictsByYear(year, ifMinusModifiedMinusSince)



Gets a list of districts and their corresponding district key, for the given year.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<DistrictList> = apiInstance.getDistrictsByYear(year, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DistrictApi#getDistrictsByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistrictApi#getDistrictsByYear")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **kotlin.Int**| Competition Year (or Season). Must be 4 digits. |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;DistrictList&gt;**](DistrictList.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventDistrictPoints"></a>
# **getEventDistrictPoints**
> EventDistrictPoints getEventDistrictPoints(eventKey, ifMinusModifiedMinusSince)



Gets a list of team rankings for the Event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : EventDistrictPoints = apiInstance.getEventDistrictPoints(eventKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DistrictApi#getEventDistrictPoints")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistrictApi#getEventDistrictPoints")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**EventDistrictPoints**](EventDistrictPoints.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamDistricts"></a>
# **getTeamDistricts**
> kotlin.Array&lt;DistrictList&gt; getTeamDistricts(teamKey, ifMinusModifiedMinusSince)



Gets an array of districts representing each year the team was in a district. Will return an empty array if the team was never in a district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<DistrictList> = apiInstance.getTeamDistricts(teamKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DistrictApi#getTeamDistricts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistrictApi#getTeamDistricts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **kotlin.String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;DistrictList&gt;**](DistrictList.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

