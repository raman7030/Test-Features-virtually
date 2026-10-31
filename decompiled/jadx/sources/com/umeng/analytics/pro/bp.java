package com.umeng.analytics.pro;

import l.C3200;

/* JADX INFO: compiled from: A5J0 */
/* JADX INFO: loaded from: classes.dex */
public class bp {
    public final String a;
    public final byte b;
    public final short c;

    public bp() {
        this("", (byte) 0, (short) 0);
    }

    public bp(String str, byte b, short s) {
        this.a = str;
        this.b = b;
        this.c = s;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<TField name:'");
        sb.append(this.a);
        sb.append("' type:");
        sb.append((int) this.b);
        sb.append(" field-id:");
        return C3200.m9831(this.c, ">", sb);
    }

    public boolean a(bp bpVar) {
        return this.b == bpVar.b && this.c == bpVar.c;
    }
}
