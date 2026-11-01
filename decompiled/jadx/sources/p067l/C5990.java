package p067l;

import org.bouncycastle.crypto.digests.WhirlpoolDigest;

/* JADX INFO: renamed from: l.ۘ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: W26L */
/* JADX INFO: loaded from: classes2.dex */
public final class C5990 {

    /* JADX INFO: renamed from: ᩻ */
    public static final C5990 f14818;

    /* JADX INFO: renamed from: ֫ */
    public final int[] f14819;

    /* JADX INFO: renamed from: ۧ */
    public final int f14820;

    /* JADX INFO: renamed from: ܳ */
    public final C20072 f14821;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f14822;

    /* JADX INFO: renamed from: ܿ */
    public final int f14823;

    /* JADX INFO: renamed from: ᩳ */
    public final int f14824;

    static {
        new C5990(4201, 4096, 1);
        new C5990(1033, 1024, 1);
        new C5990(67, 64, 1);
        new C5990(19, 16, 1);
        f14818 = new C5990(WhirlpoolDigest.REDUCTION_POLYNOMIAL, 256, 0);
        new C5990(301, 256, 1);
    }

    public C5990(int i, int i2, int i3) {
        this.f14824 = i;
        this.f14823 = i2;
        this.f14820 = i3;
        this.f14819 = new int[i2];
        this.f14822 = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f14819[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f14822[this.f14819[i6]] = i6;
        }
        this.f14821 = new C20072(this, new int[]{0});
        new C20072(this, new int[]{1});
    }

    /* JADX INFO: renamed from: ۧ */
    public final C20072 m13434() {
        return this.f14821;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20072 m13431(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.f14821;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new C20072(this, iArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m13430(int i) {
        return this.f14819[i];
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m13435(int i) {
        if (i == 0) {
            throw new IllegalArgumentException();
        }
        return this.f14822[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m13432(int i) {
        if (i == 0) {
            throw new ArithmeticException();
        }
        return this.f14819[(this.f14823 - this.f14822[i]) - 1];
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m13433(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f14822;
        return this.f14819[(iArr[i] + iArr[i2]) % (this.f14823 - 1)];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m13429() {
        return this.f14820;
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f14824) + ',' + this.f14823 + ')';
    }
}
