# TBAApi

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStatus**](TBAApi.md#getStatus) | **GET** /status | 


<a name="getStatus"></a>
# **getStatus**
> APIStatus getStatus(ifMinusModifiedMinusSince)



Returns API status, and TBA status information.

### Example
```kotlin
// Import classes:
//import net.thefletcher.tbaapi.v3client.infrastructure.*
//import net.thefletcher.tbaapi.v3client.models.*

val apiInstance = TBAApi()
val ifMinusModifiedMinusSince : kotlin.String = ifMinusModifiedMinusSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : APIStatus = apiInstance.getStatus(ifMinusModifiedMinusSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TBAApi#getStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TBAApi#getStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifMinusModifiedMinusSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**APIStatus**](APIStatus.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

