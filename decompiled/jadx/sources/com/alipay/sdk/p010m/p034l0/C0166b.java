package com.alipay.sdk.p010m.p034l0;

import android.content.Context;
import com.alipay.sdk.p010m.p028i0.C0148d;
import com.alipay.sdk.p010m.p028i0.InterfaceC0145a;
import com.alipay.sdk.p010m.p032k0.C0158b;
import com.alipay.sdk.p010m.p032k0.C0159c;
import com.alipay.sdk.p010m.p032k0.C0160d;

/* JADX INFO: renamed from: com.alipay.sdk.m.l0.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0166b implements InterfaceC0165a {

    /* JADX INFO: renamed from: a */
    public static InterfaceC0165a f563a;

    /* JADX INFO: renamed from: b */
    public static InterfaceC0145a f564b;

    /* JADX INFO: renamed from: a */
    public static InterfaceC0165a m746a(Context context, String str) {
        if (context == null) {
            return null;
        }
        if (f563a == null) {
            f564b = C0148d.m713a(context, str);
            f563a = new C0166b();
        }
        return f563a;
    }

    @Override // com.alipay.sdk.p010m.p034l0.InterfaceC0165a
    /* JADX INFO: renamed from: a */
    public C0159c mo745a(C0160d c0160d) {
        return C0158b.m720a(f564b.mo708a(C0158b.m721a(c0160d)));
    }

    @Override // com.alipay.sdk.p010m.p034l0.InterfaceC0165a
    public boolean logCollect(String str) {
        return f564b.logCollect(str);
    }
}
