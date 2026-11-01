package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧ۠ */
/* JADX INFO: compiled from: M1KI */
/* JADX INFO: loaded from: classes4.dex */
public class C1381 implements InterfaceC1731 {

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC0926 f35612;

    /* JADX INFO: renamed from: ܽ */
    public C1626 f35610 = null;

    /* JADX INFO: renamed from: ֫ */
    public float f35608 = 0.0f;

    /* JADX INFO: renamed from: ܿ */
    public ArrayList f35611 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public boolean f35609 = false;

    public C1381() {
    }

    public C1381(C1661 c1661) {
        this.f35612 = new C1196(this, c1661);
    }

    public String toString() {
        boolean z;
        String str;
        String strM40053 = C17588.m40053(this.f35610 == null ? "0" : "" + this.f35610, " = ");
        if (this.f35608 != 0.0f) {
            StringBuilder sbM17248 = C7470.m17248(strM40053);
            sbM17248.append(this.f35608);
            strM40053 = sbM17248.toString();
            z = true;
        } else {
            z = false;
        }
        int iMo7933 = this.f35612.mo7933();
        for (int i = 0; i < iMo7933; i++) {
            C1626 c1626Mo7927 = this.f35612.mo7927(i);
            if (c1626Mo7927 != null) {
                float fMo7932 = this.f35612.mo7932(i);
                if (fMo7932 != 0.0f) {
                    String string = c1626Mo7927.toString();
                    if (z) {
                        if (fMo7932 > 0.0f) {
                            strM40053 = C17588.m40053(strM40053, " + ");
                        } else {
                            str = " - ";
                            strM40053 = C17588.m40053(strM40053, str);
                            fMo7932 *= -1.0f;
                        }
                    } else if (fMo7932 < 0.0f) {
                        str = "- ";
                        strM40053 = C17588.m40053(strM40053, str);
                        fMo7932 *= -1.0f;
                    }
                    strM40053 = fMo7932 == 1.0f ? C17588.m40053(strM40053, string) : strM40053 + fMo7932 + " " + string;
                    z = true;
                }
            }
        }
        return !z ? C17588.m40053(strM40053, "0.0") : strM40053;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29204(C1626 c1626, C1626 c1627, C1626 c1628, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f35608 = i;
        }
        if (!z) {
            this.f35612.mo7930(c1626, -1.0f);
            this.f35612.mo7930(c1627, 1.0f);
            this.f35612.mo7930(c1628, 1.0f);
        } else {
            this.f35612.mo7930(c1626, 1.0f);
            this.f35612.mo7930(c1627, -1.0f);
            this.f35612.mo7930(c1628, -1.0f);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m29209(C1626 c1626, C1626 c1627, C1626 c1628, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f35608 = i;
        }
        if (!z) {
            this.f35612.mo7930(c1626, -1.0f);
            this.f35612.mo7930(c1627, 1.0f);
            this.f35612.mo7930(c1628, -1.0f);
        } else {
            this.f35612.mo7930(c1626, 1.0f);
            this.f35612.mo7930(c1627, -1.0f);
            this.f35612.mo7930(c1628, 1.0f);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29203(float f, float f2, float f3, C1626 c1626, C1626 c1627, C1626 c1628, C1626 c1629) {
        this.f35608 = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f35612.mo7930(c1626, 1.0f);
            this.f35612.mo7930(c1627, -1.0f);
            this.f35612.mo7930(c1629, 1.0f);
            this.f35612.mo7930(c1628, -1.0f);
            return;
        }
        if (f == 0.0f) {
            this.f35612.mo7930(c1626, 1.0f);
            this.f35612.mo7930(c1627, -1.0f);
        } else {
            if (f3 == 0.0f) {
                this.f35612.mo7930(c1628, 1.0f);
                this.f35612.mo7930(c1629, -1.0f);
                return;
            }
            float f4 = (f / f2) / (f3 / f2);
            this.f35612.mo7930(c1626, 1.0f);
            this.f35612.mo7930(c1627, -1.0f);
            this.f35612.mo7930(c1629, f4);
            this.f35612.mo7930(c1628, -f4);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29206(C1696 c1696, int i) {
        this.f35612.mo7930(c1696.m42741(i), 1.0f);
        this.f35612.mo7930(c1696.m42741(i), -1.0f);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29205(C1626 c1626, C1626 c1627, C1626 c1628, C1626 c1629, float f) {
        this.f35612.mo7930(c1628, 0.5f);
        this.f35612.mo7930(c1629, 0.5f);
        this.f35612.mo7930(c1626, -0.5f);
        this.f35612.mo7930(c1627, -0.5f);
        this.f35608 = -f;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m29208(C1626 c1626) {
        C1626 c1627 = this.f35610;
        if (c1627 != null) {
            this.f35612.mo7930(c1627, -1.0f);
            this.f35610.f51876 = -1;
            this.f35610 = null;
        }
        float fMo7926 = this.f35612.mo7926(c1626, true) * (-1.0f);
        this.f35610 = c1626;
        if (fMo7926 == 1.0f) {
            return;
        }
        this.f35608 /= fMo7926;
        this.f35612.mo7929(fMo7926);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo26298() {
        return this.f35610 == null && this.f35608 == 0.0f && this.f35612.mo7933() == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo26297(C1696 c1696, C1381 c1381, boolean z) {
        float fMo7924 = this.f35612.mo7924(c1381, z);
        this.f35608 = (c1381.f35608 * fMo7924) + this.f35608;
        if (z) {
            c1381.f35610.m39611(this);
        }
        if (this.f35610 == null || this.f35612.mo7933() != 0) {
            return;
        }
        this.f35609 = true;
        c1696.f55982 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29207(C1696 c1696, C1626 c1626, boolean z) {
        if (c1626.f51877) {
            float fMo7925 = this.f35612.mo7925(c1626);
            this.f35608 = (c1626.f51872 * fMo7925) + this.f35608;
            this.f35612.mo7926(c1626, z);
            if (z) {
                c1626.m39611(this);
            }
            if (this.f35612.mo7933() == 0) {
                this.f35609 = true;
                c1696.f55982 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C1626 m29201(boolean[] zArr, C1626 c1626) {
        EnumC1276 enumC1276;
        int iMo7933 = this.f35612.mo7933();
        C1626 c1627 = null;
        float f = 0.0f;
        for (int i = 0; i < iMo7933; i++) {
            float fMo7932 = this.f35612.mo7932(i);
            if (fMo7932 < 0.0f) {
                C1626 c1626Mo7927 = this.f35612.mo7927(i);
                if ((zArr == null || !zArr[c1626Mo7927.f51881]) && c1626Mo7927 != c1626 && (((enumC1276 = c1626Mo7927.f51882) == EnumC1276.SLACK || enumC1276 == EnumC1276.ERROR) && fMo7932 < f)) {
                    f = fMo7932;
                    c1627 = c1626Mo7927;
                }
            }
        }
        return c1627;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1626 m29202(C1626 c1626) {
        return m29201((boolean[]) null, c1626);
    }

    @Override // p067l.InterfaceC1731
    /* JADX INFO: renamed from: ֫ */
    public C1626 mo26296(boolean[] zArr) {
        return m29201(zArr, (C1626) null);
    }
}
