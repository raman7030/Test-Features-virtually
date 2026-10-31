package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S1AA */
/* JADX INFO: loaded from: classes5.dex */
public final class C16005 extends AbstractC8245 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static int[] f49379 = new int[2];

    public C16005(C15094 c15094) {
        super(c15094);
        this.f25382.f53268 = EnumC18123.LEFT;
        this.f25379.f53268 = EnumC18123.RIGHT;
        this.f25378 = 0;
    }

    public final String toString() {
        return "HorizontalRun " + this.f25376.m35751();
    }

    @Override // l.AbstractC8245
    /* JADX INFO: renamed from: ܽ */
    public final void mo6244() {
        this.f25375 = null;
        this.f25382.m40762();
        this.f25379.m40762();
        this.f25374.m40762();
        this.f25383 = false;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m37817() {
        this.f25383 = false;
        C17417 c17417 = this.f25382;
        c17417.m40762();
        c17417.f53276 = false;
        C17417 c17418 = this.f25379;
        c17418.m40762();
        c17418.f53276 = false;
        this.f25374.f53276 = false;
    }

    @Override // l.AbstractC8245
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo6243() {
        return this.f25377 != EnumC8040.MATCH_CONSTRAINT || this.f25376.f46145 == 0;
    }

    @Override // l.AbstractC8245
    /* JADX INFO: renamed from: ֫ */
    public final void mo6240() {
        C15094 c15094;
        C15094 c15095;
        C15094 c15096;
        C15094 c15097;
        C15094 c15098 = this.f25376;
        boolean z = c15098.f46117;
        C14594 c14594 = this.f25374;
        if (z) {
            c14594.mo34849(c15098.m35753());
        }
        boolean z2 = c14594.f53276;
        ArrayList arrayList = c14594.f53269;
        ArrayList arrayList2 = c14594.f53275;
        C17417 c17417 = this.f25379;
        C17417 c17418 = this.f25382;
        if (z2) {
            EnumC8040 enumC8040 = this.f25377;
            EnumC8040 enumC8041 = EnumC8040.MATCH_PARENT;
            if (enumC8040 == enumC8041 && (((c15095 = (c15094 = this.f25376).f46132) != null && c15095.f46124[0] == EnumC8040.FIXED) || c15095.f46124[0] == enumC8041)) {
                AbstractC8245.m21828(c17418, c15095.f46156.f25382, c15094.f46141.m15007());
                AbstractC8245.m21828(c17417, c15095.f46156.f25379, -this.f25376.f46159.m15007());
                return;
            }
        } else {
            C15094 c15099 = this.f25376;
            EnumC8040 enumC8042 = c15099.f46124[0];
            this.f25377 = enumC8042;
            if (enumC8042 != EnumC8040.MATCH_CONSTRAINT) {
                EnumC8040 enumC8043 = EnumC8040.MATCH_PARENT;
                if (enumC8042 == enumC8043 && (((c15097 = c15099.f46132) != null && c15097.f46124[0] == EnumC8040.FIXED) || c15097.f46124[0] == enumC8043)) {
                    int iM35753 = (c15097.m35753() - this.f25376.f46141.m15007()) - this.f25376.f46159.m15007();
                    AbstractC8245.m21828(c17418, c15097.f46156.f25382, this.f25376.f46141.m15007());
                    AbstractC8245.m21828(c17417, c15097.f46156.f25379, -this.f25376.f46159.m15007());
                    c14594.mo34849(iM35753);
                    return;
                }
                if (enumC8042 == EnumC8040.FIXED) {
                    c14594.mo34849(c15099.m35753());
                }
            }
        }
        if (c14594.f53276) {
            C15094 c150910 = this.f25376;
            if (c150910.f46117) {
                C5218[] c5218Arr = c150910.f46135;
                C5218 c5218 = c5218Arr[0];
                C5218 c5219 = c5218.f16339;
                if (c5219 != null && c5218Arr[1].f16339 != null) {
                    if (c150910.m35729()) {
                        c17418.f53272 = this.f25376.f46135[0].m15007();
                        c17417.f53272 = -this.f25376.f46135[1].m15007();
                        return;
                    }
                    C17417 c17417M21826 = AbstractC8245.m21826(this.f25376.f46135[0]);
                    if (c17417M21826 != null) {
                        AbstractC8245.m21828(c17418, c17417M21826, this.f25376.f46135[0].m15007());
                    }
                    C17417 c17417M21827 = AbstractC8245.m21826(this.f25376.f46135[1]);
                    if (c17417M21827 != null) {
                        AbstractC8245.m21828(c17417, c17417M21827, -this.f25376.f46135[1].m15007());
                    }
                    c17418.f53265 = true;
                    c17417.f53265 = true;
                    return;
                }
                if (c5219 != null) {
                    C17417 c17417M21828 = AbstractC8245.m21826(c5218);
                    if (c17417M21828 != null) {
                        AbstractC8245.m21828(c17418, c17417M21828, this.f25376.f46135[0].m15007());
                        AbstractC8245.m21828(c17417, c17418, c14594.f53271);
                        return;
                    }
                    return;
                }
                C5218 c52110 = c5218Arr[1];
                if (c52110.f16339 != null) {
                    C17417 c17417M21829 = AbstractC8245.m21826(c52110);
                    if (c17417M21829 != null) {
                        AbstractC8245.m21828(c17417, c17417M21829, -this.f25376.f46135[1].m15007());
                        AbstractC8245.m21828(c17418, c17417, -c14594.f53271);
                        return;
                    }
                    return;
                }
                if ((c150910 instanceof C12978) || c150910.f46132 == null || c150910.mo9453(EnumC0278.CENTER).f16339 != null) {
                    return;
                }
                C15094 c150911 = this.f25376;
                AbstractC8245.m21828(c17418, c150911.f46132.f46156.f25382, c150911.m35774());
                AbstractC8245.m21828(c17417, c17418, c14594.f53271);
                return;
            }
        }
        if (this.f25377 == EnumC8040.MATCH_CONSTRAINT) {
            C15094 c150912 = this.f25376;
            int i = c150912.f46145;
            if (i == 2) {
                C15094 c150913 = c150912.f46132;
                if (c150913 != null) {
                    C14594 c14595 = c150913.f46140.f25374;
                    arrayList2.add(c14595);
                    c14595.f53269.add(c14594);
                    c14594.f53265 = true;
                    arrayList.add(c17418);
                    arrayList.add(c17417);
                }
            } else if (i == 3) {
                if (c150912.f46170 == 3) {
                    c17418.f53267 = this;
                    c17417.f53267 = this;
                    C18829 c18829 = c150912.f46140;
                    c18829.f25382.f53267 = this;
                    c18829.f25379.f53267 = this;
                    c14594.f53267 = this;
                    if (c150912.m35749()) {
                        arrayList2.add(this.f25376.f46140.f25374);
                        this.f25376.f46140.f25374.f53269.add(c14594);
                        C18829 c188210 = this.f25376.f46140;
                        c188210.f25374.f53267 = this;
                        arrayList2.add(c188210.f25382);
                        arrayList2.add(this.f25376.f46140.f25379);
                        this.f25376.f46140.f25382.f53269.add(c14594);
                        this.f25376.f46140.f25379.f53269.add(c14594);
                    } else if (this.f25376.m35729()) {
                        this.f25376.f46140.f25374.f53275.add(c14594);
                        arrayList.add(this.f25376.f46140.f25374);
                    } else {
                        this.f25376.f46140.f25374.f53275.add(c14594);
                    }
                } else {
                    C14594 c14596 = c150912.f46140.f25374;
                    arrayList2.add(c14596);
                    c14596.f53269.add(c14594);
                    this.f25376.f46140.f25382.f53269.add(c14594);
                    this.f25376.f46140.f25379.f53269.add(c14594);
                    c14594.f53265 = true;
                    arrayList.add(c17418);
                    arrayList.add(c17417);
                    c17418.f53275.add(c14594);
                    c17417.f53275.add(c14594);
                }
            }
        }
        C15094 c150914 = this.f25376;
        C5218[] c5218Arr2 = c150914.f46135;
        C5218 c52111 = c5218Arr2[0];
        C5218 c52112 = c52111.f16339;
        if (c52112 != null && c5218Arr2[1].f16339 != null) {
            if (c150914.m35729()) {
                c17418.f53272 = this.f25376.f46135[0].m15007();
                c17417.f53272 = -this.f25376.f46135[1].m15007();
                return;
            }
            C17417 c17417M218210 = AbstractC8245.m21826(this.f25376.f46135[0]);
            C17417 c17417M218211 = AbstractC8245.m21826(this.f25376.f46135[1]);
            c17417M218210.m40763((AbstractC8245) this);
            c17417M218211.m40763((AbstractC8245) this);
            this.f25381 = EnumC1189.CENTER;
            return;
        }
        if (c52112 != null) {
            C17417 c17417M218212 = AbstractC8245.m21826(c52111);
            if (c17417M218212 != null) {
                AbstractC8245.m21828(c17418, c17417M218212, this.f25376.f46135[0].m15007());
                m21831(c17417, c17418, 1, c14594);
                return;
            }
            return;
        }
        C5218 c52113 = c5218Arr2[1];
        if (c52113.f16339 != null) {
            C17417 c17417M218213 = AbstractC8245.m21826(c52113);
            if (c17417M218213 != null) {
                AbstractC8245.m21828(c17417, c17417M218213, -this.f25376.f46135[1].m15007());
                m21831(c17418, c17417, -1, c14594);
                return;
            }
            return;
        }
        if ((c150914 instanceof C12978) || (c15096 = c150914.f46132) == null) {
            return;
        }
        AbstractC8245.m21828(c17418, c15096.f46156.f25382, c150914.m35774());
        m21831(c17417, c17418, 1, c14594);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37816(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x027b  */
    /* JADX WARN: Code duplicated, block: B:117:0x028a  */
    @Override // l.AbstractC8245, l.InterfaceC11068
    /* JADX INFO: renamed from: ֫ */
    public final void mo6241(InterfaceC11068 interfaceC11068) {
        int iM21829;
        int i;
        int iM218210;
        C15094 c15094;
        int i2;
        float f;
        int i3;
        if (C8951.f27200[this.f25381.ordinal()] == 3) {
            C15094 c15095 = this.f25376;
            m21830(c15095.f46141, c15095.f46159, 0);
            return;
        }
        C14594 c14594 = this.f25374;
        boolean z = c14594.f53276;
        C17417 c17417 = this.f25382;
        C17417 c17418 = this.f25379;
        if (!z && this.f25377 == EnumC8040.MATCH_CONSTRAINT) {
            C15094 c15096 = this.f25376;
            int i4 = c15096.f46145;
            if (i4 == 2) {
                C15094 c15097 = c15096.f46132;
                if (c15097 != null) {
                    C14594 c14595 = c15097.f46156.f25374;
                    if (c14595.f53276) {
                        c14594.mo34849((int) ((c14595.f53271 * c15096.f46155) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                int i5 = c15096.f46170;
                if (i5 == 0 || i5 == 3) {
                    C18829 c18829 = c15096.f46140;
                    C17417 c17419 = c18829.f25382;
                    C17417 c174110 = c18829.f25379;
                    boolean z2 = c15096.f46141.f16339 != null;
                    boolean z3 = c15096.f46161.f16339 != null;
                    boolean z4 = c15096.f46159.f16339 != null;
                    boolean z5 = c15096.f46133.f16339 != null;
                    int iM35776 = c15096.m35776();
                    if (z2 && z3 && z4 && z5) {
                        float f2 = this.f25376.f46108;
                        boolean z6 = c17419.f53276;
                        ArrayList arrayList = c17419.f53275;
                        int[] iArr = f49379;
                        if (z6 && c174110.f53276) {
                            if (c17417.f53270 && c17418.f53270) {
                                m37816(iArr, ((C17417) c17417.f53275.get(0)).f53271 + c17417.f53272, ((C17417) c17418.f53275.get(0)).f53271 - c17418.f53272, c17419.f53271 + c17419.f53272, c174110.f53271 - c174110.f53272, f2, iM35776);
                                c14594.mo34849(iArr[0]);
                                this.f25376.f46140.f25374.mo34849(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (c17417.f53276 && c17418.f53276) {
                            if (!c17419.f53270 || !c174110.f53270) {
                                return;
                            }
                            m37816(iArr, c17417.f53271 + c17417.f53272, c17418.f53271 - c17418.f53272, ((C17417) arrayList.get(0)).f53271 + c17419.f53272, ((C17417) c174110.f53275.get(0)).f53271 - c174110.f53272, f2, iM35776);
                            c14594.mo34849(iArr[0]);
                            this.f25376.f46140.f25374.mo34849(iArr[1]);
                        }
                        if (!c17417.f53270 || !c17418.f53270 || !c17419.f53270 || !c174110.f53270) {
                            return;
                        }
                        m37816(iArr, ((C17417) c17417.f53275.get(0)).f53271 + c17417.f53272, ((C17417) c17418.f53275.get(0)).f53271 - c17418.f53272, ((C17417) arrayList.get(0)).f53271 + c17419.f53272, ((C17417) c174110.f53275.get(0)).f53271 - c174110.f53272, f2, iM35776);
                        c14594.mo34849(iArr[0]);
                        this.f25376.f46140.f25374.mo34849(iArr[1]);
                    } else if (z2 && z4) {
                        if (!c17417.f53270 || !c17418.f53270) {
                            return;
                        }
                        float f3 = this.f25376.f46108;
                        int i6 = ((C17417) c17417.f53275.get(0)).f53271 + c17417.f53272;
                        int i7 = ((C17417) c17418.f53275.get(0)).f53271 - c17418.f53272;
                        if (iM35776 == -1 || iM35776 == 0) {
                            int iM218211 = m21829(i7 - i6, 0);
                            int i8 = (int) ((iM218211 * f3) + 0.5f);
                            int iM218212 = m21829(i8, 1);
                            if (i8 != iM218212) {
                                iM218211 = (int) ((iM218212 / f3) + 0.5f);
                            }
                            c14594.mo34849(iM218211);
                            this.f25376.f46140.f25374.mo34849(iM218212);
                        } else if (iM35776 == 1) {
                            int iM218213 = m21829(i7 - i6, 0);
                            int i9 = (int) ((iM218213 / f3) + 0.5f);
                            int iM218214 = m21829(i9, 1);
                            if (i9 != iM218214) {
                                iM218213 = (int) ((iM218214 * f3) + 0.5f);
                            }
                            c14594.mo34849(iM218213);
                            this.f25376.f46140.f25374.mo34849(iM218214);
                        }
                    } else if (z3 && z5) {
                        if (!c17419.f53270 || !c174110.f53270) {
                            return;
                        }
                        float f4 = this.f25376.f46108;
                        int i10 = ((C17417) c17419.f53275.get(0)).f53271 + c17419.f53272;
                        int i11 = ((C17417) c174110.f53275.get(0)).f53271 - c174110.f53272;
                        if (iM35776 == -1) {
                            iM21829 = m21829(i11 - i10, 1);
                            i = (int) ((iM21829 / f4) + 0.5f);
                            iM218210 = m21829(i, 0);
                            if (i != iM218210) {
                                iM21829 = (int) ((iM218210 * f4) + 0.5f);
                            }
                            c14594.mo34849(iM218210);
                            this.f25376.f46140.f25374.mo34849(iM21829);
                        } else if (iM35776 == 0) {
                            int iM218215 = m21829(i11 - i10, 1);
                            int i12 = (int) ((iM218215 * f4) + 0.5f);
                            int iM218216 = m21829(i12, 0);
                            if (i12 != iM218216) {
                                iM218215 = (int) ((iM218216 / f4) + 0.5f);
                            }
                            c14594.mo34849(iM218216);
                            this.f25376.f46140.f25374.mo34849(iM218215);
                        } else if (iM35776 == 1) {
                            iM21829 = m21829(i11 - i10, 1);
                            i = (int) ((iM21829 / f4) + 0.5f);
                            iM218210 = m21829(i, 0);
                            if (i != iM218210) {
                                iM21829 = (int) ((iM218210 * f4) + 0.5f);
                            }
                            c14594.mo34849(iM218210);
                            this.f25376.f46140.f25374.mo34849(iM21829);
                        }
                    }
                } else {
                    int iM35777 = c15096.m35776();
                    if (iM35777 != -1) {
                        if (iM35777 == 0) {
                            C15094 c15098 = this.f25376;
                            f = c15098.f46140.f25374.f53271 / c15098.f46108;
                            i3 = (int) (f + 0.5f);
                        } else if (iM35777 != 1) {
                            i3 = 0;
                        } else {
                            c15094 = this.f25376;
                            i2 = c15094.f46140.f25374.f53271;
                        }
                        c14594.mo34849(i3);
                    } else {
                        c15094 = this.f25376;
                        i2 = c15094.f46140.f25374.f53271;
                    }
                    f = i2 * c15094.f46108;
                    i3 = (int) (f + 0.5f);
                    c14594.mo34849(i3);
                }
            }
        }
        boolean z7 = c17417.f53270;
        ArrayList arrayList2 = c17417.f53275;
        if (z7) {
            boolean z8 = c17418.f53270;
            ArrayList arrayList3 = c17418.f53275;
            if (z8) {
                if (c17417.f53276 && c17418.f53276 && c14594.f53276) {
                    return;
                }
                if (!c14594.f53276 && this.f25377 == EnumC8040.MATCH_CONSTRAINT) {
                    C15094 c15099 = this.f25376;
                    if (c15099.f46145 == 0 && !c15099.m35729()) {
                        C17417 c174111 = (C17417) arrayList2.get(0);
                        C17417 c174112 = (C17417) arrayList3.get(0);
                        int i13 = c174111.f53271 + c17417.f53272;
                        int i14 = c174112.f53271 + c17418.f53272;
                        c17417.mo34849(i13);
                        c17418.mo34849(i14);
                        c14594.mo34849(i14 - i13);
                        return;
                    }
                }
                if (!c14594.f53276 && this.f25377 == EnumC8040.MATCH_CONSTRAINT && this.f25380 == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((C17417) arrayList3.get(0)).f53271 + c17418.f53272) - (((C17417) arrayList2.get(0)).f53271 + c17417.f53272), c14594.f44683);
                    C15094 c150910 = this.f25376;
                    int i15 = c150910.f46113;
                    int iMax = Math.max(c150910.f46153, iMin);
                    if (i15 > 0) {
                        iMax = Math.min(i15, iMax);
                    }
                    c14594.mo34849(iMax);
                }
                if (c14594.f53276) {
                    C17417 c174113 = (C17417) arrayList2.get(0);
                    C17417 c174114 = (C17417) arrayList3.get(0);
                    int i16 = c174113.f53271 + c17417.f53272;
                    int i17 = c174114.f53271 + c17418.f53272;
                    float fM35772 = this.f25376.m35772();
                    if (c174113 == c174114) {
                        i16 = c174113.f53271;
                        i17 = c174114.f53271;
                        fM35772 = 0.5f;
                    }
                    c17417.mo34849((int) ((((i17 - i16) - c14594.f53271) * fM35772) + i16 + 0.5f));
                    c17418.mo34849(c17417.f53271 + c14594.f53271);
                }
            }
        }
    }

    @Override // l.AbstractC8245
    /* JADX INFO: renamed from: ۧ */
    public final void mo6242() {
        C17417 c17417 = this.f25382;
        if (c17417.f53276) {
            this.f25376.m35706(c17417.f53271);
        }
    }
}
