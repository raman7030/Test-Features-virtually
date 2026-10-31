package l;

import bin.mt.plus.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ܿۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N33Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C17324 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f53059 = new SimpleDateFormat("yyyy-MM-dd");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f53060 = new SimpleDateFormat("MM-dd");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m40646(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        if (jCurrentTimeMillis >= 0) {
            long j2 = jCurrentTimeMillis / 1000;
            if (j2 < 60) {
                int i = (int) j2;
                return C4925.m14338().getQuantityString(R.plurals.MT_Protector, i, Integer.valueOf(i));
            }
            long j3 = j2 / 60;
            if (j3 < 60) {
                int i2 = (int) j3;
                return C4925.m14338().getQuantityString(R.plurals.MT_Protector, i2, Integer.valueOf(i2));
            }
            long j4 = j3 / 60;
            if (j4 < 24) {
                int i3 = (int) j4;
                return C4925.m14338().getQuantityString(R.plurals.MT_Protector, i3, Integer.valueOf(i3));
            }
            long j5 = j4 / 24;
            if (j5 < 31) {
                int i4 = (int) j5;
                return C4925.m14338().getQuantityString(R.plurals.MT_Protector, i4, Integer.valueOf(i4));
            }
        }
        if (new Date().getYear() != new Date(j).getYear()) {
            return f53059.format(Long.valueOf(j));
        }
        return f53060.format(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Long m40645(C7605 c7605) {
        Long lM20388 = c7605.m20388();
        if (lM20388 == null && (lM20388 = c7605.m20389()) != null && c7605.m20385("OffsetTimeOriginal") == null) {
            lM20388 = Long.valueOf(lM20388.longValue() - ((long) TimeZone.getDefault().getRawOffset()));
        }
        if (lM20388 == null && (lM20388 = c7605.m20387()) != null && c7605.m20385("OffsetTimeDigitized") == null) {
            lM20388 = Long.valueOf(lM20388.longValue() - ((long) TimeZone.getDefault().getRawOffset()));
        }
        return (lM20388 == null && (lM20388 = c7605.m20386()) != null && c7605.m20385("OffsetTime") == null) ? Long.valueOf(lM20388.longValue() - ((long) TimeZone.getDefault().getRawOffset())) : lM20388;
    }
}
