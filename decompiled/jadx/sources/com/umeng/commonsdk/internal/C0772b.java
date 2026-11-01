package com.umeng.commonsdk.internal;

import android.content.Context;

/* JADX INFO: renamed from: com.umeng.commonsdk.internal.b */
/* JADX INFO: compiled from: 0478 */
/* JADX INFO: loaded from: classes.dex */
public class C0772b {

    /* JADX INFO: renamed from: b */
    public static C0772b f3242b;

    /* JADX INFO: renamed from: a */
    public Context f3243a;

    /* JADX INFO: renamed from: c */
    public C0773c f3244c;

    public C0772b(Context context) {
        this.f3243a = context;
        this.f3244c = new C0773c(context);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C0772b m2790a(Context context) {
        if (f3242b == null) {
            f3242b = new C0772b(context.getApplicationContext());
        }
        return f3242b;
    }

    /* JADX INFO: renamed from: a */
    public C0773c m2791a() {
        return this.f3244c;
    }
}
