var exec = require('cordova/exec');

module.exports = {
    alertMessage: function (name) {
        exec(function (message) { // The callback function is called if the call succeeds.
            alert(message);
        }, function (error) { // The callback function is called if the call fails.
            alert("Plugin failed" + error);
        },
        "CordovaPluginExample", // E.g. the java class to call.
        "alertMessage", // E.g. the name of the javascript
        // function which was called to comunicate with the java class.
        [name]); // The array of arguments.
    }
};
