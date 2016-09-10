Push Notification using Scala
---------------------------------
In this simple example the [OneSignal](https://onesignal.com/) was used as the platform push notification delivery.
[Here](https://github.com/robsonoduarte/learn-cordova/tree/master/push-notification) is the hybrid mobile App developed with [Apache Cordova](http://cordova.apache.org/) to test the messages received.
For more information how you can use the OneSignal API watch [this video](https://www.youtube.com/watch?v=_jexwbrSFpY&feature=youtu.be).



> The [scalaj-http](https://github.com/scalaj/scalaj-http) was used to Post the message in OneSignal API.

###**Run the example**

**1** Get your App Settings in OneSignal:
![capturar](https://cloud.githubusercontent.com/assets/797845/18406151/be6ae446-76cf-11e6-95d2-bcf8f10eeba0.PNG)

**2** Clone the Project:
```
git clone https://github.com/robsonoduarte/learn-cordova.git
```

**3** Change the values in Scala program:

![capturar](https://cloud.githubusercontent.com/assets/797845/18406358/296196da-76d2-11e6-8835-6444ed0356e4.PNG)


**4** In the terminal:
```
cd learn-cordova/scala-push-notification/
sbt
run
```









