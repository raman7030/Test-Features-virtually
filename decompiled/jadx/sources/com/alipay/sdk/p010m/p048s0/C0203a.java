package com.alipay.sdk.p010m.p048s0;

import android.content.Context;
import com.alipay.sdk.p010m.p044q0.C0196f;

/* JADX INFO: renamed from: com.alipay.sdk.m.s0.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0203a {
    /* JADX INFO: renamed from: a */
    public static String m981a(Context context) {
        C0204b c0204bM998b = C0205c.m998b(context);
        return (c0204bM998b == null || C0196f.m948b(c0204bM998b.m991c())) ? "ffffffffffffffffffffffff" : c0204bM998b.m991c();
    }

    /* JADX INFO: renamed from: b */
    public static String m982b(Context context) {
        String strM1007d = C0206d.m999a(context).m1007d();
        return (strM1007d == null || C0196f.m948b(strM1007d)) ? "ffffffffffffffffffffffff" : strM1007d;
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static String m983c(Context context) {
        return m981a(context);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static String m984d(Context context) {
        return m982b(context);
    }
}
