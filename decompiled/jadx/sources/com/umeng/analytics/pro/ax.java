package com.umeng.analytics.pro;

import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: 146U */
/* JADX INFO: loaded from: classes.dex */
public class ax extends ByteArrayOutputStream {
    public ax(int i) {
        super(i);
    }

    public ax() {
    }

    public byte[] a() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public int b() {
        return ((ByteArrayOutputStream) this).count;
    }
}
