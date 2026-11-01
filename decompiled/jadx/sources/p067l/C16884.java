package p067l;

/* JADX INFO: renamed from: l.ܶܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16884 {

    /* JADX INFO: renamed from: ֫ */
    public final C10180[] f49989;

    /* JADX INFO: renamed from: ۧ */
    public final C3474 f49990;

    /* JADX INFO: renamed from: ܽ */
    public boolean f49991;

    /* JADX INFO: renamed from: ᩳ */
    public final int f49992;

    public C16884(C22921 c22921, C10180[] c10180Arr, int i) {
        this.f49990 = new C3474(c22921);
        this.f49989 = c10180Arr;
        this.f49992 = i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0037 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final void m38443(int i, int i2) {
        while (i < i2) {
            C3474 c3474 = this.f49990;
            c3474.m6205(i);
            int iM6204 = c3474.m6204();
            i++;
            if (iM6204 != 0 && c3474.m6200() != 0) {
                boolean z = true;
                int i3 = i;
                int i4 = i3;
                int i5 = i4;
                while (true) {
                    if (i3 >= i2) {
                        i3 = i4;
                        break;
                    }
                    c3474.m6205(i3);
                    char cM6200 = c3474.m6200();
                    if (cM6200 != 0) {
                        if (c3474.m6204() > (z ? iM6204 + 1 : iM6204)) {
                            i5 = i3 + 1;
                            i4 = i5;
                        } else {
                            if (cM6200 != 0) {
                                if ((cM6200 != '}' || cM6200 == ']' || cM6200 == ')' || cM6200 == '>') && i5 != i) {
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
                        if (cM6200 != 0) {
                            if (cM6200 != '}') {
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
                    c3474.m6205(i6);
                    C10180 c10180 = this.f49989[c3474.f6970 - this.f49992];
                    int iMin = Math.min(i5, c3474.f6972);
                    int i7 = iMin - c3474.f6971;
                    if (this.f49991) {
                        for (int i8 = c3474.f6974; i8 < i7; i8++) {
                            char[] cArr = c10180.f28233;
                            int[] iArr = c10180.f28237;
                            int i9 = iArr[i8];
                            iArr[i8] = i9 + 1;
                            cArr[i9] = (char) iM6204;
                        }
                    } else {
                        int i10 = c3474.f6974;
                        int[] iArr2 = c10180.f28235;
                        iArr2[i10] = iArr2[i10] + 1;
                        iArr2[i7] = iArr2[i7] - 1;
                    }
                    i6 = iMin;
                }
                m38443(i, i3);
                i = i3;
            }
        }
    }
}
