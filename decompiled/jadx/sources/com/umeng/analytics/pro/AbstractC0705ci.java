package com.umeng.analytics.pro;

import p067l.C20780;

/* JADX INFO: renamed from: com.umeng.analytics.pro.ci */
/* JADX INFO: compiled from: R5FG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0705ci {
    /* JADX INFO: renamed from: a */
    public abstract int mo2437a(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: a */
    public void mo2443a(int i) {
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo2438a();

    /* JADX INFO: renamed from: b */
    public abstract void mo2439b();

    /* JADX INFO: renamed from: b */
    public abstract void mo2440b(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: c */
    public abstract void mo2441c();

    /* JADX INFO: renamed from: d */
    public void mo2442d() {
    }

    /* JADX INFO: renamed from: f */
    public byte[] mo2447f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public int mo2448g() {
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public int mo2449h() {
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public boolean m2452i() {
        return mo2438a();
    }

    /* JADX INFO: renamed from: d */
    public int m2451d(byte[] bArr, int i, int i2) throws C0706cj {
        int i3 = 0;
        while (i3 < i2) {
            int iMo2437a = mo2437a(bArr, i + i3, i2 - i3);
            if (iMo2437a <= 0) {
                throw new C0706cj(C20780.m46928("Cannot read. Remote side has closed. Tried to read ", i2, " bytes, but only got ", " bytes. (This is often indicative of an internal error on the server side. Please check your server logs.)", i3));
            }
            i3 += iMo2437a;
        }
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public void m2450b(byte[] bArr) {
        mo2440b(bArr, 0, bArr.length);
    }
}
