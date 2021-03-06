/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* The version of the OpenAPI document: 3.8.0
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

import net.thefletcher.tbaapi.v3client.infrastructure.ApiClient
import net.thefletcher.tbaapi.v3client.infrastructure.ClientException
import net.thefletcher.tbaapi.v3client.infrastructure.ClientError
import net.thefletcher.tbaapi.v3client.infrastructure.ServerException
import net.thefletcher.tbaapi.v3client.infrastructure.ServerError
import net.thefletcher.tbaapi.v3client.infrastructure.MultiValueMap
import net.thefletcher.tbaapi.v3client.infrastructure.RequestConfig
import net.thefletcher.tbaapi.v3client.infrastructure.RequestMethod
import net.thefletcher.tbaapi.v3client.infrastructure.ResponseType
import net.thefletcher.tbaapi.v3client.infrastructure.Success
import net.thefletcher.tbaapi.v3client.infrastructure.toMultiValue

class DistrictApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("net.thefletcher.tbaapi.v3client.baseUrl", "https://www.thebluealliance.com/api/v3")
        }
    }

    /**
    * 
    * Gets a list of events in the given district.
    * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; 
    * @param ifMinusModifiedMinusSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<Event>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getDistrictEvents(districtKey: kotlin.String, ifMinusModifiedMinusSince: kotlin.String?) : kotlin.Array<Event> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-Modified-Since" to ifMinusModifiedMinusSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/district/{district_key}/events".replace("{"+"district_key"+"}", "$districtKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<Event>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<Event>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * 
    * Gets a list of event keys for events in the given district.
    * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; 
    * @param ifMinusModifiedMinusSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<kotlin.String>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getDistrictEventsKeys(districtKey: kotlin.String, ifMinusModifiedMinusSince: kotlin.String?) : kotlin.Array<kotlin.String> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-Modified-Since" to ifMinusModifiedMinusSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/district/{district_key}/events/keys".replace("{"+"district_key"+"}", "$districtKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<kotlin.String>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<kotlin.String>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * 
    * Gets a short-form list of events in the given district.
    * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; 
    * @param ifMinusModifiedMinusSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<EventSimple>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getDistrictEventsSimple(districtKey: kotlin.String, ifMinusModifiedMinusSince: kotlin.String?) : kotlin.Array<EventSimple> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-Modified-Since" to ifMinusModifiedMinusSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/district/{district_key}/events/simple".replace("{"+"district_key"+"}", "$districtKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<EventSimple>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<EventSimple>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * 
    * Gets a list of team district rankings for the given district.
    * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; 
    * @param ifMinusModifiedMinusSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<DistrictRanking>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getDistrictRankings(districtKey: kotlin.String, ifMinusModifiedMinusSince: kotlin.String?) : kotlin.Array<DistrictRanking> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-Modified-Since" to ifMinusModifiedMinusSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/district/{district_key}/rankings".replace("{"+"district_key"+"}", "$districtKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<DistrictRanking>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<DistrictRanking>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * 
    * Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.
    * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; 
    * @param ifMinusModifiedMinusSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<Team>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getDistrictTeams(districtKey: kotlin.String, ifMinusModifiedMinusSince: kotlin.String?) : kotlin.Array<Team> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-Modified-Since" to ifMinusModifiedMinusSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/district/{district_key}/teams".replace("{"+"district_key"+"}", "$districtKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<Team>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<Team>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * 
    * Gets a list of &#x60;Team&#x60; objects that competed in events in the given district.
    * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; 
    * @param ifMinusModifiedMinusSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<kotlin.String>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getDistrictTeamsKeys(districtKey: kotlin.String, ifMinusModifiedMinusSince: kotlin.String?) : kotlin.Array<kotlin.String> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-Modified-Since" to ifMinusModifiedMinusSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/district/{district_key}/teams/keys".replace("{"+"district_key"+"}", "$districtKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<kotlin.String>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<kotlin.String>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * 
    * Gets a short-form list of &#x60;Team&#x60; objects that competed in events in the given district.
    * @param districtKey TBA District Key, eg &#x60;2016fim&#x60; 
    * @param ifMinusModifiedMinusSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<TeamSimple>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getDistrictTeamsSimple(districtKey: kotlin.String, ifMinusModifiedMinusSince: kotlin.String?) : kotlin.Array<TeamSimple> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-Modified-Since" to ifMinusModifiedMinusSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/district/{district_key}/teams/simple".replace("{"+"district_key"+"}", "$districtKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<TeamSimple>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<TeamSimple>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * 
    * Gets a list of districts and their corresponding district key, for the given year.
    * @param year Competition Year (or Season). Must be 4 digits. 
    * @param ifMinusModifiedMinusSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<DistrictList>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getDistrictsByYear(year: kotlin.Int, ifMinusModifiedMinusSince: kotlin.String?) : kotlin.Array<DistrictList> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-Modified-Since" to ifMinusModifiedMinusSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/districts/{year}".replace("{"+"year"+"}", "$year"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<DistrictList>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<DistrictList>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * 
    * Gets a list of team rankings for the Event.
    * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; 
    * @param ifMinusModifiedMinusSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return EventDistrictPoints
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getEventDistrictPoints(eventKey: kotlin.String, ifMinusModifiedMinusSince: kotlin.String?) : EventDistrictPoints {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-Modified-Since" to ifMinusModifiedMinusSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/event/{event_key}/district_points".replace("{"+"event_key"+"}", "$eventKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<EventDistrictPoints>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EventDistrictPoints
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * 
    * Gets an array of districts representing each year the team was in a district. Will return an empty array if the team was never in a district.
    * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; 
    * @param ifMinusModifiedMinusSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<DistrictList>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getTeamDistricts(teamKey: kotlin.String, ifMinusModifiedMinusSince: kotlin.String?) : kotlin.Array<DistrictList> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-Modified-Since" to ifMinusModifiedMinusSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/team/{team_key}/districts".replace("{"+"team_key"+"}", "$teamKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<DistrictList>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<DistrictList>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

}
