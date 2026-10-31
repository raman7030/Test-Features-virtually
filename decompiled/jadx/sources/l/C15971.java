package l;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.ܺܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76MD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15971 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m37740(int i, int i2, RectF rectF, float f, int i3, long j) {
        double d;
        int i4;
        int i5;
        int i6 = i3;
        if (i <= 0 || i2 <= 0 || rectF == null || !m37741(f) || f <= 0.0f || i6 <= 0 || ((i6 - 1) & i6) != 0 || !m37741(rectF.left) || !m37741(rectF.top) || !m37741(rectF.right) || !m37741(rectF.bottom)) {
            throw new IllegalArgumentException("Invalid tile planning geometry");
        }
        if (j <= 0 || rectF.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        double dMax = Math.max(0.0f, rectF.left);
        double dMax2 = Math.max(0.0f, rectF.top);
        double dMin = Math.min(i, rectF.right);
        double dMin2 = Math.min(i2, rectF.bottom);
        if (dMax >= dMin || dMax2 >= dMin2) {
            return Collections.EMPTY_LIST;
        }
        int i7 = 1;
        while (true) {
            if (i7 >= 1073741824) {
                d = dMin2;
                break;
            }
            d = dMin2;
            if (((double) i7) * 2.0d * ((double) f) > 1.0d) {
                break;
            }
            i7 <<= 1;
            dMin2 = d;
        }
        int i8 = i7;
        while (i8 < i6) {
            int i9 = i8;
            double d2 = dMin;
            if (m37742(i, i2, rectF, i8, 512, 64, j)) {
                i4 = 512;
                i5 = 64;
            } else {
                i4 = MLKEMEngine.KyberPolyBytes;
                i5 = 32;
            }
            int i10 = i4;
            int i11 = i5;
            if (m37742(i, i2, rectF, i9, i4, i5, j)) {
                int i12 = i9;
                long j2 = ((long) i12) * ((long) i10);
                double d3 = ((double) i11) * ((double) i12);
                double d4 = j2;
                long jMax = (long) (Math.max(0.0d, dMax - d3) / d4);
                long jMax2 = (long) (Math.max(0.0d, dMax2 - d3) / d4);
                long jCeil = (long) Math.ceil(Math.min(i, d2 + d3) / d4);
                long jCeil2 = (long) Math.ceil(Math.min(i2, d + d3) / d4);
                ArrayList arrayList = new ArrayList((int) ((jCeil - jMax) * (jCeil2 - jMax2)));
                long j3 = jMax2;
                while (j3 < jCeil2) {
                    long j4 = jMax;
                    while (j4 < jCeil) {
                        long j5 = j4 * j2;
                        long j6 = j3 * j2;
                        ArrayList arrayList2 = arrayList;
                        arrayList2.add(new C8917(i, i2, i12, j5, j6, j5 + j2, j6 + j2));
                        j4++;
                        arrayList = arrayList2;
                        i12 = i12;
                        jCeil2 = jCeil2;
                        jMax = jMax;
                        j2 = j2;
                    }
                    j3++;
                    jCeil2 = jCeil2;
                }
                ArrayList arrayList3 = arrayList;
                final double d5 = (dMax + d2) * 0.5d;
                final double d6 = (dMax2 + d) * 0.5d;
                Collections.sort(arrayList3, new Comparator() { // from class: l.ۢܰۜ
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        double d7 = d5;
                        double d8 = d6;
                        return Double.compare(C15971.m37738((C8917) obj, d7, d8), C15971.m37738((C8917) obj2, d7, d8));
                    }
                });
                return arrayList3;
            }
            if (i9 >= 1073741824) {
                break;
            }
            i8 = i9 << 1;
            i6 = i3;
            dMin = d2;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37741(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static double m37738(C8917 c8917, double d, double d2) {
        double d3 = ((((double) c8917.f27099) + ((double) c8917.f27101)) * 0.5d) - d;
        double d4 = ((((double) c8917.f27100) + ((double) c8917.f27097)) * 0.5d) - d2;
        return (d4 * d4) + (d3 * d3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37742(int i, int i2, RectF rectF, int i3, int i4, int i5, long j) {
        long j2 = i3;
        long j3 = ((long) i4) * j2;
        long j4 = i;
        double d = ((double) i5) * 2.0d * ((double) i3);
        double d2 = j3;
        long j5 = i2;
        long jMin = ((long) Math.min(((j4 + j3) - 1) / j3, Math.ceil(((((double) rectF.right) - ((double) rectF.left)) + d) / d2) + 1.0d)) * ((long) Math.min(((j5 + j3) - 1) / j3, Math.ceil(((((double) rectF.bottom) - ((double) rectF.top)) + d) / d2) + 1.0d));
        if (jMin > 32) {
            return false;
        }
        long j6 = i4 + 2;
        return ((jMin * Math.min(j6, ((j4 + j2) - 1) / j2)) * Math.min(j6, ((j5 + j2) - 1) / j2)) * 4 <= j;
    }
}
