package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴ۠ */
/* JADX INFO: compiled from: D1JM */
/* JADX INFO: loaded from: classes4.dex */
public final class C1766 {

    /* JADX INFO: renamed from: ֡ */
    public int f60985;

    /* JADX INFO: renamed from: ֫ */
    public boolean f60986;

    /* JADX INFO: renamed from: ۖ */
    public int f60987;

    /* JADX INFO: renamed from: ۘ */
    public float f60988 = 0.0f;

    /* JADX INFO: renamed from: ۜ */
    public C1591 f60989;

    /* JADX INFO: renamed from: ۡ */
    public C1591 f60990;

    /* JADX INFO: renamed from: ۢ */
    public C1591 f60991;

    /* JADX INFO: renamed from: ۧ */
    public C1591 f60992;

    /* JADX INFO: renamed from: ܳ */
    public boolean f60993;

    /* JADX INFO: renamed from: ܺ */
    public C1591 f60994;

    /* JADX INFO: renamed from: ܽ */
    public C1591 f60995;

    /* JADX INFO: renamed from: ܿ */
    public boolean f60996;

    /* JADX INFO: renamed from: ᩳ */
    public C1591 f60997;

    /* JADX INFO: renamed from: ᩴ */
    public ArrayList f60998;

    /* JADX INFO: renamed from: ᩵ */
    public int f60999;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f61000;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f61001;

    public C1766(C1591 c1591, int i, boolean z) {
        this.f60992 = c1591;
        this.f60987 = i;
        this.f61000 = z;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00e2  */
    /* JADX INFO: renamed from: ֫ */
    public final void m45447() {
        C1591 c1591;
        int i;
        if (!this.f60986) {
            int i2 = this.f60987;
            int i3 = i2 * 2;
            C1591 c1592 = this.f60992;
            boolean z = false;
            C1591 c1593 = c1592;
            C1591 c1594 = c1593;
            while (!z) {
                this.f60999++;
                C1591[] c1591Arr = c1593.f49254;
                int[] iArr = c1593.f49239;
                C1101[] c1101Arr = c1593.f49255;
                c1591Arr[i2] = null;
                c1593.f49259[i2] = null;
                if (c1593.m37893() != 8) {
                    c1593.m37899(i2);
                    EnumC1241 enumC1241 = EnumC1241.MATCH_CONSTRAINT;
                    c1101Arr[i3].m16917();
                    int i4 = i3 + 1;
                    c1101Arr[i4].m16917();
                    c1101Arr[i3].m16917();
                    c1101Arr[i4].m16917();
                    if (this.f60997 == null) {
                        this.f60997 = c1593;
                    }
                    this.f60994 = c1593;
                    if (c1593.f49244[i2] == enumC1241) {
                        int i5 = iArr[i2];
                        if (i5 == 0 || i5 == 3 || i5 == 2) {
                            this.f60985++;
                            float f = c1593.f49287[i2];
                            if (f > 0.0f) {
                                this.f60988 += f;
                            }
                            if (c1593.m37893() != 8 && c1593.f49244[i2] == enumC1241 && ((i = iArr[i2]) == 0 || i == 3)) {
                                if (f < 0.0f) {
                                    this.f61001 = true;
                                } else {
                                    this.f60993 = true;
                                }
                                if (this.f60998 == null) {
                                    this.f60998 = new ArrayList();
                                }
                                this.f60998.add(c1593);
                            }
                            if (this.f60995 == null) {
                                this.f60995 = c1593;
                            }
                            C1591 c1595 = this.f60990;
                            if (c1595 != null) {
                                c1595.f49259[i2] = c1593;
                            }
                            this.f60990 = c1593;
                        }
                        if (i2 == 0) {
                            if (c1593.f49265 == 0 && c1593.f49273 == 0) {
                                int i6 = c1593.f49233;
                            }
                        } else if (c1593.f49290 == 0 && c1593.f49258 == 0) {
                            int i7 = c1593.f49248;
                        }
                    }
                }
                if (c1594 != c1593) {
                    c1594.f49254[i2] = c1593;
                }
                C1101 c1101 = c1101Arr[i3 + 1].f19179;
                if (c1101 != null) {
                    c1591 = c1101.f19181;
                    C1101 c1102 = c1591.f49255[i3].f19179;
                    if (c1102 == null || c1102.f19181 != c1593) {
                        c1591 = null;
                    }
                } else {
                    c1591 = null;
                }
                if (c1591 == null) {
                    z = true;
                    c1591 = c1593;
                }
                C1591 c1596 = c1591;
                c1594 = c1593;
                c1593 = c1596;
            }
            C1591 c1597 = this.f60997;
            if (c1597 != null) {
                c1597.f49255[i3].m16917();
            }
            C1591 c1598 = this.f60994;
            if (c1598 != null) {
                c1598.f49255[i3 + 1].m16917();
            }
            this.f60991 = c1593;
            if (i2 == 0 && this.f61000) {
                this.f60989 = c1593;
            } else {
                this.f60989 = c1592;
            }
            this.f60996 = this.f60993 && this.f61001;
        }
        this.f60986 = true;
    }
}
