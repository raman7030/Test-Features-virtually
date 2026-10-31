package l;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBQC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7466 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m20002(int i) {
        return ((Color.blue(i) * 114) + ((Color.green(i) * 587) + (Color.red(i) * 299))) / 1000;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m20006(int i, int i2) {
        return m20001(i, i2) < 10.0d;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static double m20001(int i, int i2) {
        double[] dArr = new double[3];
        C7191.m19270(Color.red(i), Color.green(i), Color.blue(i), dArr);
        double[] dArr2 = new double[3];
        C7191.m19270(Color.red(i2), Color.green(i2), Color.blue(i2), dArr2);
        return Math.sqrt(Math.pow(dArr[2] - dArr2[2], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[0] - dArr2[0], 2.0d));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m20003(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        C15859 c15859 = new C15859((width * height) / 4);
        int i = width - 1;
        int i2 = height - 1;
        C12405 c12405 = new C12405(bitmap);
        for (int i3 = 0; i3 < width; i3++) {
            if (c12405.m30571(i3, 0)) {
                c15859.add(bitmap.getPixel(i3, 0));
            }
            if (c12405.m30571(i3, i2)) {
                c15859.add(bitmap.getPixel(i3, i2));
            }
        }
        for (int i4 = 0; i4 < height; i4++) {
            if (c12405.m30571(0, i4)) {
                c15859.add(bitmap.getPixel(0, i4));
            }
            if (c12405.m30571(i, i4)) {
                c15859.add(bitmap.getPixel(i, i4));
            }
        }
        for (int i5 = 1; i5 < i; i5++) {
            for (int i6 = 1; i6 < i2; i6++) {
                if (c12405.m30571(i5, i6)) {
                    int i7 = i5 - 1;
                    int i8 = i6 - 1;
                    if (c12405.m30571(i7, i8) && c12405.m30571(i5, i8)) {
                        int i9 = i5 + 1;
                        if (c12405.m30571(i9, i8) && c12405.m30571(i7, i6) && c12405.m30571(i9, i6)) {
                            int i10 = i6 + 1;
                            if (!c12405.m30571(i7, i10) || !c12405.m30571(i5, i10) || !c12405.m30571(i9, i10)) {
                                c15859.add(bitmap.getPixel(i5, i6));
                            }
                        } else {
                            c15859.add(bitmap.getPixel(i5, i6));
                        }
                    } else {
                        c15859.add(bitmap.getPixel(i5, i6));
                    }
                }
            }
        }
        if (!c15859.isEmpty()) {
            ArrayList arrayList = new C13815(c15859.mo3586()).f41216;
            if (!arrayList.isEmpty()) {
                return ((C5934) arrayList.get(0)).m16662();
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m20005(int i, int i2) {
        if (((i >>> 24) & 255) < 80) {
            return i2;
        }
        return m20002(i) > 130 ? -16777216 : -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20004(int i, float[] fArr) {
        float f;
        float f2;
        float f3;
        int i2 = (i >> 16) & 255;
        int i3 = (i >> 8) & 255;
        int i4 = i & 255;
        int i5 = i3 > i2 ? i3 : i2;
        if (i4 > i5) {
            i5 = i4;
        }
        int i6 = i3 < i2 ? i3 : i2;
        if (i4 < i6) {
            i6 = i4;
        }
        int i7 = i5 - i6;
        float f4 = i5;
        fArr[2] = 0.003921569f * f4;
        if (i5 != 0) {
            float f5 = i7;
            fArr[1] = f5 / f4;
            if (i7 == 0) {
                fArr[0] = 0.0f;
                return;
            }
            if (i2 == i5) {
                f3 = (i3 - i4) / f5;
            } else {
                if (i3 == i5) {
                    f = (i4 - i2) / f5;
                    f2 = 2.0f;
                } else {
                    f = (i2 - i3) / f5;
                    f2 = 4.0f;
                }
                f3 = f + f2;
            }
            float f6 = f3 * 60.0f;
            if (f6 < 0.0f) {
                f6 += 360.0f;
            }
            fArr[0] = f6;
            return;
        }
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
    }
}
