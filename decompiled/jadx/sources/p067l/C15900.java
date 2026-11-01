package p067l;

/* JADX INFO: renamed from: l.ܳۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17U9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15900 {
    /* JADX WARN: Code duplicated, block: B:41:0x005d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0061 A[LOOP:1: B:42:0x005e->B:44:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0069  */
    /* JADX WARN: Code duplicated, block: B:48:0x006d A[LOOP:2: B:46:0x006a->B:48:0x006d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0076  */
    /* JADX WARN: Code duplicated, block: B:52:0x007a A[LOOP:3: B:50:0x0077->B:52:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4 A[LOOP:6: B:63:0x00c1->B:65:0x00c4, LOOP_END] */
    /* JADX INFO: renamed from: ֫ */
    public static void m36018(C1703[] c1703Arr) {
        int i;
        int i2;
        int i3;
        int i4;
        for (C1703 c1703 : c1703Arr) {
            char cM42939 = c1703.m42939();
            float[] fArrM42938 = c1703.m42938();
            if (cM42939 == 'A') {
                for (int i5 = 0; i5 < fArrM42938.length; i5 += 7) {
                    int i6 = i5 + 5;
                    fArrM42938[i6] = 24.0f - fArrM42938[i6];
                    int i7 = i5 + 4;
                    fArrM42938[i7] = 1.0f - fArrM42938[i7];
                }
            } else if (cM42939 == 'C') {
                for (int i8 = 0; i8 < fArrM42938.length; i8 += 6) {
                    fArrM42938[i8] = 24.0f - fArrM42938[i8];
                    int i9 = i8 + 2;
                    fArrM42938[i9] = 24.0f - fArrM42938[i9];
                    int i10 = i8 + 4;
                    fArrM42938[i10] = 24.0f - fArrM42938[i10];
                }
            } else if (cM42939 == 'H') {
                fArrM42938[0] = 24.0f - fArrM42938[0];
            } else if (cM42939 == 'Q') {
                for (i = 0; i < fArrM42938.length; i += 4) {
                    fArrM42938[i] = 24.0f - fArrM42938[i];
                    int i11 = i + 2;
                    fArrM42938[i11] = 24.0f - fArrM42938[i11];
                }
            } else if (cM42939 != 'V') {
                if (cM42939 == 'a') {
                    for (int i12 = 0; i12 < fArrM42938.length; i12 += 7) {
                        int i13 = i12 + 5;
                        fArrM42938[i13] = -fArrM42938[i13];
                        int i14 = i12 + 4;
                        fArrM42938[i14] = 1.0f - fArrM42938[i14];
                    }
                } else if (cM42939 == 'c') {
                    for (int i15 = 0; i15 < fArrM42938.length; i15 += 6) {
                        fArrM42938[i15] = -fArrM42938[i15];
                        int i16 = i15 + 2;
                        fArrM42938[i16] = -fArrM42938[i16];
                        int i17 = i15 + 4;
                        fArrM42938[i17] = -fArrM42938[i17];
                    }
                } else if (cM42939 == 'h') {
                    fArrM42938[0] = -fArrM42938[0];
                } else if (cM42939 == 'q') {
                    for (i2 = 0; i2 < fArrM42938.length; i2 += 4) {
                        fArrM42938[i2] = -fArrM42938[i2];
                        int i18 = i2 + 2;
                        fArrM42938[i18] = -fArrM42938[i18];
                    }
                } else if (cM42939 != 'v') {
                    if (cM42939 == 'L' || cM42939 == 'M') {
                        for (i3 = 0; i3 < fArrM42938.length; i3 += 2) {
                            fArrM42938[i3] = 24.0f - fArrM42938[i3];
                        }
                    } else if (cM42939 == 'S') {
                        while (i < fArrM42938.length) {
                            fArrM42938[i] = 24.0f - fArrM42938[i];
                            int i19 = i + 2;
                            fArrM42938[i19] = 24.0f - fArrM42938[i19];
                        }
                    } else if (cM42939 == 'T') {
                        while (i3 < fArrM42938.length) {
                            fArrM42938[i3] = 24.0f - fArrM42938[i3];
                        }
                    } else if (cM42939 == 'l' || cM42939 == 'm') {
                        for (i4 = 0; i4 < fArrM42938.length; i4 += 2) {
                            fArrM42938[i4] = -fArrM42938[i4];
                        }
                    } else if (cM42939 == 's') {
                        while (i2 < fArrM42938.length) {
                            fArrM42938[i2] = -fArrM42938[i2];
                            int i110 = i2 + 2;
                            fArrM42938[i110] = -fArrM42938[i110];
                        }
                    } else if (cM42939 == 't') {
                        while (i4 < fArrM42938.length) {
                            fArrM42938[i4] = -fArrM42938[i4];
                        }
                    }
                }
            }
        }
    }
}
