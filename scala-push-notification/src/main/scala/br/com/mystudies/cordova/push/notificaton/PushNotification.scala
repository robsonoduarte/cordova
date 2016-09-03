package br.com.mystudies.cordova.push.notificaton

import scalaj.http.Http

object PushNotification extends App {

  var json = """{"app_id": "b5e7a9a4-35f2-4abc-a5c8-5c8125c386f0","included_segments": ["All"],"data": {"foo": "bar"},"contents": {"en": "English Message"}}"""

  val response = Http("https://onesignal.com/api/v1/notifications")
    .postData(json)
    .header("content-type", "application/json; charset=UTF-8")
    .header("Authorization", "Basic ZTBmOWIxNDYtNmNlZi00YTE4LWFkZDEtYzFlNGM5YWMwZmNh")
    .asString

  println(response.code)
  println(response.body)


}



