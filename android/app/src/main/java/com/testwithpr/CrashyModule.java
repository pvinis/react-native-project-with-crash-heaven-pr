package com.testwithpr;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class CrashyModule extends ReactContextBaseJavaModule {
    public CrashyModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "Crashy";
    }

    @ReactMethod
    public void doIt() throws Exception {
        throw new Exception("Yey");
    }
}
