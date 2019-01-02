/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* OpenAPI spec version: 3.04.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package net.thefletcher.tbaapi.v3client.apis

import net.thefletcher.tbaapi.v3client.models.Match
import net.thefletcher.tbaapi.v3client.models.Match_Simple

import net.thefletcher.tbaapi.v3client.infrastructure.*

class MatchApi(basePath: kotlin.String = "https://www.thebluealliance.com/api/v3") : ApiClient(basePath) {

    /**
    * 
    * Gets an array of Match Keys for the given event key that have timeseries data. Returns an empty array if no matches have timeseries data. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This endpoint and corresponding data models are under *active development* and may change at any time, including in breaking ways.
    * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<kotlin.String>
    */
    @Suppress("UNCHECKED_CAST")
    fun getEventMatchTimeseries(eventKey: kotlin.String, ifModifiedSince: kotlin.String) : kotlin.Array<kotlin.String> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("ifModifiedSince" to ifModifiedSince)
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/event/{event_key}/matches/timeseries".replace("{"+"event_key"+"}", "$eventKey"),
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
    * Gets a list of matches for the given event.
    * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<Match>
    */
    @Suppress("UNCHECKED_CAST")
    fun getEventMatches(eventKey: kotlin.String, ifModifiedSince: kotlin.String) : kotlin.Array<Match> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("ifModifiedSince" to ifModifiedSince)
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/event/{event_key}/matches".replace("{"+"event_key"+"}", "$eventKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Match>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Match>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Gets a list of match keys for the given event.
    * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<kotlin.String>
    */
    @Suppress("UNCHECKED_CAST")
    fun getEventMatchesKeys(eventKey: kotlin.String, ifModifiedSince: kotlin.String) : kotlin.Array<kotlin.String> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("ifModifiedSince" to ifModifiedSince)
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/event/{event_key}/matches/keys".replace("{"+"event_key"+"}", "$eventKey"),
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
    * Gets a short-form list of matches for the given event.
    * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<Match_Simple>
    */
    @Suppress("UNCHECKED_CAST")
    fun getEventMatchesSimple(eventKey: kotlin.String, ifModifiedSince: kotlin.String) : kotlin.Array<Match_Simple> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("ifModifiedSince" to ifModifiedSince)
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/event/{event_key}/matches/simple".replace("{"+"event_key"+"}", "$eventKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Match_Simple>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Match_Simple>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Gets a &#x60;Match&#x60; object for the given match key.
    * @param matchKey TBA Match Key, eg &#x60;2016nytr_qm1&#x60; 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return Match
    */
    @Suppress("UNCHECKED_CAST")
    fun getMatch(matchKey: kotlin.String, ifModifiedSince: kotlin.String) : Match {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("ifModifiedSince" to ifModifiedSince)
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/match/{match_key}".replace("{"+"match_key"+"}", "$matchKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Match>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Match
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Gets a short-form &#x60;Match&#x60; object for the given match key.
    * @param matchKey TBA Match Key, eg &#x60;2016nytr_qm1&#x60; 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return Match_Simple
    */
    @Suppress("UNCHECKED_CAST")
    fun getMatchSimple(matchKey: kotlin.String, ifModifiedSince: kotlin.String) : Match_Simple {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("ifModifiedSince" to ifModifiedSince)
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/match/{match_key}/simple".replace("{"+"match_key"+"}", "$matchKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Match_Simple>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Match_Simple
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Gets an array of game-specific Match Timeseries objects for the given match key or an empty array if not available. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This endpoint and corresponding data models are under *active development* and may change at any time, including in breaking ways.
    * @param matchKey TBA Match Key, eg &#x60;2016nytr_qm1&#x60; 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<kotlin.Any>
    */
    @Suppress("UNCHECKED_CAST")
    fun getMatchTimeseries(matchKey: kotlin.String, ifModifiedSince: kotlin.String) : kotlin.Array<kotlin.Any> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("ifModifiedSince" to ifModifiedSince)
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/match/{match_key}/timeseries".replace("{"+"match_key"+"}", "$matchKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<kotlin.Any>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<kotlin.Any>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Gets a list of matches for the given team and event.
    * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; 
    * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<Match>
    */
    @Suppress("UNCHECKED_CAST")
    fun getTeamEventMatches(teamKey: kotlin.String, eventKey: kotlin.String, ifModifiedSince: kotlin.String) : kotlin.Array<Match> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("ifModifiedSince" to ifModifiedSince)
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/team/{team_key}/event/{event_key}/matches".replace("{"+"team_key"+"}", "$teamKey").replace("{"+"event_key"+"}", "$eventKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Match>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Match>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Gets a list of match keys for matches for the given team and event.
    * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; 
    * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<kotlin.String>
    */
    @Suppress("UNCHECKED_CAST")
    fun getTeamEventMatchesKeys(teamKey: kotlin.String, eventKey: kotlin.String, ifModifiedSince: kotlin.String) : kotlin.Array<kotlin.String> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("ifModifiedSince" to ifModifiedSince)
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/team/{team_key}/event/{event_key}/matches/keys".replace("{"+"team_key"+"}", "$teamKey").replace("{"+"event_key"+"}", "$eventKey"),
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
    * Gets a short-form list of matches for the given team and event.
    * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; 
    * @param eventKey TBA Event Key, eg &#x60;2016nytr&#x60; 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<Match>
    */
    @Suppress("UNCHECKED_CAST")
    fun getTeamEventMatchesSimple(teamKey: kotlin.String, eventKey: kotlin.String, ifModifiedSince: kotlin.String) : kotlin.Array<Match> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("ifModifiedSince" to ifModifiedSince)
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/team/{team_key}/event/{event_key}/matches/simple".replace("{"+"team_key"+"}", "$teamKey").replace("{"+"event_key"+"}", "$eventKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Match>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Match>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Gets a list of matches for the given team and year.
    * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; 
    * @param year Competition Year (or Season). Must be 4 digits. 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<Match>
    */
    @Suppress("UNCHECKED_CAST")
    fun getTeamMatchesByYear(teamKey: kotlin.String, year: kotlin.Int, ifModifiedSince: kotlin.String) : kotlin.Array<Match> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("ifModifiedSince" to ifModifiedSince)
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/team/{team_key}/matches/{year}".replace("{"+"team_key"+"}", "$teamKey").replace("{"+"year"+"}", "$year"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Match>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Match>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * Gets a list of match keys for matches for the given team and year.
    * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; 
    * @param year Competition Year (or Season). Must be 4 digits. 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<kotlin.String>
    */
    @Suppress("UNCHECKED_CAST")
    fun getTeamMatchesByYearKeys(teamKey: kotlin.String, year: kotlin.Int, ifModifiedSince: kotlin.String) : kotlin.Array<kotlin.String> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("ifModifiedSince" to ifModifiedSince)
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/team/{team_key}/matches/{year}/keys".replace("{"+"team_key"+"}", "$teamKey").replace("{"+"year"+"}", "$year"),
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
    * Gets a short-form list of matches for the given team and year.
    * @param teamKey TBA Team Key, eg &#x60;frc254&#x60; 
    * @param year Competition Year (or Season). Must be 4 digits. 
    * @param ifModifiedSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return kotlin.Array<Match_Simple>
    */
    @Suppress("UNCHECKED_CAST")
    fun getTeamMatchesByYearSimple(teamKey: kotlin.String, year: kotlin.Int, ifModifiedSince: kotlin.String) : kotlin.Array<Match_Simple> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("ifModifiedSince" to ifModifiedSince)
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/team/{team_key}/matches/{year}/simple".replace("{"+"team_key"+"}", "$teamKey").replace("{"+"year"+"}", "$year"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Match_Simple>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Match_Simple>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
