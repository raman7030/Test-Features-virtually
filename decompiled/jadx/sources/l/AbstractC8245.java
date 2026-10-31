package l;

/* JADX INFO: renamed from: l.۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1C7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8245 implements InterfaceC11068 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C2601 f25375;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C15094 f25376;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC8040 f25377;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f25380;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14594 f25374 = new C14594(this);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f25378 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f25383 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C17417 f25382 = new C17417(this);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C17417 f25379 = new C17417(this);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumC1189 f25381 = EnumC1189.NONE;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo6240();

    @Override // l.InterfaceC11068
    /* JADX INFO: renamed from: ֫ */
    public void mo6241(InterfaceC11068 interfaceC11068) {
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo6242();

    /* JADX INFO: renamed from: ܳ */
    public abstract boolean mo6243();

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo6244();

    public AbstractC8245(C15094 c15094) {
        this.f25376 = c15094;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17417 m21826(C5218 c5218) {
        C5218 c5219 = c5218.f16339;
        if (c5219 == null) {
            return null;
        }
        C15094 c15094 = c5219.f16341;
        int i = C5423.f16914[c5219.f16345.ordinal()];
        if (i == 1) {
            return c15094.f46156.f25382;
        }
        if (i == 2) {
            return c15094.f46156.f25379;
        }
        if (i == 3) {
            return c15094.f46140.f25382;
        }
        if (i == 4) {
            return c15094.f46140.f59402;
        }
        if (i != 5) {
            return null;
        }
        return c15094.f46140.f25379;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21830(C5218 c5218, C5218 c5219, int i) {
        C14594 c14594;
        float f;
        int i2;
        C17417 c17417M21826 = m21826(c5218);
        C17417 c17417M21827 = m21826(c5219);
        if (c17417M21826.f53276 && c17417M21827.f53276) {
            int iM15007 = c5218.m15007() + c17417M21826.f53271;
            int iM15008 = c17417M21827.f53271 - c5219.m15007();
            int i3 = iM15008 - iM15007;
            C14594 c14595 = this.f25374;
            if (!c14595.f53276) {
                EnumC8040 enumC8040 = this.f25377;
                EnumC8040 enumC8041 = EnumC8040.MATCH_CONSTRAINT;
                if (enumC8040 == enumC8041) {
                    int i4 = this.f25380;
                    if (i4 == 0) {
                        c14595.mo34849(m21829(i3, i));
                    } else if (i4 == 1) {
                        c14595.mo34849(Math.min(m21829(c14595.f44683, i), i3));
                    } else if (i4 == 2) {
                        C15094 c15094 = this.f25376;
                        C15094 c15095 = c15094.f46132;
                        if (c15095 != null) {
                            C14594 c14596 = (i == 0 ? c15095.f46156 : c15095.f46140).f25374;
                            if (c14596.f53276) {
                                c14595.mo34849(m21829((int) ((c14596.f53271 * (i == 0 ? c15094.f46155 : c15094.f46157)) + 0.5f), i));
                            }
                        }
                    } else if (i4 == 3) {
                        C15094 c15096 = this.f25376;
                        AbstractC8245 abstractC8245 = c15096.f46156;
                        if (abstractC8245.f25377 == enumC8041 && abstractC8245.f25380 == 3) {
                            C18829 c18829 = c15096.f46140;
                            if (c18829.f25377 != enumC8041 || c18829.f25380 != 3) {
                                if (i == 0) {
                                    abstractC8245 = c15096.f46140;
                                }
                                c14594 = abstractC8245.f25374;
                                if (c14594.f53276) {
                                    f = c15096.f46108;
                                    if (i == 1) {
                                        i2 = (int) ((c14594.f53271 / f) + 0.5f);
                                    } else {
                                        i2 = (int) ((f * c14594.f53271) + 0.5f);
                                    }
                                    c14595.mo34849(i2);
                                }
                            }
                        } else {
                            if (i == 0) {
                                abstractC8245 = c15096.f46140;
                            }
                            c14594 = abstractC8245.f25374;
                            if (c14594.f53276) {
                                f = c15096.f46108;
                                if (i == 1) {
                                    i2 = (int) ((c14594.f53271 / f) + 0.5f);
                                } else {
                                    i2 = (int) ((f * c14594.f53271) + 0.5f);
                                }
                                c14595.mo34849(i2);
                            }
                        }
                    }
                }
            }
            if (c14595.f53276) {
                int i5 = c14595.f53271;
                C17417 c17417 = this.f25379;
                C17417 c17418 = this.f25382;
                if (i5 == i3) {
                    c17418.mo34849(iM15007);
                    c17417.mo34849(iM15008);
                    return;
                }
                C15094 c15097 = this.f25376;
                float fM35772 = i == 0 ? c15097.m35772() : c15097.m35730();
                if (c17417M21826 == c17417M21827) {
                    iM15007 = c17417M21826.f53271;
                    iM15008 = c17417M21827.f53271;
                    fM35772 = 0.5f;
                }
                c17418.mo34849((int) ((((iM15008 - iM15007) - c14595.f53271) * fM35772) + iM15007 + 0.5f));
                c17417.mo34849(c17418.f53271 + c14595.f53271);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m21829(int i, int i2) {
        if (i2 == 0) {
            C15094 c15094 = this.f25376;
            int i3 = c15094.f46113;
            int iMax = Math.max(c15094.f46153, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            C15094 c15095 = this.f25376;
            int i4 = c15095.f46128;
            int iMax2 = Math.max(c15095.f46138, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17417 m21827(C5218 c5218, int i) {
        C5218 c5219 = c5218.f16339;
        if (c5219 == null) {
            return null;
        }
        C15094 c15094 = c5219.f16341;
        AbstractC8245 abstractC8245 = i == 0 ? c15094.f46156 : c15094.f46140;
        int i2 = C5423.f16914[c5219.f16345.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return abstractC8245.f25379;
        }
        return abstractC8245.f25382;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21828(C17417 c17417, C17417 c17418, int i) {
        c17417.f53275.add(c17418);
        c17417.f53272 = i;
        c17418.f53269.add(c17417);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21831(C17417 c17417, C17417 c17418, int i, C14594 c14594) {
        c17417.f53275.add(c17418);
        c17417.f53275.add(this.f25374);
        c17417.f53273 = i;
        c17417.f53274 = c14594;
        c17418.f53269.add(c17417);
        c14594.f53269.add(c17417);
    }

    /* JADX INFO: renamed from: ᩳ */
    public long mo6245() {
        C14594 c14594 = this.f25374;
        if (c14594.f53276) {
            return c14594.f53271;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m21832() {
        return this.f25383;
    }
}
