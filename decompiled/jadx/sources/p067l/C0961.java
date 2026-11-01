package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۖ۠ */
/* JADX INFO: compiled from: U1KA */
/* JADX INFO: loaded from: classes3.dex */
public final class C0961 extends C1486 {

    /* JADX INFO: renamed from: ֫ۧ */
    public int f10437 = 0;

    /* JADX INFO: renamed from: ۟֫ */
    public boolean f10438 = true;

    /* JADX INFO: renamed from: ۧۧ */
    public int f10439 = 0;

    /* JADX INFO: renamed from: ܽۧ */
    public boolean f10440 = false;

    @Override // p067l.C1591
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9823() {
        return true;
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public final int m9829() {
        return this.f10437;
    }

    /* JADX INFO: renamed from: ֨ */
    public final void m9820(int i) {
        this.f10437 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m9830(boolean z) {
        this.f10438 = z;
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final boolean m9833() {
        return this.f10438;
    }

    @Override // p067l.C1591
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo9825() {
        return this.f10440;
    }

    @Override // p067l.C1591
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo9831() {
        return this.f10440;
    }

    @Override // p067l.C1486, p067l.C1591
    /* JADX INFO: renamed from: ֫ */
    public final void mo9821(C1591 c1591, HashMap map) {
        super.mo9821(c1591, map);
        C0961 c0961 = (C0961) c1591;
        this.f10437 = c0961.f10437;
        this.f10438 = c0961.f10438;
        this.f10439 = c0961.f10439;
    }

    @Override // p067l.C1591
    public final String toString() {
        String string = "[Barrier] " + m37909() + " {";
        for (int i = 0; i < this.f41927; i++) {
            C1591 c1591 = this.f41928[i];
            if (i > 0) {
                string = C17588.m40053(string, ", ");
            }
            StringBuilder sbM17248 = C7470.m17248(string);
            sbM17248.append(c1591.m37909());
            string = sbM17248.toString();
        }
        return C17588.m40053(string, C0249l.f1198d);
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public final void m9824() {
        for (int i = 0; i < this.f41927; i++) {
            C1591 c1591 = this.f41928[i];
            int i2 = this.f10437;
            if (i2 == 0 || i2 == 1) {
                c1591.m37869(0, true);
            } else if (i2 == 2 || i2 == 3) {
                c1591.m37869(1, true);
            }
        }
    }

    @Override // p067l.C1591
    /* JADX INFO: renamed from: ֫ */
    public final void mo9822(C1696 c1696, boolean z) {
        boolean z2;
        int i;
        int i2;
        C1101[] c1101Arr = this.f49255;
        C1101 c1101 = this.f49261;
        c1101Arr[0] = c1101;
        int i3 = 2;
        C1101 c1102 = this.f49281;
        c1101Arr[2] = c1102;
        C1101 c1103 = this.f49279;
        c1101Arr[1] = c1103;
        C1101 c1104 = this.f49253;
        c1101Arr[3] = c1104;
        for (C1101 c1105 : c1101Arr) {
            c1105.f19186 = c1696.m42742(c1105);
        }
        int i4 = this.f10437;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C1101 c1106 = c1101Arr[i4];
        if (!this.f10440) {
            m9826();
        }
        if (this.f10440) {
            this.f10440 = false;
            int i5 = this.f10437;
            if (i5 == 0 || i5 == 1) {
                c1696.m42745(c1101.f19186, this.f49283);
                c1696.m42745(c1103.f19186, this.f49283);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c1696.m42745(c1102.f19186, this.f49241);
                    c1696.m42745(c1104.f19186, this.f49241);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.f41927) {
                z2 = false;
                break;
            }
            C1591 c1591 = this.f41928[i6];
            if ((this.f10438 || c1591.mo9823()) && ((((i2 = this.f10437) == 0 || i2 == 1) && c1591.f49244[0] == EnumC1241.MATCH_CONSTRAINT && c1591.f49261.f19179 != null && c1591.f49279.f19179 != null) || ((i2 == 2 || i2 == 3) && c1591.f49244[1] == EnumC1241.MATCH_CONSTRAINT && c1591.f49281.f19179 != null && c1591.f49253.f19179 != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = c1101.m16915() || c1103.m16915();
        boolean z4 = c1102.m16915() || c1104.m16915();
        int i7 = !(!z2 && (((i = this.f10437) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f41927) {
            C1591 c1592 = this.f41928[i8];
            if (this.f10438 || c1592.mo9823()) {
                C1626 c1626M42742 = c1696.m42742(c1592.f49255[this.f10437]);
                C1101[] c1101Arr2 = c1592.f49255;
                int i9 = this.f10437;
                C1101 c1107 = c1101Arr2[i9];
                c1107.f19186 = c1626M42742;
                C1101 c1108 = c1107.f19179;
                int i10 = (c1108 == null || c1108.f19181 != this) ? 0 : c1107.f19183;
                if (i9 == 0 || i9 == i3) {
                    C1626 c1626 = c1106.f19186;
                    int i11 = this.f10439 - i10;
                    C1381 c1381M42740 = c1696.m42740();
                    C1626 c1626M42748 = c1696.m42748();
                    c1626M42748.f51875 = 0;
                    c1381M42740.m29209(c1626, c1626M42742, c1626M42748, i11);
                    c1696.m42744(c1381M42740);
                } else {
                    C1626 c1627 = c1106.f19186;
                    int i12 = this.f10439 + i10;
                    C1381 c1381M42741 = c1696.m42740();
                    C1626 c1626M42749 = c1696.m42748();
                    c1626M42749.f51875 = 0;
                    c1381M42741.m29204(c1627, c1626M42742, c1626M42749, i12);
                    c1696.m42744(c1381M42741);
                }
                c1696.m42747(c1106.f19186, c1626M42742, this.f10439 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f10437;
        if (i13 == 0) {
            c1696.m42747(c1103.f19186, c1101.f19186, 0, 8);
            c1696.m42747(c1101.f19186, this.f49252.f49279.f19186, 0, 4);
            c1696.m42747(c1101.f19186, this.f49252.f49261.f19186, 0, 0);
            return;
        }
        if (i13 == 1) {
            c1696.m42747(c1101.f19186, c1103.f19186, 0, 8);
            c1696.m42747(c1101.f19186, this.f49252.f49261.f19186, 0, 4);
            c1696.m42747(c1101.f19186, this.f49252.f49279.f19186, 0, 0);
        } else if (i13 == 2) {
            c1696.m42747(c1104.f19186, c1102.f19186, 0, 8);
            c1696.m42747(c1102.f19186, this.f49252.f49253.f19186, 0, 4);
            c1696.m42747(c1102.f19186, this.f49252.f49281.f19186, 0, 0);
        } else if (i13 == 3) {
            c1696.m42747(c1102.f19186, c1104.f19186, 0, 8);
            c1696.m42747(c1102.f19186, this.f49252.f49281.f19186, 0, 4);
            c1696.m42747(c1102.f19186, this.f49252.f49253.f19186, 0, 0);
        }
    }

    /* JADX INFO: renamed from: ۠ */
    public final void m9827(int i) {
        this.f10439 = i;
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final int m9828() {
        return this.f10439;
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final int m9832() {
        int i = this.f10437;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final boolean m9826() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.f41927;
            if (i4 >= i) {
                break;
            }
            C1591 c1591 = this.f41928[i4];
            if ((this.f10438 || c1591.mo9823()) && ((((i2 = this.f10437) == 0 || i2 == 1) && !c1591.mo9825()) || (((i3 = this.f10437) == 2 || i3 == 3) && !c1591.mo9831()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f41927; i5++) {
            C1591 c1592 = this.f41928[i5];
            if (this.f10438 || c1592.mo9823()) {
                if (!z2) {
                    int i6 = this.f10437;
                    if (i6 == 0) {
                        iMax = c1592.mo11496(EnumC0856.LEFT).m16914();
                    } else if (i6 == 1) {
                        iMax = c1592.mo11496(EnumC0856.RIGHT).m16914();
                    } else if (i6 == 2) {
                        iMax = c1592.mo11496(EnumC0856.TOP).m16914();
                    } else if (i6 == 3) {
                        iMax = c1592.mo11496(EnumC0856.BOTTOM).m16914();
                    }
                    z2 = true;
                }
                int i7 = this.f10437;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c1592.mo11496(EnumC0856.LEFT).m16914());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c1592.mo11496(EnumC0856.RIGHT).m16914());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c1592.mo11496(EnumC0856.TOP).m16914());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c1592.mo11496(EnumC0856.BOTTOM).m16914());
                }
            }
        }
        int i8 = iMax + this.f10439;
        int i9 = this.f10437;
        if (i9 == 0 || i9 == 1) {
            m37868(i8, i8);
        } else {
            m37902(i8, i8);
        }
        this.f10440 = true;
        return true;
    }
}
