package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8G0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15624 {

    /* JADX INFO: renamed from: ۧ */
    public static final float[] f44707 = new float[0];

    /* JADX INFO: renamed from: ֫ */
    public static final float[] f44706 = new float[0];

    /* JADX INFO: renamed from: ֫ */
    public static void m35507(float[] fArr, int i, int i2, InterfaceC8960 interfaceC8960, float[] fArr2) {
        int i3 = i2 - i;
        if (i3 >= 16) {
            if (fArr2 == null) {
                fArr2 = Arrays.copyOf(fArr, i2);
            }
            int i4 = (i + i2) >>> 1;
            m35507(fArr2, i, i4, interfaceC8960, fArr);
            m35507(fArr2, i4, i2, interfaceC8960, fArr);
            if (interfaceC8960.mo20697(fArr2[i4 - 1], fArr2[i4]) <= 0) {
                System.arraycopy(fArr2, i, fArr, i, i3);
                return;
            }
            int i5 = i;
            int i6 = i4;
            while (i < i2) {
                if (i6 >= i2 || (i5 < i4 && interfaceC8960.mo20697(fArr2[i5], fArr2[i6]) <= 0)) {
                    fArr[i] = fArr2[i5];
                    i5++;
                } else {
                    fArr[i] = fArr2[i6];
                    i6++;
                }
                i++;
            }
            return;
        }
        int i7 = i;
        while (true) {
            int i8 = i7 + 1;
            if (i8 >= i2) {
                return;
            }
            float f = fArr[i8];
            float f2 = fArr[i7];
            int i9 = i8;
            while (interfaceC8960.mo20697(f, f2) < 0) {
                fArr[i9] = f2;
                if (i == i9 - 1) {
                    i9--;
                    break;
                }
                int i10 = i9 - 1;
                float f3 = fArr[i9 - 2];
                i9 = i10;
                f2 = f3;
            }
            fArr[i9] = f;
            i7 = i8;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35506(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i2 - i;
        if (i3 >= 16) {
            if (fArr2 == null) {
                fArr2 = Arrays.copyOf(fArr, i2);
            }
            int i4 = (i + i2) >>> 1;
            m35506(i, i4, fArr2, fArr);
            m35506(i4, i2, fArr2, fArr);
            if (Float.compare(fArr2[i4 - 1], fArr2[i4]) <= 0) {
                System.arraycopy(fArr2, i, fArr, i, i3);
                return;
            }
            int i5 = i;
            int i6 = i4;
            while (i < i2) {
                if (i6 >= i2 || (i5 < i4 && Float.compare(fArr2[i5], fArr2[i6]) <= 0)) {
                    fArr[i] = fArr2[i5];
                    i5++;
                } else {
                    fArr[i] = fArr2[i6];
                    i6++;
                }
                i++;
            }
            return;
        }
        int i7 = i;
        while (true) {
            int i8 = i7 + 1;
            if (i8 >= i2) {
                return;
            }
            float f = fArr[i8];
            float f2 = fArr[i7];
            int i9 = i8;
            while (Float.compare(f, f2) < 0) {
                fArr[i9] = f2;
                if (i == i9 - 1) {
                    i9--;
                    break;
                }
                int i10 = i9 - 1;
                float f3 = fArr[i9 - 2];
                i9 = i10;
                f2 = f3;
            }
            fArr[i9] = f;
            i7 = i8;
        }
    }
}
