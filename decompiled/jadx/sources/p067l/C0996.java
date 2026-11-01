package p067l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۗ۠ */
/* JADX INFO: compiled from: 41JE */
/* JADX INFO: loaded from: classes2.dex */
public final class C0996 extends C1591 {

    /* JADX INFO: renamed from: ܽۧ */
    public boolean f12509;

    /* JADX INFO: renamed from: ۧۧ */
    public float f12507 = -1.0f;

    /* JADX INFO: renamed from: ۟֫ */
    public int f12506 = -1;

    /* JADX INFO: renamed from: ֫ۧ */
    public int f12505 = -1;

    /* JADX INFO: renamed from: ᩺֫ */
    public C1101 f12510 = this.f49281;

    /* JADX INFO: renamed from: ܰ֫ */
    public int f12508 = 0;

    @Override // p067l.C1591
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9823() {
        return true;
    }

    public C0996() {
        this.f49291.clear();
        this.f49291.add(this.f12510);
        int length = this.f49255.length;
        for (int i = 0; i < length; i++) {
            this.f49255[i] = this.f12510;
        }
    }

    @Override // p067l.C1591
    /* JADX INFO: renamed from: ֫ */
    public final void mo9821(C1591 c1591, HashMap map) {
        super.mo9821(c1591, map);
        C0996 c0996 = (C0996) c1591;
        this.f12507 = c0996.f12507;
        this.f12506 = c0996.f12506;
        this.f12505 = c0996.f12505;
        m11505(c0996.f12508);
    }

    /* JADX INFO: renamed from: ᩸ */
    public final void m11505(int i) {
        if (this.f12508 == i) {
            return;
        }
        this.f12508 = i;
        ArrayList arrayList = this.f49291;
        arrayList.clear();
        if (this.f12508 == 1) {
            this.f12510 = this.f49261;
        } else {
            this.f12510 = this.f49281;
        }
        arrayList.add(this.f12510);
        C1101[] c1101Arr = this.f49255;
        int length = c1101Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c1101Arr[i2] = this.f12510;
        }
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public final C1101 m11501() {
        return this.f12510;
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public final int m11506() {
        return this.f12508;
    }

    @Override // p067l.C1591
    /* JADX INFO: renamed from: ֫ */
    public final C1101 mo11496(EnumC0856 enumC0856) {
        switch (C1066.f17171[enumC0856.ordinal()]) {
            case 1:
            case 2:
                if (this.f12508 == 1) {
                    return this.f12510;
                }
                break;
            case 3:
            case 4:
                if (this.f12508 == 0) {
                    return this.f12510;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(enumC0856.name());
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m11503(float f) {
        if (f > -1.0f) {
            this.f12507 = f;
            this.f12506 = -1;
            this.f12505 = -1;
        }
    }

    /* JADX INFO: renamed from: ۠ */
    public final void m11498(int i) {
        if (i > -1) {
            this.f12507 = -1.0f;
            this.f12506 = i;
            this.f12505 = -1;
        }
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m11502(int i) {
        if (i > -1) {
            this.f12507 = -1.0f;
            this.f12506 = -1;
            this.f12505 = i;
        }
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public final float m11499() {
        return this.f12507;
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final int m11497() {
        return this.f12506;
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final int m11504() {
        return this.f12505;
    }

    /* JADX INFO: renamed from: ֨ */
    public final void m11495(int i) {
        this.f12510.m16906(i);
        this.f12509 = true;
    }

    @Override // p067l.C1591
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo9825() {
        return this.f12509;
    }

    @Override // p067l.C1591
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo9831() {
        return this.f12509;
    }

    @Override // p067l.C1591
    /* JADX INFO: renamed from: ֫ */
    public final void mo9822(C1696 c1696, boolean z) {
        C1906 c1906 = (C1906) this.f49252;
        if (c1906 == null) {
            return;
        }
        C1101 c1101Mo11496 = c1906.mo11496(EnumC0856.LEFT);
        C1101 c1101Mo11497 = c1906.mo11496(EnumC0856.RIGHT);
        C1591 c1591 = this.f49252;
        boolean z2 = c1591 != null && c1591.f49244[0] == EnumC1241.WRAP_CONTENT;
        if (this.f12508 == 0) {
            c1101Mo11496 = c1906.mo11496(EnumC0856.TOP);
            c1101Mo11497 = c1906.mo11496(EnumC0856.BOTTOM);
            C1591 c1592 = this.f49252;
            z2 = c1592 != null && c1592.f49244[1] == EnumC1241.WRAP_CONTENT;
        }
        if (this.f12509 && this.f12510.m16911()) {
            C1626 c1626M42742 = c1696.m42742(this.f12510);
            c1696.m42745(c1626M42742, this.f12510.m16914());
            if (this.f12506 != -1) {
                if (z2) {
                    c1696.m42749(c1696.m42742(c1101Mo11497), c1626M42742, 0, 5);
                }
            } else if (this.f12505 != -1 && z2) {
                C1626 c1626M42743 = c1696.m42742(c1101Mo11497);
                c1696.m42749(c1626M42742, c1696.m42742(c1101Mo11496), 0, 5);
                c1696.m42749(c1626M42743, c1626M42742, 0, 5);
            }
            this.f12509 = false;
            return;
        }
        if (this.f12506 != -1) {
            C1626 c1626M42744 = c1696.m42742(this.f12510);
            c1696.m42747(c1626M42744, c1696.m42742(c1101Mo11496), this.f12506, 8);
            if (z2) {
                c1696.m42749(c1696.m42742(c1101Mo11497), c1626M42744, 0, 5);
                return;
            }
            return;
        }
        if (this.f12505 != -1) {
            C1626 c1626M42745 = c1696.m42742(this.f12510);
            C1626 c1626M42746 = c1696.m42742(c1101Mo11497);
            c1696.m42747(c1626M42745, c1626M42746, -this.f12505, 8);
            if (z2) {
                c1696.m42749(c1626M42745, c1696.m42742(c1101Mo11496), 0, 5);
                c1696.m42749(c1626M42746, c1626M42745, 0, 5);
                return;
            }
            return;
        }
        if (this.f12507 != -1.0f) {
            C1626 c1626M42747 = c1696.m42742(this.f12510);
            C1626 c1626M42748 = c1696.m42742(c1101Mo11497);
            float f = this.f12507;
            C1381 c1381M42740 = c1696.m42740();
            c1381M42740.f35612.mo7930(c1626M42747, -1.0f);
            c1381M42740.f35612.mo7930(c1626M42748, f);
            c1696.m42744(c1381M42740);
        }
    }

    @Override // p067l.C1591
    /* JADX INFO: renamed from: ۧ */
    public final void mo11500(C1696 c1696, boolean z) {
        if (this.f49252 == null) {
            return;
        }
        C1101 c1101 = this.f12510;
        c1696.getClass();
        int iM42736 = C1696.m42736(c1101);
        if (this.f12508 == 1) {
            this.f49283 = iM42736;
            this.f49241 = 0;
            m37891(this.f49252.m37890());
            m37928(0);
            return;
        }
        this.f49283 = 0;
        this.f49241 = iM42736;
        m37928(this.f49252.m37911());
        m37891(0);
    }
}
