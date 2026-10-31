package l;

/* JADX INFO: renamed from: l.ۘܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBEJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4004 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19611 f12698;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f12699;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0312 f12700;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f12701;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13012 f12702;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C14586 f12703;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int[] f12704 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2593 f12705;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f12706;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20316 m12061(C13012 c13012, C0312 c0312, int i, C9733 c9733) {
        C16540 c16540M40535;
        int i2;
        C4004 c4004 = new C4004(c13012, c0312, i, c9733);
        C17246 c17246M31591 = c13012.m31591();
        int size = c17246M31591.size();
        int iM38023 = c17246M31591.m38023();
        int[] iArrM32622 = C13573.m32622(iM38023);
        int[] iArrM32623 = C13573.m32622(iM38023);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C13573.m32627(c17246M31591.m41002get(i4).mo2269(), iArrM32622);
        }
        int[] iArr = new int[size];
        int iM31593 = c13012.m31593();
        int i5 = 0;
        while (iM31593 != -1) {
            while (true) {
                C21064 c21064M31592 = c13012.m31592(iM31593);
                int size2 = c21064M31592.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        break;
                    }
                    i2 = c21064M31592.get(i6);
                    if (C13573.m32626(i2, iArrM32623)) {
                        break;
                    }
                    if (C13573.m32626(i2, iArrM32622) && c17246M31591.m40535(i2).m38913() == iM31593) {
                        break;
                    }
                    i6++;
                }
                C13573.m32627(i2, iArrM32623);
                iM31593 = i2;
            }
            while (iM31593 != -1) {
                C13573.m32620(iM31593, iArrM32622);
                C13573.m32620(iM31593, iArrM32623);
                iArr[i5] = iM31593;
                i5++;
                C16540 c16540M40536 = c17246M31591.m40535(iM31593);
                int iM38913 = c16540M40536.m38913();
                C21064 c21064M38911 = c16540M40536.m38911();
                int size3 = c21064M38911.size();
                if (size3 == 0) {
                    c16540M40535 = null;
                } else if (size3 != 1 && iM38913 != -1) {
                    c16540M40535 = c17246M31591.m40535(iM38913);
                } else {
                    c16540M40535 = c17246M31591.m40535(c21064M38911.get(0));
                }
                if (c16540M40535 == null) {
                    break;
                }
                int iMo2269 = c16540M40535.mo2269();
                int iM38914 = c16540M40536.m38913();
                if (C13573.m32626(iMo2269, iArrM32622)) {
                    iM31593 = iMo2269;
                } else if (iM38914 == iMo2269 || iM38914 < 0 || !C13573.m32626(iM38914, iArrM32622)) {
                    C21064 c21064M38912 = c16540M40536.m38911();
                    int size4 = c21064M38912.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size4) {
                            iM31593 = -1;
                            break;
                        }
                        int i8 = c21064M38912.get(i7);
                        if (C13573.m32626(i8, iArrM32622)) {
                            iM31593 = i8;
                            break;
                        }
                        i7++;
                    }
                } else {
                    iM31593 = iM38914;
                }
            }
            iM31593 = C13573.m32623(0, iArrM32622);
        }
        if (i5 != size) {
            throw new RuntimeException("shouldn't happen");
        }
        c4004.f12704 = iArr;
        C17246 c17246M31592 = c13012.m31591();
        int[] iArr2 = c4004.f12704;
        int length = iArr2.length;
        while (true) {
            C14586 c14586 = c4004.f12703;
            C19611 c19611 = c4004.f12698;
            if (i3 >= length) {
                return new C20316(c14586.m34837(), new C19527(c13012, c4004.f12704, c19611));
            }
            int i9 = i3 + 1;
            int i10 = i9 == iArr2.length ? -1 : iArr2[i9];
            C16540 c16540M40537 = c17246M31592.m40535(iArr2[i3]);
            C15375 c15375M45054 = c19611.m45054(c16540M40537);
            c14586.m34838((AbstractC4793) c15375M45054);
            C0312 c0313 = c4004.f12700;
            if (c0313 != null) {
                c14586.m34838(new C11060(c15375M45054.m13983(), c0313.m1723(c16540M40537)));
            }
            C15375 c15375M45053 = c19611.m45053(c16540M40537);
            C2593 c2593 = c4004.f12705;
            c2593.m8218(c16540M40537, c15375M45053);
            c16540M40537.m38916().m7866(c2593);
            c14586.m34838((AbstractC4793) c19611.m45052(c16540M40537));
            int iM38915 = c16540M40537.m38913();
            AbstractC15834 abstractC15834M38915 = c16540M40537.m38915();
            if (iM38915 >= 0 && iM38915 != i10) {
                if (abstractC15834M38915.m37484().m9558() == 4 && c16540M40537.m38918() == i10) {
                    c14586.m34839(c19611.m45051(iM38915));
                } else {
                    c14586.m34838(new C5415(C12554.f37822, abstractC15834M38915.m37480(), C20069.f65002, c19611.m45051(iM38915)));
                }
            }
            i3 = i9;
        }
    }

    public C4004(C13012 c13012, C0312 c0312, int i, C9733 c9733) {
        this.f12702 = c13012;
        this.f12700 = c0312;
        this.f12698 = new C19611(c13012);
        this.f12701 = i;
        boolean[] zArr = {true};
        c13012.m31591().m40532(new C8943(zArr, c13012.m31591().m40536(), i));
        boolean z = zArr[0];
        this.f12706 = z;
        C17246 c17246M31591 = c13012.m31591();
        int size = c17246M31591.size();
        int i2 = size * 3;
        int iM40533 = c17246M31591.m40533() + i2;
        int iM1727 = c0312 != null ? iM40533 + c0312.m1727() + size : iM40533;
        int iM40536 = c17246M31591.m40536() + (z ? 0 : i);
        this.f12699 = iM40536;
        C14586 c14586 = new C14586(c9733, iM1727, i2, iM40536, i);
        this.f12703 = c14586;
        if (c0312 != null) {
            this.f12705 = new C15997(this, c14586, c0312);
        } else {
            this.f12705 = new C2593(this, c14586);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20069 m12059(AbstractC15834 abstractC15834) {
        return m12063(abstractC15834, abstractC15834.m37483());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C20069 m12063(AbstractC15834 abstractC15834, C21480 c21480) {
        C20069 c20069M37479 = abstractC15834.m37479();
        if (abstractC15834.m37484().m9557() && c20069M37479.size() == 2 && c21480.m48652() == c20069M37479.m41004get(1).m48652()) {
            c20069M37479 = C20069.m46250(c20069M37479.m41004get(1), c20069M37479.m41004get(0));
        }
        return c21480 == null ? c20069M37479 : c20069M37479.m46255(c21480);
    }
}
