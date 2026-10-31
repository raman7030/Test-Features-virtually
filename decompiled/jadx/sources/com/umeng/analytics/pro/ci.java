package com.umeng.analytics.pro;

import l.C19373;

/* JADX INFO: compiled from: R5FG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ci {
    public abstract int a(byte[] bArr, int i, int i2);

    public void a(int i) {
    }

    public abstract boolean a();

    public abstract void b();

    public abstract void b(byte[] bArr, int i, int i2);

    public abstract void c();

    public void d() {
    }

    public byte[] f() {
        return null;
    }

    public int g() {
        return 0;
    }

    public int h() {
        return -1;
    }

    public boolean i() {
        return a();
    }

    public int d(byte[] bArr, int i, int i2) throws cj {
        int i3 = 0;
        while (i3 < i2) {
            int iA = a(bArr, i + i3, i2 - i3);
            if (iA <= 0) {
                throw new cj(C19373.m44634("Cannot read. Remote side has closed. Tried to read ", i2, " bytes, but only got ", " bytes. (This is often indicative of an internal error on the server side. Please check your server logs.)", i3));
            }
            i3 += iA;
        }
        return i3;
    }

    public void b(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }
}
