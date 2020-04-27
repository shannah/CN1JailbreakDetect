(function(exports){

var o = {};

    o.isJailbroken_ = function(callback) {
        callback.error(new Error("Not implemented yet"));
    };

    o.isSupported_ = function(callback) {
        callback.complete(false);
    };

exports.com_codename1_ext_jailbreak_JailbreakDetectNative= o;

})(cn1_get_native_interfaces());
