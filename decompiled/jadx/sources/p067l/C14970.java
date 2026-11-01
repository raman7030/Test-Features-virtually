package p067l;

import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.۬ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BE7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14970 {

    /* JADX INFO: renamed from: ֫ */
    public final int f42767;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC13630 f42768;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f42769;

    /* JADX INFO: renamed from: ܿ */
    public final int f42770;

    /* JADX INFO: renamed from: ᩳ */
    public final int f42771;

    public C14970(int i, int i2, int i3, AbstractC13630 abstractC13630, boolean z) {
        if (!C22187.m50001(i)) {
            throw new IllegalArgumentException("bogus opcode");
        }
        if (!C22187.m50001(i2)) {
            throw new IllegalArgumentException("bogus family");
        }
        if (!C22187.m50001(i3)) {
            throw new IllegalArgumentException("bogus nextOpcode");
        }
        if (abstractC13630 == null) {
            throw new NullPointerException("format == null");
        }
        this.f42770 = i;
        this.f42767 = i2;
        this.f42771 = i3;
        this.f42768 = abstractC13630;
        this.f42769 = z;
    }

    public final String toString() {
        return m34269();
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m34270() {
        return this.f42770;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m34266() {
        return this.f42767;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC13630 m34267() {
        return this.f42768;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m34272() {
        return this.f42769;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m34269() {
        return C11719.m26919(this.f42770).m50413();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m34271() {
        return this.f42771;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C14970 m34268() {
        switch (this.f42770) {
            case 50:
                return C14300.f40803;
            case 51:
                return C14300.f40714;
            case 52:
                return C14300.f40719;
            case 53:
                return C14300.f40744;
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                return C14300.f40868;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                return C14300.f40818;
            case 56:
                return C14300.f40798;
            case 57:
                return C14300.f40749;
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                return C14300.f40768;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                return C14300.f40734;
            case 60:
                return C14300.f40853;
            case 61:
                return C14300.f40863;
            default:
                throw new IllegalArgumentException("bogus opcode: " + this);
        }
    }
}
