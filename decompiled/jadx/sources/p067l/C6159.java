package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
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
public final class C6159 {

    /* JADX INFO: renamed from: ۖ */
    public static final Pattern f15454 = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: ۡ */
    public static final Pattern f15455 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: ۢ */
    public static final Pattern f15456 = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: ܺ */
    public static final Pattern f15457 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: ֫ */
    public final String f15458;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f15459;

    /* JADX INFO: renamed from: ۧ */
    public final long f15460;

    /* JADX INFO: renamed from: ܳ */
    public final String f15461;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f15462;

    /* JADX INFO: renamed from: ܿ */
    public final String f15463;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f15464;

    /* JADX INFO: renamed from: ᩷ */
    public final String f15465;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean f15466;

    public C6159(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f15463 = str;
        this.f15465 = str2;
        this.f15460 = j;
        this.f15458 = str3;
        this.f15461 = str4;
        this.f15459 = z;
        this.f15464 = z2;
        this.f15462 = z3;
        this.f15466 = z4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m13955() {
        return this.f15463;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m13956() {
        return this.f15465;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0084  */
    /* JADX INFO: renamed from: ֫ */
    public static long m13953(int i, String str) {
        int iM13952 = m13952(str, 0, i, false);
        Pattern pattern = f15457;
        Matcher matcher = pattern.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iIndexOf = -1;
        int i5 = -1;
        int i6 = -1;
        while (iM13952 < i) {
            int iM13953 = m13952(str, iM13952 + 1, i, true);
            matcher.region(iM13952, iM13953);
            if (i3 == -1 && matcher.usePattern(pattern).matches()) {
                int i7 = Integer.parseInt(matcher.group(1));
                int i8 = Integer.parseInt(matcher.group(2));
                i6 = Integer.parseInt(matcher.group(3));
                i5 = i8;
                i3 = i7;
            } else if (i4 == -1 && matcher.usePattern(f15456).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            } else if (iIndexOf == -1) {
                Pattern pattern2 = f15455;
                if (matcher.usePattern(pattern2).matches()) {
                    iIndexOf = pattern2.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                } else if (i2 != -1 && matcher.usePattern(f15454).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            } else if (i2 != -1) {
            }
            iM13952 = m13952(str, iM13953 + 1, i, false);
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
        GregorianCalendar gregorianCalendar = new GregorianCalendar(C21407.f67534);
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

    /* JADX INFO: renamed from: ֫ */
    public static int m13952(String str, int i, int i2, boolean z) {
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
    /* JADX INFO: renamed from: ֫ */
    public static List m13954(C13535 c13535, C12194 c12194) {
        List list;
        long j;
        String strSubstring;
        C6159 c6159;
        String strSubstring2;
        List listM28166 = c12194.m28166("Set-Cookie");
        int size = listM28166.size();
        int i = 0;
        int i2 = 0;
        ArrayList arrayList = null;
        while (i2 < size) {
            String str = (String) listM28166.get(i2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            int length = str.length();
            int iM48484 = C21407.m48484(str, i, length, ';');
            int iM48485 = C21407.m48484(str, i, iM48484, C0184a.f880h);
            if (iM48485 != iM48484) {
                int iM48502 = C21407.m48502(i, iM48485, str);
                String strSubstring3 = str.substring(iM48502, C21407.m48505(iM48502, iM48485, str));
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
                        int iM48503 = C21407.m48502(iM48485 + 1, iM48484, str);
                        String strSubstring4 = str.substring(iM48503, C21407.m48505(iM48503, iM48484, str));
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
                            int i5 = iM48484 + 1;
                            String str2 = null;
                            long j2 = -1;
                            long jM13953 = 253402300799999L;
                            boolean z = false;
                            boolean z2 = false;
                            boolean z3 = true;
                            boolean z4 = false;
                            String str3 = null;
                            int i6 = i5;
                            while (true) {
                                long j3 = C14849.FOREVER_NS;
                                if (i6 >= length) {
                                    list = listM28166;
                                    if (j2 == Long.MIN_VALUE) {
                                        j = Long.MIN_VALUE;
                                    } else if (j2 != -1) {
                                        if (j2 <= 9223372036854775L) {
                                            j3 = j2 * 1000;
                                        }
                                        long j4 = jCurrentTimeMillis + j3;
                                        j = (j4 < jCurrentTimeMillis || j4 > 253402300799999L) ? 253402300799999L : j4;
                                    } else {
                                        j = jM13953;
                                    }
                                    String str4 = c13535.f38067;
                                    if (str3 != null) {
                                        if (!str4.equals(str3) && (!str4.endsWith(str3) || str4.charAt((str4.length() - str3.length()) - 1) != '.' || C21407.m48503(str4))) {
                                            break;
                                        }
                                    } else {
                                        str3 = str4;
                                    }
                                    if (str4.length() == str3.length() || PublicSuffixDatabase.get().getEffectiveTldPlusOne(str3) != null) {
                                        if (str2 == null || !str2.startsWith("/")) {
                                            String strM30819 = c13535.m30819();
                                            int iLastIndexOf = strM30819.lastIndexOf(47);
                                            strSubstring = iLastIndexOf != 0 ? strM30819.substring(0, iLastIndexOf) : "/";
                                        } else {
                                            strSubstring = str2;
                                        }
                                        c6159 = new C6159(strSubstring3, strSubstring4, j, str3, strSubstring, z, z2, z3, z4);
                                        break;
                                    }
                                } else {
                                    int iM48486 = C21407.m48484(str, i6, length, ';');
                                    int iM48487 = C21407.m48484(str, i6, iM48486, C0184a.f880h);
                                    int iM48504 = C21407.m48502(i6, iM48487, str);
                                    List list2 = listM28166;
                                    String strSubstring5 = str.substring(iM48504, C21407.m48505(iM48504, iM48487, str));
                                    if (iM48487 < iM48486) {
                                        int iM48505 = C21407.m48502(iM48487 + 1, iM48486, str);
                                        strSubstring2 = str.substring(iM48505, C21407.m48505(iM48505, iM48486, str));
                                    } else {
                                        strSubstring2 = "";
                                    }
                                    if (strSubstring5.equalsIgnoreCase("expires")) {
                                        try {
                                            jM13953 = m13953(strSubstring2.length(), strSubstring2);
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
                                        String strM48487 = C21407.m48487(strSubstring2);
                                        if (strM48487 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        z3 = false;
                                        str3 = strM48487;
                                    } else if (strSubstring5.equalsIgnoreCase(MotionUtils.EASING_TYPE_PATH)) {
                                        str2 = strSubstring2;
                                    } else if (strSubstring5.equalsIgnoreCase("secure")) {
                                        z = true;
                                    } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                                        z2 = true;
                                    }
                                    i6 = iM48486 + 1;
                                    listM28166 = list2;
                                }
                            }
                        } else {
                            list = listM28166;
                        }
                        c6159 = null;
                        break;
                    } else {
                        list = listM28166;
                        c6159 = null;
                        break;
                    }
                } else {
                    list = listM28166;
                    c6159 = null;
                    break;
                }
            } else {
                list = listM28166;
                c6159 = null;
                break;
            }
            if (c6159 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c6159);
            }
            i2++;
            i = 0;
            listM28166 = list;
        }
        return arrayList != null ? C21562.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15463);
        sb.append(C0184a.f880h);
        sb.append(this.f15465);
        if (this.f15466) {
            long j = this.f15460;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C7151.m16448(new Date(j)));
            }
        }
        if (!this.f15462) {
            sb.append("; domain=");
            sb.append(this.f15458);
        }
        sb.append("; path=");
        sb.append(this.f15461);
        if (this.f15459) {
            sb.append("; secure");
        }
        if (this.f15464) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6159)) {
            return false;
        }
        C6159 c6159 = (C6159) obj;
        return c6159.f15463.equals(this.f15463) && c6159.f15465.equals(this.f15465) && c6159.f15458.equals(this.f15458) && c6159.f15461.equals(this.f15461) && c6159.f15460 == this.f15460 && c6159.f15459 == this.f15459 && c6159.f15464 == this.f15464 && c6159.f15466 == this.f15466 && c6159.f15462 == this.f15462;
    }

    public final int hashCode() {
        int iM29411 = C12832.m29411(C12832.m29411(C12832.m29411(C12832.m29411(527, 31, this.f15463), 31, this.f15465), 31, this.f15458), 31, this.f15461);
        long j = this.f15460;
        return ((((((((iM29411 + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f15459 ? 1 : 0)) * 31) + (!this.f15464 ? 1 : 0)) * 31) + (!this.f15466 ? 1 : 0)) * 31) + (!this.f15462 ? 1 : 0);
    }
}
