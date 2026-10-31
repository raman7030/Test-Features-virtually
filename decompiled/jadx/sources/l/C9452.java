package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E1CE */
/* JADX INFO: loaded from: classes4.dex */
public final class C9452 extends C10863 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f28657;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C20741 f28658;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C15800[] f28659;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C15800[] f28660;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24289() {
        this.f28657 = 0;
        this.f32631 = 0.0f;
    }

    public C9452(C16506 c16506) {
        super(c16506);
        this.f28660 = new C15800[128];
        this.f28659 = new C15800[128];
        this.f28657 = 0;
        this.f28658 = new C20741(this);
    }

    @Override // l.C10863
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo24288() {
        return this.f28657 == 0;
    }

    @Override // l.C10863, l.InterfaceC17918
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15800 mo24286(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f28657; i2++) {
            C15800[] c15800Arr = this.f28660;
            C15800 c15800 = c15800Arr[i2];
            if (!zArr[c15800.f48743]) {
                C20741 c20741 = this.f28658;
                c20741.f66770 = c15800;
                int i3 = 8;
                if (i != -1) {
                    C15800 c15801 = c15800Arr[i];
                    while (i3 >= 0) {
                        float f = c15801.f48741[i3];
                        float f2 = c20741.f66770.f48741[i3];
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
                        float f3 = c20741.f66770.f48741[i3];
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
        return this.f28660[i];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m24290(C15800 c15800) {
        this.f28658.f66770 = c15800;
        float[] fArr = c15800.f48741;
        Arrays.fill(fArr, 0.0f);
        fArr[c15800.f48737] = 1.0f;
        m24285(c15800);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private final void m24285(C15800 c15800) {
        int i;
        int i2 = this.f28657 + 1;
        C15800[] c15800Arr = this.f28660;
        if (i2 > c15800Arr.length) {
            C15800[] c15800Arr2 = (C15800[]) Arrays.copyOf(c15800Arr, c15800Arr.length * 2);
            this.f28660 = c15800Arr2;
            this.f28659 = (C15800[]) Arrays.copyOf(c15800Arr2, c15800Arr2.length * 2);
        }
        C15800[] c15800Arr3 = this.f28660;
        int i3 = this.f28657;
        c15800Arr3[i3] = c15800;
        int i4 = i3 + 1;
        this.f28657 = i4;
        if (i4 > 1 && c15800Arr3[i3].f48743 > c15800.f48743) {
            int i5 = 0;
            while (true) {
                i = this.f28657;
                if (i5 >= i) {
                    break;
                }
                this.f28659[i5] = this.f28660[i5];
                i5++;
            }
            Arrays.sort(this.f28659, 0, i, new C6629());
            for (int i6 = 0; i6 < this.f28657; i6++) {
                this.f28660[i6] = this.f28659[i6];
            }
        }
        c15800.f48742 = true;
        c15800.m37437(this);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private final void m24284(C15800 c15800) {
        int i = 0;
        while (i < this.f28657) {
            if (this.f28660[i] == c15800) {
                while (true) {
                    int i2 = this.f28657;
                    if (i < i2 - 1) {
                        C15800[] c15800Arr = this.f28660;
                        int i3 = i + 1;
                        c15800Arr[i] = c15800Arr[i3];
                        i = i3;
                    } else {
                        this.f28657 = i2 - 1;
                        c15800.f48742 = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // l.C10863
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo24287(C17212 c17212, C10863 c10863, boolean z) {
        C15800 c15800 = c10863.f32633;
        if (c15800 == null) {
            return;
        }
        float[] fArr = c15800.f48741;
        InterfaceC1690 interfaceC1690 = c10863.f32635;
        int iMo5700 = interfaceC1690.mo5700();
        for (int i = 0; i < iMo5700; i++) {
            C15800 c15800Mo5694 = interfaceC1690.mo5694(i);
            float fMo5699 = interfaceC1690.mo5699(i);
            C20741 c20741 = this.f28658;
            c20741.f66770 = c15800Mo5694;
            if (c15800Mo5694.f48742) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = c20741.f66770.f48741;
                    float f = (fArr[i2] * fMo5699) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        c20741.f66770.f48741[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    c20741.f66769.m24284(c20741.f66770);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fMo5699;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        c20741.f66770.f48741[i3] = f3;
                    } else {
                        c20741.f66770.f48741[i3] = 0.0f;
                    }
                }
                m24285(c15800Mo5694);
            }
            this.f32631 = (c10863.f32631 * fMo5699) + this.f32631;
        }
        m24284(c15800);
    }

    @Override // l.C10863
    public final String toString() {
        String str = " goal -> (" + this.f32631 + ") : ";
        for (int i = 0; i < this.f28657; i++) {
            C15800 c15800 = this.f28660[i];
            C20741 c20741 = this.f28658;
            c20741.f66770 = c15800;
            str = str + c20741 + " ";
        }
        return str;
    }
}
