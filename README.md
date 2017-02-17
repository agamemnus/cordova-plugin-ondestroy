onDestroy (and onPause)
========================

Sets an event listener that runs when the Cordova Activity stops (is destroyed).

Note that this event does not always run. It is safer to use onPause -- this plugin includes onPause as well.

See the following link and image:
http://stackoverflow.com/questions/18361719/android-activity-ondestroy-is-not-always-called-and-if-called-only-part-of-the/18361887#18361887

![activity_lifecycle](https://developer.android.com/images/activity_lifecycle.png)

Usage / Function List
----------------------

OnPausePlugin: set the event listener for onPause Android events.
````
window.plugins.OnPausePlugin.setEventListener (function)
````

OnDestroyPlugin: set the event listener for onDestroy Android events.
````
window.plugins.OnDestroyPlugin.setEventListener (function)
````

