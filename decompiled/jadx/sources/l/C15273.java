package l;

/* JADX INFO: renamed from: l.ܶܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes4.dex */
public final class C15273 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8219[] f46865;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1163 f46866;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f46867;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f46868;

    public C15273(C21625 c21625, C8219[] c8219Arr, int i) {
        this.f46866 = new C1163(c21625);
        this.f46865 = c8219Arr;
        this.f46868 = i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0037 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36282(int i, int i2) {
        while (i < i2) {
            C1163 c1163 = this.f46866;
            c1163.m3964(i);
            int iM3963 = c1163.m3963();
            i++;
            if (iM3963 != 0 && c1163.m3959() != 0) {
                boolean z = true;
                int i3 = i;
                int i4 = i3;
                int i5 = i4;
                while (true) {
                    if (i3 >= i2) {
                        i3 = i4;
                        break;
                    }
                    c1163.m3964(i3);
                    char cM3959 = c1163.m3959();
                    if (cM3959 != 0) {
                        if (c1163.m3963() > (z ? iM3963 + 1 : iM3963)) {
                            i5 = i3 + 1;
                            i4 = i5;
                        } else {
                            if (cM3959 != 0) {
                                if ((cM3959 != '}' || cM3959 == ']' || cM3959 == ')' || cM3959 == '>') && i5 != i) {
                                    i5 = i3;
                                    break;
                                } else {
                                    break;
                                    break;
                                }
                            }
                            i4 = i3 + 1;
                        }
                        i3++;
                        z = false;
                    } else {
                        if (cM3959 != 0) {
                            if (cM3959 != '}') {
                                i5 = i3;
                                break;
                            } else {
                                i5 = i3;
                                break;
                            }
                        }
                        i4 = i3 + 1;
                        i3++;
                        z = false;
                    }
                }
                int i6 = i;
                while (i6 < i5) {
                    c1163.m3964(i6);
                    C8219 c8219 = this.f46865[c1163.f4202 - this.f46868];
                    int iMin = Math.min(i5, c1163.f4204);
                    int i7 = iMin - c1163.f4203;
                    if (this.f46867) {
                        for (int i8 = c1163.f4206; i8 < i7; i8++) {
                            char[] cArr = c8219.f25323;
                            int[] iArr = c8219.f25327;
                            int i9 = iArr[i8];
                            iArr[i8] = i9 + 1;
                            cArr[i9] = (char) iM3963;
                        }
                    } else {
                        int i10 = c1163.f4206;
                        int[] iArr2 = c8219.f25325;
                        iArr2[i10] = iArr2[i10] + 1;
                        iArr2[i7] = iArr2[i7] - 1;
                    }
                    i6 = iMin;
                }
                m36282(i, i3);
                i = i3;
            }
        }
    }
}
