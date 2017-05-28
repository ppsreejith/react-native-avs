
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.util.Map;
import java.util.HashMap;
import com.willblaschko.android.alexa.AlexaManager;
import com.willblaschko.android.alexa.callbacks.AsyncCallback;
import com.facebook.react.bridge.Promise;

public class RNAvsModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  private AlexaManager alexaManager;
  private static final String AUTH_ERROR = "AUTH_ERROR";
  private static final String PRODUCT_ID = "react_native_avs";

  public RNAvsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
    alexaManager = AlexaManager.getInstance(reactContext, PRODUCT_ID);
  }

    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();
        constants.put("SOME_VALUE", 5);
        return constants;
    }

    @ReactMethod
    public void checkLoggedIn(final Promise promise) {
        alexaManager.checkLoggedIn(new AsyncCallback<Boolean, Throwable>() {
                private Boolean _finishedExecuting = false;
                
                @Override
                public void start() {
                }
                @Override
                public void success(Boolean result) {
                    if (!this._finishedExecuting) {
                        promise.resolve(result);
                        this._finishedExecuting = true;
                    }
                }

                @Override
                public void failure(Throwable error) {
                    if (!this._finishedExecuting) {
                        promise.reject(AUTH_ERROR, error);
                        this._finishedExecuting = true;
                    }
                }

                @Override
                public void complete() {

                }
            });
    }

  @Override
  public String getName() {
    return "RNAvs";
  }
}
