module.exports = function () {
 exports.setEventListener = function (callback) {
  cordova.exec (callback, undefined, "OnDestroy", "setEventListener", [])
 }
 return exports
} ()