package p067l;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۜ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8PP */
/* JADX INFO: loaded from: classes2.dex */
public final class C8994 {

    /* JADX INFO: renamed from: ֫ */
    public final int f24368;

    /* JADX INFO: renamed from: ۜ */
    public final Integer f24369;

    /* JADX INFO: renamed from: ۢ */
    public final boolean f24370;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f24371;

    /* JADX INFO: renamed from: ܳ */
    public final String f24372;

    /* JADX INFO: renamed from: ܽ */
    public final int f24373;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f24374;

    /* JADX INFO: renamed from: ᩳ */
    public final float f24375;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean f24376;

    /* JADX INFO: renamed from: ᩻ */
    public final Integer f24377;

    public C8994(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f24372 = str;
        this.f24368 = i;
        this.f24369 = num;
        this.f24377 = num2;
        this.f24375 = f;
        this.f24371 = z;
        this.f24374 = z2;
        this.f24370 = z3;
        this.f24376 = z4;
        this.f24373 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8994 m20799(String str, C16369 c16369) {
        int i;
        C23877.m52957(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i2 = c16369.f48101;
        if (length != i2) {
            int length2 = strArrSplit.length;
            String str2 = C5792.f14228;
            Locale locale = Locale.US;
            StringBuilder sbM49005 = C21720.m49005("Skipping malformed 'Style:' line (expected ", i2, " values, found ", "): '", length2);
            sbM49005.append(str);
            sbM49005.append("'");
            C21334.m48351(sbM49005.toString());
            return null;
        }
        try {
            String strTrim = strArrSplit[c16369.f48106].trim();
            int i3 = c16369.f48096;
            int i4 = -1;
            int iM20800 = i3 != -1 ? m20800(strArrSplit[i3].trim()) : -1;
            int i5 = c16369.f48105;
            Integer numM20802 = i5 != -1 ? m20802(strArrSplit[i5].trim()) : null;
            int i6 = c16369.f48097;
            Integer numM20803 = i6 != -1 ? m20802(strArrSplit[i6].trim()) : null;
            int i7 = c16369.f48104;
            float f = -3.4028235E38f;
            if (i7 != -1) {
                String strTrim2 = strArrSplit[i7].trim();
                try {
                    f = Float.parseFloat(strTrim2);
                } catch (NumberFormatException e) {
                    C21334.m48350("Failed to parse font size: '" + strTrim2 + "'", e);
                }
            }
            int i8 = c16369.f48100;
            boolean z = false;
            if (i8 != -1 && m20801(strArrSplit[i8].trim())) {
                z = true;
            }
            int i9 = c16369.f48103;
            boolean z2 = i9 != -1 && m20801(strArrSplit[i9].trim());
            int i10 = c16369.f48098;
            boolean z3 = i10 != -1 && m20801(strArrSplit[i10].trim());
            int i11 = c16369.f48099;
            boolean z4 = i11 != -1 && m20801(strArrSplit[i11].trim());
            int i12 = c16369.f48102;
            if (i12 != -1) {
                String strTrim3 = strArrSplit[i12].trim();
                try {
                    int i13 = Integer.parseInt(strTrim3.trim());
                    if (i13 == 1 || i13 == 3) {
                        i4 = i13;
                    } else {
                        C21334.m48351("Ignoring unknown BorderStyle: " + strTrim3);
                    }
                } catch (NumberFormatException unused) {
                }
                i = i4;
            } else {
                i = -1;
            }
            return new C8994(strTrim, iM20800, numM20802, numM20803, f, z, z2, z3, z4, i);
        } catch (RuntimeException e2) {
            C21334.m48350("Skipping malformed 'Style:' line: '" + str + "'", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m20800(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i;
                default:
                    C6988.m16054("Ignoring unknown alignment: ", str);
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static Integer m20802(String str) {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            C23877.m52957(j <= 4294967295L);
            return Integer.valueOf(Color.argb(C15129.m34548(((j >> 24) & 255) ^ 255), C15129.m34548(j & 255), C15129.m34548((j >> 8) & 255), C15129.m34548((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            C21334.m48350("Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m20801(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            C21334.m48350("Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
