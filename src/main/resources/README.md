# Project Execution Steps

## Step 1: Requirement Analysis
- For moving on the sea bed, we need to have the fixed grid in which the probe should move
- In the request, we will take 
	- Grid Data ( Grid Coordinates in which the probe should move and Obstacles present in which coordinates)
	- Position of the probe from where it needs to start
	- Command to the probe to execute (L - Left turn, R- Right turn, F - Move Front, B - Move Back)

## Step 2: Design
- Design Direction test class to check the probe's direction (It can either turn Right or turn Left)
- Design Movement test class to check the probe's movement (It can either move Front or Back)
- Design Validation class to check the probe's reached any obstacle or it is going beyond the grid.

## Step 3: Implementation
- Create a controller to take the request object and pass it to Service to Integrate Direction - Position - Validation methods.
- Return the response object having the finalPosition , isObstacleFound , visited nodes


## API Details:

http://localhost:8082/api/probe/execute

Success Scenario:
##------------
Request:
##------------
{
    "grid":{
        "width":5,
        "height":5,
        "obstacles":[{ "x": 2, "y": 2 },{ "x": 4, "y": 3 }]
    },
    "start":{
        "x":0,
        "y":0
    },
    "command":"RFFFFFLFFFFF"
}
##------------
Response:
##------------
{
    "finalPosition": {
        "x": 5,
        "y": 5
    },
    "visited": [
        {
            "x": 1,
            "y": 0
        },
        {
            "x": 2,
            "y": 0
        },
        {
            "x": 3,
            "y": 0
        },
        {
            "x": 4,
            "y": 0
        },
        {
            "x": 5,
            "y": 0
        },
        {
            "x": 5,
            "y": 1
        },
        {
            "x": 5,
            "y": 2
        },
        {
            "x": 5,
            "y": 3
        },
        {
            "x": 5,
            "y": 4
        },
        {
            "x": 5,
            "y": 5
        },
        {
            "x": 0,
            "y": 1
        },
        {
            "x": 1,
            "y": 1
        },
        {
            "x": 2,
            "y": 1
        },
        {
            "x": 1,
            "y": 0
        },
        {
            "x": 2,
            "y": 0
        },
        {
            "x": 3,
            "y": 0
        },
        {
            "x": 4,
            "y": 0
        },
        {
            "x": 5,
            "y": 0
        },
        {
            "x": 5,
            "y": 1
        },
        {
            "x": 5,
            "y": 2
        },
        {
            "x": 5,
            "y": 3
        },
        {
            "x": 5,
            "y": 4
        },
        {
            "x": 5,
            "y": 5
        }
    ],
    "obstacleHit": false
}


Obstacle Scenario: 
##------------
Request:
##------------
{
    "grid":{
        "width":5,
        "height":5,
        "obstacles":[{ "x": 2, "y": 2 },{ "x": 4, "y": 3 }]
    },
    "start":{
        "x":0,
        "y":0
    },
    "command":"FRFFLF"
}

##------------
Response:
##------------
{
    "errorId": "Err-1",
    "errorDesc": "Grid Validation Failed - Either Obstacle / Out of Grid Exception",
    "severity": "4"
}
