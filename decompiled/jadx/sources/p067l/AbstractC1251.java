package p067l;

/* JADX INFO: renamed from: l.۠ܶ */
/* JADX INFO: compiled from: M1C7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1251 implements InterfaceC1391 {

    /* JADX INFO: renamed from: ۜ */
    public C0971 f28285;

    /* JADX INFO: renamed from: ۢ */
    public C1591 f28286;

    /* JADX INFO: renamed from: ۧ */
    public EnumC1241 f28287;

    /* JADX INFO: renamed from: ܿ */
    public int f28290;

    /* JADX INFO: renamed from: ֫ */
    public C1566 f28284 = new C1566(this);

    /* JADX INFO: renamed from: ܳ */
    public int f28288 = 0;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f28293 = false;

    /* JADX INFO: renamed from: ᩷ */
    public C1706 f28292 = new C1706(this);

    /* JADX INFO: renamed from: ܽ */
    public C1706 f28289 = new C1706(this);

    /* JADX INFO: renamed from: ᩳ */
    public EnumC0901 f28291 = EnumC0901.NONE;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8442();

    @Override // p067l.InterfaceC1391
    /* JADX INFO: renamed from: ֫ */
    public void mo8443(InterfaceC1391 interfaceC1391) {
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo8444();

    /* JADX INFO: renamed from: ܳ */
    public abstract boolean mo8445();

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo8446();

    public AbstractC1251(C1591 c1591) {
        this.f28286 = c1591;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1706 m23796(C1101 c1101) {
        C1101 c1102 = c1101.f19179;
        if (c1102 == null) {
            return null;
        }
        C1591 c1591 = c1102.f19181;
        int i = C1111.f19755[c1102.f19185.ordinal()];
        if (i == 1) {
            return c1591.f49276.f28292;
        }
        if (i == 2) {
            return c1591.f49276.f28289;
        }
        if (i == 3) {
            return c1591.f49260.f28292;
        }
        if (i == 4) {
            return c1591.f49260.f62630;
        }
        if (i != 5) {
            return null;
        }
        return c1591.f49260.f28289;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX INFO: renamed from: ֫ */
    public final void m23800(C1101 c1101, C1101 c1102, int i) {
        C1566 c1566;
        float f;
        int i2;
        C1706 c1706M23796 = m23796(c1101);
        C1706 c1706M23797 = m23796(c1102);
        if (c1706M23796.f56464 && c1706M23797.f56464) {
            int iM16917 = c1101.m16917() + c1706M23796.f56459;
            int iM16918 = c1706M23797.f56459 - c1102.m16917();
            int i3 = iM16918 - iM16917;
            C1566 c1567 = this.f28284;
            if (!c1567.f56464) {
                EnumC1241 enumC1241 = this.f28287;
                EnumC1241 enumC1242 = EnumC1241.MATCH_CONSTRAINT;
                if (enumC1241 == enumC1242) {
                    int i4 = this.f28290;
                    if (i4 == 0) {
                        c1567.mo37000(m23799(i3, i));
                    } else if (i4 == 1) {
                        c1567.mo37000(Math.min(m23799(c1567.f47790, i), i3));
                    } else if (i4 == 2) {
                        C1591 c1591 = this.f28286;
                        C1591 c1592 = c1591.f49252;
                        if (c1592 != null) {
                            C1566 c1568 = (i == 0 ? c1592.f49276 : c1592.f49260).f28284;
                            if (c1568.f56464) {
                                c1567.mo37000(m23799((int) ((c1568.f56459 * (i == 0 ? c1591.f49275 : c1591.f49277)) + 0.5f), i));
                            }
                        }
                    } else if (i4 == 3) {
                        C1591 c1593 = this.f28286;
                        AbstractC1251 abstractC1251 = c1593.f49276;
                        if (abstractC1251.f28287 == enumC1242 && abstractC1251.f28290 == 3) {
                            C1776 c1776 = c1593.f49260;
                            if (c1776.f28287 != enumC1242 || c1776.f28290 != 3) {
                                if (i == 0) {
                                    abstractC1251 = c1593.f49260;
                                }
                                c1566 = abstractC1251.f28284;
                                if (c1566.f56464) {
                                    f = c1593.f49228;
                                    if (i == 1) {
                                        i2 = (int) ((c1566.f56459 / f) + 0.5f);
                                    } else {
                                        i2 = (int) ((f * c1566.f56459) + 0.5f);
                                    }
                                    c1567.mo37000(i2);
                                }
                            }
                        } else {
                            if (i == 0) {
                                abstractC1251 = c1593.f49260;
                            }
                            c1566 = abstractC1251.f28284;
                            if (c1566.f56464) {
                                f = c1593.f49228;
                                if (i == 1) {
                                    i2 = (int) ((c1566.f56459 / f) + 0.5f);
                                } else {
                                    i2 = (int) ((f * c1566.f56459) + 0.5f);
                                }
                                c1567.mo37000(i2);
                            }
                        }
                    }
                }
            }
            if (c1567.f56464) {
                int i5 = c1567.f56459;
                C1706 c1706 = this.f28289;
                C1706 c1707 = this.f28292;
                if (i5 == i3) {
                    c1707.mo37000(iM16917);
                    c1706.mo37000(iM16918);
                    return;
                }
                C1591 c1594 = this.f28286;
                float fM37930 = i == 0 ? c1594.m37930() : c1594.m37888();
                if (c1706M23796 == c1706M23797) {
                    iM16917 = c1706M23796.f56459;
                    iM16918 = c1706M23797.f56459;
                    fM37930 = 0.5f;
                }
                c1707.mo37000((int) ((((iM16918 - iM16917) - c1567.f56459) * fM37930) + iM16917 + 0.5f));
                c1706.mo37000(c1707.f56459 + c1567.f56459);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m23799(int i, int i2) {
        if (i2 == 0) {
            C1591 c1591 = this.f28286;
            int i3 = c1591.f49233;
            int iMax = Math.max(c1591.f49273, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            C1591 c1592 = this.f28286;
            int i4 = c1592.f49248;
            int iMax2 = Math.max(c1592.f49258, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1706 m23797(C1101 c1101, int i) {
        C1101 c1102 = c1101.f19179;
        if (c1102 == null) {
            return null;
        }
        C1591 c1591 = c1102.f19181;
        AbstractC1251 abstractC1251 = i == 0 ? c1591.f49276 : c1591.f49260;
        int i2 = C1111.f19755[c1102.f19185.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return abstractC1251.f28289;
        }
        return abstractC1251.f28292;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23798(C1706 c1706, C1706 c1707, int i) {
        c1706.f56463.add(c1707);
        c1706.f56460 = i;
        c1707.f56457.add(c1706);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23801(C1706 c1706, C1706 c1707, int i, C1566 c1566) {
        c1706.f56463.add(c1707);
        c1706.f56463.add(this.f28284);
        c1706.f56461 = i;
        c1706.f56462 = c1566;
        c1707.f56457.add(c1706);
        c1566.f56457.add(c1706);
    }

    /* JADX INFO: renamed from: ᩳ */
    public long mo8447() {
        C1566 c1566 = this.f28284;
        if (c1566.f56464) {
            return c1566.f56459;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m23802() {
        return this.f28293;
    }
}
