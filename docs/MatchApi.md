# MatchApi

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEventMatchTimeseries**](MatchApi.md#getEventMatchTimeseries) | **GET** /event/{event_key}/matches/timeseries | 
[**getEventMatches**](MatchApi.md#getEventMatches) | **GET** /event/{event_key}/matches | 
[**getEventMatchesKeys**](MatchApi.md#getEventMatchesKeys) | **GET** /event/{event_key}/matches/keys | 
[**getEventMatchesSimple**](MatchApi.md#getEventMatchesSimple) | **GET** /event/{event_key}/matches/simple | 
[**getMatch**](MatchApi.md#getMatch) | **GET** /match/{match_key} | 
[**getMatchSimple**](MatchApi.md#getMatchSimple) | **GET** /match/{match_key}/simple | 
[**getMatchTimeseries**](MatchApi.md#getMatchTimeseries) | **GET** /match/{match_key}/timeseries | 
[**getMatchZebra**](MatchApi.md#getMatchZebra) | **GET** /match/{match_key}/zebra_motionworks | 
[**getTeamEventMatches**](MatchApi.md#getTeamEventMatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
[**getTeamEventMatchesKeys**](MatchApi.md#getTeamEventMatchesKeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
[**getTeamEventMatchesSimple**](MatchApi.md#getTeamEventMatchesSimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
[**getTeamMatchesByYear**](MatchApi.md#getTeamMatchesByYear) | **GET** /team/{team_key}/matches/{year} | 
[**getTeamMatchesByYearKeys**](MatchApi.md#getTeamMatchesByYearKeys) | **GET** /team/{team_key}/matches/{year}/keys | 
[**getTeamMatchesByYearSimple**](MatchApi.md#getTeamMatchesByYearSimple) | **GET** /team/{team_key}/matches/{year}/simple | 


<a name="getEventMatchTimeseries"></a>
# **getEventMatchTimeseries**
> kotlin.Array&lt;kotlin.String&gt; getEventMatchTimeseries(eventKey, ifMinusModifiedMinusSince)



Gets an array of Match Keys for the given event key that have timeseries data. Returns an empty array if no matches have timeseries data. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This endpoint and corresponding data models are under *active development* and may change at any time, including in breaking ways.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = MatchApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getEventMatchTimeseries(eventKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchApi#getEventMatchTimeseries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchApi#getEventMatchTimeseries")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
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

<a name="getEventMatches"></a>
# **getEventMatches**
> kotlin.Array&lt;Match&gt; getEventMatches(eventKey, ifMinusModifiedMinusSince)



Gets a list of matches for the given event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = MatchApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Match> = apiInstance.getEventMatches(eventKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchApi#getEventMatches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchApi#getEventMatches")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;Match&gt;**](Match.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventMatchesKeys"></a>
# **getEventMatchesKeys**
> kotlin.Array&lt;kotlin.String&gt; getEventMatchesKeys(eventKey, ifMinusModifiedMinusSince)



Gets a list of match keys for the given event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = MatchApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getEventMatchesKeys(eventKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchApi#getEventMatchesKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchApi#getEventMatchesKeys")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
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

<a name="getEventMatchesSimple"></a>
# **getEventMatchesSimple**
> kotlin.Array&lt;MatchSimple&gt; getEventMatchesSimple(eventKey, ifMinusModifiedMinusSince)



Gets a short-form list of matches for the given event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = MatchApi()
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<MatchSimple> = apiInstance.getEventMatchesSimple(eventKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchApi#getEventMatchesSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchApi#getEventMatchesSimple")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;MatchSimple&gt;**](MatchSimple.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMatch"></a>
# **getMatch**
> Match getMatch(matchKey, ifMinusModifiedMinusSince)



Gets a &#x60;Match&#x60; object for the given match key.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = MatchApi()
val matchKey : kotlin.String = matchKey_example // kotlin.String | TBA Match Key, eg `2016nytr_qm1`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : Match = apiInstance.getMatch(matchKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchApi#getMatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchApi#getMatch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchKey** | **kotlin.String**| TBA Match Key, eg &#x60;2016nytr_qm1&#x60; |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**Match**](Match.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMatchSimple"></a>
# **getMatchSimple**
> MatchSimple getMatchSimple(matchKey, ifMinusModifiedMinusSince)



Gets a short-form &#x60;Match&#x60; object for the given match key.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = MatchApi()
val matchKey : kotlin.String = matchKey_example // kotlin.String | TBA Match Key, eg `2016nytr_qm1`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : MatchSimple = apiInstance.getMatchSimple(matchKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchApi#getMatchSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchApi#getMatchSimple")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchKey** | **kotlin.String**| TBA Match Key, eg &#x60;2016nytr_qm1&#x60; |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**MatchSimple**](MatchSimple.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMatchTimeseries"></a>
# **getMatchTimeseries**
> kotlin.Array&lt;kotlin.Any&gt; getMatchTimeseries(matchKey, ifMinusModifiedMinusSince)



Gets an array of game-specific Match Timeseries objects for the given match key or an empty array if not available. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This endpoint and corresponding data models are under *active development* and may change at any time, including in breaking ways.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = MatchApi()
val matchKey : kotlin.String = matchKey_example // kotlin.String | TBA Match Key, eg `2016nytr_qm1`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.Any> = apiInstance.getMatchTimeseries(matchKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchApi#getMatchTimeseries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchApi#getMatchTimeseries")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchKey** | **kotlin.String**| TBA Match Key, eg &#x60;2016nytr_qm1&#x60; |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;kotlin.Any&gt;**](kotlin.Any.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMatchZebra"></a>
# **getMatchZebra**
> Zebra getMatchZebra(matchKey, ifMinusModifiedMinusSince)



Gets Zebra MotionWorks data for a Match for the given match key.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = MatchApi()
val matchKey : kotlin.String = matchKey_example // kotlin.String | TBA Match Key, eg `2016nytr_qm1`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : Zebra = apiInstance.getMatchZebra(matchKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchApi#getMatchZebra")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchApi#getMatchZebra")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchKey** | **kotlin.String**| TBA Match Key, eg &#x60;2016nytr_qm1&#x60; |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**Zebra**](Zebra.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventMatches"></a>
# **getTeamEventMatches**
> kotlin.Array&lt;Match&gt; getTeamEventMatches(teamKey, eventKey, ifMinusModifiedMinusSince)



Gets a list of matches for the given team and event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = MatchApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Match> = apiInstance.getTeamEventMatches(teamKey, eventKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchApi#getTeamEventMatches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchApi#getTeamEventMatches")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **kotlin.String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;Match&gt;**](Match.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventMatchesKeys"></a>
# **getTeamEventMatchesKeys**
> kotlin.Array&lt;kotlin.String&gt; getTeamEventMatchesKeys(teamKey, eventKey, ifMinusModifiedMinusSince)



Gets a list of match keys for matches for the given team and event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = MatchApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamEventMatchesKeys(teamKey, eventKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchApi#getTeamEventMatchesKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchApi#getTeamEventMatchesKeys")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **kotlin.String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
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

<a name="getTeamEventMatchesSimple"></a>
# **getTeamEventMatchesSimple**
> kotlin.Array&lt;Match&gt; getTeamEventMatchesSimple(teamKey, eventKey, ifMinusModifiedMinusSince)



Gets a short-form list of matches for the given team and event.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = MatchApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val eventKey : kotlin.String = eventKey_example // kotlin.String | TBA Event Key, eg `2016nytr`
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Match> = apiInstance.getTeamEventMatchesSimple(teamKey, eventKey, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchApi#getTeamEventMatchesSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchApi#getTeamEventMatchesSimple")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **kotlin.String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **eventKey** | **kotlin.String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;Match&gt;**](Match.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamMatchesByYear"></a>
# **getTeamMatchesByYear**
> kotlin.Array&lt;Match&gt; getTeamMatchesByYear(teamKey, year, ifMinusModifiedMinusSince)



Gets a list of matches for the given team and year.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = MatchApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<Match> = apiInstance.getTeamMatchesByYear(teamKey, year, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchApi#getTeamMatchesByYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchApi#getTeamMatchesByYear")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **kotlin.String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **year** | **kotlin.Int**| Competition Year (or Season). Must be 4 digits. |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;Match&gt;**](Match.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamMatchesByYearKeys"></a>
# **getTeamMatchesByYearKeys**
> kotlin.Array&lt;kotlin.String&gt; getTeamMatchesByYearKeys(teamKey, year, ifMinusModifiedMinusSince)



Gets a list of match keys for matches for the given team and year.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = MatchApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamMatchesByYearKeys(teamKey, year, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchApi#getTeamMatchesByYearKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchApi#getTeamMatchesByYearKeys")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **kotlin.String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **year** | **kotlin.Int**| Competition Year (or Season). Must be 4 digits. |
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

<a name="getTeamMatchesByYearSimple"></a>
# **getTeamMatchesByYearSimple**
> kotlin.Array&lt;MatchSimple&gt; getTeamMatchesByYearSimple(teamKey, year, ifMinusModifiedMinusSince)



Gets a short-form list of matches for the given team and year.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = MatchApi()
val teamKey : kotlin.String = teamKey_example // kotlin.String | TBA Team Key, eg `frc254`
val year : kotlin.Int = 56 // kotlin.Int | Competition Year (or Season). Must be 4 digits.
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : kotlin.Array<MatchSimple> = apiInstance.getTeamMatchesByYearSimple(teamKey, year, ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchApi#getTeamMatchesByYearSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchApi#getTeamMatchesByYearSimple")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **kotlin.String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **year** | **kotlin.Int**| Competition Year (or Season). Must be 4 digits. |
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**kotlin.Array&lt;MatchSimple&gt;**](MatchSimple.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

