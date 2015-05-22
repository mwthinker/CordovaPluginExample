package se.mwthinker.plugin.example;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.util.Log;

public class CordovaPluginExample extends CordovaPlugin {
    public static final String TAG = CordovaPluginExample.class.getSimpleName();
    
    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        Log.v(TAG," Init plugin");
    }

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
        // For debug purpose.
        Log.v(TAG, "Plugin received:" + action);
        
        // Excecute the function "alertMessage"?
        if (action.equals("alertMessage")) {
            // Ignore parameters.
            String message = "This is a cordova plugin example!";
            callbackContext.success(message);
            return true;
        } else {
            return false;
        }
    }
}
