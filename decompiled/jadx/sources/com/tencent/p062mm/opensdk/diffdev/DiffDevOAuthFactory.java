package com.tencent.p062mm.opensdk.diffdev;

import com.tencent.p062mm.opensdk.diffdev.p064a.C0607a;
import com.tencent.p062mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes.dex */
public class DiffDevOAuthFactory {
    public static final int MAX_SUPPORTED_VERSION = 1;
    public static final String TAG = "MicroMsg.SDK.DiffDevOAuthFactory";
    public static final int VERSION_1 = 1;
    public static IDiffDevOAuth v1Instance;

    public static IDiffDevOAuth getDiffDevOAuth() {
        return getDiffDevOAuth(1);
    }

    public static IDiffDevOAuth getDiffDevOAuth(int i) {
        Log.m2023v(TAG, "getDiffDevOAuth, version = ".concat(String.valueOf(i)));
        if (i > 1) {
            Log.m2021e(TAG, "getDiffDevOAuth fail, unsupported version = ".concat(String.valueOf(i)));
            return null;
        }
        if (i != 1) {
            return null;
        }
        if (v1Instance == null) {
            v1Instance = new C0607a();
        }
        return v1Instance;
    }
}
