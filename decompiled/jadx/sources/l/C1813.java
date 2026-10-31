package l;

import bin.mt.json.JSON;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.֫ۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1813 {
    /* JADX WARN: Code duplicated, block: B:96:0x015c  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7292 m6033(String str, int i, int i2, boolean z) throws C3059 {
        String strM29847;
        List listAsList;
        int i3;
        int i4;
        String strM27292;
        String str2 = str;
        if (str2 == null) {
            throw m6032(str2, "prefix must be a string");
        }
        int i5 = 1;
        if (!str.isEmpty()) {
            if (str2.charAt(0) != '/' && str2.indexOf(92) < 0 && str2.indexOf(0) < 0) {
                int iIndexOf = str2.indexOf(58);
                if (iIndexOf > 0) {
                    int i6 = 0;
                    while (true) {
                        if (i6 < iIndexOf) {
                            char cCharAt = str2.charAt(i6);
                            if (i6 == 0) {
                                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                                    break;
                                }
                                i6++;
                                i5 = 1;
                            } else {
                                if ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '+' && cCharAt != '-' && cCharAt != '.'))) {
                                    break;
                                }
                                i6++;
                                i5 = 1;
                            }
                        }
                    }
                }
                String[] strArrSplit = str2.split("/", -1);
                for (int i7 = 0; i7 < strArrSplit.length; i7++) {
                    String str3 = strArrSplit[i7];
                    if (!(i7 == strArrSplit.length - i5 && str3.isEmpty()) && (str3.isEmpty() || ".".equals(str3) || "..".equals(str3))) {
                        throw m6032(str2, "prefix must not contain empty, dot, or parent segments");
                    }
                }
            }
            throw m6032(str2, "prefix must be a relative path prefix");
        }
        str2 = "";
        String str4 = str2;
        C7383 c7383M48690 = C22233.m49903().m48690();
        String str5 = c7383M48690.f22726;
        c7383M48690.m19883(str5);
        C13641 c13641M6034 = null;
        if (z && str4.isEmpty() && (strM27292 = C10986.m27292()) != null) {
            try {
                strM29847 = C12301.m29847(strM27292, MotionUtils.EASING_TYPE_PATH);
            } catch (C3059 unused) {
                strM29847 = null;
            }
        } else {
            strM29847 = null;
        }
        if (strM29847 == null) {
            listAsList = Collections.singletonList(str5);
        } else {
            listAsList = Arrays.asList(str5, strM29847);
        }
        AbstractC15440 abstractC15440M39866 = C16999.m39866(str5, new String[0]);
        C10000 c10000M16222 = C22233.m49904().m16222(listAsList);
        try {
            if (!abstractC15440M39866.mo23120()) {
                throw C3059.m9361(null, "AVAILABLE_APK_DIRECTORY_NOT_FOUND", "Available APK directory does not exist.", "warning");
            }
            if (!abstractC15440M39866.mo23113()) {
                throw C3059.m9368("AVAILABLE_APK_DIRECTORY_NOT_DIRECTORY", "Available APK path is not a directory.");
            }
            if (!abstractC15440M39866.mo27936()) {
                throw C3059.m9361(null, "AVAILABLE_APK_DIRECTORY_UNREADABLE", "Available APK directory is not readable.", "warning");
            }
            ArrayList arrayListM6031 = m6031(abstractC15440M39866, c7383M48690, str4);
            C6083.sort(arrayListM6031, C8200.comparing(new C5881()));
            int iMax = Math.max(0, Math.min(i2, arrayListM6031.size()));
            ArrayList arrayList = new ArrayList(i);
            if (z && iMax == 0 && str4.isEmpty()) {
                if (strM29847 != null) {
                    AbstractC15440 abstractC15440M39867 = C16999.m39866(strM29847, new String[0]);
                    if (abstractC15440M39867.mo23120() && abstractC15440M39867.mo23119()) {
                        c13641M6034 = m6034(new C22814(abstractC15440M39867, "mt://current-apk", abstractC15440M39867.mo23127(), abstractC15440M39867.mo23117()));
                    }
                }
                if (c13641M6034 != null) {
                    arrayList.add(c13641M6034);
                    i3 = i - 1;
                    i4 = 1;
                } else {
                    i3 = i;
                    i4 = 0;
                }
            } else {
                i3 = i;
                i4 = 0;
            }
            int iMin = Math.min(i3 + iMax, arrayListM6031.size());
            while (iMax < iMin) {
                arrayList.add(m6034((C22814) arrayListM6031.get(iMax)));
                iMax++;
            }
            C7292 c7292 = new C7292(str4, arrayList, arrayListM6031.size(), i4 + arrayListM6031.size(), i, iMin);
            c10000M16222.close();
            return c7292;
        } catch (Throwable th) {
            try {
                c10000M16222.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m6031(AbstractC15440 abstractC15440, C7383 c7383, String str) {
        String string;
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C11526(abstractC15440, ""));
        while (!linkedList.isEmpty()) {
            C11526 c11526 = (C11526) linkedList.removeFirst();
            AbstractC15440 abstractC15441 = c11526.f34410;
            String str2 = c11526.f34411;
            for (AbstractC15440 abstractC15442 : abstractC15441.mo23549(true)) {
                if (c7383.m19881(abstractC15442.mo23554()).f73841.m16736()) {
                    if (str2.isEmpty()) {
                        string = abstractC15442.getName();
                    } else {
                        StringBuilder sbM19190 = C7166.m19190(str2, "/");
                        sbM19190.append(abstractC15442.getName());
                        string = sbM19190.toString();
                    }
                    String str3 = string;
                    if (abstractC15442.mo23113()) {
                        if (!abstractC15442.m36533()) {
                            linkedList.addLast(new C11526(abstractC15442, str3));
                        }
                    } else if (abstractC15442.mo23119() && !abstractC15442.m36533() && abstractC15442.getName().toLowerCase(Locale.ROOT).endsWith(".apk") && str3.startsWith(str)) {
                        arrayList.add(new C22814(abstractC15442, str3, abstractC15442.mo23127(), abstractC15442.mo23117()));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13641 m6034(C22814 c22814) {
        C20158 c20158;
        Long lValueOf;
        int i = 0;
        try {
            C18090 c18090 = new C18090(c22814.f73659);
            try {
                c20158 = C3224.m9893(c18090);
                c18090.close();
            } catch (Throwable th) {
                try {
                    c18090.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            String message = e.getMessage() == null ? "Failed to parse APK manifest." : e.getMessage();
            c20158 = new C20158();
            c20158.f65275 = false;
            c20158.f65277 = message;
        }
        String str = c20158.f65270;
        if (str == null) {
            str = c20158.f65273;
        }
        String str2 = str;
        String str3 = c22814.f73661;
        long j = c22814.f73662;
        long j2 = c22814.f73660;
        String str4 = c20158.f65279;
        String str5 = c20158.f65272;
        String str6 = c20158.f65278;
        if (str6 == null || str6.isEmpty()) {
            lValueOf = null;
        } else {
            while (true) {
                if (i < str6.length()) {
                    char cCharAt = str6.charAt(i);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    i++;
                } else {
                    try {
                        lValueOf = Long.valueOf(Long.parseLong(str6));
                    } catch (NumberFormatException unused) {
                        lValueOf = null;
                    }
                }
            }
            lValueOf = null;
        }
        return new C13641(str3, j, j2, str2, str4, str5, lValueOf, c20158.f65275, c20158.f65277);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m6032(String str, String str2) {
        return C3059.m9364(str2, "prefix", str == null ? null : JSON.value(str), JSON.array(), JSON.object().add("prefix", ""));
    }
}
