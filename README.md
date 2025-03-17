REST API that allows control of the probe from the surface using a set of interpreted controls.

Design a grid 6 ^6


1,2,3,4,5,6
1,2,3,4,5,6
1,2,3,4,5,6
1,2,3,4,5,6
1,2,3,4,5,6
1,2,3,4,5,6

Actions - Forward, Backward, Left, Right, Stay
APIs:
GET :  http://localhost:8080/ship/moveShip?action=Forward

GET: http://localhost:8080/ship/getCurrentCordinates


Current

current 3,2

1. move forward

Check cordinates(x) == facingdirection(x)
#Initial cordinates -  3,2
#facingDirections -> 3,3
if yes
if facingdirection(y) > cordinates(y)
if(facingdirection(y) == facingDirections(x).length +1)
{
throw exception already reached the grid
}
cordinates(x) = cordinates(x) //No change
cordinates(y) = cordinates(y) +1 //increment 1
facingdirection(x) = facingdirection(x) // No change
facingdirection(y) = facingdirection(y) + 1 // increment 1
if facingdirection(y) < cordinates(y)
if(facingdirection(y) == facingDirections(x).(0))
{
throw exception already reached the grid
}
cordinates(x) = cordinates(x) //No change
cordinates(y) = cordinates(y) -1 //decrement 1
facingdirection(x) = facingdirection(x) // No change
facingdirection(y) = facingdirection(y) - 1 // decrement 1
if no
#Initial cordinates -  3,2
#facingDirections -> 4,2
if facingdirection(x) > cordinates(x)
cordinates(x) = cordinates(x)+1 //increment 1
cordinates(y) = cordinates(y) //No change
facingdirection(x) = facingdirection(x) + 1 // increment 1
facingdirection(y) = facingdirection(y)  // No change
if facingdirection(x) < cordinates(x)
cordinates(x) = cordinates(x) -1 //decrement 1
cordinates(y) = cordinates(y)
facingdirection(x) = facingdirection(x) -1 // No change
facingdirection(y) = facingdirection(y) // decrement 1



2. move Backward

Check cordinates(x) == facingdirection(x)
#Initial cordinates -  3,2
#facingDirections -> 3,3
if yes
if facingdirection(y) > cordinates(y)
cordinates(x) = cordinates(x) //No change
cordinates(y) = cordinates(y) - 1 //decrement 1
facingdirection(x) = facingdirection(x) // No change
facingdirection(y) = facingdirection(y) -1 1 // decrement 1
if facingdirection(y) < cordinates(y)
cordinates(x) = cordinates(x) //No change
cordinates(y) = cordinates(y) + 1 //increment 1
facingdirection(x) = facingdirection(x) // No change
facingdirection(y) = facingdirection(y) + 1 // increment 1
if no
#Initial cordinates -  3,2
#facingDirections -> 4,2
if facingdirection(x) > cordinates(x)
cordinates(x) = cordinates(x) - 1  //decrement 1
cordinates(y) = cordinates(y) //No change
facingdirection(x) = facingdirection(x) - 1 // decrement 1
facingdirection(y) = facingdirection(y)  // No change
if facingdirection(x) < cordinates(x)
cordinates(x) = cordinates(x) + 1 //increment 1
cordinates(y) = cordinates(y)
facingdirection(x) = facingdirection(x)  + 1 //increment 1
facingdirection(y) = facingdirection(y) // No change



1,2,3,4,5,6
1,2,3,4,5,6
1,2,3,4,5,6
1,2,3,4,5,6
1,2,3,4,5,6
1,2,3,4,5,6

3. move Right
   //Not on the same grid line
   Check cordinates(x) != facingdirection(x)
   #Initial cordinates ->  3,3
   #facingDirections -> 4,3
   if yes
   if facingdirection(x) > cordinates(x)
   cordinates(x) = cordinates(x) //No change
   cordinates(y) = cordinates(y) - 1 //decrement 1
   facingdirection(x) = facingdirection(x) // No change
   facingdirection(y) = facingdirection(y) -1 1 // decrement 1
   if facingdirection(x) < cordinates(x)
   cordinates(x) = cordinates(x) //No change
   cordinates(y) = cordinates(y) + 1 //increment 1
   facingdirection(x) = facingdirection(x) // No change
   facingdirection(y) = facingdirection(y) + 1 // increment 1
   if no
   #Initial cordinates -  3,2
   #facingDirections -> 4,2
   if facingdirection(y) > cordinates(y)
   cordinates(x) = cordinates(x) + 1  //increment 1
   cordinates(y) = cordinates(y) //No change
   facingdirection(x) = facingdirection(x) +1 // increment 1
   facingdirection(y) = facingdirection(y)  // No change
   if facingdirection(y) < cordinates(y)
   cordinates(x) = cordinates(x) - 1 //decrement 1
   cordinates(y) = cordinates(y)
   facingdirection(x) = facingdirection(x)  - 1 //decrement 1
   facingdirection(y) = facingdirection(y) // No change


3. move Left
   //Not on the same grid line
   Check cordinates(x) != facingdirection(x)
   #Initial cordinates ->  3,3
   #facingDirections -> 4,3
   if yes
   if facingdirection(x) > cordinates(x)
   cordinates(x) = cordinates(x) //No change
   cordinates(y) = cordinates(y) + 1 //increment 1
   facingdirection(x) = facingdirection(x) // No change
   facingdirection(y) = facingdirection(y) +1  // increment 1
   if facingdirection(x) < cordinates(x)
   cordinates(x) = cordinates(x) //No change
   cordinates(y) = cordinates(y) - 1 //decrement 1
   facingdirection(x) = facingdirection(x) // No change
   facingdirection(y) = facingdirection(y) - 1 // decrement 1
   if no
   #Initial cordinates -  3,2
   #facingDirections -> 4,2
   if facingdirection(y) > cordinates(y)
   cordinates(x) = cordinates(x) - 1  //decrement 1
   cordinates(y) = cordinates(y) //No change
   facingdirection(x) = facingdirection(x) - 1 // decrement 1
   facingdirection(y) = facingdirection(y)  // No change
   if facingdirection(y) < cordinates(y)
   cordinates(x) = cordinates(x) +1 1 //increment 1
   cordinates(y) = cordinates(y)
   facingdirection(x) = facingdirection(x)  + 1 //increment 1
   facingdirection(y) = facingdirection(y) // No change




