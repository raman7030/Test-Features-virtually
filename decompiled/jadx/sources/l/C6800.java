package l;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6MJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6800 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m18441(int i, int i2, RectF rectF, float f, int i3, long j) {
        int i4;
        double d;
        double d2;
        double d3;
        double d4;
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        if (i5 <= 0 || i6 <= 0 || !m18442(f) || f <= 0.0f || i3 < 1 || rectF == null || !m18442(rectF.left) || !m18442(rectF.top) || !m18442(rectF.right) || !m18442(rectF.bottom)) {
            throw new IllegalArgumentException("Invalid SVG tile geometry");
        }
        if (rectF.isEmpty() || j3 <= 0) {
            return Collections.EMPTY_LIST;
        }
        double dMax = Math.max(0.0f, rectF.left);
        double dMax2 = Math.max(0.0f, rectF.top);
        double dMin = Math.min(i5, rectF.right);
        double dMin2 = Math.min(i6, rectF.bottom);
        if (dMax >= dMin || dMax2 >= dMin2) {
            return Collections.EMPTY_LIST;
        }
        int iMax = Math.max(-30, Math.min(30, Math.getExponent(f)));
        if (Math.scalb(1.0d, iMax) < f && iMax < 30) {
            iMax++;
        }
        int i7 = iMax;
        int i8 = -30;
        while (i7 >= i8) {
            double dScalb = Math.scalb(1.0f, i7);
            double d5 = ((double) i5) * dScalb;
            double d6 = dMin;
            double d7 = ((double) i6) * dScalb;
            int i9 = 512;
            while (true) {
                i4 = 128;
                if (i9 < 128) {
                    d = d5;
                    d2 = d7;
                    d3 = dMax;
                    d4 = dMax2;
                    j2 = j3;
                    break;
                }
                d4 = dMax2;
                double d8 = i9;
                d3 = dMax;
                d2 = d7;
                double dMin3 = ((long) Math.min(Math.ceil(d5 / d8), Math.ceil(C4248.m12787(rectF.width(), dScalb, 64.0d, d8)) + 1.0d)) * ((long) Math.min(Math.ceil(d7 / d8), Math.ceil(C4248.m12787(rectF.height(), dScalb, 64.0d, d8)) + 1.0d));
                double d9 = i9 + 3;
                d = d5;
                double dMin4 = Math.min(d9, Math.ceil(d2) + 1.0d) * Math.min(d9, Math.ceil(d5) + 1.0d) * 4.0d;
                if (dMin3 <= 64.0d) {
                    double d10 = ((dMin3 + ((double) i3)) - 1.0d) * dMin4;
                    j2 = j;
                    if (d10 <= j2) {
                        i4 = 128;
                        break;
                    }
                } else {
                    j2 = j;
                }
                i9 /= 2;
                j3 = j2;
                d5 = d;
                dMax2 = d4;
                dMax = d3;
                d7 = d2;
            }
            if (i9 >= i4) {
                double d11 = i9;
                long jMax = (long) (Math.max(0.0d, (d3 * dScalb) - 32.0d) / d11);
                long jMax2 = (long) (Math.max(0.0d, (d4 * dScalb) - 32.0d) / d11);
                long jCeil = (long) Math.ceil(Math.min(d, (d6 * dScalb) + 32.0d) / d11);
                long jCeil2 = (long) Math.ceil(Math.min(d2, (dScalb * dMin2) + 32.0d) / d11);
                ArrayList arrayList = new ArrayList();
                for (long j4 = jMax2; j4 < jCeil2; j4++) {
                    long j5 = jMax;
                    while (j5 < jCeil) {
                        arrayList.add(new C23733(j5, j4, i, i2, i7, i9));
                        j5++;
                        jCeil2 = jCeil2;
                        jCeil = jCeil;
                    }
                }
                final double d12 = (d3 + d6) / 2.0d;
                final double d13 = (d4 + dMin2) / 2.0d;
                Collections.sort(arrayList, new Comparator() { // from class: l.ܳܰۜ
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        C23733 c23733 = (C23733) obj;
                        C23733 c23734 = (C23733) obj2;
                        double dCenterX = c23733.f76845.centerX();
                        double d14 = d12;
                        double d15 = dCenterX - d14;
                        double dCenterY = c23733.f76845.centerY();
                        double d16 = d13;
                        double d17 = dCenterY - d16;
                        double d18 = (d17 * d17) + (d15 * d15);
                        double dCenterX2 = ((double) c23734.f76845.centerX()) - d14;
                        double dCenterY2 = ((double) c23734.f76845.centerY()) - d16;
                        return Double.compare(d18, (dCenterY2 * dCenterY2) + (dCenterX2 * dCenterX2));
                    }
                });
                return arrayList;
            }
            i7--;
            i8 = -30;
            i5 = i;
            i6 = i2;
            j3 = j2;
            dMin = d6;
            dMax2 = d4;
            dMax = d3;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18442(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }
}
