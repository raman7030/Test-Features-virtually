package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819P */
/* JADX INFO: loaded from: classes5.dex */
public final class C18829 extends AbstractC8245 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C17417 f59402;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C11568 f59403;

    public C18829(C15094 c15094) {
        super(c15094);
        C17417 c17417 = new C17417(this);
        this.f59402 = c17417;
        this.f59403 = null;
        this.f25382.f53268 = EnumC18123.TOP;
        this.f25379.f53268 = EnumC18123.BOTTOM;
        c17417.f53268 = EnumC18123.BASELINE;
        this.f25378 = 1;
    }

    public final String toString() {
        return "VerticalRun " + this.f25376.m35751();
    }

    @Override // l.AbstractC8245
    /* JADX INFO: renamed from: ܽ */
    public final void mo6244() {
        this.f25375 = null;
        this.f25382.m40762();
        this.f25379.m40762();
        this.f59402.m40762();
        this.f25374.m40762();
        this.f25383 = false;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m43506() {
        this.f25383 = false;
        C17417 c17417 = this.f25382;
        c17417.m40762();
        c17417.f53276 = false;
        C17417 c17418 = this.f25379;
        c17418.m40762();
        c17418.f53276 = false;
        C17417 c17419 = this.f59402;
        c17419.m40762();
        c17419.f53276 = false;
        this.f25374.f53276 = false;
    }

    @Override // l.AbstractC8245
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo6243() {
        return this.f25377 != EnumC8040.MATCH_CONSTRAINT || this.f25376.f46170 == 0;
    }

    @Override // l.AbstractC8245, l.InterfaceC11068
    /* JADX INFO: renamed from: ֫ */
    public final void mo6241(InterfaceC11068 interfaceC11068) {
        C15094 c15094;
        int i;
        float f;
        int i2;
        if (C4012.f12741[this.f25381.ordinal()] == 3) {
            C15094 c15095 = this.f25376;
            m21830(c15095.f46161, c15095.f46133, 1);
            return;
        }
        C14594 c14594 = this.f25374;
        if (c14594.f53270 && !c14594.f53276 && this.f25377 == EnumC8040.MATCH_CONSTRAINT) {
            C15094 c15096 = this.f25376;
            int i3 = c15096.f46170;
            if (i3 != 2) {
                if (i3 == 3 && c15096.f46156.f25374.f53276) {
                    int iM35776 = c15096.m35776();
                    if (iM35776 == -1) {
                        c15094 = this.f25376;
                        i = c15094.f46156.f25374.f53271;
                    } else {
                        if (iM35776 == 0) {
                            C15094 c15097 = this.f25376;
                            f = c15097.f46156.f25374.f53271 * c15097.f46108;
                            i2 = (int) (f + 0.5f);
                        } else if (iM35776 != 1) {
                            i2 = 0;
                        } else {
                            c15094 = this.f25376;
                            i = c15094.f46156.f25374.f53271;
                        }
                        c14594.mo34849(i2);
                    }
                    f = i / c15094.f46108;
                    i2 = (int) (f + 0.5f);
                    c14594.mo34849(i2);
                }
            } else {
                C15094 c15098 = c15096.f46132;
                if (c15098 != null) {
                    C14594 c14595 = c15098.f46140.f25374;
                    if (c14595.f53276) {
                        c14594.mo34849((int) ((c14595.f53271 * c15096.f46157) + 0.5f));
                    }
                }
            }
        }
        C17417 c17417 = this.f25382;
        boolean z = c17417.f53270;
        ArrayList arrayList = c17417.f53275;
        if (z) {
            C17417 c17418 = this.f25379;
            boolean z2 = c17418.f53270;
            ArrayList arrayList2 = c17418.f53275;
            if (z2) {
                if (c17417.f53276 && c17418.f53276 && c14594.f53276) {
                    return;
                }
                if (!c14594.f53276 && this.f25377 == EnumC8040.MATCH_CONSTRAINT) {
                    C15094 c15099 = this.f25376;
                    if (c15099.f46145 == 0 && !c15099.m35749()) {
                        C17417 c17419 = (C17417) arrayList.get(0);
                        C17417 c174110 = (C17417) arrayList2.get(0);
                        int i4 = c17419.f53271 + c17417.f53272;
                        int i5 = c174110.f53271 + c17418.f53272;
                        c17417.mo34849(i4);
                        c17418.mo34849(i5);
                        c14594.mo34849(i5 - i4);
                        return;
                    }
                }
                if (!c14594.f53276 && this.f25377 == EnumC8040.MATCH_CONSTRAINT && this.f25380 == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C17417 c174111 = (C17417) arrayList.get(0);
                    int i6 = (((C17417) arrayList2.get(0)).f53271 + c17418.f53272) - (c174111.f53271 + c17417.f53272);
                    int i7 = c14594.f44683;
                    if (i6 < i7) {
                        c14594.mo34849(i6);
                    } else {
                        c14594.mo34849(i7);
                    }
                }
                if (c14594.f53276 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C17417 c174112 = (C17417) arrayList.get(0);
                    C17417 c174113 = (C17417) arrayList2.get(0);
                    int i8 = c174112.f53271 + c17417.f53272;
                    int i9 = c174113.f53271 + c17418.f53272;
                    float fM35730 = this.f25376.m35730();
                    if (c174112 == c174113) {
                        i8 = c174112.f53271;
                        i9 = c174113.f53271;
                        fM35730 = 0.5f;
                    }
                    c17417.mo34849((int) ((((i9 - i8) - c14594.f53271) * fM35730) + i8 + 0.5f));
                    c17418.mo34849(c17417.f53271 + c14594.f53271);
                }
            }
        }
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
            c14594.mo34849(c15098.m35732());
        }
        boolean z2 = c14594.f53276;
        ArrayList arrayList = c14594.f53269;
        ArrayList arrayList2 = c14594.f53275;
        C17417 c17417 = this.f25379;
        C17417 c17418 = this.f25382;
        if (!z2) {
            C15094 c15099 = this.f25376;
            this.f25377 = c15099.f46124[1];
            if (c15099.m35771()) {
                this.f59403 = new C11568(this);
            }
            EnumC8040 enumC8040 = this.f25377;
            if (enumC8040 != EnumC8040.MATCH_CONSTRAINT) {
                if (enumC8040 == EnumC8040.MATCH_PARENT && (c15097 = this.f25376.f46132) != null && c15097.f46124[1] == EnumC8040.FIXED) {
                    int iM35732 = (c15097.m35732() - this.f25376.f46161.m15007()) - this.f25376.f46133.m15007();
                    AbstractC8245.m21828(c17418, c15097.f46140.f25382, this.f25376.f46161.m15007());
                    AbstractC8245.m21828(c17417, c15097.f46140.f25379, -this.f25376.f46133.m15007());
                    c14594.mo34849(iM35732);
                    return;
                }
                if (enumC8040 == EnumC8040.FIXED) {
                    c14594.mo34849(this.f25376.m35732());
                }
            }
        } else if (this.f25377 == EnumC8040.MATCH_PARENT && (c15095 = (c15094 = this.f25376).f46132) != null && c15095.f46124[1] == EnumC8040.FIXED) {
            AbstractC8245.m21828(c17418, c15095.f46140.f25382, c15094.f46161.m15007());
            AbstractC8245.m21828(c17417, c15095.f46140.f25379, -this.f25376.f46133.m15007());
            return;
        }
        boolean z3 = c14594.f53276;
        C17417 c17419 = this.f59402;
        if (z3) {
            C15094 c150910 = this.f25376;
            if (c150910.f46117) {
                C5218[] c5218Arr = c150910.f46135;
                C5218 c5218 = c5218Arr[2];
                C5218 c5219 = c5218.f16339;
                if (c5219 != null && c5218Arr[3].f16339 != null) {
                    if (c150910.m35749()) {
                        c17418.f53272 = this.f25376.f46135[2].m15007();
                        c17417.f53272 = -this.f25376.f46135[3].m15007();
                    } else {
                        C17417 c17417M21826 = AbstractC8245.m21826(this.f25376.f46135[2]);
                        if (c17417M21826 != null) {
                            AbstractC8245.m21828(c17418, c17417M21826, this.f25376.f46135[2].m15007());
                        }
                        C17417 c17417M21827 = AbstractC8245.m21826(this.f25376.f46135[3]);
                        if (c17417M21827 != null) {
                            AbstractC8245.m21828(c17417, c17417M21827, -this.f25376.f46135[3].m15007());
                        }
                        c17418.f53265 = true;
                        c17417.f53265 = true;
                    }
                    if (this.f25376.m35771()) {
                        AbstractC8245.m21828(c17419, c17418, this.f25376.m35756());
                        return;
                    }
                    return;
                }
                if (c5219 != null) {
                    C17417 c17417M21828 = AbstractC8245.m21826(c5218);
                    if (c17417M21828 != null) {
                        AbstractC8245.m21828(c17418, c17417M21828, this.f25376.f46135[2].m15007());
                        AbstractC8245.m21828(c17417, c17418, c14594.f53271);
                        if (this.f25376.m35771()) {
                            AbstractC8245.m21828(c17419, c17418, this.f25376.m35756());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C5218 c52110 = c5218Arr[3];
                if (c52110.f16339 != null) {
                    C17417 c17417M21829 = AbstractC8245.m21826(c52110);
                    if (c17417M21829 != null) {
                        AbstractC8245.m21828(c17417, c17417M21829, -this.f25376.f46135[3].m15007());
                        AbstractC8245.m21828(c17418, c17417, -c14594.f53271);
                    }
                    if (this.f25376.m35771()) {
                        AbstractC8245.m21828(c17419, c17418, this.f25376.m35756());
                        return;
                    }
                    return;
                }
                C5218 c52111 = c5218Arr[4];
                if (c52111.f16339 != null) {
                    C17417 c17417M218210 = AbstractC8245.m21826(c52111);
                    if (c17417M218210 != null) {
                        AbstractC8245.m21828(c17419, c17417M218210, 0);
                        AbstractC8245.m21828(c17418, c17419, -this.f25376.m35756());
                        AbstractC8245.m21828(c17417, c17418, c14594.f53271);
                        return;
                    }
                    return;
                }
                if ((c150910 instanceof C12978) || c150910.f46132 == null || c150910.mo9453(EnumC0278.CENTER).f16339 != null) {
                    return;
                }
                C15094 c150911 = this.f25376;
                AbstractC8245.m21828(c17418, c150911.f46132.f46140.f25382, c150911.m35775());
                AbstractC8245.m21828(c17417, c17418, c14594.f53271);
                if (this.f25376.m35771()) {
                    AbstractC8245.m21828(c17419, c17418, this.f25376.m35756());
                    return;
                }
                return;
            }
        }
        if (z3 || this.f25377 != EnumC8040.MATCH_CONSTRAINT) {
            c14594.m40763((AbstractC8245) this);
        } else {
            C15094 c150912 = this.f25376;
            int i = c150912.f46170;
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
            } else if (i == 3 && !c150912.m35749()) {
                C15094 c150914 = this.f25376;
                if (c150914.f46145 != 3) {
                    C14594 c14596 = c150914.f46156.f25374;
                    arrayList2.add(c14596);
                    c14596.f53269.add(c14594);
                    c14594.f53265 = true;
                    arrayList.add(c17418);
                    arrayList.add(c17417);
                }
            }
        }
        C15094 c150915 = this.f25376;
        C5218[] c5218Arr2 = c150915.f46135;
        C5218 c52112 = c5218Arr2[2];
        C5218 c52113 = c52112.f16339;
        if (c52113 != null && c5218Arr2[3].f16339 != null) {
            if (c150915.m35749()) {
                c17418.f53272 = this.f25376.f46135[2].m15007();
                c17417.f53272 = -this.f25376.f46135[3].m15007();
            } else {
                C17417 c17417M218211 = AbstractC8245.m21826(this.f25376.f46135[2]);
                C17417 c17417M218212 = AbstractC8245.m21826(this.f25376.f46135[3]);
                c17417M218211.m40763((AbstractC8245) this);
                c17417M218212.m40763((AbstractC8245) this);
                this.f25381 = EnumC1189.CENTER;
            }
            if (this.f25376.m35771()) {
                m21831(c17419, c17418, 1, this.f59403);
            }
        } else if (c52113 != null) {
            C17417 c17417M218213 = AbstractC8245.m21826(c52112);
            if (c17417M218213 != null) {
                AbstractC8245.m21828(c17418, c17417M218213, this.f25376.f46135[2].m15007());
                m21831(c17417, c17418, 1, c14594);
                if (this.f25376.m35771()) {
                    m21831(c17419, c17418, 1, this.f59403);
                }
                EnumC8040 enumC8041 = this.f25377;
                EnumC8040 enumC8042 = EnumC8040.MATCH_CONSTRAINT;
                if (enumC8041 == enumC8042) {
                    C15094 c150916 = this.f25376;
                    if (c150916.f46108 > 0.0f) {
                        C16005 c16005 = c150916.f46156;
                        if (c16005.f25377 == enumC8042) {
                            c16005.f25374.f53269.add(c14594);
                            arrayList2.add(this.f25376.f46156.f25374);
                            c14594.f53267 = this;
                        }
                    }
                }
            }
        } else {
            C5218 c52114 = c5218Arr2[3];
            if (c52114.f16339 != null) {
                C17417 c17417M218214 = AbstractC8245.m21826(c52114);
                if (c17417M218214 != null) {
                    AbstractC8245.m21828(c17417, c17417M218214, -this.f25376.f46135[3].m15007());
                    m21831(c17418, c17417, -1, c14594);
                    if (this.f25376.m35771()) {
                        m21831(c17419, c17418, 1, this.f59403);
                    }
                }
            } else {
                C5218 c52115 = c5218Arr2[4];
                if (c52115.f16339 != null) {
                    C17417 c17417M218215 = AbstractC8245.m21826(c52115);
                    if (c17417M218215 != null) {
                        AbstractC8245.m21828(c17419, c17417M218215, 0);
                        m21831(c17418, c17419, -1, this.f59403);
                        m21831(c17417, c17418, 1, c14594);
                    }
                } else if (!(c150915 instanceof C12978) && (c15096 = c150915.f46132) != null) {
                    AbstractC8245.m21828(c17418, c15096.f46140.f25382, c150915.m35775());
                    m21831(c17417, c17418, 1, c14594);
                    if (this.f25376.m35771()) {
                        m21831(c17419, c17418, 1, this.f59403);
                    }
                    EnumC8040 enumC8043 = this.f25377;
                    EnumC8040 enumC8044 = EnumC8040.MATCH_CONSTRAINT;
                    if (enumC8043 == enumC8044) {
                        C15094 c150917 = this.f25376;
                        if (c150917.f46108 > 0.0f) {
                            C16005 c16006 = c150917.f46156;
                            if (c16006.f25377 == enumC8044) {
                                c16006.f25374.f53269.add(c14594);
                                arrayList2.add(this.f25376.f46156.f25374);
                                c14594.f53267 = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c14594.f53270 = true;
        }
    }

    @Override // l.AbstractC8245
    /* JADX INFO: renamed from: ۧ */
    public final void mo6242() {
        C17417 c17417 = this.f25382;
        if (c17417.f53276) {
            this.f25376.m35731(c17417.f53271);
        }
    }
}
