package l;

import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ۖܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BBR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2656 implements InterfaceC20295 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f8350;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8300[] f8351;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21064[] f8352;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f8353;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f8354;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3361 f8355;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f8356;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5478 m8322(C3361 c3361) {
        int[] iArr;
        C8300 c8300;
        C21064 c21064M47910;
        C2656 c2656 = new C2656(c3361);
        C4772 c4772M10270 = c3361.m10270();
        C8300 c8300M10271 = c3361.m10271();
        int size = c8300M10271.size();
        int[] iArr2 = c2656.f8356;
        C13573.m32627(0, iArr2);
        int[] iArr3 = c2656.f8350;
        C13573.m32627(0, iArr3);
        loop0: while (true) {
            int length = iArr2.length;
            int i = 0;
            while (true) {
                iArr = c2656.f8353;
                if (i >= length) {
                    break loop0;
                }
                if (iArr2[i] != 0) {
                    break;
                }
                i++;
            }
            try {
                c4772M10270.getClass();
                while (true) {
                    int iM32623 = C13573.m32623(0, iArr2);
                    if (iM32623 < 0) {
                        break;
                    }
                    C13573.m32620(iM32623, iArr2);
                    c4772M10270.m13940(iM32623, c2656);
                    c2656.f8354 = iM32623;
                }
                for (int i2 = 0; i2 < size; i2++) {
                    C1244 c1244M40991get = c8300M10271.m40991get(i2);
                    int iM4089 = c1244M40991get.m4089();
                    int iM4085 = c1244M40991get.m4085();
                    int iM32624 = C13573.m32623(iM4089, iArr);
                    if (iM32624 >= 0 && iM32624 < iM4085) {
                        C13573.m32627(iM4089, iArr3);
                        C13573.m32627(iM4085, iArr3);
                        c2656.m8324(c1244M40991get.m4088(), true);
                    }
                }
            } catch (IllegalArgumentException e) {
                throw new C2698("flow of control falls off end of method", e);
            }
        }
        C0538[] c0538Arr = new C0538[c2656.f8355.m10270().m13941()];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int iM32625 = C13573.m32623(i4 + 1, iArr3);
            if (iM32625 < 0) {
                break;
            }
            if (C13573.m32626(i4, iArr)) {
                int i5 = iM32625 - 1;
                C21064 c21064 = null;
                while (true) {
                    if (i5 < i4) {
                        i5 = -1;
                        break;
                    }
                    c21064 = c2656.f8352[i5];
                    if (c21064 != null) {
                        break;
                    }
                    i5--;
                }
                if (c21064 == null) {
                    c21064M47910 = C21064.m47910(iM32625);
                    c8300 = C8300.f25495;
                } else {
                    C8300 c8301 = c2656.f8351[i5];
                    if (c8301 == null) {
                        c8301 = C8300.f25495;
                    }
                    c8300 = c8301;
                    c21064M47910 = c21064;
                }
                c0538Arr[i3] = new C0538(i4, i4, iM32625, c21064M47910, c8300);
                i3++;
            }
            i4 = iM32625;
        }
        C5478 c5478 = new C5478(i3);
        for (int i6 = 0; i6 < i3; i6++) {
            c5478.m38024(i6, c0538Arr[i6]);
        }
        return c5478;
    }

    public C2656(C3361 c3361) {
        this.f8355 = c3361;
        int iM13941 = c3361.m10270().m13941() + 1;
        this.f8356 = C13573.m32622(iM13941);
        this.f8353 = C13573.m32622(iM13941);
        this.f8350 = C13573.m32622(iM13941);
        this.f8352 = new C21064[iM13941];
        this.f8351 = new C8300[iM13941];
        this.f8354 = -1;
    }

    @Override // l.InterfaceC20295
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8327(int i, int i2) {
        m8323(i2, 1, true);
    }

    @Override // l.InterfaceC20295
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8331(int i, int i2, C7573 c7573) {
        if (i == 108 || i == 112) {
            m8323(i2, 1, true);
            if (c7573 == C7573.f23413 || c7573 == C7573.f23418) {
                m8325(i2, 1, true);
                return;
            }
            return;
        }
        if (i == 172 || i == 177) {
            m8323(i2, 1, false);
            this.f8352[i2] = C21064.f67936;
            return;
        }
        if (i != 190) {
            if (i == 191) {
                m8323(i2, 1, false);
                m8325(i2, 1, false);
                return;
            } else if (i != 194 && i != 195) {
                switch (i) {
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                        break;
                    default:
                        switch (i) {
                            case 79:
                            case 80:
                            case 81:
                            case 82:
                            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                            case 84:
                            case 85:
                            case HRSS1373Polynomial.K /* 86 */:
                                break;
                            default:
                                m8323(i2, 1, true);
                                break;
                        }
                        return;
                }
            }
        }
        m8323(i2, 1, true);
        m8325(i2, 1, true);
    }

    @Override // l.InterfaceC20295
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8329(int i, int i2, int i3, int i4, C7573 c7573, int i5) {
        if (i == 169) {
            m8323(i2, i3, false);
            this.f8352[i2] = C21064.f67936;
        } else {
            m8323(i2, i3, true);
        }
    }

    @Override // l.InterfaceC20295
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8330(int i, int i2, int i3, AbstractC13717 abstractC13717, int i4) {
        m8323(i2, i3, true);
        if ((abstractC13717 instanceof AbstractC15333) || (abstractC13717 instanceof C12512) || (abstractC13717 instanceof C13217) || (abstractC13717 instanceof C18863) || (abstractC13717 instanceof C21685) || (abstractC13717 instanceof C4751)) {
            m8325(i2, i3, true);
        }
    }

    @Override // l.InterfaceC20295
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8328(int i, int i2, int i3, int i4) {
        C21064[] c21064Arr = this.f8352;
        if (i == 167) {
            m8323(i2, i3, false);
            c21064Arr[i2] = C21064.m47910(i4);
        } else {
            if (i == 168) {
                m8324(i2, true);
            }
            int i5 = i2 + i3;
            m8323(i2, i3, true);
            m8324(i5, true);
            C21064 c21064 = new C21064(2);
            c21064.add(i5);
            c21064.add(i4);
            c21064.mo20349();
            c21064Arr[i2] = c21064;
        }
        m8324(i4, true);
    }

    @Override // l.InterfaceC20295
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8333(int i, int i2, C19632 c19632, int i3) {
        m8323(i, i2, false);
        m8324(c19632.m45145(), true);
        int size = c19632.size();
        for (int i4 = 0; i4 < size; i4++) {
            m8324(c19632.m45144(i4), true);
        }
        this.f8352[i] = c19632.m45143();
    }

    @Override // l.InterfaceC20295
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8332(int i, int i2, C12512 c12512, ArrayList arrayList) {
        m8323(i, i2, true);
        m8325(i, i2, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8324(int i, boolean z) {
        if (!C13573.m32626(i, this.f8353)) {
            C13573.m32627(i, this.f8356);
        }
        if (z) {
            C13573.m32627(i, this.f8350);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8323(int i, int i2, boolean z) {
        C13573.m32627(i, this.f8353);
        if (z) {
            m8324(i + i2, false);
        } else {
            C13573.m32627(i + i2, this.f8350);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m8325(int i, int i2, boolean z) {
        int i3 = i2 + i;
        if (z) {
            m8324(i3, true);
        }
        C8300 c8300M21903 = this.f8355.m10271().m21903(i);
        this.f8351[i] = c8300M21903;
        if (!z) {
            i3 = -1;
        }
        this.f8352[i] = c8300M21903.m21902(i3);
    }

    @Override // l.InterfaceC20295
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo8326() {
        return this.f8354;
    }
}
