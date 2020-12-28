# Tweeter Analytics

- Tweet Analystics web Sockets application using play framework with sbt build. 

Play Application: Reactive TweetAnalytics". Your goal is to modify your Play application from static applicationn to 
make it reactive, i.e., stream live updates to the user interface. Thus, instead of having a static
list of Tweets for a search keyword, your application will now dynamically show any new incoming tweets.
You only have to make the search page reactive; the prole page can stay static (but you are free to make it
reactive as well).
You must implement this reactive behavior as an asynchronous server push solution, using WebSockets and
Akka Actors.1 You can base your implementation on the Play `Reactive Stocks' example application shown
in the lecture (note: you can, but do not have to, use Akka Streams in your solution).


## Pre-requisites
1) JDK 11 (Recommended) or JDK 8
2) SBT Tool ( Download it from :  https://www.scala-sbt.org/download.html)
3) Latest version of Eclipse EE supporting installed jdk. (Not required for running the project)
4) Twitter api credentials ( Apply from : https://developer.twitter.com)

## Steps to configure project in eclipse.
1) Clone the repository from git uri.
2) Open the checked out project in CMD.
3) Run the command : "sbt compile" (without quotes) in cmd
4) Run the command : "sbt eclipse" (without quotes) in cmd
5) Open the project in eclipse

## Steps to configure Twitter4J
1) Open the file named "twitter4j.properties" from the "conf" folder
2) Replace the **** with respective credentials and save the file

## Run the project in debug mode with eclipse
To debug, start your application with "sbt -jvm-debug 9999 run" and in Eclipse right-click on the project and select Debug As, Debug Configurations. In the Debug Configurations dialog, right-click on Remote Java Application and select New. Change Port to 9999 and click Apply. From now on you can click on Debug to connect to the running application. Stopping the debugging session will not stop the server.
