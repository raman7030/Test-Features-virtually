package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: renamed from: l.ۘܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 14GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3988 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f12638 = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Pattern f12639 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Pattern f12640 = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final Pattern f12641 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f12642;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f12643;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f12644;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f12645;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f12646;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f12647;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f12648;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f12649;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f12650;

    public C3988(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f12647 = str;
        this.f12649 = str2;
        this.f12644 = j;
        this.f12642 = str3;
        this.f12645 = str4;
        this.f12643 = z;
        this.f12648 = z2;
        this.f12646 = z3;
        this.f12650 = z4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m12035() {
        return this.f12647;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m12036() {
        return this.f12649;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0084  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m12033(int i, String str) {
        int iM12032 = m12032(str, 0, i, false);
        Pattern pattern = f12641;
        Matcher matcher = pattern.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iIndexOf = -1;
        int i5 = -1;
        int i6 = -1;
        while (iM12032 < i) {
            int iM12033 = m12032(str, iM12032 + 1, i, true);
            matcher.region(iM12032, iM12033);
            if (i3 == -1 && matcher.usePattern(pattern).matches()) {
                int i7 = Integer.parseInt(matcher.group(1));
                int i8 = Integer.parseInt(matcher.group(2));
                i6 = Integer.parseInt(matcher.group(3));
                i5 = i8;
                i3 = i7;
            } else if (i4 == -1 && matcher.usePattern(f12640).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            } else if (iIndexOf == -1) {
                Pattern pattern2 = f12639;
                if (matcher.usePattern(pattern2).matches()) {
                    iIndexOf = pattern2.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                } else if (i2 != -1 && matcher.usePattern(f12638).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            } else if (i2 != -1) {
            }
            iM12032 = m12032(str, iM12033 + 1, i, false);
        }
        if (i2 >= 70 && i2 <= 99) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 <= 69) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            throw new IllegalArgumentException();
        }
        if (iIndexOf == -1) {
            throw new IllegalArgumentException();
        }
        if (i4 < 1 || i4 > 31) {
            throw new IllegalArgumentException();
        }
        if (i3 < 0 || i3 > 23) {
            throw new IllegalArgumentException();
        }
        if (i5 < 0 || i5 > 59) {
            throw new IllegalArgumentException();
        }
        if (i6 < 0 || i6 > 59) {
            throw new IllegalArgumentException();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(C20032.f64892);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iIndexOf - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m12032(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002d  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m12034(C11749 c11749, C10338 c10338) {
        List list;
        long j;
        String strSubstring;
        C3988 c3988;
        String strSubstring2;
        List listM26141 = c10338.m26141("Set-Cookie");
        int size = listM26141.size();
        int i = 0;
        int i2 = 0;
        ArrayList arrayList = null;
        while (i2 < size) {
            String str = (String) listM26141.get(i2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            int length = str.length();
            int iM46168 = C20032.m46168(str, i, length, ';');
            int iM46169 = C20032.m46168(str, i, iM46168, a.h);
            if (iM46169 != iM46168) {
                int iM46186 = C20032.m46186(i, iM46169, str);
                String strSubstring3 = str.substring(iM46186, C20032.m46189(iM46186, iM46169, str));
                if (!strSubstring3.isEmpty()) {
                    int length2 = strSubstring3.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            i3 = -1;
                            break;
                        }
                        char cCharAt = strSubstring3.charAt(i3);
                        if (cCharAt <= 31 || cCharAt >= 127) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 == -1) {
                        int iM46187 = C20032.m46186(iM46169 + 1, iM46168, str);
                        String strSubstring4 = str.substring(iM46187, C20032.m46189(iM46187, iM46168, str));
                        int length3 = strSubstring4.length();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length3) {
                                i4 = -1;
                                break;
                            }
                            char cCharAt2 = strSubstring4.charAt(i4);
                            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                                break;
                            }
                            i4++;
                        }
                        if (i4 == -1) {
                            int i5 = iM46168 + 1;
                            String str2 = null;
                            long j2 = -1;
                            long jM12033 = 253402300799999L;
                            boolean z = false;
                            boolean z2 = false;
                            boolean z3 = true;
                            boolean z4 = false;
                            String str3 = null;
                            int i6 = i5;
                            while (true) {
                                long j3 = C13132.FOREVER_NS;
                                if (i6 >= length) {
                                    list = listM26141;
                                    if (j2 == Long.MIN_VALUE) {
                                        j = Long.MIN_VALUE;
                                    } else if (j2 != -1) {
                                        if (j2 <= 9223372036854775L) {
                                            j3 = j2 * 1000;
                                        }
                                        long j4 = jCurrentTimeMillis + j3;
                                        j = (j4 < jCurrentTimeMillis || j4 > 253402300799999L) ? 253402300799999L : j4;
                                    } else {
                                        j = jM12033;
                                    }
                                    String str4 = c11749.f35068;
                                    if (str3 != null) {
                                        if (!str4.equals(str3) && (!str4.endsWith(str3) || str4.charAt((str4.length() - str3.length()) - 1) != '.' || C20032.m46187(str4))) {
                                            break;
                                        }
                                    } else {
                                        str3 = str4;
                                    }
                                    if (str4.length() == str3.length() || PublicSuffixDatabase.get().getEffectiveTldPlusOne(str3) != null) {
                                        if (str2 == null || !str2.startsWith("/")) {
                                            String strM28772 = c11749.m28772();
                                            int iLastIndexOf = strM28772.lastIndexOf(47);
                                            strSubstring = iLastIndexOf != 0 ? strM28772.substring(0, iLastIndexOf) : "/";
                                        } else {
                                            strSubstring = str2;
                                        }
                                        c3988 = new C3988(strSubstring3, strSubstring4, j, str3, strSubstring, z, z2, z3, z4);
                                        break;
                                    }
                                } else {
                                    int iM461610 = C20032.m46168(str, i6, length, ';');
                                    int iM461611 = C20032.m46168(str, i6, iM461610, a.h);
                                    int iM46188 = C20032.m46186(i6, iM461611, str);
                                    List list2 = listM26141;
                                    String strSubstring5 = str.substring(iM46188, C20032.m46189(iM46188, iM461611, str));
                                    if (iM461611 < iM461610) {
                                        int iM46189 = C20032.m46186(iM461611 + 1, iM461610, str);
                                        strSubstring2 = str.substring(iM46189, C20032.m46189(iM46189, iM461610, str));
                                    } else {
                                        strSubstring2 = "";
                                    }
                                    if (strSubstring5.equalsIgnoreCase("expires")) {
                                        try {
                                            jM12033 = m12033(strSubstring2.length(), strSubstring2);
                                            z4 = true;
                                        } catch (NumberFormatException | IllegalArgumentException unused) {
                                        }
                                    } else if (strSubstring5.equalsIgnoreCase("max-age")) {
                                        try {
                                            j2 = Long.parseLong(strSubstring2);
                                            if (j2 <= 0) {
                                                j2 = Long.MIN_VALUE;
                                            }
                                        } catch (NumberFormatException e) {
                                            if (!strSubstring2.matches("-?\\d+")) {
                                                throw e;
                                            }
                                            if (!strSubstring2.startsWith("-")) {
                                                j2 = Long.MAX_VALUE;
                                            }
                                            z4 = true;
                                        }
                                        z4 = true;
                                    } else if (strSubstring5.equalsIgnoreCase("domain")) {
                                        if (strSubstring2.endsWith(".")) {
                                            throw new IllegalArgumentException();
                                        }
                                        if (strSubstring2.startsWith(".")) {
                                            strSubstring2 = strSubstring2.substring(1);
                                        }
                                        String strM46171 = C20032.m46171(strSubstring2);
                                        if (strM46171 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        z3 = false;
                                        str3 = strM46171;
                                    } else if (strSubstring5.equalsIgnoreCase(MotionUtils.EASING_TYPE_PATH)) {
                                        str2 = strSubstring2;
                                    } else if (strSubstring5.equalsIgnoreCase("secure")) {
                                        z = true;
                                    } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                                        z2 = true;
                                    }
                                    i6 = iM461610 + 1;
                                    listM26141 = list2;
                                }
                            }
                        } else {
                            list = listM26141;
                        }
                        c3988 = null;
                        break;
                    } else {
                        list = listM26141;
                        c3988 = null;
                        break;
                    }
                } else {
                    list = listM26141;
                    c3988 = null;
                    break;
                }
            } else {
                list = listM26141;
                c3988 = null;
                break;
            }
            if (c3988 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c3988);
            }
            i2++;
            i = 0;
            listM26141 = list;
        }
        return arrayList != null ? C20195.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12647);
        sb.append(a.h);
        sb.append(this.f12649);
        if (this.f12650) {
            long j = this.f12644;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C5033.m14544(new Date(j)));
            }
        }
        if (!this.f12646) {
            sb.append("; domain=");
            sb.append(this.f12642);
        }
        sb.append("; path=");
        sb.append(this.f12645);
        if (this.f12643) {
            sb.append("; secure");
        }
        if (this.f12648) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3988)) {
            return false;
        }
        C3988 c3988 = (C3988) obj;
        return c3988.f12647.equals(this.f12647) && c3988.f12649.equals(this.f12649) && c3988.f12642.equals(this.f12642) && c3988.f12645.equals(this.f12645) && c3988.f12644 == this.f12644 && c3988.f12643 == this.f12643 && c3988.f12648 == this.f12648 && c3988.f12650 == this.f12650 && c3988.f12646 == this.f12646;
    }

    public final int hashCode() {
        int iM27349 = C11010.m27349(C11010.m27349(C11010.m27349(C11010.m27349(527, 31, this.f12647), 31, this.f12649), 31, this.f12642), 31, this.f12645);
        long j = this.f12644;
        return ((((((((iM27349 + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f12643 ? 1 : 0)) * 31) + (!this.f12648 ? 1 : 0)) * 31) + (!this.f12650 ? 1 : 0)) * 31) + (!this.f12646 ? 1 : 0);
    }
}
