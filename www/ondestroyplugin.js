module.exports = function () {
 exports.setEventListener = exports.setDestroyEventListener = function (callback) {
  cordova.exec (callback, undefined, "OnDestroyPlugin", "setEventListener", [])
 }
 exports.setOnPauseEventListener = function (callback) {
  cordova.exec (callback, undefined, "OnPausePlugin", "setEventListener", [])
 }
 return exports
} ()
