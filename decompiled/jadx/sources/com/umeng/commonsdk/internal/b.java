package com.umeng.commonsdk.internal;

import android.content.Context;

/* JADX INFO: compiled from: 0478 */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public static b b;
    public Context a;
    public c c;

    public b(Context context) {
        this.a = context;
        this.c = new c(context);
    }

    public static synchronized b a(Context context) {
        if (b == null) {
            b = new b(context.getApplicationContext());
        }
        return b;
    }

    public c a() {
        return this.c;
    }
}
