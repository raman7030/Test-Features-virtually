package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢ۠ */
/* JADX INFO: compiled from: E1CE */
/* JADX INFO: loaded from: classes4.dex */
public final class C1311 extends C1381 {

    /* JADX INFO: renamed from: ۜ */
    public int f31606;

    /* JADX INFO: renamed from: ܳ */
    public C1871 f31607;

    /* JADX INFO: renamed from: ᩷ */
    public C1626[] f31608;

    /* JADX INFO: renamed from: ᩻ */
    public C1626[] f31609;

    /* JADX INFO: renamed from: ۧ */
    public final void m26299() {
        this.f31606 = 0;
        this.f35608 = 0.0f;
    }

    public C1311(C1661 c1661) {
        super(c1661);
        this.f31609 = new C1626[128];
        this.f31608 = new C1626[128];
        this.f31606 = 0;
        this.f31607 = new C1871(this);
    }

    @Override // p067l.C1381
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo26298() {
        return this.f31606 == 0;
    }

    @Override // p067l.C1381, p067l.InterfaceC1731
    /* JADX INFO: renamed from: ֫ */
    public final C1626 mo26296(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f31606; i2++) {
            C1626[] c1626Arr = this.f31609;
            C1626 c1626 = c1626Arr[i2];
            if (!zArr[c1626.f51881]) {
                C1871 c1871 = this.f31607;
                c1871.f69454 = c1626;
                int i3 = 8;
                if (i != -1) {
                    C1626 c1627 = c1626Arr[i];
                    while (i3 >= 0) {
                        float f = c1627.f51879[i3];
                        float f2 = c1871.f69454.f51879[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = c1871.f69454.f51879[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f31609[i];
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m26300(C1626 c1626) {
        this.f31607.f69454 = c1626;
        float[] fArr = c1626.f51879;
        Arrays.fill(fArr, 0.0f);
        fArr[c1626.f51875] = 1.0f;
        m26295(c1626);
    }

    /* JADX INFO: renamed from: ᩳ */
    private final void m26295(C1626 c1626) {
        int i;
        int i2 = this.f31606 + 1;
        C1626[] c1626Arr = this.f31609;
        if (i2 > c1626Arr.length) {
            C1626[] c1626Arr2 = (C1626[]) Arrays.copyOf(c1626Arr, c1626Arr.length * 2);
            this.f31609 = c1626Arr2;
            this.f31608 = (C1626[]) Arrays.copyOf(c1626Arr2, c1626Arr2.length * 2);
        }
        C1626[] c1626Arr3 = this.f31609;
        int i3 = this.f31606;
        c1626Arr3[i3] = c1626;
        int i4 = i3 + 1;
        this.f31606 = i4;
        if (i4 > 1 && c1626Arr3[i3].f51881 > c1626.f51881) {
            int i5 = 0;
            while (true) {
                i = this.f31606;
                if (i5 >= i) {
                    break;
                }
                this.f31608[i5] = this.f31609[i5];
                i5++;
            }
            Arrays.sort(this.f31608, 0, i, new C1171());
            for (int i6 = 0; i6 < this.f31606; i6++) {
                this.f31609[i6] = this.f31608[i6];
            }
        }
        c1626.f51880 = true;
        c1626.m39608(this);
    }

    /* JADX INFO: renamed from: ܿ */
    private final void m26294(C1626 c1626) {
        int i = 0;
        while (i < this.f31606) {
            if (this.f31609[i] == c1626) {
                while (true) {
                    int i2 = this.f31606;
                    if (i < i2 - 1) {
                        C1626[] c1626Arr = this.f31609;
                        int i3 = i + 1;
                        c1626Arr[i] = c1626Arr[i3];
                        i = i3;
                    } else {
                        this.f31606 = i2 - 1;
                        c1626.f51880 = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p067l.C1381
    /* JADX INFO: renamed from: ֫ */
    public final void mo26297(C1696 c1696, C1381 c1381, boolean z) {
        C1626 c1626 = c1381.f35610;
        if (c1626 == null) {
            return;
        }
        float[] fArr = c1626.f51879;
        InterfaceC0926 interfaceC0926 = c1381.f35612;
        int iMo7933 = interfaceC0926.mo7933();
        for (int i = 0; i < iMo7933; i++) {
            C1626 c1626Mo7927 = interfaceC0926.mo7927(i);
            float fMo7932 = interfaceC0926.mo7932(i);
            C1871 c1871 = this.f31607;
            c1871.f69454 = c1626Mo7927;
            if (c1626Mo7927.f51880) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = c1871.f69454.f51879;
                    float f = (fArr[i2] * fMo7932) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        c1871.f69454.f51879[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    c1871.f69453.m26294(c1871.f69454);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fMo7932;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        c1871.f69454.f51879[i3] = f3;
                    } else {
                        c1871.f69454.f51879[i3] = 0.0f;
                    }
                }
                m26295(c1626Mo7927);
            }
            this.f35608 = (c1381.f35608 * fMo7932) + this.f35608;
        }
        m26294(c1626);
    }

    @Override // p067l.C1381
    public final String toString() {
        String str = " goal -> (" + this.f35608 + ") : ";
        for (int i = 0; i < this.f31606; i++) {
            C1626 c1626 = this.f31609[i];
            C1871 c1871 = this.f31607;
            c1871.f69454 = c1626;
            str = str + c1871 + " ";
        }
        return str;
    }
}
