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
[**getTeamEventMatches**](MatchApi.md#getTeamEventMatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
[**getTeamEventMatchesKeys**](MatchApi.md#getTeamEventMatchesKeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
[**getTeamEventMatchesSimple**](MatchApi.md#getTeamEventMatchesSimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
[**getTeamMatchesByYear**](MatchApi.md#getTeamMatchesByYear) | **GET** /team/{team_key}/matches/{year} | 
[**getTeamMatchesByYearKeys**](MatchApi.md#getTeamMatchesByYearKeys) | **GET** /team/{team_key}/matches/{year}/keys | 
[**getTeamMatchesByYearSimple**](MatchApi.md#getTeamMatchesByYearSimple) | **GET** /team/{team_key}/matches/{year}/simple | 


<a name="getEventMatchTimeseries"></a>
# **getEventMatchTimeseries**
> kotlin.Array&lt;kotlin.String&gt; getEventMatchTimeseries()



Gets an array of Match Keys for the given event key that have timeseries data. Returns an empty array if no matches have timeseries data. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This endpoint and corresponding data models are under *active development* and may change at any time, including in breaking ways.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = MatchApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getEventMatchTimeseries()
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

val apiInstance = MatchApi()
try {
    val result : kotlin.Array<Match> = apiInstance.getEventMatches()
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

val apiInstance = MatchApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getEventMatchesKeys()
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

val apiInstance = MatchApi()
try {
    val result : kotlin.Array<MatchSimple> = apiInstance.getEventMatchesSimple()
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
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;MatchSimple&gt;**](MatchSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMatch"></a>
# **getMatch**
> Match getMatch()



Gets a &#x60;Match&#x60; object for the given match key.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = MatchApi()
try {
    val result : Match = apiInstance.getMatch()
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
This endpoint does not need any parameter.

### Return type

[**Match**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMatchSimple"></a>
# **getMatchSimple**
> MatchSimple getMatchSimple()



Gets a short-form &#x60;Match&#x60; object for the given match key.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = MatchApi()
try {
    val result : MatchSimple = apiInstance.getMatchSimple()
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
This endpoint does not need any parameter.

### Return type

[**MatchSimple**](MatchSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMatchTimeseries"></a>
# **getMatchTimeseries**
> kotlin.Array&lt;kotlin.Any&gt; getMatchTimeseries()



Gets an array of game-specific Match Timeseries objects for the given match key or an empty array if not available. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This endpoint and corresponding data models are under *active development* and may change at any time, including in breaking ways.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = MatchApi()
try {
    val result : kotlin.Array<kotlin.Any> = apiInstance.getMatchTimeseries()
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
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;kotlin.Any&gt;**](kotlin.Any.md)

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

val apiInstance = MatchApi()
try {
    val result : kotlin.Array<Match> = apiInstance.getTeamEventMatches()
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

val apiInstance = MatchApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamEventMatchesKeys()
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

val apiInstance = MatchApi()
try {
    val result : kotlin.Array<Match> = apiInstance.getTeamEventMatchesSimple()
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
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Match&gt;**](Match.md)

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

val apiInstance = MatchApi()
try {
    val result : kotlin.Array<Match> = apiInstance.getTeamMatchesByYear()
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

val apiInstance = MatchApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getTeamMatchesByYearKeys()
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

val apiInstance = MatchApi()
try {
    val result : kotlin.Array<MatchSimple> = apiInstance.getTeamMatchesByYearSimple()
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
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;MatchSimple&gt;**](MatchSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

