package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A1J5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7128 implements InterfaceC1690 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C10863 f21872;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16506 f21874;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f21873 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f21870 = 8;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f21875 = new int[8];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int[] f21877 = new int[8];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float[] f21876 = new float[8];

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f21871 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f21878 = -1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f21879 = false;

    public C7128(C10863 c10863, C16506 c16506) {
        this.f21872 = c10863;
        this.f21874 = c16506;
    }

    @Override // l.InterfaceC1690
    /* JADX INFO: renamed from: ֫ */
    public final void mo5697(C15800 c15800, float f) {
        if (f == 0.0f) {
            mo5693(c15800, true);
            return;
        }
        int i = this.f21871;
        C10863 c10863 = this.f21872;
        if (i == -1) {
            this.f21871 = 0;
            this.f21876[0] = f;
            this.f21875[0] = c15800.f48743;
            this.f21877[0] = -1;
            c15800.f48740++;
            c15800.m37437(c10863);
            this.f21873++;
            if (this.f21879) {
                return;
            }
            int i2 = this.f21878 + 1;
            this.f21878 = i2;
            int[] iArr = this.f21875;
            if (i2 >= iArr.length) {
                this.f21879 = true;
                this.f21878 = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f21873; i4++) {
            int i5 = this.f21875[i];
            int i6 = c15800.f48743;
            if (i5 == i6) {
                this.f21876[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f21877[i];
        }
        int length = this.f21878;
        int i7 = length + 1;
        if (this.f21879) {
            int[] iArr2 = this.f21875;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f21875;
        if (length >= iArr3.length && this.f21873 < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f21875;
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
        int[] iArr5 = this.f21875;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f21870 * 2;
            this.f21870 = i9;
            this.f21879 = false;
            this.f21878 = length - 1;
            this.f21876 = Arrays.copyOf(this.f21876, i9);
            this.f21875 = Arrays.copyOf(this.f21875, this.f21870);
            this.f21877 = Arrays.copyOf(this.f21877, this.f21870);
        }
        this.f21875[length] = c15800.f48743;
        this.f21876[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f21877;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f21877[length] = this.f21871;
            this.f21871 = length;
        }
        c15800.f48740++;
        c15800.m37437(c10863);
        int i10 = this.f21873 + 1;
        this.f21873 = i10;
        if (!this.f21879) {
            this.f21878++;
        }
        int[] iArr7 = this.f21875;
        if (i10 >= iArr7.length) {
            this.f21879 = true;
        }
        if (this.f21878 >= iArr7.length) {
            this.f21879 = true;
            this.f21878 = iArr7.length - 1;
        }
    }

    @Override // l.InterfaceC1690
    /* JADX INFO: renamed from: ֫ */
    public final void mo5698(C15800 c15800, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f21871;
            C10863 c10863 = this.f21872;
            if (i == -1) {
                this.f21871 = 0;
                this.f21876[0] = f;
                this.f21875[0] = c15800.f48743;
                this.f21877[0] = -1;
                c15800.f48740++;
                c15800.m37437(c10863);
                this.f21873++;
                if (this.f21879) {
                    return;
                }
                int i2 = this.f21878 + 1;
                this.f21878 = i2;
                int[] iArr = this.f21875;
                if (i2 >= iArr.length) {
                    this.f21879 = true;
                    this.f21878 = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f21873; i4++) {
                int i5 = this.f21875[i];
                int i6 = c15800.f48743;
                if (i5 == i6) {
                    float[] fArr = this.f21876;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f21871) {
                            this.f21871 = this.f21877[i];
                        } else {
                            int[] iArr2 = this.f21877;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c15800.m37440(c10863);
                        }
                        if (this.f21879) {
                            this.f21878 = i;
                        }
                        c15800.f48740--;
                        this.f21873--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f21877[i];
            }
            int length = this.f21878;
            int i7 = length + 1;
            if (this.f21879) {
                int[] iArr3 = this.f21875;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f21875;
            if (length >= iArr4.length && this.f21873 < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f21875;
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
            int[] iArr6 = this.f21875;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f21870 * 2;
                this.f21870 = i9;
                this.f21879 = false;
                this.f21878 = length - 1;
                this.f21876 = Arrays.copyOf(this.f21876, i9);
                this.f21875 = Arrays.copyOf(this.f21875, this.f21870);
                this.f21877 = Arrays.copyOf(this.f21877, this.f21870);
            }
            this.f21875[length] = c15800.f48743;
            this.f21876[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f21877;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f21877[length] = this.f21871;
                this.f21871 = length;
            }
            c15800.f48740++;
            c15800.m37437(c10863);
            this.f21873++;
            if (!this.f21879) {
                this.f21878++;
            }
            int i10 = this.f21878;
            int[] iArr8 = this.f21875;
            if (i10 >= iArr8.length) {
                this.f21879 = true;
                this.f21878 = iArr8.length - 1;
            }
        }
    }

    @Override // l.InterfaceC1690
    /* JADX INFO: renamed from: ֫ */
    public final float mo5691(C10863 c10863, boolean z) {
        float fMo5692 = mo5692(c10863.f32633);
        mo5693(c10863.f32633, z);
        InterfaceC1690 interfaceC1690 = c10863.f32635;
        int iMo5700 = interfaceC1690.mo5700();
        for (int i = 0; i < iMo5700; i++) {
            C15800 c15800Mo5694 = interfaceC1690.mo5694(i);
            mo5698(c15800Mo5694, interfaceC1690.mo5692(c15800Mo5694) * fMo5692, z);
        }
        return fMo5692;
    }

    @Override // l.InterfaceC1690
    /* JADX INFO: renamed from: ֫ */
    public final float mo5693(C15800 c15800, boolean z) {
        int i = this.f21871;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f21873) {
            if (this.f21875[i] == c15800.f48743) {
                if (i == this.f21871) {
                    this.f21871 = this.f21877[i];
                } else {
                    int[] iArr = this.f21877;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c15800.m37440(this.f21872);
                }
                c15800.f48740--;
                this.f21873--;
                this.f21875[i] = -1;
                if (this.f21879) {
                    this.f21878 = i;
                }
                return this.f21876[i];
            }
            i2++;
            i3 = i;
            i = this.f21877[i];
        }
        return 0.0f;
    }

    @Override // l.InterfaceC1690
    public final void clear() {
        int i = this.f21871;
        for (int i2 = 0; i != -1 && i2 < this.f21873; i2++) {
            C15800 c15800 = this.f21874.f50724[this.f21875[i]];
            if (c15800 != null) {
                c15800.m37440(this.f21872);
            }
            i = this.f21877[i];
        }
        this.f21871 = -1;
        this.f21878 = -1;
        this.f21879 = false;
        this.f21873 = 0;
    }

    @Override // l.InterfaceC1690
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo5701(C15800 c15800) {
        int i = this.f21871;
        if (i != -1) {
            for (int i2 = 0; i != -1 && i2 < this.f21873; i2++) {
                if (this.f21875[i] == c15800.f48743) {
                    return true;
                }
                i = this.f21877[i];
            }
        }
        return false;
    }

    @Override // l.InterfaceC1690
    /* JADX INFO: renamed from: ֫ */
    public final void mo5695() {
        int i = this.f21871;
        for (int i2 = 0; i != -1 && i2 < this.f21873; i2++) {
            float[] fArr = this.f21876;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f21877[i];
        }
    }

    @Override // l.InterfaceC1690
    /* JADX INFO: renamed from: ֫ */
    public final void mo5696(float f) {
        int i = this.f21871;
        for (int i2 = 0; i != -1 && i2 < this.f21873; i2++) {
            float[] fArr = this.f21876;
            fArr[i] = fArr[i] / f;
            i = this.f21877[i];
        }
    }

    @Override // l.InterfaceC1690
    /* JADX INFO: renamed from: ۧ */
    public final int mo5700() {
        return this.f21873;
    }

    @Override // l.InterfaceC1690
    /* JADX INFO: renamed from: ֫ */
    public final C15800 mo5694(int i) {
        int i2 = this.f21871;
        for (int i3 = 0; i2 != -1 && i3 < this.f21873; i3++) {
            if (i3 == i) {
                return this.f21874.f50724[this.f21875[i2]];
            }
            i2 = this.f21877[i2];
        }
        return null;
    }

    @Override // l.InterfaceC1690
    /* JADX INFO: renamed from: ۧ */
    public final float mo5699(int i) {
        int i2 = this.f21871;
        for (int i3 = 0; i2 != -1 && i3 < this.f21873; i3++) {
            if (i3 == i) {
                return this.f21876[i2];
            }
            i2 = this.f21877[i2];
        }
        return 0.0f;
    }

    @Override // l.InterfaceC1690
    /* JADX INFO: renamed from: ֫ */
    public final float mo5692(C15800 c15800) {
        int i = this.f21871;
        for (int i2 = 0; i != -1 && i2 < this.f21873; i2++) {
            if (this.f21875[i] == c15800.f48743) {
                return this.f21876[i];
            }
            i = this.f21877[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f21871;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f21873; i2++) {
            StringBuilder sbM15339 = C5368.m15339(C16014.m37867(string, " -> "));
            sbM15339.append(this.f21876[i]);
            sbM15339.append(" : ");
            StringBuilder sbM153310 = C5368.m15339(sbM15339.toString());
            sbM153310.append(this.f21874.f50724[this.f21875[i]]);
            string = sbM153310.toString();
            i = this.f21877[i];
        }
        return string;
    }
}
