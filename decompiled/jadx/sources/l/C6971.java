package l;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۜ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8PP */
/* JADX INFO: loaded from: classes2.dex */
public final class C6971 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f21488;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Integer f21489;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f21490;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f21491;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f21492;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f21493;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f21494;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float f21495;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f21496;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Integer f21497;

    public C6971(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f21492 = str;
        this.f21488 = i;
        this.f21489 = num;
        this.f21497 = num2;
        this.f21495 = f;
        this.f21491 = z;
        this.f21494 = z2;
        this.f21490 = z3;
        this.f21496 = z4;
        this.f21493 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6971 m18845(String str, C14731 c14731) {
        int i;
        C22632.m50631(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i2 = c14731.f44988;
        if (length != i2) {
            int length2 = strArrSplit.length;
            String str2 = C3603.f11424;
            Locale locale = Locale.US;
            StringBuilder sbM46682 = C20361.m46682("Skipping malformed 'Style:' line (expected ", i2, " values, found ", "): '", length2);
            sbM46682.append(str);
            sbM46682.append("'");
            C19956.m46037(sbM46682.toString());
            return null;
        }
        try {
            String strTrim = strArrSplit[c14731.f44993].trim();
            int i3 = c14731.f44983;
            int i4 = -1;
            int iM18846 = i3 != -1 ? m18846(strArrSplit[i3].trim()) : -1;
            int i5 = c14731.f44992;
            Integer numM18848 = i5 != -1 ? m18848(strArrSplit[i5].trim()) : null;
            int i6 = c14731.f44984;
            Integer numM18849 = i6 != -1 ? m18848(strArrSplit[i6].trim()) : null;
            int i7 = c14731.f44991;
            float f = -3.4028235E38f;
            if (i7 != -1) {
                String strTrim2 = strArrSplit[i7].trim();
                try {
                    f = Float.parseFloat(strTrim2);
                } catch (NumberFormatException e) {
                    C19956.m46036("Failed to parse font size: '" + strTrim2 + "'", e);
                }
            }
            int i8 = c14731.f44987;
            boolean z = false;
            if (i8 != -1 && m18847(strArrSplit[i8].trim())) {
                z = true;
            }
            int i9 = c14731.f44990;
            boolean z2 = i9 != -1 && m18847(strArrSplit[i9].trim());
            int i10 = c14731.f44985;
            boolean z3 = i10 != -1 && m18847(strArrSplit[i10].trim());
            int i11 = c14731.f44986;
            boolean z4 = i11 != -1 && m18847(strArrSplit[i11].trim());
            int i12 = c14731.f44989;
            if (i12 != -1) {
                String strTrim3 = strArrSplit[i12].trim();
                try {
                    int i13 = Integer.parseInt(strTrim3.trim());
                    if (i13 == 1 || i13 == 3) {
                        i4 = i13;
                    } else {
                        C19956.m46037("Ignoring unknown BorderStyle: " + strTrim3);
                    }
                } catch (NumberFormatException unused) {
                }
                i = i4;
            } else {
                i = -1;
            }
            return new C6971(strTrim, iM18846, numM18848, numM18849, f, z, z2, z3, z4, i);
        } catch (RuntimeException e2) {
            C19956.m46036("Skipping malformed 'Style:' line: '" + str + "'", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m18846(String str) {
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
                    C4860.m14173("Ignoring unknown alignment: ", str);
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Integer m18848(String str) {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            C22632.m50631(j <= 4294967295L);
            return Integer.valueOf(Color.argb(C13426.m32446(((j >> 24) & 255) ^ 255), C13426.m32446(j & 255), C13426.m32446((j >> 8) & 255), C13426.m32446((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            C19956.m46036("Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m18847(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            C19956.m46036("Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
