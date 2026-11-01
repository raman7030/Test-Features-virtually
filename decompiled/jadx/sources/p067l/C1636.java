package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺܶ */
/* JADX INFO: compiled from: S1AA */
/* JADX INFO: loaded from: classes5.dex */
public final class C1636 extends AbstractC1251 {

    /* JADX INFO: renamed from: ۡ */
    public static int[] f52542 = new int[2];

    public C1636(C1591 c1591) {
        super(c1591);
        this.f28292.f56456 = EnumC1741.LEFT;
        this.f28289.f56456 = EnumC1741.RIGHT;
        this.f28288 = 0;
    }

    public final String toString() {
        return "HorizontalRun " + this.f28286.m37909();
    }

    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ܽ */
    public final void mo8446() {
        this.f28285 = null;
        this.f28292.m43019();
        this.f28289.m43019();
        this.f28284.m43019();
        this.f28293 = false;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m40003() {
        this.f28293 = false;
        C1706 c1706 = this.f28292;
        c1706.m43019();
        c1706.f56464 = false;
        C1706 c1707 = this.f28289;
        c1707.m43019();
        c1707.f56464 = false;
        this.f28284.f56464 = false;
    }

    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo8445() {
        return this.f28287 != EnumC1241.MATCH_CONSTRAINT || this.f28286.f49265 == 0;
    }

    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ֫ */
    public final void mo8442() {
        C1591 c1591;
        C1591 c1592;
        C1591 c1593;
        C1591 c1594;
        C1591 c1595 = this.f28286;
        boolean z = c1595.f49237;
        C1566 c1566 = this.f28284;
        if (z) {
            c1566.mo37000(c1595.m37911());
        }
        boolean z2 = c1566.f56464;
        ArrayList arrayList = c1566.f56457;
        ArrayList arrayList2 = c1566.f56463;
        C1706 c1706 = this.f28289;
        C1706 c1707 = this.f28292;
        if (z2) {
            EnumC1241 enumC1241 = this.f28287;
            EnumC1241 enumC1242 = EnumC1241.MATCH_PARENT;
            if (enumC1241 == enumC1242 && (((c1592 = (c1591 = this.f28286).f49252) != null && c1592.f49244[0] == EnumC1241.FIXED) || c1592.f49244[0] == enumC1242)) {
                AbstractC1251.m23798(c1707, c1592.f49276.f28292, c1591.f49261.m16917());
                AbstractC1251.m23798(c1706, c1592.f49276.f28289, -this.f28286.f49279.m16917());
                return;
            }
        } else {
            C1591 c1596 = this.f28286;
            EnumC1241 enumC1243 = c1596.f49244[0];
            this.f28287 = enumC1243;
            if (enumC1243 != EnumC1241.MATCH_CONSTRAINT) {
                EnumC1241 enumC1244 = EnumC1241.MATCH_PARENT;
                if (enumC1243 == enumC1244 && (((c1594 = c1596.f49252) != null && c1594.f49244[0] == EnumC1241.FIXED) || c1594.f49244[0] == enumC1244)) {
                    int iM37911 = (c1594.m37911() - this.f28286.f49261.m16917()) - this.f28286.f49279.m16917();
                    AbstractC1251.m23798(c1707, c1594.f49276.f28292, this.f28286.f49261.m16917());
                    AbstractC1251.m23798(c1706, c1594.f49276.f28289, -this.f28286.f49279.m16917());
                    c1566.mo37000(iM37911);
                    return;
                }
                if (enumC1243 == EnumC1241.FIXED) {
                    c1566.mo37000(c1596.m37911());
                }
            }
        }
        if (c1566.f56464) {
            C1591 c1597 = this.f28286;
            if (c1597.f49237) {
                C1101[] c1101Arr = c1597.f49255;
                C1101 c1101 = c1101Arr[0];
                C1101 c1102 = c1101.f19179;
                if (c1102 != null && c1101Arr[1].f19179 != null) {
                    if (c1597.m37887()) {
                        c1707.f56460 = this.f28286.f49255[0].m16917();
                        c1706.f56460 = -this.f28286.f49255[1].m16917();
                        return;
                    }
                    C1706 c1706M23796 = AbstractC1251.m23796(this.f28286.f49255[0]);
                    if (c1706M23796 != null) {
                        AbstractC1251.m23798(c1707, c1706M23796, this.f28286.f49255[0].m16917());
                    }
                    C1706 c1706M23797 = AbstractC1251.m23796(this.f28286.f49255[1]);
                    if (c1706M23797 != null) {
                        AbstractC1251.m23798(c1706, c1706M23797, -this.f28286.f49255[1].m16917());
                    }
                    c1707.f56453 = true;
                    c1706.f56453 = true;
                    return;
                }
                if (c1102 != null) {
                    C1706 c1706M23798 = AbstractC1251.m23796(c1101);
                    if (c1706M23798 != null) {
                        AbstractC1251.m23798(c1707, c1706M23798, this.f28286.f49255[0].m16917());
                        AbstractC1251.m23798(c1706, c1707, c1566.f56459);
                        return;
                    }
                    return;
                }
                C1101 c1103 = c1101Arr[1];
                if (c1103.f19179 != null) {
                    C1706 c1706M23799 = AbstractC1251.m23796(c1103);
                    if (c1706M23799 != null) {
                        AbstractC1251.m23798(c1706, c1706M23799, -this.f28286.f49255[1].m16917());
                        AbstractC1251.m23798(c1707, c1706, -c1566.f56459);
                        return;
                    }
                    return;
                }
                if ((c1597 instanceof C1486) || c1597.f49252 == null || c1597.mo11496(EnumC0856.CENTER).f19179 != null) {
                    return;
                }
                C1591 c1598 = this.f28286;
                AbstractC1251.m23798(c1707, c1598.f49252.f49276.f28292, c1598.m37932());
                AbstractC1251.m23798(c1706, c1707, c1566.f56459);
                return;
            }
        }
        if (this.f28287 == EnumC1241.MATCH_CONSTRAINT) {
            C1591 c1599 = this.f28286;
            int i = c1599.f49265;
            if (i == 2) {
                C1591 c15910 = c1599.f49252;
                if (c15910 != null) {
                    C1566 c1567 = c15910.f49260.f28284;
                    arrayList2.add(c1567);
                    c1567.f56457.add(c1566);
                    c1566.f56453 = true;
                    arrayList.add(c1707);
                    arrayList.add(c1706);
                }
            } else if (i == 3) {
                if (c1599.f49290 == 3) {
                    c1707.f56455 = this;
                    c1706.f56455 = this;
                    C1776 c1776 = c1599.f49260;
                    c1776.f28292.f56455 = this;
                    c1776.f28289.f56455 = this;
                    c1566.f56455 = this;
                    if (c1599.m37907()) {
                        arrayList2.add(this.f28286.f49260.f28284);
                        this.f28286.f49260.f28284.f56457.add(c1566);
                        C1776 c1777 = this.f28286.f49260;
                        c1777.f28284.f56455 = this;
                        arrayList2.add(c1777.f28292);
                        arrayList2.add(this.f28286.f49260.f28289);
                        this.f28286.f49260.f28292.f56457.add(c1566);
                        this.f28286.f49260.f28289.f56457.add(c1566);
                    } else if (this.f28286.m37887()) {
                        this.f28286.f49260.f28284.f56463.add(c1566);
                        arrayList.add(this.f28286.f49260.f28284);
                    } else {
                        this.f28286.f49260.f28284.f56463.add(c1566);
                    }
                } else {
                    C1566 c1568 = c1599.f49260.f28284;
                    arrayList2.add(c1568);
                    c1568.f56457.add(c1566);
                    this.f28286.f49260.f28292.f56457.add(c1566);
                    this.f28286.f49260.f28289.f56457.add(c1566);
                    c1566.f56453 = true;
                    arrayList.add(c1707);
                    arrayList.add(c1706);
                    c1707.f56463.add(c1566);
                    c1706.f56463.add(c1566);
                }
            }
        }
        C1591 c15911 = this.f28286;
        C1101[] c1101Arr2 = c15911.f49255;
        C1101 c1104 = c1101Arr2[0];
        C1101 c1105 = c1104.f19179;
        if (c1105 != null && c1101Arr2[1].f19179 != null) {
            if (c15911.m37887()) {
                c1707.f56460 = this.f28286.f49255[0].m16917();
                c1706.f56460 = -this.f28286.f49255[1].m16917();
                return;
            }
            C1706 c1706M237910 = AbstractC1251.m23796(this.f28286.f49255[0]);
            C1706 c1706M237911 = AbstractC1251.m23796(this.f28286.f49255[1]);
            c1706M237910.m43020((AbstractC1251) this);
            c1706M237911.m43020((AbstractC1251) this);
            this.f28291 = EnumC0901.CENTER;
            return;
        }
        if (c1105 != null) {
            C1706 c1706M237912 = AbstractC1251.m23796(c1104);
            if (c1706M237912 != null) {
                AbstractC1251.m23798(c1707, c1706M237912, this.f28286.f49255[0].m16917());
                m23801(c1706, c1707, 1, c1566);
                return;
            }
            return;
        }
        C1101 c1106 = c1101Arr2[1];
        if (c1106.f19179 != null) {
            C1706 c1706M237913 = AbstractC1251.m23796(c1106);
            if (c1706M237913 != null) {
                AbstractC1251.m23798(c1706, c1706M237913, -this.f28286.f49255[1].m16917());
                m23801(c1707, c1706, -1, c1566);
                return;
            }
            return;
        }
        if ((c15911 instanceof C1486) || (c1593 = c15911.f49252) == null) {
            return;
        }
        AbstractC1251.m23798(c1707, c1593.f49276.f28292, c15911.m37932());
        m23801(c1706, c1707, 1, c1566);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40002(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
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
    @Override // p067l.AbstractC1251, p067l.InterfaceC1391
    /* JADX INFO: renamed from: ֫ */
    public final void mo8443(InterfaceC1391 interfaceC1391) {
        int iM23799;
        int i;
        int iM237910;
        C1591 c1591;
        int i2;
        float f;
        int i3;
        if (C1286.f30134[this.f28291.ordinal()] == 3) {
            C1591 c1592 = this.f28286;
            m23800(c1592.f49261, c1592.f49279, 0);
            return;
        }
        C1566 c1566 = this.f28284;
        boolean z = c1566.f56464;
        C1706 c1706 = this.f28292;
        C1706 c1707 = this.f28289;
        if (!z && this.f28287 == EnumC1241.MATCH_CONSTRAINT) {
            C1591 c1593 = this.f28286;
            int i4 = c1593.f49265;
            if (i4 == 2) {
                C1591 c1594 = c1593.f49252;
                if (c1594 != null) {
                    C1566 c1567 = c1594.f49276.f28284;
                    if (c1567.f56464) {
                        c1566.mo37000((int) ((c1567.f56459 * c1593.f49275) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                int i5 = c1593.f49290;
                if (i5 == 0 || i5 == 3) {
                    C1776 c1776 = c1593.f49260;
                    C1706 c1708 = c1776.f28292;
                    C1706 c1709 = c1776.f28289;
                    boolean z2 = c1593.f49261.f19179 != null;
                    boolean z3 = c1593.f49281.f19179 != null;
                    boolean z4 = c1593.f49279.f19179 != null;
                    boolean z5 = c1593.f49253.f19179 != null;
                    int iM37934 = c1593.m37934();
                    if (z2 && z3 && z4 && z5) {
                        float f2 = this.f28286.f49228;
                        boolean z6 = c1708.f56464;
                        ArrayList arrayList = c1708.f56463;
                        int[] iArr = f52542;
                        if (z6 && c1709.f56464) {
                            if (c1706.f56458 && c1707.f56458) {
                                m40002(iArr, ((C1706) c1706.f56463.get(0)).f56459 + c1706.f56460, ((C1706) c1707.f56463.get(0)).f56459 - c1707.f56460, c1708.f56459 + c1708.f56460, c1709.f56459 - c1709.f56460, f2, iM37934);
                                c1566.mo37000(iArr[0]);
                                this.f28286.f49260.f28284.mo37000(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (c1706.f56464 && c1707.f56464) {
                            if (!c1708.f56458 || !c1709.f56458) {
                                return;
                            }
                            m40002(iArr, c1706.f56459 + c1706.f56460, c1707.f56459 - c1707.f56460, ((C1706) arrayList.get(0)).f56459 + c1708.f56460, ((C1706) c1709.f56463.get(0)).f56459 - c1709.f56460, f2, iM37934);
                            c1566.mo37000(iArr[0]);
                            this.f28286.f49260.f28284.mo37000(iArr[1]);
                        }
                        if (!c1706.f56458 || !c1707.f56458 || !c1708.f56458 || !c1709.f56458) {
                            return;
                        }
                        m40002(iArr, ((C1706) c1706.f56463.get(0)).f56459 + c1706.f56460, ((C1706) c1707.f56463.get(0)).f56459 - c1707.f56460, ((C1706) arrayList.get(0)).f56459 + c1708.f56460, ((C1706) c1709.f56463.get(0)).f56459 - c1709.f56460, f2, iM37934);
                        c1566.mo37000(iArr[0]);
                        this.f28286.f49260.f28284.mo37000(iArr[1]);
                    } else if (z2 && z4) {
                        if (!c1706.f56458 || !c1707.f56458) {
                            return;
                        }
                        float f3 = this.f28286.f49228;
                        int i6 = ((C1706) c1706.f56463.get(0)).f56459 + c1706.f56460;
                        int i7 = ((C1706) c1707.f56463.get(0)).f56459 - c1707.f56460;
                        if (iM37934 == -1 || iM37934 == 0) {
                            int iM237911 = m23799(i7 - i6, 0);
                            int i8 = (int) ((iM237911 * f3) + 0.5f);
                            int iM237912 = m23799(i8, 1);
                            if (i8 != iM237912) {
                                iM237911 = (int) ((iM237912 / f3) + 0.5f);
                            }
                            c1566.mo37000(iM237911);
                            this.f28286.f49260.f28284.mo37000(iM237912);
                        } else if (iM37934 == 1) {
                            int iM237913 = m23799(i7 - i6, 0);
                            int i9 = (int) ((iM237913 / f3) + 0.5f);
                            int iM237914 = m23799(i9, 1);
                            if (i9 != iM237914) {
                                iM237913 = (int) ((iM237914 * f3) + 0.5f);
                            }
                            c1566.mo37000(iM237913);
                            this.f28286.f49260.f28284.mo37000(iM237914);
                        }
                    } else if (z3 && z5) {
                        if (!c1708.f56458 || !c1709.f56458) {
                            return;
                        }
                        float f4 = this.f28286.f49228;
                        int i10 = ((C1706) c1708.f56463.get(0)).f56459 + c1708.f56460;
                        int i11 = ((C1706) c1709.f56463.get(0)).f56459 - c1709.f56460;
                        if (iM37934 == -1) {
                            iM23799 = m23799(i11 - i10, 1);
                            i = (int) ((iM23799 / f4) + 0.5f);
                            iM237910 = m23799(i, 0);
                            if (i != iM237910) {
                                iM23799 = (int) ((iM237910 * f4) + 0.5f);
                            }
                            c1566.mo37000(iM237910);
                            this.f28286.f49260.f28284.mo37000(iM23799);
                        } else if (iM37934 == 0) {
                            int iM237915 = m23799(i11 - i10, 1);
                            int i12 = (int) ((iM237915 * f4) + 0.5f);
                            int iM237916 = m23799(i12, 0);
                            if (i12 != iM237916) {
                                iM237915 = (int) ((iM237916 / f4) + 0.5f);
                            }
                            c1566.mo37000(iM237916);
                            this.f28286.f49260.f28284.mo37000(iM237915);
                        } else if (iM37934 == 1) {
                            iM23799 = m23799(i11 - i10, 1);
                            i = (int) ((iM23799 / f4) + 0.5f);
                            iM237910 = m23799(i, 0);
                            if (i != iM237910) {
                                iM23799 = (int) ((iM237910 * f4) + 0.5f);
                            }
                            c1566.mo37000(iM237910);
                            this.f28286.f49260.f28284.mo37000(iM23799);
                        }
                    }
                } else {
                    int iM37935 = c1593.m37934();
                    if (iM37935 != -1) {
                        if (iM37935 == 0) {
                            C1591 c1595 = this.f28286;
                            f = c1595.f49260.f28284.f56459 / c1595.f49228;
                            i3 = (int) (f + 0.5f);
                        } else if (iM37935 != 1) {
                            i3 = 0;
                        } else {
                            c1591 = this.f28286;
                            i2 = c1591.f49260.f28284.f56459;
                        }
                        c1566.mo37000(i3);
                    } else {
                        c1591 = this.f28286;
                        i2 = c1591.f49260.f28284.f56459;
                    }
                    f = i2 * c1591.f49228;
                    i3 = (int) (f + 0.5f);
                    c1566.mo37000(i3);
                }
            }
        }
        boolean z7 = c1706.f56458;
        ArrayList arrayList2 = c1706.f56463;
        if (z7) {
            boolean z8 = c1707.f56458;
            ArrayList arrayList3 = c1707.f56463;
            if (z8) {
                if (c1706.f56464 && c1707.f56464 && c1566.f56464) {
                    return;
                }
                if (!c1566.f56464 && this.f28287 == EnumC1241.MATCH_CONSTRAINT) {
                    C1591 c1596 = this.f28286;
                    if (c1596.f49265 == 0 && !c1596.m37887()) {
                        C1706 c17010 = (C1706) arrayList2.get(0);
                        C1706 c17011 = (C1706) arrayList3.get(0);
                        int i13 = c17010.f56459 + c1706.f56460;
                        int i14 = c17011.f56459 + c1707.f56460;
                        c1706.mo37000(i13);
                        c1707.mo37000(i14);
                        c1566.mo37000(i14 - i13);
                        return;
                    }
                }
                if (!c1566.f56464 && this.f28287 == EnumC1241.MATCH_CONSTRAINT && this.f28290 == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((C1706) arrayList3.get(0)).f56459 + c1707.f56460) - (((C1706) arrayList2.get(0)).f56459 + c1706.f56460), c1566.f47790);
                    C1591 c1597 = this.f28286;
                    int i15 = c1597.f49233;
                    int iMax = Math.max(c1597.f49273, iMin);
                    if (i15 > 0) {
                        iMax = Math.min(i15, iMax);
                    }
                    c1566.mo37000(iMax);
                }
                if (c1566.f56464) {
                    C1706 c17012 = (C1706) arrayList2.get(0);
                    C1706 c17013 = (C1706) arrayList3.get(0);
                    int i16 = c17012.f56459 + c1706.f56460;
                    int i17 = c17013.f56459 + c1707.f56460;
                    float fM37930 = this.f28286.m37930();
                    if (c17012 == c17013) {
                        i16 = c17012.f56459;
                        i17 = c17013.f56459;
                        fM37930 = 0.5f;
                    }
                    c1706.mo37000((int) ((((i17 - i16) - c1566.f56459) * fM37930) + i16 + 0.5f));
                    c1707.mo37000(c1706.f56459 + c1566.f56459);
                }
            }
        }
    }

    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ۧ */
    public final void mo8444() {
        C1706 c1706 = this.f28292;
        if (c1706.f56464) {
            this.f28286.m37864(c1706.f56459);
        }
    }
}
