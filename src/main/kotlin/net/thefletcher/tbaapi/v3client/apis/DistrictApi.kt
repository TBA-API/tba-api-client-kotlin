/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* OpenAPI spec version: 3.04.1
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package net.thefletcher.tbaapi.v3client.apis

import net.thefletcher.tbaapi.v3client.models.DistrictList
import net.thefletcher.tbaapi.v3client.models.DistrictRanking
import net.thefletcher.tbaapi.v3client.models.Event
import net.thefletcher.tbaapi.v3client.models.EventDistrictPoints
import net.thefletcher.tbaapi.v3client.models.EventSimple
import net.thefletcher.tbaapi.v3client.models.Team
import net.thefletcher.tbaapi.v3client.models.TeamSimple

import net.thefletcher.tbaapi.v3client.infrastructure.*

class DistrictApi(basePath: kotlin.String = "https://www.thebluealliance.com/api/v3") : ApiClient(basePath) {

    /**
    * 
    * Gets a list of events in the given district.
    * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional, default to null)
    * @return kotlin.Array<Event>
    */
    @Suppress("UNCHECKED_CAST")
    fun getDistrictEvents(districtKey: kotlin.String, ifModifiedSince: kotlin.String) : kotlin.Array<Event> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("If-Modified-Since" to ifModifiedSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/district/{district_key}/events".replace("{"+"district_key"+"}", "$districtKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Event>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Event>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Gets a list of event keys for events in the given district.
    * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional, default to null)
    * @return kotlin.Array<kotlin.String>
    */
    @Suppress("UNCHECKED_CAST")
    fun getDistrictEventsKeys(districtKey: kotlin.String, ifModifiedSince: kotlin.String) : kotlin.Array<kotlin.String> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("If-Modified-Since" to ifModifiedSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/district/{district_key}/events/keys".replace("{"+"district_key"+"}", "$districtKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<kotlin.String>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<kotlin.String>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Gets a short-form list of events in the given district.
    * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional, default to null)
    * @return kotlin.Array<EventSimple>
    */
    @Suppress("UNCHECKED_CAST")
    fun getDistrictEventsSimple(districtKey: kotlin.String, ifModifiedSince: kotlin.String) : kotlin.Array<EventSimple> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("If-Modified-Since" to ifModifiedSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/district/{district_key}/events/simple".replace("{"+"district_key"+"}", "$districtKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<EventSimple>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<EventSimple>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Gets a list of team district rankings for the given district.
    * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional, default to null)
    * @return kotlin.Array<DistrictRanking>
    */
    @Suppress("UNCHECKED_CAST")
    fun getDistrictRankings(districtKey: kotlin.String, ifModifiedSince: kotlin.String) : kotlin.Array<DistrictRanking> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("If-Modified-Since" to ifModifiedSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/district/{district_key}/rankings".replace("{"+"district_key"+"}", "$districtKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<DistrictRanking>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<DistrictRanking>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.
    * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional, default to null)
    * @return kotlin.Array<Team>
    */
    @Suppress("UNCHECKED_CAST")
    fun getDistrictTeams(districtKey: kotlin.String, ifModifiedSince: kotlin.String) : kotlin.Array<Team> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("If-Modified-Since" to ifModifiedSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/district/{district_key}/teams".replace("{"+"district_key"+"}", "$districtKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Team>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Team>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.
    * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional, default to null)
    * @return kotlin.Array<kotlin.String>
    */
    @Suppress("UNCHECKED_CAST")
    fun getDistrictTeamsKeys(districtKey: kotlin.String, ifModifiedSince: kotlin.String) : kotlin.Array<kotlin.String> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("If-Modified-Since" to ifModifiedSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/district/{district_key}/teams/keys".replace("{"+"district_key"+"}", "$districtKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<kotlin.String>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<kotlin.String>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Gets a short-form list of &#x60;Team&#x60; objects that competed in events in the given district.
    * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional, default to null)
    * @return kotlin.Array<TeamSimple>
    */
    @Suppress("UNCHECKED_CAST")
    fun getDistrictTeamsSimple(districtKey: kotlin.String, ifModifiedSince: kotlin.String) : kotlin.Array<TeamSimple> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("If-Modified-Since" to ifModifiedSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/district/{district_key}/teams/simple".replace("{"+"district_key"+"}", "$districtKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<TeamSimple>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<TeamSimple>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Gets a list of districts and their corresponding district key, for the given year.
    * @param year Competition Year (or Season). Must be 4 digits. 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional, default to null)
    * @return kotlin.Array<DistrictList>
    */
    @Suppress("UNCHECKED_CAST")
    fun getDistrictsByYear(year: kotlin.Int, ifModifiedSince: kotlin.String) : kotlin.Array<DistrictList> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("If-Modified-Since" to ifModifiedSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/districts/{year}".replace("{"+"year"+"}", "$year"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<DistrictList>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<DistrictList>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Gets a list of team rankings for the Event.
    * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional, default to null)
    * @return EventDistrictPoints
    */
    @Suppress("UNCHECKED_CAST")
    fun getEventDistrictPoints(eventKey: kotlin.String, ifModifiedSince: kotlin.String) : EventDistrictPoints {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("If-Modified-Since" to ifModifiedSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/event/{event_key}/district_points".replace("{"+"event_key"+"}", "$eventKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<EventDistrictPoints>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as EventDistrictPoints
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Gets an array of districts representing each year the team was in a district. Will return an empty array if the team was never in a district.
    * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional, default to null)
    * @return kotlin.Array<DistrictList>
    */
    @Suppress("UNCHECKED_CAST")
    fun getTeamDistricts(teamKey: kotlin.String, ifModifiedSince: kotlin.String) : kotlin.Array<DistrictList> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("If-Modified-Since" to ifModifiedSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/team/{team_key}/districts".replace("{"+"team_key"+"}", "$teamKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<DistrictList>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<DistrictList>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
