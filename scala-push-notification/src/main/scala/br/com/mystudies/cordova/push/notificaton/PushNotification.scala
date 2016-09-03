package br.com.mystudies.cordova.push.notificaton

import scalaj.http.Http

object PushNotification extends App {

  val json = """{"app_id": "your_id","included_segments": ["All"],"data": {"foo": "bar"},"contents": {"en": "English Message"}}"""

  val response = Http("https://onesignal.com/api/v1/notifications")
    .postData(json)
    .header("content-type", "application/json; charset=UTF-8")
    .header("Authorization", "Basic your_key")
    .asString


  println(response.body)

}



