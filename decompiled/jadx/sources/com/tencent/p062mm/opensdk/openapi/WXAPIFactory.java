package com.tencent.p062mm.opensdk.openapi;

import android.content.Context;
import com.tencent.p062mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes.dex */
public class WXAPIFactory {
    public static final String TAG = "MicroMsg.PaySdk.WXFactory";

    public WXAPIFactory() {
        throw new RuntimeException(getClass().getSimpleName().concat(" should not be instantiated"));
    }

    public static IWXAPI createWXAPI(Context context, String str) {
        return createWXAPI(context, str, true);
    }

    public static IWXAPI createWXAPI(Context context, String str, boolean z) {
        Log.m2020d(TAG, "createWXAPI, appId = " + str + ", checkSignature = " + z);
        return createWXAPI(context, str, z, 2);
    }

    public static IWXAPI createWXAPI(Context context, String str, boolean z, int i) {
        Log.m2020d(TAG, "createWXAPI, appId = " + str + ", checkSignature = " + z + ", launchMode = " + i);
        return new WXApiImplV10(context, str, z, i);
    }
}
