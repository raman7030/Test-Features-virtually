package com.umeng.analytics;

import android.content.Context;
import com.umeng.analytics.pro.C0719o;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMSenderStateNotify;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CoreProtocol implements UMLogDataProtocol, UMSenderStateNotify {

    /* JADX INFO: renamed from: a */
    public static Context f2152a;

    public CoreProtocol() {
    }

    /* JADX INFO: renamed from: com.umeng.analytics.CoreProtocol$a */
    public class C0630a {

        /* JADX INFO: renamed from: a */
        public static final CoreProtocol f2153a = new CoreProtocol();
    }

    public static CoreProtocol getInstance(Context context) {
        if (f2152a == null && context != null) {
            f2152a = context.getApplicationContext();
        }
        return C0630a.f2153a;
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i) {
        C0719o.m2548a(f2152a).m2583a(obj, i);
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
        C0719o.m2548a(f2152a).m2582a(obj);
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j) {
        return C0719o.m2548a(f2152a).m2580a(j);
    }

    @Override // com.umeng.commonsdk.framework.UMSenderStateNotify
    public void onConnectionAvailable() {
        C0719o.m2548a(f2152a).m2581a();
    }

    @Override // com.umeng.commonsdk.framework.UMSenderStateNotify
    public void onSenderIdle() {
        C0719o.m2548a(f2152a).m2588b();
    }
}
