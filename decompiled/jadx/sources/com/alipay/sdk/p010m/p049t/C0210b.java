package com.alipay.sdk.p010m.p049t;

import android.text.TextUtils;
import com.alipay.sdk.p010m.p058y.C0244g;
import org.json.JSONObject;
import p067l.C21459;

/* JADX INFO: renamed from: com.alipay.sdk.m.t.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C0210b {

    /* JADX INFO: renamed from: a */
    public final String f973a;

    /* JADX INFO: renamed from: b */
    public final String f974b;

    public C0210b(String str, String str2) {
        this.f973a = str;
        this.f974b = str2;
    }

    /* JADX INFO: renamed from: a */
    public String m1020a() {
        return this.f974b;
    }

    /* JADX INFO: renamed from: b */
    public String m1021b() {
        return this.f973a;
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m1022c() {
        if (TextUtils.isEmpty(this.f974b)) {
            return null;
        }
        try {
            return new JSONObject(this.f974b);
        } catch (Exception e) {
            C0244g.m1199a(e);
            return null;
        }
    }

    public String toString() {
        return C21459.m48622("<Letter envelop=", this.f973a, " body=", this.f974b, ">");
    }
}
