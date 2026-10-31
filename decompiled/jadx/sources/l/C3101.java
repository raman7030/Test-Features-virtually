package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 41JE */
/* JADX INFO: loaded from: classes2.dex */
public final class C3101 extends C15094 {

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public boolean f9706;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public float f9704 = -1.0f;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public int f9703 = -1;

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public int f9702 = -1;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public C5218 f9707 = this.f46161;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public int f9705 = 0;

    @Override // l.C15094
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7760() {
        return true;
    }

    public C3101() {
        this.f46171.clear();
        this.f46171.add(this.f9707);
        int length = this.f46135.length;
        for (int i = 0; i < length; i++) {
            this.f46135[i] = this.f9707;
        }
    }

    @Override // l.C15094
    /* JADX INFO: renamed from: ֫ */
    public final void mo7758(C15094 c15094, HashMap map) {
        super.mo7758(c15094, map);
        C3101 c3101 = (C3101) c15094;
        this.f9704 = c3101.f9704;
        this.f9703 = c3101.f9703;
        this.f9702 = c3101.f9702;
        m9462(c3101.f9705);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m9462(int i) {
        if (this.f9705 == i) {
            return;
        }
        this.f9705 = i;
        ArrayList arrayList = this.f46171;
        arrayList.clear();
        if (this.f9705 == 1) {
            this.f9707 = this.f46141;
        } else {
            this.f9707 = this.f46161;
        }
        arrayList.add(this.f9707);
        C5218[] c5218Arr = this.f46135;
        int length = c5218Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c5218Arr[i2] = this.f9707;
        }
    }

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C5218 m9458() {
        return this.f9707;
    }

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final int m9463() {
        return this.f9705;
    }

    @Override // l.C15094
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5218 mo9453(EnumC0278 enumC0278) {
        switch (C4512.f14344[enumC0278.ordinal()]) {
            case 1:
            case 2:
                if (this.f9705 == 1) {
                    return this.f9707;
                }
                break;
            case 3:
            case 4:
                if (this.f9705 == 0) {
                    return this.f9707;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(enumC0278.name());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m9460(float f) {
        if (f > -1.0f) {
            this.f9704 = f;
            this.f9703 = -1;
            this.f9702 = -1;
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m9455(int i) {
        if (i > -1) {
            this.f9704 = -1.0f;
            this.f9703 = i;
            this.f9702 = -1;
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m9459(int i) {
        if (i > -1) {
            this.f9704 = -1.0f;
            this.f9703 = -1;
            this.f9702 = i;
        }
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final float m9456() {
        return this.f9704;
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final int m9454() {
        return this.f9703;
    }

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final int m9461() {
        return this.f9702;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m9452(int i) {
        this.f9707.m14996(i);
        this.f9706 = true;
    }

    @Override // l.C15094
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo7762() {
        return this.f9706;
    }

    @Override // l.C15094
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo7768() {
        return this.f9706;
    }

    @Override // l.C15094
    /* JADX INFO: renamed from: ֫ */
    public final void mo7759(C17212 c17212, boolean z) {
        C21446 c21446 = (C21446) this.f46132;
        if (c21446 == null) {
            return;
        }
        C5218 c5218Mo9453 = c21446.mo9453(EnumC0278.LEFT);
        C5218 c5218Mo9454 = c21446.mo9453(EnumC0278.RIGHT);
        C15094 c15094 = this.f46132;
        boolean z2 = c15094 != null && c15094.f46124[0] == EnumC8040.WRAP_CONTENT;
        if (this.f9705 == 0) {
            c5218Mo9453 = c21446.mo9453(EnumC0278.TOP);
            c5218Mo9454 = c21446.mo9453(EnumC0278.BOTTOM);
            C15094 c15095 = this.f46132;
            z2 = c15095 != null && c15095.f46124[1] == EnumC8040.WRAP_CONTENT;
        }
        if (this.f9706 && this.f9707.m15001()) {
            C15800 c15800M40495 = c17212.m40495(this.f9707);
            c17212.m40498(c15800M40495, this.f9707.m15004());
            if (this.f9703 != -1) {
                if (z2) {
                    c17212.m40502(c17212.m40495(c5218Mo9454), c15800M40495, 0, 5);
                }
            } else if (this.f9702 != -1 && z2) {
                C15800 c15800M40496 = c17212.m40495(c5218Mo9454);
                c17212.m40502(c15800M40495, c17212.m40495(c5218Mo9453), 0, 5);
                c17212.m40502(c15800M40496, c15800M40495, 0, 5);
            }
            this.f9706 = false;
            return;
        }
        if (this.f9703 != -1) {
            C15800 c15800M40497 = c17212.m40495(this.f9707);
            c17212.m40500(c15800M40497, c17212.m40495(c5218Mo9453), this.f9703, 8);
            if (z2) {
                c17212.m40502(c17212.m40495(c5218Mo9454), c15800M40497, 0, 5);
                return;
            }
            return;
        }
        if (this.f9702 != -1) {
            C15800 c15800M40498 = c17212.m40495(this.f9707);
            C15800 c15800M40499 = c17212.m40495(c5218Mo9454);
            c17212.m40500(c15800M40498, c15800M40499, -this.f9702, 8);
            if (z2) {
                c17212.m40502(c15800M40498, c17212.m40495(c5218Mo9453), 0, 5);
                c17212.m40502(c15800M40499, c15800M40498, 0, 5);
                return;
            }
            return;
        }
        if (this.f9704 != -1.0f) {
            C15800 c15800M404910 = c17212.m40495(this.f9707);
            C15800 c15800M404911 = c17212.m40495(c5218Mo9454);
            float f = this.f9704;
            C10863 c10863M40493 = c17212.m40493();
            c10863M40493.f32635.mo5697(c15800M404910, -1.0f);
            c10863M40493.f32635.mo5697(c15800M404911, f);
            c17212.m40497(c10863M40493);
        }
    }

    @Override // l.C15094
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo9457(C17212 c17212, boolean z) {
        if (this.f46132 == null) {
            return;
        }
        C5218 c5218 = this.f9707;
        c17212.getClass();
        int iM40489 = C17212.m40489(c5218);
        if (this.f9705 == 1) {
            this.f46163 = iM40489;
            this.f46121 = 0;
            m35733(this.f46132.m35732());
            m35770(0);
            return;
        }
        this.f46163 = 0;
        this.f46121 = iM40489;
        m35770(this.f46132.m35753());
        m35733(0);
    }
}
