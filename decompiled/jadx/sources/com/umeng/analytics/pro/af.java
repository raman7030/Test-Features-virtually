package com.umeng.analytics.pro;

import android.content.Context;
import l.C8226;

/* JADX INFO: compiled from: RAPL */
/* JADX INFO: loaded from: classes.dex */
public class af implements z {
    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean zM21777 = C8226.m21777();
        al.a("getOAID", "isSupported", Boolean.valueOf(zM21777));
        if (zM21777) {
            return C8226.m21776(context);
        }
        return null;
    }
}
