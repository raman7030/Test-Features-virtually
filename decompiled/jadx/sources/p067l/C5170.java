package p067l;

/* JADX INFO: renamed from: l.ۗۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8QR */
/* JADX INFO: loaded from: classes2.dex */
public final class C5170 {

    /* JADX INFO: renamed from: ֫ */
    public final C10307 f12149;

    /* JADX INFO: renamed from: ۡ */
    public C21973 f12152;

    /* JADX INFO: renamed from: ۧ */
    public int f12154;

    /* JADX INFO: renamed from: ܺ */
    public final InterfaceC20790 f12156;

    /* JADX INFO: renamed from: ܽ */
    public int f12157;

    /* JADX INFO: renamed from: ܿ */
    public boolean f12158;

    /* JADX INFO: renamed from: ᩳ */
    public int f12159;

    /* JADX INFO: renamed from: ᩷ */
    public int f12160;

    /* JADX INFO: renamed from: ᩻ */
    public C21264 f12161;

    /* JADX INFO: renamed from: ۢ */
    public final C8561 f12153 = new C8561();

    /* JADX INFO: renamed from: ۖ */
    public final C19203 f12150 = new C19203();

    /* JADX INFO: renamed from: ۜ */
    public final C19203 f12151 = new C19203(1);

    /* JADX INFO: renamed from: ܳ */
    public final C19203 f12155 = new C19203();

    /* JADX INFO: renamed from: ᩻ */
    public final void m11050() {
        C8561 c8561 = this.f12153;
        c8561.f23002 = 0;
        c8561.f23000 = 0L;
        c8561.f22997 = false;
        c8561.f22999 = false;
        c8561.f23004 = false;
        c8561.f22992 = null;
        this.f12157 = 0;
        this.f12159 = 0;
        this.f12154 = 0;
        this.f12160 = 0;
        this.f12158 = false;
    }

    public C5170(InterfaceC20790 interfaceC20790, C21973 c21973, C21264 c21264, C10307 c10307) {
        this.f12156 = interfaceC20790;
        this.f12152 = c21973;
        this.f12161 = c21264;
        this.f12149 = c10307;
        m11044(c21973, c21264);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11044(C21973 c21973, C21264 c21264) {
        this.f12152 = c21973;
        this.f12161 = c21264;
        this.f12156.mo10503(this.f12149);
        m11050();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11043(C21037 c21037) {
        C15936 c15936 = this.f12152.f69033;
        C21264 c21264 = this.f12153.f23001;
        String str = C5792.f14228;
        C24654 c24654M36169 = c15936.m36169(c21264.f66813);
        C21037 c21037M47450 = c21037.m47450(c24654M36169 != null ? c24654M36169.f78019 : null);
        C3601 c3601M23918 = this.f12149.m23918();
        c3601M23918.m6679(c21037M47450);
        this.f12156.mo10503(c3601M23918.m6672());
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m11047() {
        if (!this.f12158) {
            return this.f12152.f69039[this.f12157];
        }
        return this.f12153.f22998[this.f12157];
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m11045() {
        if (!this.f12158) {
            return this.f12152.f69038[this.f12157];
        }
        return this.f12153.f23003[this.f12159];
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m11049() {
        if (!this.f12158) {
            return this.f12152.f69035[this.f12157];
        }
        return this.f12153.f22991[this.f12157];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m11041() {
        int i;
        if (!this.f12158) {
            i = this.f12152.f69034[this.f12157];
        } else {
            i = this.f12153.f22994[this.f12157] ? 1 : 0;
        }
        return m11048() != null ? i | 1073741824 : i;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m11046() {
        this.f12157++;
        if (!this.f12158) {
            return false;
        }
        int i = this.f12154 + 1;
        this.f12154 = i;
        int[] iArr = this.f12153.f22989;
        int i2 = this.f12159;
        if (i != iArr[i2]) {
            return true;
        }
        this.f12159 = i2 + 1;
        this.f12154 = 0;
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m11042(int i, int i2) {
        C19203 c19203;
        C24654 c24654M11048 = m11048();
        if (c24654M11048 == null) {
            return 0;
        }
        int length = c24654M11048.f78020;
        C8561 c8561 = this.f12153;
        if (length != 0) {
            c19203 = c8561.f22993;
        } else {
            byte[] bArr = c24654M11048.f78017;
            String str = C5792.f14228;
            int length2 = bArr.length;
            C19203 c19204 = this.f12155;
            c19204.m43708(length2, bArr);
            length = bArr.length;
            c19203 = c19204;
        }
        boolean z = c8561.f22999 && c8561.f22995[this.f12157];
        boolean z2 = z || i2 != 0;
        C19203 c19205 = this.f12151;
        c19205.m43728()[0] = (byte) ((z2 ? 128 : 0) | length);
        c19205.m43730(0);
        InterfaceC20790 interfaceC20790 = this.f12156;
        interfaceC20790.mo10504(c19205, 1, 1);
        interfaceC20790.mo10504(c19203, length, 1);
        if (!z2) {
            return length + 1;
        }
        C19203 c19206 = this.f12150;
        if (!z) {
            c19206.m43727(8);
            byte[] bArrM43728 = c19206.m43728();
            bArrM43728[0] = 0;
            bArrM43728[1] = 1;
            bArrM43728[2] = (byte) 0;
            bArrM43728[3] = (byte) (i2 & 255);
            bArrM43728[4] = (byte) ((i >> 24) & 255);
            bArrM43728[5] = (byte) ((i >> 16) & 255);
            bArrM43728[6] = (byte) ((i >> 8) & 255);
            bArrM43728[7] = (byte) (i & 255);
            interfaceC20790.mo10504(c19206, 8, 1);
            return length + 9;
        }
        C19203 c19207 = c8561.f22993;
        int iM43710 = c19207.m43710();
        c19207.m43724(-2);
        int i3 = (iM43710 * 6) + 2;
        if (i2 != 0) {
            c19206.m43727(i3);
            byte[] bArrM43729 = c19206.m43728();
            c19207.m43707(0, i3, bArrM43729);
            int i4 = (((bArrM43729[2] & 255) << 8) | (bArrM43729[3] & 255)) + i2;
            bArrM43729[2] = (byte) ((i4 >> 8) & 255);
            bArrM43729[3] = (byte) (i4 & 255);
        } else {
            c19206 = c19207;
        }
        interfaceC20790.mo10504(c19206, i3, 1);
        return length + 1 + i3;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C24654 m11048() {
        if (!this.f12158) {
            return null;
        }
        C8561 c8561 = this.f12153;
        C21264 c21264 = c8561.f23001;
        String str = C5792.f14228;
        int i = c21264.f66813;
        C24654 c24654M36169 = c8561.f22992;
        if (c24654M36169 == null) {
            c24654M36169 = this.f12152.f69033.m36169(i);
        }
        if (c24654M36169 == null || !c24654M36169.f78018) {
            return null;
        }
        return c24654M36169;
    }
}
