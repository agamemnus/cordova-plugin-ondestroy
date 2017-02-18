module.exports = function () {
 exports.setEventListener = exports.setDestroyEventListener = function (callback) {
  cordova.exec (callback, undefined, "OnDestroyPlugin", "setEventListener", [])
 }
 exports.addOnPauseEventListener = function (callback) {
  document.addEventListener("pause", callback, false)
 }
 return exports
} ()
