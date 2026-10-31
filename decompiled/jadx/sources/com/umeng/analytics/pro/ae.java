package com.umeng.analytics.pro;

import android.content.Context;
import l.C13869;

/* JADX INFO: compiled from: TBKN */
/* JADX INFO: loaded from: classes.dex */
public class ae implements z {
    public static final int a = 1;
    public C13869 b;
    public boolean c = false;
    public boolean d = false;

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.c) {
            C13869 c13869 = new C13869();
            this.b = c13869;
            this.d = c13869.m33232(context) == 1;
            this.c = true;
        }
        al.a("getOAID", "isSupported", Boolean.valueOf(this.d));
        if (this.d && this.b.m33234()) {
            return this.b.m33233();
        }
        return null;
    }
}
