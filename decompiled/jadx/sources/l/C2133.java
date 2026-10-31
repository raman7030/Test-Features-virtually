package l;

import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֫᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26K9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2133 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m7054(C8917 c8917, RectF rectF, int i, int i2, int i3) {
        float fMax = Math.max(0.0f, rectF.left);
        float fMax2 = Math.max(0.0f, rectF.top);
        float fMin = Math.min(i, rectF.right);
        float fMin2 = Math.min(i2, rectF.bottom);
        return c8917.f27096 <= i3 && fMax < fMin && fMax2 < fMin2 && ((float) c8917.f27099) <= fMax && ((float) c8917.f27100) <= fMax2 && ((float) c8917.f27101) >= fMin && ((float) c8917.f27097) >= fMin2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m7051(int i, int i2, RectF rectF, float f, int i3, long j, int i4, int i5) {
        double d;
        double d2;
        int i6 = i;
        RectF rectF2 = rectF;
        if (i6 <= 0 || i2 <= 0 || rectF.isEmpty() || f <= 0.0f || !m7052(f) || !m7052(rectF2.left) || !m7052(rectF2.top) || !m7052(rectF2.right) || !m7052(rectF2.bottom) || j <= 0 || i4 <= 0 || i5 <= 0) {
            return Collections.EMPTY_LIST;
        }
        double dMax = Math.max(0.0f, rectF2.left);
        double dMax2 = Math.max(0.0f, rectF2.top);
        double dMin = Math.min(i6, rectF2.right);
        double dMin2 = Math.min(i2, rectF2.bottom);
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
        while (i8 < i3) {
            double d3 = i8;
            double d4 = (((double) rectF2.right) - ((double) rectF2.left)) / d3;
            double d5 = dMin;
            double d6 = (((double) rectF2.bottom) - ((double) rectF2.top)) / d3;
            int i9 = i8;
            double d7 = dMax2;
            double d8 = dMax;
            if (m7053(i, i2, i8, d4, d6, 32.0d, 32.0d, j, i4, i5)) {
                double d9 = 32.0d;
                double dMax3 = Math.max(0.0d, Math.min(256.0d, d4 / 4.0d) - 32.0d);
                double dMax4 = Math.max(0.0d, Math.min(256.0d, d6 / 4.0d) - 32.0d);
                int i10 = 4;
                while (i10 > 0) {
                    double d10 = i10;
                    double d11 = ((dMax3 * d10) / 4.0d) + 32.0d;
                    d2 = ((d10 * dMax4) / 4.0d) + 32.0d;
                    int i11 = i10;
                    if (m7053(i, i2, i9, d4, d6, d11, d2, j, i4, i5)) {
                        d9 = d11;
                        long j2 = ((long) i9) * 64;
                        double d12 = d9 * d3;
                        double d13 = j2;
                        double d14 = d2 * d3;
                        return Collections.singletonList(new C8917(i, i2, i9, ((long) (Math.max(0.0d, d8 - d12) / d13)) * j2, ((long) (Math.max(0.0d, d7 - d14) / d13)) * j2, ((long) Math.ceil(Math.min(i6, d5 + d12) / d13)) * j2, ((long) Math.ceil(Math.min(i2, d + d14) / d13)) * j2));
                    }
                    i10 = i11 - 1;
                }
                d2 = 32.0d;
                long j3 = ((long) i9) * 64;
                double d15 = d9 * d3;
                double d16 = j3;
                double d17 = d2 * d3;
                return Collections.singletonList(new C8917(i, i2, i9, ((long) (Math.max(0.0d, d8 - d15) / d16)) * j3, ((long) (Math.max(0.0d, d7 - d17) / d16)) * j3, ((long) Math.ceil(Math.min(i6, d5 + d15) / d16)) * j3, ((long) Math.ceil(Math.min(i2, d + d17) / d16)) * j3));
            }
            if (i9 >= 1073741824) {
                break;
            }
            i8 = i9 << 1;
            i6 = i;
            rectF2 = rectF;
            dMin = d5;
            dMax = d8;
            dMax2 = d7;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m7053(int i, int i2, int i3, double d, double d2, double d3, double d4, long j, int i4, int i5) {
        double d5 = i3;
        long jMin = (long) Math.min(Math.ceil(((double) i) / d5), ((Math.ceil(C4248.m12787(d3, 2.0d, d, 64.0d)) + 1.0d) * 64.0d) + 2.0d);
        long jMin2 = (long) Math.min(Math.ceil(((double) i2) / d5), ((Math.ceil(C4248.m12787(d4, 2.0d, d2, 64.0d)) + 1.0d) * 64.0d) + 2.0d);
        return jMin <= ((long) i4) && jMin2 <= ((long) i5) && jMin * jMin2 <= j / 4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m7052(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }
}
