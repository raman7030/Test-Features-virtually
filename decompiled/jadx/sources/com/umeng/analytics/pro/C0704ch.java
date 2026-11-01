package com.umeng.analytics.pro;

/* JADX INFO: renamed from: com.umeng.analytics.pro.ch */
/* JADX INFO: compiled from: W65L */
/* JADX INFO: loaded from: classes.dex */
public final class C0704ch extends AbstractC0705ci {

    /* JADX INFO: renamed from: a */
    public byte[] f2575a;

    /* JADX INFO: renamed from: b */
    public int f2576b;

    /* JADX INFO: renamed from: c */
    public int f2577c;

    @Override // com.umeng.analytics.pro.AbstractC0705ci
    /* JADX INFO: renamed from: a */
    public boolean mo2438a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.AbstractC0705ci
    /* JADX INFO: renamed from: b */
    public void mo2439b() {
    }

    @Override // com.umeng.analytics.pro.AbstractC0705ci
    /* JADX INFO: renamed from: c */
    public void mo2441c() {
    }

    public C0704ch() {
    }

    public C0704ch(byte[] bArr) {
        m2444a(bArr);
    }

    public C0704ch(byte[] bArr, int i, int i2) {
        m2445c(bArr, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public void m2444a(byte[] bArr) {
        m2445c(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: c */
    public void m2445c(byte[] bArr, int i, int i2) {
        this.f2575a = bArr;
        this.f2576b = i;
        this.f2577c = i + i2;
    }

    /* JADX INFO: renamed from: e */
    public void m2446e() {
        this.f2575a = null;
    }

    @Override // com.umeng.analytics.pro.AbstractC0705ci
    /* JADX INFO: renamed from: a */
    public int mo2437a(byte[] bArr, int i, int i2) {
        int iMo2449h = mo2449h();
        if (i2 > iMo2449h) {
            i2 = iMo2449h;
        }
        if (i2 > 0) {
            System.arraycopy(this.f2575a, this.f2576b, bArr, i, i2);
            mo2443a(i2);
        }
        return i2;
    }

    @Override // com.umeng.analytics.pro.AbstractC0705ci
    /* JADX INFO: renamed from: b */
    public void mo2440b(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // com.umeng.analytics.pro.AbstractC0705ci
    /* JADX INFO: renamed from: f */
    public byte[] mo2447f() {
        return this.f2575a;
    }

    @Override // com.umeng.analytics.pro.AbstractC0705ci
    /* JADX INFO: renamed from: g */
    public int mo2448g() {
        return this.f2576b;
    }

    @Override // com.umeng.analytics.pro.AbstractC0705ci
    /* JADX INFO: renamed from: h */
    public int mo2449h() {
        return this.f2577c - this.f2576b;
    }

    @Override // com.umeng.analytics.pro.AbstractC0705ci
    /* JADX INFO: renamed from: a */
    public void mo2443a(int i) {
        this.f2576b += i;
    }
}
