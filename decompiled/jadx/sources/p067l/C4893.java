package p067l;

import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ۖܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BBR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4893 implements InterfaceC21657 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f11144;

    /* JADX INFO: renamed from: ۧ */
    public final C10257[] f11145;

    /* JADX INFO: renamed from: ܳ */
    public final C22388[] f11146;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f11147;

    /* JADX INFO: renamed from: ܿ */
    public int f11148;

    /* JADX INFO: renamed from: ᩳ */
    public final C5563 f11149;

    /* JADX INFO: renamed from: ᩻ */
    public final int[] f11150;

    /* JADX INFO: renamed from: ֫ */
    public static C7575 m10366(C5563 c5563) {
        int[] iArr;
        C10257 c10257;
        C22388 c22388M50240;
        C4893 c4893 = new C4893(c5563);
        C6904 c6904M12307 = c5563.m12307();
        C10257 c10257M12308 = c5563.m12308();
        int size = c10257M12308.size();
        int[] iArr2 = c4893.f11150;
        C15268.m34739(0, iArr2);
        int[] iArr3 = c4893.f11144;
        C15268.m34739(0, iArr3);
        loop0: while (true) {
            int length = iArr2.length;
            int i = 0;
            while (true) {
                iArr = c4893.f11147;
                if (i >= length) {
                    break loop0;
                }
                if (iArr2[i] != 0) {
                    break;
                }
                i++;
            }
            try {
                c6904M12307.getClass();
                while (true) {
                    int iM34735 = C15268.m34735(0, iArr2);
                    if (iM34735 < 0) {
                        break;
                    }
                    C15268.m34732(iM34735, iArr2);
                    c6904M12307.m15820(iM34735, c4893);
                    c4893.f11148 = iM34735;
                }
                for (int i2 = 0; i2 < size; i2++) {
                    C3551 c3551M56511get = c10257M12308.m56511get(i2);
                    int iM6333 = c3551M56511get.m6333();
                    int iM6329 = c3551M56511get.m6329();
                    int iM34736 = C15268.m34735(iM6333, iArr);
                    if (iM34736 >= 0 && iM34736 < iM6329) {
                        C15268.m34739(iM6333, iArr3);
                        C15268.m34739(iM6329, iArr3);
                        c4893.m10368(c3551M56511get.m6332(), true);
                    }
                }
            } catch (IllegalArgumentException e) {
                throw new C4933("flow of control falls off end of method", e);
            }
        }
        C2880[] c2880Arr = new C2880[c4893.f11149.m12307().m15821()];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int iM34737 = C15268.m34735(i4 + 1, iArr3);
            if (iM34737 < 0) {
                break;
            }
            if (C15268.m34738(i4, iArr)) {
                int i5 = iM34737 - 1;
                C22388 c22388 = null;
                while (true) {
                    if (i5 < i4) {
                        i5 = -1;
                        break;
                    }
                    c22388 = c4893.f11146[i5];
                    if (c22388 != null) {
                        break;
                    }
                    i5--;
                }
                if (c22388 == null) {
                    c22388M50240 = C22388.m50240(iM34737);
                    c10257 = C10257.f28405;
                } else {
                    C10257 c10258 = c4893.f11145[i5];
                    if (c10258 == null) {
                        c10258 = C10257.f28405;
                    }
                    c10257 = c10258;
                    c22388M50240 = c22388;
                }
                c2880Arr[i3] = new C2880(i4, i4, iM34737, c22388M50240, c10257);
                i3++;
            }
            i4 = iM34737;
        }
        C7575 c7575 = new C7575(i3);
        for (int i6 = 0; i6 < i3; i6++) {
            c7575.m40216(i6, c2880Arr[i6]);
        }
        return c7575;
    }

    public C4893(C5563 c5563) {
        this.f11149 = c5563;
        int iM15821 = c5563.m12307().m15821() + 1;
        this.f11150 = C15268.m34734(iM15821);
        this.f11147 = C15268.m34734(iM15821);
        this.f11144 = C15268.m34734(iM15821);
        this.f11146 = new C22388[iM15821];
        this.f11145 = new C10257[iM15821];
        this.f11148 = -1;
    }

    @Override // p067l.InterfaceC21657
    /* JADX INFO: renamed from: ֫ */
    public final void mo10371(int i, int i2) {
        m10367(i2, 1, true);
    }

    @Override // p067l.InterfaceC21657
    /* JADX INFO: renamed from: ֫ */
    public final void mo10375(int i, int i2, C9566 c9566) {
        if (i == 108 || i == 112) {
            m10367(i2, 1, true);
            if (c9566 == C9566.f26325 || c9566 == C9566.f26330) {
                m10369(i2, 1, true);
                return;
            }
            return;
        }
        if (i == 172 || i == 177) {
            m10367(i2, 1, false);
            this.f11146[i2] = C22388.f70620;
            return;
        }
        if (i != 190) {
            if (i == 191) {
                m10367(i2, 1, false);
                m10369(i2, 1, false);
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
                            case HRSS1373Polynomial.f81792K /* 86 */:
                                break;
                            default:
                                m10367(i2, 1, true);
                                break;
                        }
                        return;
                }
            }
        }
        m10367(i2, 1, true);
        m10369(i2, 1, true);
    }

    @Override // p067l.InterfaceC21657
    /* JADX INFO: renamed from: ֫ */
    public final void mo10373(int i, int i2, int i3, int i4, C9566 c9566, int i5) {
        if (i == 169) {
            m10367(i2, i3, false);
            this.f11146[i2] = C22388.f70620;
        } else {
            m10367(i2, i3, true);
        }
    }

    @Override // p067l.InterfaceC21657
    /* JADX INFO: renamed from: ֫ */
    public final void mo10374(int i, int i2, int i3, AbstractC15405 abstractC15405, int i4) {
        m10367(i2, i3, true);
        if ((abstractC15405 instanceof AbstractC16941) || (abstractC15405 instanceof C14260) || (abstractC15405 instanceof C14930) || (abstractC15405 instanceof C20296) || (abstractC15405 instanceof C22978) || (abstractC15405 instanceof C6884)) {
            m10369(i2, i3, true);
        }
    }

    @Override // p067l.InterfaceC21657
    /* JADX INFO: renamed from: ֫ */
    public final void mo10372(int i, int i2, int i3, int i4) {
        C22388[] c22388Arr = this.f11146;
        if (i == 167) {
            m10367(i2, i3, false);
            c22388Arr[i2] = C22388.m50240(i4);
        } else {
            if (i == 168) {
                m10368(i2, true);
            }
            int i5 = i2 + i3;
            m10367(i2, i3, true);
            m10368(i5, true);
            C22388 c22388 = new C22388(2);
            c22388.add(i5);
            c22388.add(i4);
            c22388.mo22326();
            c22388Arr[i2] = c22388;
        }
        m10368(i4, true);
    }

    @Override // p067l.InterfaceC21657
    /* JADX INFO: renamed from: ֫ */
    public final void mo10377(int i, int i2, C21027 c21027, int i3) {
        m10367(i, i2, false);
        m10368(c21027.m47441(), true);
        int size = c21027.size();
        for (int i4 = 0; i4 < size; i4++) {
            m10368(c21027.m47440(i4), true);
        }
        this.f11146[i] = c21027.m47439();
    }

    @Override // p067l.InterfaceC21657
    /* JADX INFO: renamed from: ֫ */
    public final void mo10376(int i, int i2, C14260 c14260, ArrayList arrayList) {
        m10367(i, i2, true);
        m10369(i, i2, true);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10368(int i, boolean z) {
        if (!C15268.m34738(i, this.f11147)) {
            C15268.m34739(i, this.f11150);
        }
        if (z) {
            C15268.m34739(i, this.f11144);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10367(int i, int i2, boolean z) {
        C15268.m34739(i, this.f11147);
        if (z) {
            m10368(i + i2, false);
        } else {
            C15268.m34739(i + i2, this.f11144);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m10369(int i, int i2, boolean z) {
        int i3 = i2 + i;
        if (z) {
            m10368(i3, true);
        }
        C10257 c10257M23873 = this.f11149.m12308().m23873(i);
        this.f11145[i] = c10257M23873;
        if (!z) {
            i3 = -1;
        }
        this.f11146[i] = c10257M23873.m23872(i3);
    }

    @Override // p067l.InterfaceC21657
    /* JADX INFO: renamed from: ֫ */
    public final int mo10370() {
        return this.f11148;
    }
}
