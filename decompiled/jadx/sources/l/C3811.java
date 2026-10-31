package l;

import org.bouncycastle.crypto.digests.WhirlpoolDigest;

/* JADX INFO: renamed from: l.ۘ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: W26L */
/* JADX INFO: loaded from: classes2.dex */
public final class C3811 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C3811 f12010;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f12011;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f12012;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C18628 f12013;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f12014;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f12015;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f12016;

    static {
        new C3811(4201, 4096, 1);
        new C3811(1033, 1024, 1);
        new C3811(67, 64, 1);
        new C3811(19, 16, 1);
        f12010 = new C3811(WhirlpoolDigest.REDUCTION_POLYNOMIAL, 256, 0);
        new C3811(301, 256, 1);
    }

    public C3811(int i, int i2, int i3) {
        this.f12016 = i;
        this.f12015 = i2;
        this.f12012 = i3;
        this.f12011 = new int[i2];
        this.f12014 = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f12011[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f12014[this.f12011[i6]] = i6;
        }
        this.f12013 = new C18628(this, new int[]{0});
        new C18628(this, new int[]{1});
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18628 m11498() {
        return this.f12013;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18628 m11495(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.f12013;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new C18628(this, iArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m11494(int i) {
        return this.f12011[i];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m11499(int i) {
        if (i == 0) {
            throw new IllegalArgumentException();
        }
        return this.f12014[i];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m11496(int i) {
        if (i == 0) {
            throw new ArithmeticException();
        }
        return this.f12011[(this.f12015 - this.f12014[i]) - 1];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m11497(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f12014;
        return this.f12011[(iArr[i] + iArr[i2]) % (this.f12015 - 1)];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m11493() {
        return this.f12012;
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f12016) + ',' + this.f12015 + ')';
    }
}
