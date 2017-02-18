onDestroy
========================

Sets an event listener that runs when the Cordova Activity is "destroyed". Note that this event does not always run before a program is removed from memory (see below link and image).

http://stackoverflow.com/questions/18361719/android-activity-ondestroy-is-not-always-called-and-if-called-only-part-of-the/18361887#18361887

![activity_lifecycle](https://developer.android.com/images/activity_lifecycle.png)

Usage / Function List
----------------------

````
window.plugins.OnDestroyPlugin.setEventListener (function)
````
