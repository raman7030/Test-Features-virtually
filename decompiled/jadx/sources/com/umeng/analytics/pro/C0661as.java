package com.umeng.analytics.pro;

/* JADX INFO: renamed from: com.umeng.analytics.pro.as */
/* JADX INFO: compiled from: 25SL */
/* JADX INFO: loaded from: classes.dex */
public class C0661as {
    /* JADX INFO: renamed from: a */
    public static final boolean m2261a(int i, int i2) {
        return (i & (1 << i2)) != 0;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m2262a(long j, int i) {
        return (j & (1 << i)) != 0;
    }

    /* JADX INFO: renamed from: b */
    public static final int m2265b(int i, int i2) {
        return i & (~(1 << i2));
    }

    /* JADX INFO: renamed from: b */
    public static final long m2266b(long j, int i) {
        return j & (~(1 << i));
    }

    /* JADX INFO: renamed from: a */
    public static final void m2258a(int i, byte[] bArr) {
        m2259a(i, bArr, 0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m2259a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) ((i >> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
    }

    /* JADX INFO: renamed from: a */
    public static final int m2254a(byte[] bArr) {
        return m2255a(bArr, 0);
    }

    /* JADX INFO: renamed from: a */
    public static final int m2255a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m2260a(byte b, int i) {
        return m2261a((int) b, i);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m2263a(short s, int i) {
        return m2261a((int) s, i);
    }

    /* JADX INFO: renamed from: b */
    public static final byte m2264b(byte b, int i) {
        return (byte) m2265b((int) b, i);
    }

    /* JADX INFO: renamed from: b */
    public static final short m2267b(short s, int i) {
        return (short) m2265b((int) s, i);
    }

    /* JADX INFO: renamed from: a */
    public static final byte m2252a(byte b, int i, boolean z) {
        return (byte) m2253a((int) b, i, z);
    }

    /* JADX INFO: renamed from: a */
    public static final short m2257a(short s, int i, boolean z) {
        return (short) m2253a((int) s, i, z);
    }

    /* JADX INFO: renamed from: a */
    public static final int m2253a(int i, int i2, boolean z) {
        return z ? i | (1 << i2) : m2265b(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static final long m2256a(long j, int i, boolean z) {
        return z ? j | (1 << i) : m2266b(j, i);
    }
}
