package p067l;

import bin.p000mt.plus.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ܿۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N33Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C18833 {

    /* JADX INFO: renamed from: ֫ */
    public static final SimpleDateFormat f56241 = new SimpleDateFormat("yyyy-MM-dd");

    /* JADX INFO: renamed from: ۧ */
    public static final SimpleDateFormat f56242 = new SimpleDateFormat("MM-dd");

    /* JADX INFO: renamed from: ֫ */
    public static String m42897(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        if (jCurrentTimeMillis >= 0) {
            long j2 = jCurrentTimeMillis / 1000;
            if (j2 < 60) {
                int i = (int) j2;
                return C7050.m16235().getQuantityString(R.plurals.MT_Protector, i, Integer.valueOf(i));
            }
            long j3 = j2 / 60;
            if (j3 < 60) {
                int i2 = (int) j3;
                return C7050.m16235().getQuantityString(R.plurals.MT_Protector, i2, Integer.valueOf(i2));
            }
            long j4 = j3 / 60;
            if (j4 < 24) {
                int i3 = (int) j4;
                return C7050.m16235().getQuantityString(R.plurals.MT_Protector, i3, Integer.valueOf(i3));
            }
            long j5 = j4 / 24;
            if (j5 < 31) {
                int i4 = (int) j5;
                return C7050.m16235().getQuantityString(R.plurals.MT_Protector, i4, Integer.valueOf(i4));
            }
        }
        if (new Date().getYear() != new Date(j).getYear()) {
            return f56241.format(Long.valueOf(j));
        }
        return f56242.format(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ֫ */
    public static Long m42896(C9596 c9596) {
        Long lM22367 = c9596.m22367();
        if (lM22367 == null && (lM22367 = c9596.m22368()) != null && c9596.m22364("OffsetTimeOriginal") == null) {
            lM22367 = Long.valueOf(lM22367.longValue() - ((long) TimeZone.getDefault().getRawOffset()));
        }
        if (lM22367 == null && (lM22367 = c9596.m22366()) != null && c9596.m22364("OffsetTimeDigitized") == null) {
            lM22367 = Long.valueOf(lM22367.longValue() - ((long) TimeZone.getDefault().getRawOffset()));
        }
        return (lM22367 == null && (lM22367 = c9596.m22365()) != null && c9596.m22364("OffsetTime") == null) ? Long.valueOf(lM22367.longValue() - ((long) TimeZone.getDefault().getRawOffset())) : lM22367;
    }
}
