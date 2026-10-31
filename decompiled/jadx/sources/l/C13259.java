package l;

import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.۬ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BE7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13259 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f39703;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC11849 f39704;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f39705;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f39706;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f39707;

    public C13259(int i, int i2, int i3, AbstractC11849 abstractC11849, boolean z) {
        if (!C20853.m47673(i)) {
            throw new IllegalArgumentException("bogus opcode");
        }
        if (!C20853.m47673(i2)) {
            throw new IllegalArgumentException("bogus family");
        }
        if (!C20853.m47673(i3)) {
            throw new IllegalArgumentException("bogus nextOpcode");
        }
        if (abstractC11849 == null) {
            throw new NullPointerException("format == null");
        }
        this.f39706 = i;
        this.f39703 = i2;
        this.f39707 = i3;
        this.f39704 = abstractC11849;
        this.f39705 = z;
    }

    public final String toString() {
        return m32170();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m32171() {
        return this.f39706;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32167() {
        return this.f39703;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC11849 m32168() {
        return this.f39704;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m32173() {
        return this.f39705;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m32170() {
        return C9838.m24904(this.f39706).m48083();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m32172() {
        return this.f39707;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C13259 m32169() {
        switch (this.f39706) {
            case 50:
                return C12554.f37777;
            case 51:
                return C12554.f37688;
            case 52:
                return C12554.f37693;
            case 53:
                return C12554.f37718;
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                return C12554.f37842;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                return C12554.f37792;
            case 56:
                return C12554.f37772;
            case 57:
                return C12554.f37723;
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                return C12554.f37742;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                return C12554.f37708;
            case 60:
                return C12554.f37827;
            case 61:
                return C12554.f37837;
            default:
                throw new IllegalArgumentException("bogus opcode: " + this);
        }
    }
}
