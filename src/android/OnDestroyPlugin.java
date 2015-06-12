package com.flyingsoftgames.ondestroyplugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

public class OnDestroyPlugin extends CordovaPlugin {
 
 private CallbackContext onDestroyCallback = null;
 private final String LOG_TAG = "onDestroyPlugin";
 
 public boolean execute (String action, JSONArray inputs, CallbackContext callbackContext) throws JSONException {
  onDestroyCallback = callbackContext;
  return true;
 }
 
 @Override public void onDestroy () {
  if (onDestroyCallback != null) onDestroyCallback.sendPluginResult (pluginResultKeep());
  super.onDestroy ();
 };
 
 private PluginResult pluginResultKeep () {
  PluginResult pluginResult = new PluginResult (PluginResult.Status.OK);
  pluginResult.setKeepCallback (true);
  return pluginResult;
 }
}