package com.flyingsoftgames.ondestroyplugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

public class OnDestroyPlugin extends CordovaPlugin {
 
 private CallbackContext onPauseCallback = null;
 private final String LOG_TAG = "onPausePlugin";
 
 public boolean execute (String action, JSONArray inputs, CallbackContext callbackContext) throws JSONException {
  onPauseCallback = callbackContext;
  return true;
 }
 
 @Override public void onPause () {
  if (onPauseCallback != null) onPauseCallback.sendPluginResult (pluginResultKeep());
  super.onPause ();
 };
 
 private PluginResult pluginResultKeep () {
  PluginResult pluginResult = new PluginResult (PluginResult.Status.OK);
  pluginResult.setKeepCallback (true);
  return pluginResult;
 }
}
