package com.umeng.analytics.pro;

import android.content.Context;
import p067l.C10186;

/* JADX INFO: renamed from: com.umeng.analytics.pro.af */
/* JADX INFO: compiled from: RAPL */
/* JADX INFO: loaded from: classes.dex */
public class C0648af implements InterfaceC0730z {
    @Override // com.umeng.analytics.pro.InterfaceC0730z
    /* JADX INFO: renamed from: a */
    public String mo2131a(Context context) {
        if (context == null) {
            return null;
        }
        boolean zM23746 = C10186.m23746();
        C0654al.m2141a("getOAID", "isSupported", Boolean.valueOf(zM23746));
        if (zM23746) {
            return C10186.m23745(context);
        }
        return null;
    }
}
