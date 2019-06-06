# net.thefletcher.tbaapi.v3client - Kotlin client library for The Blue Alliance API v3

## Requires

* Kotlin 1.3.31
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DistrictApi* | [**getDistrictEvents**](docs/DistrictApi.md#getdistrictevents) | **GET** /district/{district_key}/events | 
*DistrictApi* | [**getDistrictEventsKeys**](docs/DistrictApi.md#getdistricteventskeys) | **GET** /district/{district_key}/events/keys | 
*DistrictApi* | [**getDistrictEventsSimple**](docs/DistrictApi.md#getdistricteventssimple) | **GET** /district/{district_key}/events/simple | 
*DistrictApi* | [**getDistrictRankings**](docs/DistrictApi.md#getdistrictrankings) | **GET** /district/{district_key}/rankings | 
*DistrictApi* | [**getDistrictTeams**](docs/DistrictApi.md#getdistrictteams) | **GET** /district/{district_key}/teams | 
*DistrictApi* | [**getDistrictTeamsKeys**](docs/DistrictApi.md#getdistrictteamskeys) | **GET** /district/{district_key}/teams/keys | 
*DistrictApi* | [**getDistrictTeamsSimple**](docs/DistrictApi.md#getdistrictteamssimple) | **GET** /district/{district_key}/teams/simple | 
*DistrictApi* | [**getDistrictsByYear**](docs/DistrictApi.md#getdistrictsbyyear) | **GET** /districts/{year} | 
*DistrictApi* | [**getEventDistrictPoints**](docs/DistrictApi.md#geteventdistrictpoints) | **GET** /event/{event_key}/district_points | 
*DistrictApi* | [**getTeamDistricts**](docs/DistrictApi.md#getteamdistricts) | **GET** /team/{team_key}/districts | 
*EventApi* | [**getDistrictEvents**](docs/EventApi.md#getdistrictevents) | **GET** /district/{district_key}/events | 
*EventApi* | [**getDistrictEventsKeys**](docs/EventApi.md#getdistricteventskeys) | **GET** /district/{district_key}/events/keys | 
*EventApi* | [**getDistrictEventsSimple**](docs/EventApi.md#getdistricteventssimple) | **GET** /district/{district_key}/events/simple | 
*EventApi* | [**getEvent**](docs/EventApi.md#getevent) | **GET** /event/{event_key} | 
*EventApi* | [**getEventAlliances**](docs/EventApi.md#geteventalliances) | **GET** /event/{event_key}/alliances | 
*EventApi* | [**getEventAwards**](docs/EventApi.md#geteventawards) | **GET** /event/{event_key}/awards | 
*EventApi* | [**getEventDistrictPoints**](docs/EventApi.md#geteventdistrictpoints) | **GET** /event/{event_key}/district_points | 
*EventApi* | [**getEventInsights**](docs/EventApi.md#geteventinsights) | **GET** /event/{event_key}/insights | 
*EventApi* | [**getEventMatchTimeseries**](docs/EventApi.md#geteventmatchtimeseries) | **GET** /event/{event_key}/matches/timeseries | 
*EventApi* | [**getEventMatches**](docs/EventApi.md#geteventmatches) | **GET** /event/{event_key}/matches | 
*EventApi* | [**getEventMatchesKeys**](docs/EventApi.md#geteventmatcheskeys) | **GET** /event/{event_key}/matches/keys | 
*EventApi* | [**getEventMatchesSimple**](docs/EventApi.md#geteventmatchessimple) | **GET** /event/{event_key}/matches/simple | 
*EventApi* | [**getEventOPRs**](docs/EventApi.md#geteventoprs) | **GET** /event/{event_key}/oprs | 
*EventApi* | [**getEventPredictions**](docs/EventApi.md#geteventpredictions) | **GET** /event/{event_key}/predictions | 
*EventApi* | [**getEventRankings**](docs/EventApi.md#geteventrankings) | **GET** /event/{event_key}/rankings | 
*EventApi* | [**getEventSimple**](docs/EventApi.md#geteventsimple) | **GET** /event/{event_key}/simple | 
*EventApi* | [**getEventTeams**](docs/EventApi.md#geteventteams) | **GET** /event/{event_key}/teams | 
*EventApi* | [**getEventTeamsKeys**](docs/EventApi.md#geteventteamskeys) | **GET** /event/{event_key}/teams/keys | 
*EventApi* | [**getEventTeamsSimple**](docs/EventApi.md#geteventteamssimple) | **GET** /event/{event_key}/teams/simple | 
*EventApi* | [**getEventTeamsStatuses**](docs/EventApi.md#geteventteamsstatuses) | **GET** /event/{event_key}/teams/statuses | 
*EventApi* | [**getEventsByYear**](docs/EventApi.md#geteventsbyyear) | **GET** /events/{year} | 
*EventApi* | [**getEventsByYearKeys**](docs/EventApi.md#geteventsbyyearkeys) | **GET** /events/{year}/keys | 
*EventApi* | [**getEventsByYearSimple**](docs/EventApi.md#geteventsbyyearsimple) | **GET** /events/{year}/simple | 
*EventApi* | [**getTeamEventAwards**](docs/EventApi.md#getteameventawards) | **GET** /team/{team_key}/event/{event_key}/awards | 
*EventApi* | [**getTeamEventMatches**](docs/EventApi.md#getteameventmatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
*EventApi* | [**getTeamEventMatchesKeys**](docs/EventApi.md#getteameventmatcheskeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
*EventApi* | [**getTeamEventMatchesSimple**](docs/EventApi.md#getteameventmatchessimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
*EventApi* | [**getTeamEventStatus**](docs/EventApi.md#getteameventstatus) | **GET** /team/{team_key}/event/{event_key}/status | 
*EventApi* | [**getTeamEvents**](docs/EventApi.md#getteamevents) | **GET** /team/{team_key}/events | 
*EventApi* | [**getTeamEventsByYear**](docs/EventApi.md#getteameventsbyyear) | **GET** /team/{team_key}/events/{year} | 
*EventApi* | [**getTeamEventsByYearKeys**](docs/EventApi.md#getteameventsbyyearkeys) | **GET** /team/{team_key}/events/{year}/keys | 
*EventApi* | [**getTeamEventsByYearSimple**](docs/EventApi.md#getteameventsbyyearsimple) | **GET** /team/{team_key}/events/{year}/simple | 
*EventApi* | [**getTeamEventsKeys**](docs/EventApi.md#getteameventskeys) | **GET** /team/{team_key}/events/keys | 
*EventApi* | [**getTeamEventsSimple**](docs/EventApi.md#getteameventssimple) | **GET** /team/{team_key}/events/simple | 
*EventApi* | [**getTeamEventsStatusesByYear**](docs/EventApi.md#getteameventsstatusesbyyear) | **GET** /team/{team_key}/events/{year}/statuses | 
*ListApi* | [**getDistrictEvents**](docs/ListApi.md#getdistrictevents) | **GET** /district/{district_key}/events | 
*ListApi* | [**getDistrictEventsKeys**](docs/ListApi.md#getdistricteventskeys) | **GET** /district/{district_key}/events/keys | 
*ListApi* | [**getDistrictEventsSimple**](docs/ListApi.md#getdistricteventssimple) | **GET** /district/{district_key}/events/simple | 
*ListApi* | [**getDistrictRankings**](docs/ListApi.md#getdistrictrankings) | **GET** /district/{district_key}/rankings | 
*ListApi* | [**getDistrictTeams**](docs/ListApi.md#getdistrictteams) | **GET** /district/{district_key}/teams | 
*ListApi* | [**getDistrictTeamsKeys**](docs/ListApi.md#getdistrictteamskeys) | **GET** /district/{district_key}/teams/keys | 
*ListApi* | [**getDistrictTeamsSimple**](docs/ListApi.md#getdistrictteamssimple) | **GET** /district/{district_key}/teams/simple | 
*ListApi* | [**getEventTeams**](docs/ListApi.md#geteventteams) | **GET** /event/{event_key}/teams | 
*ListApi* | [**getEventTeamsKeys**](docs/ListApi.md#geteventteamskeys) | **GET** /event/{event_key}/teams/keys | 
*ListApi* | [**getEventTeamsSimple**](docs/ListApi.md#geteventteamssimple) | **GET** /event/{event_key}/teams/simple | 
*ListApi* | [**getEventTeamsStatuses**](docs/ListApi.md#geteventteamsstatuses) | **GET** /event/{event_key}/teams/statuses | 
*ListApi* | [**getEventsByYear**](docs/ListApi.md#geteventsbyyear) | **GET** /events/{year} | 
*ListApi* | [**getEventsByYearKeys**](docs/ListApi.md#geteventsbyyearkeys) | **GET** /events/{year}/keys | 
*ListApi* | [**getEventsByYearSimple**](docs/ListApi.md#geteventsbyyearsimple) | **GET** /events/{year}/simple | 
*ListApi* | [**getTeamEventsStatusesByYear**](docs/ListApi.md#getteameventsstatusesbyyear) | **GET** /team/{team_key}/events/{year}/statuses | 
*ListApi* | [**getTeams**](docs/ListApi.md#getteams) | **GET** /teams/{page_num} | 
*ListApi* | [**getTeamsByYear**](docs/ListApi.md#getteamsbyyear) | **GET** /teams/{year}/{page_num} | 
*ListApi* | [**getTeamsByYearKeys**](docs/ListApi.md#getteamsbyyearkeys) | **GET** /teams/{year}/{page_num}/keys | 
*ListApi* | [**getTeamsByYearSimple**](docs/ListApi.md#getteamsbyyearsimple) | **GET** /teams/{year}/{page_num}/simple | 
*ListApi* | [**getTeamsKeys**](docs/ListApi.md#getteamskeys) | **GET** /teams/{page_num}/keys | 
*ListApi* | [**getTeamsSimple**](docs/ListApi.md#getteamssimple) | **GET** /teams/{page_num}/simple | 
*MatchApi* | [**getEventMatchTimeseries**](docs/MatchApi.md#geteventmatchtimeseries) | **GET** /event/{event_key}/matches/timeseries | 
*MatchApi* | [**getEventMatches**](docs/MatchApi.md#geteventmatches) | **GET** /event/{event_key}/matches | 
*MatchApi* | [**getEventMatchesKeys**](docs/MatchApi.md#geteventmatcheskeys) | **GET** /event/{event_key}/matches/keys | 
*MatchApi* | [**getEventMatchesSimple**](docs/MatchApi.md#geteventmatchessimple) | **GET** /event/{event_key}/matches/simple | 
*MatchApi* | [**getMatch**](docs/MatchApi.md#getmatch) | **GET** /match/{match_key} | 
*MatchApi* | [**getMatchSimple**](docs/MatchApi.md#getmatchsimple) | **GET** /match/{match_key}/simple | 
*MatchApi* | [**getMatchTimeseries**](docs/MatchApi.md#getmatchtimeseries) | **GET** /match/{match_key}/timeseries | 
*MatchApi* | [**getTeamEventMatches**](docs/MatchApi.md#getteameventmatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
*MatchApi* | [**getTeamEventMatchesKeys**](docs/MatchApi.md#getteameventmatcheskeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
*MatchApi* | [**getTeamEventMatchesSimple**](docs/MatchApi.md#getteameventmatchessimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
*MatchApi* | [**getTeamMatchesByYear**](docs/MatchApi.md#getteammatchesbyyear) | **GET** /team/{team_key}/matches/{year} | 
*MatchApi* | [**getTeamMatchesByYearKeys**](docs/MatchApi.md#getteammatchesbyyearkeys) | **GET** /team/{team_key}/matches/{year}/keys | 
*MatchApi* | [**getTeamMatchesByYearSimple**](docs/MatchApi.md#getteammatchesbyyearsimple) | **GET** /team/{team_key}/matches/{year}/simple | 
*TBAApi* | [**getStatus**](docs/TBAApi.md#getstatus) | **GET** /status | 
*TeamApi* | [**getDistrictRankings**](docs/TeamApi.md#getdistrictrankings) | **GET** /district/{district_key}/rankings | 
*TeamApi* | [**getDistrictTeams**](docs/TeamApi.md#getdistrictteams) | **GET** /district/{district_key}/teams | 
*TeamApi* | [**getDistrictTeamsKeys**](docs/TeamApi.md#getdistrictteamskeys) | **GET** /district/{district_key}/teams/keys | 
*TeamApi* | [**getDistrictTeamsSimple**](docs/TeamApi.md#getdistrictteamssimple) | **GET** /district/{district_key}/teams/simple | 
*TeamApi* | [**getEventTeams**](docs/TeamApi.md#geteventteams) | **GET** /event/{event_key}/teams | 
*TeamApi* | [**getEventTeamsKeys**](docs/TeamApi.md#geteventteamskeys) | **GET** /event/{event_key}/teams/keys | 
*TeamApi* | [**getEventTeamsSimple**](docs/TeamApi.md#geteventteamssimple) | **GET** /event/{event_key}/teams/simple | 
*TeamApi* | [**getEventTeamsStatuses**](docs/TeamApi.md#geteventteamsstatuses) | **GET** /event/{event_key}/teams/statuses | 
*TeamApi* | [**getTeam**](docs/TeamApi.md#getteam) | **GET** /team/{team_key} | 
*TeamApi* | [**getTeamAwards**](docs/TeamApi.md#getteamawards) | **GET** /team/{team_key}/awards | 
*TeamApi* | [**getTeamAwardsByYear**](docs/TeamApi.md#getteamawardsbyyear) | **GET** /team/{team_key}/awards/{year} | 
*TeamApi* | [**getTeamDistricts**](docs/TeamApi.md#getteamdistricts) | **GET** /team/{team_key}/districts | 
*TeamApi* | [**getTeamEventAwards**](docs/TeamApi.md#getteameventawards) | **GET** /team/{team_key}/event/{event_key}/awards | 
*TeamApi* | [**getTeamEventMatches**](docs/TeamApi.md#getteameventmatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
*TeamApi* | [**getTeamEventMatchesKeys**](docs/TeamApi.md#getteameventmatcheskeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
*TeamApi* | [**getTeamEventMatchesSimple**](docs/TeamApi.md#getteameventmatchessimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
*TeamApi* | [**getTeamEventStatus**](docs/TeamApi.md#getteameventstatus) | **GET** /team/{team_key}/event/{event_key}/status | 
*TeamApi* | [**getTeamEvents**](docs/TeamApi.md#getteamevents) | **GET** /team/{team_key}/events | 
*TeamApi* | [**getTeamEventsByYear**](docs/TeamApi.md#getteameventsbyyear) | **GET** /team/{team_key}/events/{year} | 
*TeamApi* | [**getTeamEventsByYearKeys**](docs/TeamApi.md#getteameventsbyyearkeys) | **GET** /team/{team_key}/events/{year}/keys | 
*TeamApi* | [**getTeamEventsByYearSimple**](docs/TeamApi.md#getteameventsbyyearsimple) | **GET** /team/{team_key}/events/{year}/simple | 
*TeamApi* | [**getTeamEventsKeys**](docs/TeamApi.md#getteameventskeys) | **GET** /team/{team_key}/events/keys | 
*TeamApi* | [**getTeamEventsSimple**](docs/TeamApi.md#getteameventssimple) | **GET** /team/{team_key}/events/simple | 
*TeamApi* | [**getTeamEventsStatusesByYear**](docs/TeamApi.md#getteameventsstatusesbyyear) | **GET** /team/{team_key}/events/{year}/statuses | 
*TeamApi* | [**getTeamMatchesByYear**](docs/TeamApi.md#getteammatchesbyyear) | **GET** /team/{team_key}/matches/{year} | 
*TeamApi* | [**getTeamMatchesByYearKeys**](docs/TeamApi.md#getteammatchesbyyearkeys) | **GET** /team/{team_key}/matches/{year}/keys | 
*TeamApi* | [**getTeamMatchesByYearSimple**](docs/TeamApi.md#getteammatchesbyyearsimple) | **GET** /team/{team_key}/matches/{year}/simple | 
*TeamApi* | [**getTeamMediaByTag**](docs/TeamApi.md#getteammediabytag) | **GET** /team/{team_key}/media/tag/{media_tag} | 
*TeamApi* | [**getTeamMediaByTagYear**](docs/TeamApi.md#getteammediabytagyear) | **GET** /team/{team_key}/media/tag/{media_tag}/{year} | 
*TeamApi* | [**getTeamMediaByYear**](docs/TeamApi.md#getteammediabyyear) | **GET** /team/{team_key}/media/{year} | 
*TeamApi* | [**getTeamRobots**](docs/TeamApi.md#getteamrobots) | **GET** /team/{team_key}/robots | 
*TeamApi* | [**getTeamSimple**](docs/TeamApi.md#getteamsimple) | **GET** /team/{team_key}/simple | 
*TeamApi* | [**getTeamSocialMedia**](docs/TeamApi.md#getteamsocialmedia) | **GET** /team/{team_key}/social_media | 
*TeamApi* | [**getTeamYearsParticipated**](docs/TeamApi.md#getteamyearsparticipated) | **GET** /team/{team_key}/years_participated | 
*TeamApi* | [**getTeams**](docs/TeamApi.md#getteams) | **GET** /teams/{page_num} | 
*TeamApi* | [**getTeamsByYear**](docs/TeamApi.md#getteamsbyyear) | **GET** /teams/{year}/{page_num} | 
*TeamApi* | [**getTeamsByYearKeys**](docs/TeamApi.md#getteamsbyyearkeys) | **GET** /teams/{year}/{page_num}/keys | 
*TeamApi* | [**getTeamsByYearSimple**](docs/TeamApi.md#getteamsbyyearsimple) | **GET** /teams/{year}/{page_num}/simple | 
*TeamApi* | [**getTeamsKeys**](docs/TeamApi.md#getteamskeys) | **GET** /teams/{page_num}/keys | 
*TeamApi* | [**getTeamsSimple**](docs/TeamApi.md#getteamssimple) | **GET** /teams/{page_num}/simple | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [net.thefletcher.tbaapi.v3client.models.APIStatus](docs/APIStatus.md)
 - [net.thefletcher.tbaapi.v3client.models.APIStatusAppVersion](docs/APIStatusAppVersion.md)
 - [net.thefletcher.tbaapi.v3client.models.Award](docs/Award.md)
 - [net.thefletcher.tbaapi.v3client.models.AwardRecipient](docs/AwardRecipient.md)
 - [net.thefletcher.tbaapi.v3client.models.DistrictList](docs/DistrictList.md)
 - [net.thefletcher.tbaapi.v3client.models.DistrictRanking](docs/DistrictRanking.md)
 - [net.thefletcher.tbaapi.v3client.models.DistrictRankingEventPoints](docs/DistrictRankingEventPoints.md)
 - [net.thefletcher.tbaapi.v3client.models.EliminationAlliance](docs/EliminationAlliance.md)
 - [net.thefletcher.tbaapi.v3client.models.EliminationAllianceBackup](docs/EliminationAllianceBackup.md)
 - [net.thefletcher.tbaapi.v3client.models.EliminationAllianceStatus](docs/EliminationAllianceStatus.md)
 - [net.thefletcher.tbaapi.v3client.models.Event](docs/Event.md)
 - [net.thefletcher.tbaapi.v3client.models.EventDistrictPoints](docs/EventDistrictPoints.md)
 - [net.thefletcher.tbaapi.v3client.models.EventDistrictPointsPoints](docs/EventDistrictPointsPoints.md)
 - [net.thefletcher.tbaapi.v3client.models.EventDistrictPointsTiebreakers](docs/EventDistrictPointsTiebreakers.md)
 - [net.thefletcher.tbaapi.v3client.models.EventInsights](docs/EventInsights.md)
 - [net.thefletcher.tbaapi.v3client.models.EventInsights2016](docs/EventInsights2016.md)
 - [net.thefletcher.tbaapi.v3client.models.EventInsights2017](docs/EventInsights2017.md)
 - [net.thefletcher.tbaapi.v3client.models.EventInsights2018](docs/EventInsights2018.md)
 - [net.thefletcher.tbaapi.v3client.models.EventOPRs](docs/EventOPRs.md)
 - [net.thefletcher.tbaapi.v3client.models.EventRanking](docs/EventRanking.md)
 - [net.thefletcher.tbaapi.v3client.models.EventRankingExtraStatsInfo](docs/EventRankingExtraStatsInfo.md)
 - [net.thefletcher.tbaapi.v3client.models.EventRankingRankings](docs/EventRankingRankings.md)
 - [net.thefletcher.tbaapi.v3client.models.EventRankingSortOrderInfo](docs/EventRankingSortOrderInfo.md)
 - [net.thefletcher.tbaapi.v3client.models.EventSimple](docs/EventSimple.md)
 - [net.thefletcher.tbaapi.v3client.models.Match](docs/Match.md)
 - [net.thefletcher.tbaapi.v3client.models.MatchAlliance](docs/MatchAlliance.md)
 - [net.thefletcher.tbaapi.v3client.models.MatchAlliances](docs/MatchAlliances.md)
 - [net.thefletcher.tbaapi.v3client.models.MatchScoreBreakdown2015](docs/MatchScoreBreakdown2015.md)
 - [net.thefletcher.tbaapi.v3client.models.MatchScoreBreakdown2015Alliance](docs/MatchScoreBreakdown2015Alliance.md)
 - [net.thefletcher.tbaapi.v3client.models.MatchScoreBreakdown2016](docs/MatchScoreBreakdown2016.md)
 - [net.thefletcher.tbaapi.v3client.models.MatchScoreBreakdown2016Alliance](docs/MatchScoreBreakdown2016Alliance.md)
 - [net.thefletcher.tbaapi.v3client.models.MatchScoreBreakdown2017](docs/MatchScoreBreakdown2017.md)
 - [net.thefletcher.tbaapi.v3client.models.MatchScoreBreakdown2017Alliance](docs/MatchScoreBreakdown2017Alliance.md)
 - [net.thefletcher.tbaapi.v3client.models.MatchScoreBreakdown2018](docs/MatchScoreBreakdown2018.md)
 - [net.thefletcher.tbaapi.v3client.models.MatchScoreBreakdown2018Alliance](docs/MatchScoreBreakdown2018Alliance.md)
 - [net.thefletcher.tbaapi.v3client.models.MatchScoreBreakdown2019](docs/MatchScoreBreakdown2019.md)
 - [net.thefletcher.tbaapi.v3client.models.MatchScoreBreakdown2019Alliance](docs/MatchScoreBreakdown2019Alliance.md)
 - [net.thefletcher.tbaapi.v3client.models.MatchSimple](docs/MatchSimple.md)
 - [net.thefletcher.tbaapi.v3client.models.MatchTimeseries2018](docs/MatchTimeseries2018.md)
 - [net.thefletcher.tbaapi.v3client.models.MatchVideos](docs/MatchVideos.md)
 - [net.thefletcher.tbaapi.v3client.models.Media](docs/Media.md)
 - [net.thefletcher.tbaapi.v3client.models.Team](docs/Team.md)
 - [net.thefletcher.tbaapi.v3client.models.TeamEventStatus](docs/TeamEventStatus.md)
 - [net.thefletcher.tbaapi.v3client.models.TeamEventStatusAlliance](docs/TeamEventStatusAlliance.md)
 - [net.thefletcher.tbaapi.v3client.models.TeamEventStatusAllianceBackup](docs/TeamEventStatusAllianceBackup.md)
 - [net.thefletcher.tbaapi.v3client.models.TeamEventStatusPlayoff](docs/TeamEventStatusPlayoff.md)
 - [net.thefletcher.tbaapi.v3client.models.TeamEventStatusRank](docs/TeamEventStatusRank.md)
 - [net.thefletcher.tbaapi.v3client.models.TeamEventStatusRankRanking](docs/TeamEventStatusRankRanking.md)
 - [net.thefletcher.tbaapi.v3client.models.TeamEventStatusRankSortOrderInfo](docs/TeamEventStatusRankSortOrderInfo.md)
 - [net.thefletcher.tbaapi.v3client.models.TeamRobot](docs/TeamRobot.md)
 - [net.thefletcher.tbaapi.v3client.models.TeamSimple](docs/TeamSimple.md)
 - [net.thefletcher.tbaapi.v3client.models.WLTRecord](docs/WLTRecord.md)
 - [net.thefletcher.tbaapi.v3client.models.Webcast](docs/Webcast.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="apiKey"></a>
### apiKey

- **Type**: API key
- **API key parameter name**: X-TBA-Auth-Key
- **Location**: HTTP header

