package com.umeng.analytics.pro;

import p067l.C5410;

/* JADX INFO: renamed from: com.umeng.analytics.pro.bs */
/* JADX INFO: compiled from: P45T */
/* JADX INFO: loaded from: classes.dex */
public final class C0688bs {

    /* JADX INFO: renamed from: a */
    public final String f2538a;

    /* JADX INFO: renamed from: b */
    public final byte f2539b;

    /* JADX INFO: renamed from: c */
    public final int f2540c;

    public C0688bs() {
        this("", (byte) 0, 0);
    }

    public C0688bs(String str, byte b, int i) {
        this.f2538a = str;
        this.f2539b = b;
        this.f2540c = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<TMessage name:'");
        sb.append(this.f2538a);
        sb.append("' type: ");
        sb.append((int) this.f2539b);
        sb.append(" seqid:");
        return C5410.m11876(this.f2540c, ">", sb);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0688bs) {
            return m2425a((C0688bs) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m2425a(C0688bs c0688bs) {
        return this.f2538a.equals(c0688bs.f2538a) && this.f2539b == c0688bs.f2539b && this.f2540c == c0688bs.f2540c;
    }
}
