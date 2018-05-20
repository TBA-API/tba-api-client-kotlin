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
> kotlin.Array&lt;Event&gt; getDistrictEvents(districtKey, ifModifiedSince)



Gets a list of events in the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Event> = apiInstance.getDistrictEvents(districtKey, ifModifiedSince)
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
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;Event&gt;**](Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictEventsKeys"></a>
# **getDistrictEventsKeys**
> kotlin.Array&lt;kotlin.String&gt; getDistrictEventsKeys(districtKey, ifModifiedSince)



Gets a list of event keys for events in the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getDistrictEventsKeys(districtKey, ifModifiedSince)
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
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictEventsSimple"></a>
# **getDistrictEventsSimple**
> kotlin.Array&lt;Event_Simple&gt; getDistrictEventsSimple(districtKey, ifModifiedSince)



Gets a short-form list of events in the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Event_Simple> = apiInstance.getDistrictEventsSimple(districtKey, ifModifiedSince)
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
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;Event_Simple&gt;**](Event_Simple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictRankings"></a>
# **getDistrictRankings**
> kotlin.Array&lt;District_Ranking&gt; getDistrictRankings(districtKey, ifModifiedSince)



Gets a list of team district rankings for the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<District_Ranking> = apiInstance.getDistrictRankings(districtKey, ifModifiedSince)
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
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;District_Ranking&gt;**](District_Ranking.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictTeams"></a>
# **getDistrictTeams**
> kotlin.Array&lt;Team&gt; getDistrictTeams(districtKey, ifModifiedSince)



Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Team> = apiInstance.getDistrictTeams(districtKey, ifModifiedSince)
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
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;Team&gt;**](Team.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictTeamsKeys"></a>
# **getDistrictTeamsKeys**
> kotlin.Array&lt;kotlin.String&gt; getDistrictTeamsKeys(districtKey, ifModifiedSince)



Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getDistrictTeamsKeys(districtKey, ifModifiedSince)
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
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictTeamsSimple"></a>
# **getDistrictTeamsSimple**
> kotlin.Array&lt;Team_Simple&gt; getDistrictTeamsSimple(districtKey, ifModifiedSince)



Gets a short-form list of &#x60;Team&#x60; objects that competed in events in the given district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val districtKey : kotlin.String = districtKey_example // kotlin.String | TBA District Key, eg `2016fim`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Team_Simple> = apiInstance.getDistrictTeamsSimple(districtKey, ifModifiedSince)
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
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;Team_Simple&gt;**](Team_Simple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictsByYear"></a>
# **getDistrictsByYear**
> kotlin.Array&lt;District_List&gt; getDistrictsByYear(year, ifModifiedSince)



Gets a list of districts and their corresponding district key, for the given year.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<District_List> = apiInstance.getDistrictsByYear(year, ifModifiedSince)
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
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;District_List&gt;**](District_List.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventDistrictPoints"></a>
# **getEventDistrictPoints**
> Event_District_Points getEventDistrictPoints(eventKey, ifModifiedSince)



Gets a list of team rankings for the Event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : Event_District_Points = apiInstance.getEventDistrictPoints(eventKey, ifModifiedSince)
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
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**Event_District_Points**](Event_District_Points.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamDistricts"></a>
# **getTeamDistricts**
> kotlin.Array&lt;District_List&gt; getTeamDistricts(teamKey, ifModifiedSince)



Gets an array of districts representing each year the team was in a district. Will return an empty array if the team was never in a district.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = DistrictApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<District_List> = apiInstance.getTeamDistricts(teamKey, ifModifiedSince)
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
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;District_List&gt;**](District_List.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

