package com.umeng.commonsdk.service;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: loaded from: classes.dex */
public class UMGlobalContext {
    public static final String TAG = "UMGlobalContext";
    public String mAppVersion;
    public String mAppkey;
    public Context mApplicationContext;
    public String mChannel;
    public String mProcessName;

    public UMGlobalContext() {
        this.mProcessName = "";
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.service.UMGlobalContext$a */
    public class C0788a {

        /* JADX INFO: renamed from: a */
        public static final UMGlobalContext f3305a = new UMGlobalContext();
    }

    public static UMGlobalContext getInstance(Context context) {
        if (C0788a.f3305a.mApplicationContext == null && context != null) {
            C0788a.f3305a.mApplicationContext = context;
        }
        return C0788a.f3305a;
    }

    public static Context getAppContext(Context context) {
        if (C0788a.f3305a.mApplicationContext == null && context != null) {
            C0788a.f3305a.mApplicationContext = context.getApplicationContext();
        }
        return C0788a.f3305a.mApplicationContext;
    }

    public static Context getAppContext() {
        return C0788a.f3305a.mApplicationContext;
    }

    public String getAppkey() {
        if (TextUtils.isEmpty(this.mAppkey)) {
            this.mAppkey = UMConfigure.sAppkey;
        }
        return this.mAppkey;
    }

    public String getChannel() {
        if (TextUtils.isEmpty(this.mChannel)) {
            this.mChannel = UMConfigure.sChannel;
        }
        return this.mChannel;
    }

    public String getProcessName(Context context) {
        if (TextUtils.isEmpty(this.mProcessName)) {
            if (context != null) {
                Context context2 = C0788a.f3305a.mApplicationContext;
                if (context2 != null) {
                    this.mProcessName = UMFrUtils.getCurrentProcessName(context2);
                } else {
                    this.mProcessName = UMFrUtils.getCurrentProcessName(context);
                }
            } else {
                this.mProcessName = UMFrUtils.getCurrentProcessName(C0788a.f3305a.mApplicationContext);
            }
        }
        return this.mProcessName;
    }

    public String getAppVersion() {
        if (TextUtils.isEmpty(this.mAppVersion)) {
            this.mAppVersion = UMUtils.getAppVersionName(this.mApplicationContext);
        }
        return this.mAppVersion;
    }

    public boolean isMainProcess(Context context) {
        return UMUtils.isMainProgress(context);
    }

    public String toString() {
        if (C0788a.f3305a.mApplicationContext == null) {
            return "uninitialized.";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append("appkey:" + this.mAppkey + ",");
        sb.append("channel:" + this.mChannel + ",");
        sb.append("procName:" + this.mProcessName + "]");
        return sb.toString();
    }
}
