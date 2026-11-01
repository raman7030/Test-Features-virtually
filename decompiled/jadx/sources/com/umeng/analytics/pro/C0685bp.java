package com.umeng.analytics.pro;

import p067l.C5410;

/* JADX INFO: renamed from: com.umeng.analytics.pro.bp */
/* JADX INFO: compiled from: A5J0 */
/* JADX INFO: loaded from: classes.dex */
public class C0685bp {

    /* JADX INFO: renamed from: a */
    public final String f2530a;

    /* JADX INFO: renamed from: b */
    public final byte f2531b;

    /* JADX INFO: renamed from: c */
    public final short f2532c;

    public C0685bp() {
        this("", (byte) 0, (short) 0);
    }

    public C0685bp(String str, byte b, short s) {
        this.f2530a = str;
        this.f2531b = b;
        this.f2532c = s;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<TField name:'");
        sb.append(this.f2530a);
        sb.append("' type:");
        sb.append((int) this.f2531b);
        sb.append(" field-id:");
        return C5410.m11876(this.f2532c, ">", sb);
    }

    /* JADX INFO: renamed from: a */
    public boolean m2424a(C0685bp c0685bp) {
        return this.f2531b == c0685bp.f2531b && this.f2532c == c0685bp.f2532c;
    }
}
