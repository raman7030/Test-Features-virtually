package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۟֨ */
/* JADX INFO: compiled from: A1J5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1196 implements InterfaceC0926 {

    /* JADX INFO: renamed from: ۢ */
    public final C1381 f24751;

    /* JADX INFO: renamed from: ܳ */
    public final C1661 f24753;

    /* JADX INFO: renamed from: ۧ */
    public int f24752 = 0;

    /* JADX INFO: renamed from: ֫ */
    public int f24749 = 8;

    /* JADX INFO: renamed from: ܽ */
    public int[] f24754 = new int[8];

    /* JADX INFO: renamed from: ᩳ */
    public int[] f24756 = new int[8];

    /* JADX INFO: renamed from: ܿ */
    public float[] f24755 = new float[8];

    /* JADX INFO: renamed from: ۜ */
    public int f24750 = -1;

    /* JADX INFO: renamed from: ᩷ */
    public int f24757 = -1;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f24758 = false;

    public C1196(C1381 c1381, C1661 c1661) {
        this.f24751 = c1381;
        this.f24753 = c1661;
    }

    @Override // p067l.InterfaceC0926
    /* JADX INFO: renamed from: ֫ */
    public final void mo7930(C1626 c1626, float f) {
        if (f == 0.0f) {
            mo7926(c1626, true);
            return;
        }
        int i = this.f24750;
        C1381 c1381 = this.f24751;
        if (i == -1) {
            this.f24750 = 0;
            this.f24755[0] = f;
            this.f24754[0] = c1626.f51881;
            this.f24756[0] = -1;
            c1626.f51878++;
            c1626.m39608(c1381);
            this.f24752++;
            if (this.f24758) {
                return;
            }
            int i2 = this.f24757 + 1;
            this.f24757 = i2;
            int[] iArr = this.f24754;
            if (i2 >= iArr.length) {
                this.f24758 = true;
                this.f24757 = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f24752; i4++) {
            int i5 = this.f24754[i];
            int i6 = c1626.f51881;
            if (i5 == i6) {
                this.f24755[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f24756[i];
        }
        int length = this.f24757;
        int i7 = length + 1;
        if (this.f24758) {
            int[] iArr2 = this.f24754;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f24754;
        if (length >= iArr3.length && this.f24752 < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f24754;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f24754;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f24749 * 2;
            this.f24749 = i9;
            this.f24758 = false;
            this.f24757 = length - 1;
            this.f24755 = Arrays.copyOf(this.f24755, i9);
            this.f24754 = Arrays.copyOf(this.f24754, this.f24749);
            this.f24756 = Arrays.copyOf(this.f24756, this.f24749);
        }
        this.f24754[length] = c1626.f51881;
        this.f24755[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f24756;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f24756[length] = this.f24750;
            this.f24750 = length;
        }
        c1626.f51878++;
        c1626.m39608(c1381);
        int i10 = this.f24752 + 1;
        this.f24752 = i10;
        if (!this.f24758) {
            this.f24757++;
        }
        int[] iArr7 = this.f24754;
        if (i10 >= iArr7.length) {
            this.f24758 = true;
        }
        if (this.f24757 >= iArr7.length) {
            this.f24758 = true;
            this.f24757 = iArr7.length - 1;
        }
    }

    @Override // p067l.InterfaceC0926
    /* JADX INFO: renamed from: ֫ */
    public final void mo7931(C1626 c1626, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f24750;
            C1381 c1381 = this.f24751;
            if (i == -1) {
                this.f24750 = 0;
                this.f24755[0] = f;
                this.f24754[0] = c1626.f51881;
                this.f24756[0] = -1;
                c1626.f51878++;
                c1626.m39608(c1381);
                this.f24752++;
                if (this.f24758) {
                    return;
                }
                int i2 = this.f24757 + 1;
                this.f24757 = i2;
                int[] iArr = this.f24754;
                if (i2 >= iArr.length) {
                    this.f24758 = true;
                    this.f24757 = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f24752; i4++) {
                int i5 = this.f24754[i];
                int i6 = c1626.f51881;
                if (i5 == i6) {
                    float[] fArr = this.f24755;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f24750) {
                            this.f24750 = this.f24756[i];
                        } else {
                            int[] iArr2 = this.f24756;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c1626.m39611(c1381);
                        }
                        if (this.f24758) {
                            this.f24757 = i;
                        }
                        c1626.f51878--;
                        this.f24752--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f24756[i];
            }
            int length = this.f24757;
            int i7 = length + 1;
            if (this.f24758) {
                int[] iArr3 = this.f24754;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f24754;
            if (length >= iArr4.length && this.f24752 < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f24754;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.f24754;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f24749 * 2;
                this.f24749 = i9;
                this.f24758 = false;
                this.f24757 = length - 1;
                this.f24755 = Arrays.copyOf(this.f24755, i9);
                this.f24754 = Arrays.copyOf(this.f24754, this.f24749);
                this.f24756 = Arrays.copyOf(this.f24756, this.f24749);
            }
            this.f24754[length] = c1626.f51881;
            this.f24755[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f24756;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f24756[length] = this.f24750;
                this.f24750 = length;
            }
            c1626.f51878++;
            c1626.m39608(c1381);
            this.f24752++;
            if (!this.f24758) {
                this.f24757++;
            }
            int i10 = this.f24757;
            int[] iArr8 = this.f24754;
            if (i10 >= iArr8.length) {
                this.f24758 = true;
                this.f24757 = iArr8.length - 1;
            }
        }
    }

    @Override // p067l.InterfaceC0926
    /* JADX INFO: renamed from: ֫ */
    public final float mo7924(C1381 c1381, boolean z) {
        float fMo7925 = mo7925(c1381.f35610);
        mo7926(c1381.f35610, z);
        InterfaceC0926 interfaceC0926 = c1381.f35612;
        int iMo7933 = interfaceC0926.mo7933();
        for (int i = 0; i < iMo7933; i++) {
            C1626 c1626Mo7927 = interfaceC0926.mo7927(i);
            mo7931(c1626Mo7927, interfaceC0926.mo7925(c1626Mo7927) * fMo7925, z);
        }
        return fMo7925;
    }

    @Override // p067l.InterfaceC0926
    /* JADX INFO: renamed from: ֫ */
    public final float mo7926(C1626 c1626, boolean z) {
        int i = this.f24750;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f24752) {
            if (this.f24754[i] == c1626.f51881) {
                if (i == this.f24750) {
                    this.f24750 = this.f24756[i];
                } else {
                    int[] iArr = this.f24756;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c1626.m39611(this.f24751);
                }
                c1626.f51878--;
                this.f24752--;
                this.f24754[i] = -1;
                if (this.f24758) {
                    this.f24757 = i;
                }
                return this.f24755[i];
            }
            i2++;
            i3 = i;
            i = this.f24756[i];
        }
        return 0.0f;
    }

    @Override // p067l.InterfaceC0926
    public final void clear() {
        int i = this.f24750;
        for (int i2 = 0; i != -1 && i2 < this.f24752; i2++) {
            C1626 c1626 = this.f24753.f53903[this.f24754[i]];
            if (c1626 != null) {
                c1626.m39611(this.f24751);
            }
            i = this.f24756[i];
        }
        this.f24750 = -1;
        this.f24757 = -1;
        this.f24758 = false;
        this.f24752 = 0;
    }

    @Override // p067l.InterfaceC0926
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo7934(C1626 c1626) {
        int i = this.f24750;
        if (i != -1) {
            for (int i2 = 0; i != -1 && i2 < this.f24752; i2++) {
                if (this.f24754[i] == c1626.f51881) {
                    return true;
                }
                i = this.f24756[i];
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC0926
    /* JADX INFO: renamed from: ֫ */
    public final void mo7928() {
        int i = this.f24750;
        for (int i2 = 0; i != -1 && i2 < this.f24752; i2++) {
            float[] fArr = this.f24755;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f24756[i];
        }
    }

    @Override // p067l.InterfaceC0926
    /* JADX INFO: renamed from: ֫ */
    public final void mo7929(float f) {
        int i = this.f24750;
        for (int i2 = 0; i != -1 && i2 < this.f24752; i2++) {
            float[] fArr = this.f24755;
            fArr[i] = fArr[i] / f;
            i = this.f24756[i];
        }
    }

    @Override // p067l.InterfaceC0926
    /* JADX INFO: renamed from: ۧ */
    public final int mo7933() {
        return this.f24752;
    }

    @Override // p067l.InterfaceC0926
    /* JADX INFO: renamed from: ֫ */
    public final C1626 mo7927(int i) {
        int i2 = this.f24750;
        for (int i3 = 0; i2 != -1 && i3 < this.f24752; i3++) {
            if (i3 == i) {
                return this.f24753.f53903[this.f24754[i2]];
            }
            i2 = this.f24756[i2];
        }
        return null;
    }

    @Override // p067l.InterfaceC0926
    /* JADX INFO: renamed from: ۧ */
    public final float mo7932(int i) {
        int i2 = this.f24750;
        for (int i3 = 0; i2 != -1 && i3 < this.f24752; i3++) {
            if (i3 == i) {
                return this.f24755[i2];
            }
            i2 = this.f24756[i2];
        }
        return 0.0f;
    }

    @Override // p067l.InterfaceC0926
    /* JADX INFO: renamed from: ֫ */
    public final float mo7925(C1626 c1626) {
        int i = this.f24750;
        for (int i2 = 0; i != -1 && i2 < this.f24752; i2++) {
            if (this.f24754[i] == c1626.f51881) {
                return this.f24755[i];
            }
            i = this.f24756[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f24750;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f24752; i2++) {
            StringBuilder sbM17248 = C7470.m17248(C17588.m40053(string, " -> "));
            sbM17248.append(this.f24755[i]);
            sbM17248.append(" : ");
            StringBuilder sbM17249 = C7470.m17248(sbM17248.toString());
            sbM17249.append(this.f24753.f53903[this.f24754[i]]);
            string = sbM17249.toString();
            i = this.f24756[i];
        }
        return string;
    }
}
