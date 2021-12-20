# exam-election-backend
24 hour exam project at KEA, 3rd semester Computer Science AP degree.
Backend rest api for an election software at a single municipality in Denmark.

2021/12/20

Hosted on heroku at https://electionx-backend.herokuapp.com/

## Rest API endpoints:

**GET /candidates**
**//**
Returns a list with all candidates

**GET /candidates/party/{id}**
**//**
Returns a list of all candidates for a given party
{id} represents the party's id in the database

**POST /candidates**
**//**
Create a candidate for a given party. 
Body has to be provided as JSON with parameters:
"name" (string), "surname" (string), "party" (id of the party as an integer)

**PUT /candidates**
**//**
Update a candidate.
Body has to be provided as JSON with parameters:
"id" (id of the candidate as an integer), "name" (string), "surname" (string), "party" (id of the party as an integer)

**DELETE /candidates/{id}**
**//**
Deletes a candidate
{id} represents the party's id in the database

**GET /parties**
**//**
Returns a list of parties

##
Link to frontend: https://github.com/rudasrudas/exam-election-frontend
##
Created by Justas Zdanavicius (just1531@stud.kea.dk), 20/12/2021
