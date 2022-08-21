# Hyderabad Bus Details
Web application to find direct/connected top frequency buses between given source and destination locations based on sorted (least to highest) waiting time.
It uses A* algo : which is best known form of Best First Search and it avoids expanding paths which are already expensive.
f(n) = g(n)+h(n)
g - cost for travelling from source to destination, in terms of time.
h - heuristic value eculidien distance. (lattitude and logtitude coordinates). 
DB1 stores: Station Location<lattitude,logtitude>
DB2 stores: BusNo Source Destination AvgTime (Entered manually)
Techonologies used: Java, SQL, JSP
Platforms used: NetBeans, Windows
Database used: MySQL
