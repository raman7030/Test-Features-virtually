package p067l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۖۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6ZO */
/* JADX INFO: loaded from: classes2.dex */
public final class C4680 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f10549;

    /* JADX INFO: renamed from: ۧ */
    public final int f10550;

    /* JADX INFO: renamed from: ܽ */
    public int f10551;

    public C4680(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < i || i2 > bArr.length) {
            throw new IndexOutOfBoundsException("Invalid syntax cache reader range");
        }
        this.f10549 = bArr;
        this.f10551 = i;
        this.f10550 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m9917() {
        return this.f10551;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m9922() {
        return this.f10550 - this.f10551;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m9920() {
        m9916(1);
        int i = this.f10551;
        this.f10551 = i + 1;
        return this.f10549[i] & 255;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m9919() {
        m9916(4);
        int iM45532 = C20103.m45532(this.f10551, this.f10549);
        this.f10551 += 4;
        return iM45532;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m9918(int i) {
        int iM9919 = m9919();
        if (iM9919 < 0 || iM9919 > i) {
            throw new IllegalArgumentException("Invalid syntax cache string length");
        }
        m9916(iM9919);
        String str = new String(this.f10549, this.f10551, iM9919, StandardCharsets.UTF_8);
        this.f10551 += iM9919;
        return str;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m9921() {
        if (this.f10551 != this.f10550) {
            throw new IllegalArgumentException("Trailing syntax cache payload");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m9916(int i) {
        if (i < 0 || i > this.f10550 - this.f10551) {
            throw new IndexOutOfBoundsException("Truncated syntax cache payload");
        }
    }
}
