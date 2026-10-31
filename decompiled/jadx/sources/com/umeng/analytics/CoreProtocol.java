package com.umeng.analytics;

import android.content.Context;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMSenderStateNotify;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CoreProtocol implements UMLogDataProtocol, UMSenderStateNotify {
    public static Context a;

    public CoreProtocol() {
    }

    public class a {
        public static final CoreProtocol a = new CoreProtocol();
    }

    public static CoreProtocol getInstance(Context context) {
        if (a == null && context != null) {
            a = context.getApplicationContext();
        }
        return a.a;
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i) {
        o.a(a).a(obj, i);
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
        o.a(a).a(obj);
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j) {
        return o.a(a).a(j);
    }

    @Override // com.umeng.commonsdk.framework.UMSenderStateNotify
    public void onConnectionAvailable() {
        o.a(a).a();
    }

    @Override // com.umeng.commonsdk.framework.UMSenderStateNotify
    public void onSenderIdle() {
        o.a(a).b();
    }
}
