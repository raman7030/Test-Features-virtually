package l;

/* JADX INFO: renamed from: l.ܳۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17U9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14238 {
    /* JADX WARN: Code duplicated, block: B:41:0x005d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0061 A[LOOP:1: B:42:0x005e->B:44:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0069  */
    /* JADX WARN: Code duplicated, block: B:48:0x006d A[LOOP:2: B:46:0x006a->B:48:0x006d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0076  */
    /* JADX WARN: Code duplicated, block: B:52:0x007a A[LOOP:3: B:50:0x0077->B:52:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4 A[LOOP:6: B:63:0x00c1->B:65:0x00c4, LOOP_END] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33886(C17356[] c17356Arr) {
        int i;
        int i2;
        int i3;
        int i4;
        for (C17356 c17356 : c17356Arr) {
            char cM40688 = c17356.m40688();
            float[] fArrM40687 = c17356.m40687();
            if (cM40688 == 'A') {
                for (int i5 = 0; i5 < fArrM40687.length; i5 += 7) {
                    int i6 = i5 + 5;
                    fArrM40687[i6] = 24.0f - fArrM40687[i6];
                    int i7 = i5 + 4;
                    fArrM40687[i7] = 1.0f - fArrM40687[i7];
                }
            } else if (cM40688 == 'C') {
                for (int i8 = 0; i8 < fArrM40687.length; i8 += 6) {
                    fArrM40687[i8] = 24.0f - fArrM40687[i8];
                    int i9 = i8 + 2;
                    fArrM40687[i9] = 24.0f - fArrM40687[i9];
                    int i10 = i8 + 4;
                    fArrM40687[i10] = 24.0f - fArrM40687[i10];
                }
            } else if (cM40688 == 'H') {
                fArrM40687[0] = 24.0f - fArrM40687[0];
            } else if (cM40688 == 'Q') {
                for (i = 0; i < fArrM40687.length; i += 4) {
                    fArrM40687[i] = 24.0f - fArrM40687[i];
                    int i11 = i + 2;
                    fArrM40687[i11] = 24.0f - fArrM40687[i11];
                }
            } else if (cM40688 != 'V') {
                if (cM40688 == 'a') {
                    for (int i12 = 0; i12 < fArrM40687.length; i12 += 7) {
                        int i13 = i12 + 5;
                        fArrM40687[i13] = -fArrM40687[i13];
                        int i14 = i12 + 4;
                        fArrM40687[i14] = 1.0f - fArrM40687[i14];
                    }
                } else if (cM40688 == 'c') {
                    for (int i15 = 0; i15 < fArrM40687.length; i15 += 6) {
                        fArrM40687[i15] = -fArrM40687[i15];
                        int i16 = i15 + 2;
                        fArrM40687[i16] = -fArrM40687[i16];
                        int i17 = i15 + 4;
                        fArrM40687[i17] = -fArrM40687[i17];
                    }
                } else if (cM40688 == 'h') {
                    fArrM40687[0] = -fArrM40687[0];
                } else if (cM40688 == 'q') {
                    for (i2 = 0; i2 < fArrM40687.length; i2 += 4) {
                        fArrM40687[i2] = -fArrM40687[i2];
                        int i18 = i2 + 2;
                        fArrM40687[i18] = -fArrM40687[i18];
                    }
                } else if (cM40688 != 'v') {
                    if (cM40688 == 'L' || cM40688 == 'M') {
                        for (i3 = 0; i3 < fArrM40687.length; i3 += 2) {
                            fArrM40687[i3] = 24.0f - fArrM40687[i3];
                        }
                    } else if (cM40688 == 'S') {
                        while (i < fArrM40687.length) {
                            fArrM40687[i] = 24.0f - fArrM40687[i];
                            int i19 = i + 2;
                            fArrM40687[i19] = 24.0f - fArrM40687[i19];
                        }
                    } else if (cM40688 == 'T') {
                        while (i3 < fArrM40687.length) {
                            fArrM40687[i3] = 24.0f - fArrM40687[i3];
                        }
                    } else if (cM40688 == 'l' || cM40688 == 'm') {
                        for (i4 = 0; i4 < fArrM40687.length; i4 += 2) {
                            fArrM40687[i4] = -fArrM40687[i4];
                        }
                    } else if (cM40688 == 's') {
                        while (i2 < fArrM40687.length) {
                            fArrM40687[i2] = -fArrM40687[i2];
                            int i110 = i2 + 2;
                            fArrM40687[i110] = -fArrM40687[i110];
                        }
                    } else if (cM40688 == 't') {
                        while (i4 < fArrM40687.length) {
                            fArrM40687[i4] = -fArrM40687[i4];
                        }
                    }
                }
            }
        }
    }
}
