package com.alipay.android.phone.mrpc.core;

import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class f implements ConnectionKeepAliveStrategy {
    public final /* synthetic */ d a;

    public f(d dVar) {
        this.a = dVar;
    }

    @Override // org.apache.http.conn.ConnectionKeepAliveStrategy
    public long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
        return 180000L;
    }
}
