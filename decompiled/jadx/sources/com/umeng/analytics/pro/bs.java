package com.umeng.analytics.pro;

import l.C3200;

/* JADX INFO: compiled from: P45T */
/* JADX INFO: loaded from: classes.dex */
public final class bs {
    public final String a;
    public final byte b;
    public final int c;

    public bs() {
        this("", (byte) 0, 0);
    }

    public bs(String str, byte b, int i) {
        this.a = str;
        this.b = b;
        this.c = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<TMessage name:'");
        sb.append(this.a);
        sb.append("' type: ");
        sb.append((int) this.b);
        sb.append(" seqid:");
        return C3200.m9831(this.c, ">", sb);
    }

    public boolean equals(Object obj) {
        if (obj instanceof bs) {
            return a((bs) obj);
        }
        return false;
    }

    public boolean a(bs bsVar) {
        return this.a.equals(bsVar.a) && this.b == bsVar.b && this.c == bsVar.c;
    }
}
