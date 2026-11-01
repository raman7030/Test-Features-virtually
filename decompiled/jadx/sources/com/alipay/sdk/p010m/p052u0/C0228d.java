package com.alipay.sdk.p010m.p052u0;

import android.database.ContentObserver;

/* JADX INFO: renamed from: com.alipay.sdk.m.u0.d */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0228d extends ContentObserver {

    /* JADX INFO: renamed from: d */
    public static final String f1050d = "VMS_IDLG_SDK_Observer";

    /* JADX INFO: renamed from: a */
    public String f1051a;

    /* JADX INFO: renamed from: b */
    public int f1052b;

    /* JADX INFO: renamed from: c */
    public C0227c f1053c;

    public C0228d(C0227c c0227c, int i, String str) {
        super(null);
        this.f1053c = c0227c;
        this.f1052b = i;
        this.f1051a = str;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        C0227c c0227c = this.f1053c;
        if (c0227c != null) {
            c0227c.m1062a(this.f1052b, this.f1051a);
        }
    }
}
