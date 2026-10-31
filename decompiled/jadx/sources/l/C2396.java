package l;

import com.alipay.sdk.m.y.l;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: U1KA */
/* JADX INFO: loaded from: classes3.dex */
public final class C2396 extends C12978 {

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public int f7645 = 0;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public boolean f7646 = true;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public int f7647 = 0;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public boolean f7648 = false;

    @Override // l.C15094
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo7760() {
        return true;
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final int m7766() {
        return this.f7645;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m7757(int i) {
        this.f7645 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7767(boolean z) {
        this.f7646 = z;
    }

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final boolean m7770() {
        return this.f7646;
    }

    @Override // l.C15094
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean mo7762() {
        return this.f7648;
    }

    @Override // l.C15094
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo7768() {
        return this.f7648;
    }

    @Override // l.C12978, l.C15094
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7758(C15094 c15094, HashMap map) {
        super.mo7758(c15094, map);
        C2396 c2396 = (C2396) c15094;
        this.f7645 = c2396.f7645;
        this.f7646 = c2396.f7646;
        this.f7647 = c2396.f7647;
    }

    @Override // l.C15094
    public final String toString() {
        String string = "[Barrier] " + m35751() + " {";
        for (int i = 0; i < this.f38881; i++) {
            C15094 c15094 = this.f38882[i];
            if (i > 0) {
                string = C16014.m37867(string, ", ");
            }
            StringBuilder sbM15339 = C5368.m15339(string);
            sbM15339.append(c15094.m35751());
            string = sbM15339.toString();
        }
        return C16014.m37867(string, l.d);
    }

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final void m7761() {
        for (int i = 0; i < this.f38881; i++) {
            C15094 c15094 = this.f38882[i];
            int i2 = this.f7645;
            if (i2 == 0 || i2 == 1) {
                c15094.m35711(0, true);
            } else if (i2 == 2 || i2 == 3) {
                c15094.m35711(1, true);
            }
        }
    }

    @Override // l.C15094
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7759(C17212 c17212, boolean z) {
        boolean z2;
        int i;
        int i2;
        C5218[] c5218Arr = this.f46135;
        C5218 c5218 = this.f46141;
        c5218Arr[0] = c5218;
        int i3 = 2;
        C5218 c5219 = this.f46161;
        c5218Arr[2] = c5219;
        C5218 c52110 = this.f46159;
        c5218Arr[1] = c52110;
        C5218 c52111 = this.f46133;
        c5218Arr[3] = c52111;
        for (C5218 c52112 : c5218Arr) {
            c52112.f16346 = c17212.m40495(c52112);
        }
        int i4 = this.f7645;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C5218 c52113 = c5218Arr[i4];
        if (!this.f7648) {
            m7763();
        }
        if (this.f7648) {
            this.f7648 = false;
            int i5 = this.f7645;
            if (i5 == 0 || i5 == 1) {
                c17212.m40498(c5218.f16346, this.f46163);
                c17212.m40498(c52110.f16346, this.f46163);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c17212.m40498(c5219.f16346, this.f46121);
                    c17212.m40498(c52111.f16346, this.f46121);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.f38881) {
                z2 = false;
                break;
            }
            C15094 c15094 = this.f38882[i6];
            if ((this.f7646 || c15094.mo7760()) && ((((i2 = this.f7645) == 0 || i2 == 1) && c15094.f46124[0] == EnumC8040.MATCH_CONSTRAINT && c15094.f46141.f16339 != null && c15094.f46159.f16339 != null) || ((i2 == 2 || i2 == 3) && c15094.f46124[1] == EnumC8040.MATCH_CONSTRAINT && c15094.f46161.f16339 != null && c15094.f46133.f16339 != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = c5218.m15005() || c52110.m15005();
        boolean z4 = c5219.m15005() || c52111.m15005();
        int i7 = !(!z2 && (((i = this.f7645) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f38881) {
            C15094 c15095 = this.f38882[i8];
            if (this.f7646 || c15095.mo7760()) {
                C15800 c15800M40495 = c17212.m40495(c15095.f46135[this.f7645]);
                C5218[] c5218Arr2 = c15095.f46135;
                int i9 = this.f7645;
                C5218 c52114 = c5218Arr2[i9];
                c52114.f16346 = c15800M40495;
                C5218 c52115 = c52114.f16339;
                int i10 = (c52115 == null || c52115.f16341 != this) ? 0 : c52114.f16343;
                if (i9 == 0 || i9 == i3) {
                    C15800 c15800 = c52113.f16346;
                    int i11 = this.f7647 - i10;
                    C10863 c10863M40493 = c17212.m40493();
                    C15800 c15800M40501 = c17212.m40501();
                    c15800M40501.f48737 = 0;
                    c10863M40493.m27164(c15800, c15800M40495, c15800M40501, i11);
                    c17212.m40497(c10863M40493);
                } else {
                    C15800 c15801 = c52113.f16346;
                    int i12 = this.f7647 + i10;
                    C10863 c10863M40494 = c17212.m40493();
                    C15800 c15800M40502 = c17212.m40501();
                    c15800M40502.f48737 = 0;
                    c10863M40494.m27159(c15801, c15800M40495, c15800M40502, i12);
                    c17212.m40497(c10863M40494);
                }
                c17212.m40500(c52113.f16346, c15800M40495, this.f7647 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f7645;
        if (i13 == 0) {
            c17212.m40500(c52110.f16346, c5218.f16346, 0, 8);
            c17212.m40500(c5218.f16346, this.f46132.f46159.f16346, 0, 4);
            c17212.m40500(c5218.f16346, this.f46132.f46141.f16346, 0, 0);
            return;
        }
        if (i13 == 1) {
            c17212.m40500(c5218.f16346, c52110.f16346, 0, 8);
            c17212.m40500(c5218.f16346, this.f46132.f46141.f16346, 0, 4);
            c17212.m40500(c5218.f16346, this.f46132.f46159.f16346, 0, 0);
        } else if (i13 == 2) {
            c17212.m40500(c52111.f16346, c5219.f16346, 0, 8);
            c17212.m40500(c5219.f16346, this.f46132.f46133.f16346, 0, 4);
            c17212.m40500(c5219.f16346, this.f46132.f46161.f16346, 0, 0);
        } else if (i13 == 3) {
            c17212.m40500(c5219.f16346, c52111.f16346, 0, 8);
            c17212.m40500(c5219.f16346, this.f46132.f46161.f16346, 0, 4);
            c17212.m40500(c5219.f16346, this.f46132.f46133.f16346, 0, 0);
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m7764(int i) {
        this.f7647 = i;
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final int m7765() {
        return this.f7647;
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final int m7769() {
        int i = this.f7645;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final boolean m7763() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.f38881;
            if (i4 >= i) {
                break;
            }
            C15094 c15094 = this.f38882[i4];
            if ((this.f7646 || c15094.mo7760()) && ((((i2 = this.f7645) == 0 || i2 == 1) && !c15094.mo7762()) || (((i3 = this.f7645) == 2 || i3 == 3) && !c15094.mo7768()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f38881; i5++) {
            C15094 c15095 = this.f38882[i5];
            if (this.f7646 || c15095.mo7760()) {
                if (!z2) {
                    int i6 = this.f7645;
                    if (i6 == 0) {
                        iMax = c15095.mo9453(EnumC0278.LEFT).m15004();
                    } else if (i6 == 1) {
                        iMax = c15095.mo9453(EnumC0278.RIGHT).m15004();
                    } else if (i6 == 2) {
                        iMax = c15095.mo9453(EnumC0278.TOP).m15004();
                    } else if (i6 == 3) {
                        iMax = c15095.mo9453(EnumC0278.BOTTOM).m15004();
                    }
                    z2 = true;
                }
                int i7 = this.f7645;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c15095.mo9453(EnumC0278.LEFT).m15004());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c15095.mo9453(EnumC0278.RIGHT).m15004());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c15095.mo9453(EnumC0278.TOP).m15004());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c15095.mo9453(EnumC0278.BOTTOM).m15004());
                }
            }
        }
        int i8 = iMax + this.f7647;
        int i9 = this.f7645;
        if (i9 == 0 || i9 == 1) {
            m35710(i8, i8);
        } else {
            m35744(i8, i8);
        }
        this.f7648 = true;
        return true;
    }
}
