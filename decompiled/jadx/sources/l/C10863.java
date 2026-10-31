package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KI */
/* JADX INFO: loaded from: classes4.dex */
public class C10863 implements InterfaceC17918 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC1690 f32635;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15800 f32633 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f32631 = 0.0f;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f32634 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f32632 = false;

    public C10863() {
    }

    public C10863(C16506 c16506) {
        this.f32635 = new C7128(this, c16506);
    }

    public String toString() {
        boolean z;
        String str;
        String strM37867 = C16014.m37867(this.f32633 == null ? "0" : "" + this.f32633, " = ");
        if (this.f32631 != 0.0f) {
            StringBuilder sbM15339 = C5368.m15339(strM37867);
            sbM15339.append(this.f32631);
            strM37867 = sbM15339.toString();
            z = true;
        } else {
            z = false;
        }
        int iMo5700 = this.f32635.mo5700();
        for (int i = 0; i < iMo5700; i++) {
            C15800 c15800Mo5694 = this.f32635.mo5694(i);
            if (c15800Mo5694 != null) {
                float fMo5699 = this.f32635.mo5699(i);
                if (fMo5699 != 0.0f) {
                    String string = c15800Mo5694.toString();
                    if (z) {
                        if (fMo5699 > 0.0f) {
                            strM37867 = C16014.m37867(strM37867, " + ");
                        } else {
                            str = " - ";
                            strM37867 = C16014.m37867(strM37867, str);
                            fMo5699 *= -1.0f;
                        }
                    } else if (fMo5699 < 0.0f) {
                        str = "- ";
                        strM37867 = C16014.m37867(strM37867, str);
                        fMo5699 *= -1.0f;
                    }
                    strM37867 = fMo5699 == 1.0f ? C16014.m37867(strM37867, string) : strM37867 + fMo5699 + " " + string;
                    z = true;
                }
            }
        }
        return !z ? C16014.m37867(strM37867, "0.0") : strM37867;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27159(C15800 c15800, C15800 c15801, C15800 c15802, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f32631 = i;
        }
        if (!z) {
            this.f32635.mo5697(c15800, -1.0f);
            this.f32635.mo5697(c15801, 1.0f);
            this.f32635.mo5697(c15802, 1.0f);
        } else {
            this.f32635.mo5697(c15800, 1.0f);
            this.f32635.mo5697(c15801, -1.0f);
            this.f32635.mo5697(c15802, -1.0f);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27164(C15800 c15800, C15800 c15801, C15800 c15802, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f32631 = i;
        }
        if (!z) {
            this.f32635.mo5697(c15800, -1.0f);
            this.f32635.mo5697(c15801, 1.0f);
            this.f32635.mo5697(c15802, -1.0f);
        } else {
            this.f32635.mo5697(c15800, 1.0f);
            this.f32635.mo5697(c15801, -1.0f);
            this.f32635.mo5697(c15802, 1.0f);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27158(float f, float f2, float f3, C15800 c15800, C15800 c15801, C15800 c15802, C15800 c15803) {
        this.f32631 = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f32635.mo5697(c15800, 1.0f);
            this.f32635.mo5697(c15801, -1.0f);
            this.f32635.mo5697(c15803, 1.0f);
            this.f32635.mo5697(c15802, -1.0f);
            return;
        }
        if (f == 0.0f) {
            this.f32635.mo5697(c15800, 1.0f);
            this.f32635.mo5697(c15801, -1.0f);
        } else {
            if (f3 == 0.0f) {
                this.f32635.mo5697(c15802, 1.0f);
                this.f32635.mo5697(c15803, -1.0f);
                return;
            }
            float f4 = (f / f2) / (f3 / f2);
            this.f32635.mo5697(c15800, 1.0f);
            this.f32635.mo5697(c15801, -1.0f);
            this.f32635.mo5697(c15803, f4);
            this.f32635.mo5697(c15802, -f4);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27161(C17212 c17212, int i) {
        this.f32635.mo5697(c17212.m40494(i), 1.0f);
        this.f32635.mo5697(c17212.m40494(i), -1.0f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27160(C15800 c15800, C15800 c15801, C15800 c15802, C15800 c15803, float f) {
        this.f32635.mo5697(c15802, 0.5f);
        this.f32635.mo5697(c15803, 0.5f);
        this.f32635.mo5697(c15800, -0.5f);
        this.f32635.mo5697(c15801, -0.5f);
        this.f32631 = -f;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27163(C15800 c15800) {
        C15800 c15801 = this.f32633;
        if (c15801 != null) {
            this.f32635.mo5697(c15801, -1.0f);
            this.f32633.f48738 = -1;
            this.f32633 = null;
        }
        float fMo5693 = this.f32635.mo5693(c15800, true) * (-1.0f);
        this.f32633 = c15800;
        if (fMo5693 == 1.0f) {
            return;
        }
        this.f32631 /= fMo5693;
        this.f32635.mo5696(fMo5693);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo24288() {
        return this.f32633 == null && this.f32631 == 0.0f && this.f32635.mo5700() == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo24287(C17212 c17212, C10863 c10863, boolean z) {
        float fMo5691 = this.f32635.mo5691(c10863, z);
        this.f32631 = (c10863.f32631 * fMo5691) + this.f32631;
        if (z) {
            c10863.f32633.m37440(this);
        }
        if (this.f32633 == null || this.f32635.mo5700() != 0) {
            return;
        }
        this.f32632 = true;
        c17212.f52800 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27162(C17212 c17212, C15800 c15800, boolean z) {
        if (c15800.f48739) {
            float fMo5692 = this.f32635.mo5692(c15800);
            this.f32631 = (c15800.f48734 * fMo5692) + this.f32631;
            this.f32635.mo5693(c15800, z);
            if (z) {
                c15800.m37440(this);
            }
            if (this.f32635.mo5700() == 0) {
                this.f32632 = true;
                c17212.f52800 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C15800 m27156(boolean[] zArr, C15800 c15800) {
        EnumC8746 enumC8746;
        int iMo5700 = this.f32635.mo5700();
        C15800 c15801 = null;
        float f = 0.0f;
        for (int i = 0; i < iMo5700; i++) {
            float fMo5699 = this.f32635.mo5699(i);
            if (fMo5699 < 0.0f) {
                C15800 c15800Mo5694 = this.f32635.mo5694(i);
                if ((zArr == null || !zArr[c15800Mo5694.f48743]) && c15800Mo5694 != c15800 && (((enumC8746 = c15800Mo5694.f48744) == EnumC8746.SLACK || enumC8746 == EnumC8746.ERROR) && fMo5699 < f)) {
                    f = fMo5699;
                    c15801 = c15800Mo5694;
                }
            }
        }
        return c15801;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15800 m27157(C15800 c15800) {
        return m27156((boolean[]) null, c15800);
    }

    @Override // l.InterfaceC17918
    /* JADX INFO: renamed from: ֫ */
    public C15800 mo24286(boolean[] zArr) {
        return m27156(zArr, (C15800) null);
    }
}
