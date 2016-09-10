package br.com.mystudies.cordova.push.notificaton

import scalaj.http.Http

object PushNotification extends App {

  val app_id = "" // <-- OneSignal App ID
  val api_key = "" // <-- REST API Key

  val json = s"""{"app_id": "$app_id","included_segments": ["All"],"data": {"foo": "bar"},"contents": {"en": "English Message"}}"""

  val resp = Http("https://onesignal.com/api/v1/notifications")
    .postData(json)
    .header("content-type", "application/json; charset=UTF-8")
    .header("Authorization", s"Basic $api_key")
    .asString

  println(resp.body)

}



