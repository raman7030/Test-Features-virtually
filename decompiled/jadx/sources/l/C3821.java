package l;

/* JADX INFO: renamed from: l.ۘ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6W2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3821 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f12222;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f12223;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795 f12224;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f12225;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f12226;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f12227;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795 f12228;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f12229;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795 f12230;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795 f12231;

    public C3821(C23494 c23494, int i, C23494 c23495, C4299 c4299, C23494 c23496, C12910 c12910) {
        this.f12231 = c23494.f75432;
        this.f12226 = m11565(c23494);
        this.f12227 = i;
        this.f12228 = c23495.f75432;
        this.f12229 = m11565(c23495);
        this.f12230 = c4299 == null ? null : c4299.f20243;
        this.f12223 = c4299 == null ? 0 : c4299.f20242;
        this.f12224 = c23496.f75432;
        this.f12225 = c12910.f38738;
        this.f12222 = c12910.f38739;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3821 m11563(C12910 c12910) {
        int i;
        int i2;
        C5855 c5855;
        C5855 c5856;
        C5855 c5857;
        C0916 c0916;
        C23494 c23494;
        C23494 c23494M11564;
        C4299 c4299;
        C23494 c23495;
        InterfaceC10795 interfaceC10795;
        C5855 c5858;
        if (c12910 != null) {
            int i3 = c12910.f38735;
            if (c12910.getClass() == C12910.class && (i = c12910.f38738) >= 0 && c12910.f38739 >= i && c12910.f38740 >= -1 && i3 >= 0 && (i2 = c12910.f38736) >= 0 && i3 != i2 && (c5855 = c12910.f38737) != null && c5855.getClass() == C5150.class) {
                C5150 c5150 = (C5150) c12910.f38737;
                boolean z = c5150.f16093;
                int i4 = c5150.f16092;
                if (z && i4 == i3 && (c5856 = c5150.f17958) != null && c5856.getClass() == C11355.class) {
                    C11355 c11355 = (C11355) c5150.f17958;
                    C5855[] c5855Arr = c11355.f33989;
                    C5855 c5859 = c11355.f33991;
                    if (c5855Arr != null && c11355.f33990 == 2 && c5855Arr.length >= 2 && c5859 != null && c5859.getClass() == C22643.class && (c5857 = c5859.f17958) != null && c5857.getClass() == C0916.class && c5150.f16094 == (c0916 = (C0916) c5859.f17958) && c0916.f3504 && c0916.f3502 == 0 && c0916.f3503 == i4 && c0916.f17958 == c12910) {
                        C23494 c23494M11565 = m11564(c11355.f33989[0]);
                        C23494 c23494M11566 = m11564(c11355.f33989[1]);
                        if (c23494M11565 != null && c23494M11566 != null) {
                            if (c23494M11565.f17958 == c5859) {
                                c23494 = c23494M11565;
                                c23494M11565 = c23494M11566;
                            } else if (c23494M11566.f17958 == c5859) {
                                c23494 = c23494M11566;
                            }
                            InterfaceC10795 interfaceC10796 = c23494M11565.f75432;
                            if (m11565(c23494M11565) && (c23494M11564 = m11564(c23494M11565.f17958)) != null && c23494M11564.f17958 == c5859) {
                                C5855 c58510 = c12910.f17958;
                                if (c58510 == null || c58510.getClass() != C4299.class) {
                                    c4299 = null;
                                } else {
                                    C4299 c42910 = (C4299) c58510;
                                    if (c42910.f20242 >= 0 && c42910.f20243 != null) {
                                        c4299 = c42910;
                                        c58510 = c42910.f17958;
                                    }
                                }
                                if (m11565(c58510) && (interfaceC10795 = (c23495 = (C23494) c58510).f75432) != null && (c5858 = c23495.f17958) != null && c5858.getClass() == C15026.class) {
                                    boolean zM11565 = m11565(c23494);
                                    int iMax = Math.max(C14403.m34421(interfaceC10796), C14403.m34421(interfaceC10795));
                                    if (c4299 != null) {
                                        iMax = Math.max(iMax, C14403.m34421(c4299.f20243));
                                    }
                                    int i5 = -1;
                                    for (int i6 = 0; i6 < iMax; i6++) {
                                        boolean zMo2465 = interfaceC10796.mo2465(i6);
                                        if (zMo2465) {
                                            if (i5 < 0 && !Character.isSurrogate((char) i6)) {
                                                i5 = i6;
                                            }
                                        }
                                        boolean zMo2466 = interfaceC10795.mo2465(i6);
                                        boolean z2 = c4299 != null && c4299.f20243.mo2465(i6);
                                        if (zMo2466 && z2) {
                                            return null;
                                        }
                                        boolean z3 = zMo2466 || z2;
                                        if (!zM11565 && z3 && Character.isSurrogate((char) i6)) {
                                            return null;
                                        }
                                        if (zMo2465 && z3) {
                                            return null;
                                        }
                                        if ((zMo2465 || z3) && c23494.f75432.mo2465(i6)) {
                                            return null;
                                        }
                                    }
                                    if (i5 < 0) {
                                        return null;
                                    }
                                    return new C3821(c23494, i5, c23494M11564, c4299, c23495, c12910);
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23494 m11564(C5855 c5855) {
        if (c5855 == null) {
            return null;
        }
        Class<?> cls = c5855.getClass();
        if (cls != C23494.class && cls != C8678.class && cls != C10877.class && !m11565(c5855)) {
            return null;
        }
        C23494 c23494 = (C23494) c5855;
        if (c23494.f75432 == null) {
            return null;
        }
        return c23494;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m11565(C5855 c5855) {
        return c5855 != null && c5855.getClass() == C19822.class;
    }
}
