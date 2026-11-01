package com.alipay.android.phone.mrpc.core;

import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.f */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0020f implements ConnectionKeepAliveStrategy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0018d f103a;

    public C0020f(C0018d c0018d) {
        this.f103a = c0018d;
    }

    @Override // org.apache.http.conn.ConnectionKeepAliveStrategy
    public long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
        return 180000L;
    }
}
