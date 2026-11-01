package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴܶ */
/* JADX INFO: compiled from: 819P */
/* JADX INFO: loaded from: classes5.dex */
public final class C1776 extends AbstractC1251 {

    /* JADX INFO: renamed from: ۡ */
    public C1706 f62630;

    /* JADX INFO: renamed from: ܺ */
    public C1416 f62631;

    public C1776(C1591 c1591) {
        super(c1591);
        C1706 c1706 = new C1706(this);
        this.f62630 = c1706;
        this.f62631 = null;
        this.f28292.f56456 = EnumC1741.TOP;
        this.f28289.f56456 = EnumC1741.BOTTOM;
        c1706.f56456 = EnumC1741.BASELINE;
        this.f28288 = 1;
    }

    public final String toString() {
        return "VerticalRun " + this.f28286.m37909();
    }

    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ܽ */
    public final void mo8446() {
        this.f28285 = null;
        this.f28292.m43019();
        this.f28289.m43019();
        this.f62630.m43019();
        this.f28284.m43019();
        this.f28293 = false;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m45772() {
        this.f28293 = false;
        C1706 c1706 = this.f28292;
        c1706.m43019();
        c1706.f56464 = false;
        C1706 c1707 = this.f28289;
        c1707.m43019();
        c1707.f56464 = false;
        C1706 c1708 = this.f62630;
        c1708.m43019();
        c1708.f56464 = false;
        this.f28284.f56464 = false;
    }

    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo8445() {
        return this.f28287 != EnumC1241.MATCH_CONSTRAINT || this.f28286.f49290 == 0;
    }

    @Override // p067l.AbstractC1251, p067l.InterfaceC1391
    /* JADX INFO: renamed from: ֫ */
    public final void mo8443(InterfaceC1391 interfaceC1391) {
        C1591 c1591;
        int i;
        float f;
        int i2;
        if (C1041.f15556[this.f28291.ordinal()] == 3) {
            C1591 c1592 = this.f28286;
            m23800(c1592.f49281, c1592.f49253, 1);
            return;
        }
        C1566 c1566 = this.f28284;
        if (c1566.f56458 && !c1566.f56464 && this.f28287 == EnumC1241.MATCH_CONSTRAINT) {
            C1591 c1593 = this.f28286;
            int i3 = c1593.f49290;
            if (i3 != 2) {
                if (i3 == 3 && c1593.f49276.f28284.f56464) {
                    int iM37934 = c1593.m37934();
                    if (iM37934 == -1) {
                        c1591 = this.f28286;
                        i = c1591.f49276.f28284.f56459;
                    } else {
                        if (iM37934 == 0) {
                            C1591 c1594 = this.f28286;
                            f = c1594.f49276.f28284.f56459 * c1594.f49228;
                            i2 = (int) (f + 0.5f);
                        } else if (iM37934 != 1) {
                            i2 = 0;
                        } else {
                            c1591 = this.f28286;
                            i = c1591.f49276.f28284.f56459;
                        }
                        c1566.mo37000(i2);
                    }
                    f = i / c1591.f49228;
                    i2 = (int) (f + 0.5f);
                    c1566.mo37000(i2);
                }
            } else {
                C1591 c1595 = c1593.f49252;
                if (c1595 != null) {
                    C1566 c1567 = c1595.f49260.f28284;
                    if (c1567.f56464) {
                        c1566.mo37000((int) ((c1567.f56459 * c1593.f49277) + 0.5f));
                    }
                }
            }
        }
        C1706 c1706 = this.f28292;
        boolean z = c1706.f56458;
        ArrayList arrayList = c1706.f56463;
        if (z) {
            C1706 c1707 = this.f28289;
            boolean z2 = c1707.f56458;
            ArrayList arrayList2 = c1707.f56463;
            if (z2) {
                if (c1706.f56464 && c1707.f56464 && c1566.f56464) {
                    return;
                }
                if (!c1566.f56464 && this.f28287 == EnumC1241.MATCH_CONSTRAINT) {
                    C1591 c1596 = this.f28286;
                    if (c1596.f49265 == 0 && !c1596.m37907()) {
                        C1706 c1708 = (C1706) arrayList.get(0);
                        C1706 c1709 = (C1706) arrayList2.get(0);
                        int i4 = c1708.f56459 + c1706.f56460;
                        int i5 = c1709.f56459 + c1707.f56460;
                        c1706.mo37000(i4);
                        c1707.mo37000(i5);
                        c1566.mo37000(i5 - i4);
                        return;
                    }
                }
                if (!c1566.f56464 && this.f28287 == EnumC1241.MATCH_CONSTRAINT && this.f28290 == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C1706 c17010 = (C1706) arrayList.get(0);
                    int i6 = (((C1706) arrayList2.get(0)).f56459 + c1707.f56460) - (c17010.f56459 + c1706.f56460);
                    int i7 = c1566.f47790;
                    if (i6 < i7) {
                        c1566.mo37000(i6);
                    } else {
                        c1566.mo37000(i7);
                    }
                }
                if (c1566.f56464 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C1706 c17011 = (C1706) arrayList.get(0);
                    C1706 c17012 = (C1706) arrayList2.get(0);
                    int i8 = c17011.f56459 + c1706.f56460;
                    int i9 = c17012.f56459 + c1707.f56460;
                    float fM37888 = this.f28286.m37888();
                    if (c17011 == c17012) {
                        i8 = c17011.f56459;
                        i9 = c17012.f56459;
                        fM37888 = 0.5f;
                    }
                    c1706.mo37000((int) ((((i9 - i8) - c1566.f56459) * fM37888) + i8 + 0.5f));
                    c1707.mo37000(c1706.f56459 + c1566.f56459);
                }
            }
        }
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
            c1566.mo37000(c1595.m37890());
        }
        boolean z2 = c1566.f56464;
        ArrayList arrayList = c1566.f56457;
        ArrayList arrayList2 = c1566.f56463;
        C1706 c1706 = this.f28289;
        C1706 c1707 = this.f28292;
        if (!z2) {
            C1591 c1596 = this.f28286;
            this.f28287 = c1596.f49244[1];
            if (c1596.m37929()) {
                this.f62631 = new C1416(this);
            }
            EnumC1241 enumC1241 = this.f28287;
            if (enumC1241 != EnumC1241.MATCH_CONSTRAINT) {
                if (enumC1241 == EnumC1241.MATCH_PARENT && (c1594 = this.f28286.f49252) != null && c1594.f49244[1] == EnumC1241.FIXED) {
                    int iM37890 = (c1594.m37890() - this.f28286.f49281.m16917()) - this.f28286.f49253.m16917();
                    AbstractC1251.m23798(c1707, c1594.f49260.f28292, this.f28286.f49281.m16917());
                    AbstractC1251.m23798(c1706, c1594.f49260.f28289, -this.f28286.f49253.m16917());
                    c1566.mo37000(iM37890);
                    return;
                }
                if (enumC1241 == EnumC1241.FIXED) {
                    c1566.mo37000(this.f28286.m37890());
                }
            }
        } else if (this.f28287 == EnumC1241.MATCH_PARENT && (c1592 = (c1591 = this.f28286).f49252) != null && c1592.f49244[1] == EnumC1241.FIXED) {
            AbstractC1251.m23798(c1707, c1592.f49260.f28292, c1591.f49281.m16917());
            AbstractC1251.m23798(c1706, c1592.f49260.f28289, -this.f28286.f49253.m16917());
            return;
        }
        boolean z3 = c1566.f56464;
        C1706 c1708 = this.f62630;
        if (z3) {
            C1591 c1597 = this.f28286;
            if (c1597.f49237) {
                C1101[] c1101Arr = c1597.f49255;
                C1101 c1101 = c1101Arr[2];
                C1101 c1102 = c1101.f19179;
                if (c1102 != null && c1101Arr[3].f19179 != null) {
                    if (c1597.m37907()) {
                        c1707.f56460 = this.f28286.f49255[2].m16917();
                        c1706.f56460 = -this.f28286.f49255[3].m16917();
                    } else {
                        C1706 c1706M23796 = AbstractC1251.m23796(this.f28286.f49255[2]);
                        if (c1706M23796 != null) {
                            AbstractC1251.m23798(c1707, c1706M23796, this.f28286.f49255[2].m16917());
                        }
                        C1706 c1706M23797 = AbstractC1251.m23796(this.f28286.f49255[3]);
                        if (c1706M23797 != null) {
                            AbstractC1251.m23798(c1706, c1706M23797, -this.f28286.f49255[3].m16917());
                        }
                        c1707.f56453 = true;
                        c1706.f56453 = true;
                    }
                    if (this.f28286.m37929()) {
                        AbstractC1251.m23798(c1708, c1707, this.f28286.m37914());
                        return;
                    }
                    return;
                }
                if (c1102 != null) {
                    C1706 c1706M23798 = AbstractC1251.m23796(c1101);
                    if (c1706M23798 != null) {
                        AbstractC1251.m23798(c1707, c1706M23798, this.f28286.f49255[2].m16917());
                        AbstractC1251.m23798(c1706, c1707, c1566.f56459);
                        if (this.f28286.m37929()) {
                            AbstractC1251.m23798(c1708, c1707, this.f28286.m37914());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C1101 c1103 = c1101Arr[3];
                if (c1103.f19179 != null) {
                    C1706 c1706M23799 = AbstractC1251.m23796(c1103);
                    if (c1706M23799 != null) {
                        AbstractC1251.m23798(c1706, c1706M23799, -this.f28286.f49255[3].m16917());
                        AbstractC1251.m23798(c1707, c1706, -c1566.f56459);
                    }
                    if (this.f28286.m37929()) {
                        AbstractC1251.m23798(c1708, c1707, this.f28286.m37914());
                        return;
                    }
                    return;
                }
                C1101 c1104 = c1101Arr[4];
                if (c1104.f19179 != null) {
                    C1706 c1706M237910 = AbstractC1251.m23796(c1104);
                    if (c1706M237910 != null) {
                        AbstractC1251.m23798(c1708, c1706M237910, 0);
                        AbstractC1251.m23798(c1707, c1708, -this.f28286.m37914());
                        AbstractC1251.m23798(c1706, c1707, c1566.f56459);
                        return;
                    }
                    return;
                }
                if ((c1597 instanceof C1486) || c1597.f49252 == null || c1597.mo11496(EnumC0856.CENTER).f19179 != null) {
                    return;
                }
                C1591 c1598 = this.f28286;
                AbstractC1251.m23798(c1707, c1598.f49252.f49260.f28292, c1598.m37933());
                AbstractC1251.m23798(c1706, c1707, c1566.f56459);
                if (this.f28286.m37929()) {
                    AbstractC1251.m23798(c1708, c1707, this.f28286.m37914());
                    return;
                }
                return;
            }
        }
        if (z3 || this.f28287 != EnumC1241.MATCH_CONSTRAINT) {
            c1566.m43020((AbstractC1251) this);
        } else {
            C1591 c1599 = this.f28286;
            int i = c1599.f49290;
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
            } else if (i == 3 && !c1599.m37907()) {
                C1591 c15911 = this.f28286;
                if (c15911.f49265 != 3) {
                    C1566 c1568 = c15911.f49276.f28284;
                    arrayList2.add(c1568);
                    c1568.f56457.add(c1566);
                    c1566.f56453 = true;
                    arrayList.add(c1707);
                    arrayList.add(c1706);
                }
            }
        }
        C1591 c15912 = this.f28286;
        C1101[] c1101Arr2 = c15912.f49255;
        C1101 c1105 = c1101Arr2[2];
        C1101 c1106 = c1105.f19179;
        if (c1106 != null && c1101Arr2[3].f19179 != null) {
            if (c15912.m37907()) {
                c1707.f56460 = this.f28286.f49255[2].m16917();
                c1706.f56460 = -this.f28286.f49255[3].m16917();
            } else {
                C1706 c1706M237911 = AbstractC1251.m23796(this.f28286.f49255[2]);
                C1706 c1706M237912 = AbstractC1251.m23796(this.f28286.f49255[3]);
                c1706M237911.m43020((AbstractC1251) this);
                c1706M237912.m43020((AbstractC1251) this);
                this.f28291 = EnumC0901.CENTER;
            }
            if (this.f28286.m37929()) {
                m23801(c1708, c1707, 1, this.f62631);
            }
        } else if (c1106 != null) {
            C1706 c1706M237913 = AbstractC1251.m23796(c1105);
            if (c1706M237913 != null) {
                AbstractC1251.m23798(c1707, c1706M237913, this.f28286.f49255[2].m16917());
                m23801(c1706, c1707, 1, c1566);
                if (this.f28286.m37929()) {
                    m23801(c1708, c1707, 1, this.f62631);
                }
                EnumC1241 enumC1242 = this.f28287;
                EnumC1241 enumC1243 = EnumC1241.MATCH_CONSTRAINT;
                if (enumC1242 == enumC1243) {
                    C1591 c15913 = this.f28286;
                    if (c15913.f49228 > 0.0f) {
                        C1636 c1636 = c15913.f49276;
                        if (c1636.f28287 == enumC1243) {
                            c1636.f28284.f56457.add(c1566);
                            arrayList2.add(this.f28286.f49276.f28284);
                            c1566.f56455 = this;
                        }
                    }
                }
            }
        } else {
            C1101 c1107 = c1101Arr2[3];
            if (c1107.f19179 != null) {
                C1706 c1706M237914 = AbstractC1251.m23796(c1107);
                if (c1706M237914 != null) {
                    AbstractC1251.m23798(c1706, c1706M237914, -this.f28286.f49255[3].m16917());
                    m23801(c1707, c1706, -1, c1566);
                    if (this.f28286.m37929()) {
                        m23801(c1708, c1707, 1, this.f62631);
                    }
                }
            } else {
                C1101 c1108 = c1101Arr2[4];
                if (c1108.f19179 != null) {
                    C1706 c1706M237915 = AbstractC1251.m23796(c1108);
                    if (c1706M237915 != null) {
                        AbstractC1251.m23798(c1708, c1706M237915, 0);
                        m23801(c1707, c1708, -1, this.f62631);
                        m23801(c1706, c1707, 1, c1566);
                    }
                } else if (!(c15912 instanceof C1486) && (c1593 = c15912.f49252) != null) {
                    AbstractC1251.m23798(c1707, c1593.f49260.f28292, c15912.m37933());
                    m23801(c1706, c1707, 1, c1566);
                    if (this.f28286.m37929()) {
                        m23801(c1708, c1707, 1, this.f62631);
                    }
                    EnumC1241 enumC1244 = this.f28287;
                    EnumC1241 enumC1245 = EnumC1241.MATCH_CONSTRAINT;
                    if (enumC1244 == enumC1245) {
                        C1591 c15914 = this.f28286;
                        if (c15914.f49228 > 0.0f) {
                            C1636 c1637 = c15914.f49276;
                            if (c1637.f28287 == enumC1245) {
                                c1637.f28284.f56457.add(c1566);
                                arrayList2.add(this.f28286.f49276.f28284);
                                c1566.f56455 = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c1566.f56458 = true;
        }
    }

    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ۧ */
    public final void mo8444() {
        C1706 c1706 = this.f28292;
        if (c1706.f56464) {
            this.f28286.m37889(c1706.f56459);
        }
    }
}
