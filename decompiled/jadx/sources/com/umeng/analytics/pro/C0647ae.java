package com.umeng.analytics.pro;

import android.content.Context;
import p067l.C15549;

/* JADX INFO: renamed from: com.umeng.analytics.pro.ae */
/* JADX INFO: compiled from: TBKN */
/* JADX INFO: loaded from: classes.dex */
public class C0647ae implements InterfaceC0730z {

    /* JADX INFO: renamed from: a */
    public static final int f2236a = 1;

    /* JADX INFO: renamed from: b */
    public C15549 f2237b;

    /* JADX INFO: renamed from: c */
    public boolean f2238c = false;

    /* JADX INFO: renamed from: d */
    public boolean f2239d = false;

    @Override // com.umeng.analytics.pro.InterfaceC0730z
    /* JADX INFO: renamed from: a */
    public String mo2131a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f2238c) {
            C15549 c15549 = new C15549();
            this.f2237b = c15549;
            this.f2239d = c15549.m35351(context) == 1;
            this.f2238c = true;
        }
        C0654al.m2141a("getOAID", "isSupported", Boolean.valueOf(this.f2239d));
        if (this.f2239d && this.f2237b.m35353()) {
            return this.f2237b.m35352();
        }
        return null;
    }
}
