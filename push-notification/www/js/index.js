
var app = {
    // Application Constructor
    initialize: function() {
        this.bindEvents();
    },
    // Bind Event Listeners
    //
    // Bind any events that are required on startup. Common events are:
    // 'load', 'deviceready', 'offline', and 'online'.
    bindEvents: function() {
        document.addEventListener('deviceready', this.onDeviceReady, false);
    },
    // deviceready Event Handler
    //
    // The scope of 'this' is the event. In order to call the 'receivedEvent'
    // function, we must explicitly call 'app.receivedEvent(...);'
    onDeviceReady: function() {
        app.receivedEvent('deviceready');
    },
    // Update DOM on a Received Event
    receivedEvent: function(id) {
        var parentElement = document.getElementById(id);
        var listeningElement = parentElement.querySelector('.listening');
        var receivedElement = parentElement.querySelector('.received');

        listeningElement.setAttribute('style', 'display:none;');
        receivedElement.setAttribute('style', 'display:block;');

        console.log('Received Event: ' + id);
    },


    push : function () {
        document.addEventListener('deviceready', function () {
      	  // Enable to debug issues.
      	  // window.plugins.OneSignal.setLogLevel({logLevel: 4, visualLevel: 4});

      	  var notificationOpenedCallback = function(jsonData) {
      	    alert("ok quissassa !");
      	  };

      	  window.plugins.OneSignal.init("b5e7a9a4-35f2-4abc-a5c8-5c8125c386f0",
      	                                 {googleProjectNumber: "632548614043 "},
      	                                 notificationOpenedCallback);

      	  // Show an alert box if a notification comes in when the user is in your app.
      	  window.plugins.OneSignal.enableInAppAlertNotification(true);


      	}, false);
	}




};

app.initialize();
app.push();
