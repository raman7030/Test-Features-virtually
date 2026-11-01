package p067l;

import bin.p000mt.json.JSON;
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
public final class C4092 {
    /* JADX WARN: Code duplicated, block: B:96:0x015c  */
    /* JADX INFO: renamed from: ֫ */
    public static C9299 m8231(String str, int i, int i2, boolean z) throws C5276 {
        String strM31907;
        List listAsList;
        int i3;
        int i4;
        String strM29354;
        String str2 = str;
        if (str2 == null) {
            throw m8230(str2, "prefix must be a string");
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
                        throw m8230(str2, "prefix must not contain empty, dot, or parent segments");
                    }
                }
            }
            throw m8230(str2, "prefix must be a relative path prefix");
        }
        str2 = "";
        String str4 = str2;
        C9385 c9385M51035 = C23499.m52231().m51035();
        String str5 = c9385M51035.f25638;
        c9385M51035.m21856(str5);
        C15333 c15333M8232 = null;
        if (z && str4.isEmpty() && (strM29354 = C12810.m29354()) != null) {
            try {
                strM31907 = C14059.m31907(strM29354, MotionUtils.EASING_TYPE_PATH);
            } catch (C5276 unused) {
                strM31907 = null;
            }
        } else {
            strM31907 = null;
        }
        if (strM31907 == null) {
            listAsList = Collections.singletonList(str5);
        } else {
            listAsList = Arrays.asList(str5, strM31907);
        }
        AbstractC17043 abstractC17043M42109 = C18524.m42109(str5, new String[0]);
        C11872 c11872M18141 = C23499.m52232().m18141(listAsList);
        try {
            if (!abstractC17043M42109.mo25094()) {
                throw C5276.m11403(null, "AVAILABLE_APK_DIRECTORY_NOT_FOUND", "Available APK directory does not exist.", "warning");
            }
            if (!abstractC17043M42109.mo25087()) {
                throw C5276.m11410("AVAILABLE_APK_DIRECTORY_NOT_DIRECTORY", "Available APK path is not a directory.");
            }
            if (!abstractC17043M42109.mo29997()) {
                throw C5276.m11403(null, "AVAILABLE_APK_DIRECTORY_UNREADABLE", "Available APK directory is not readable.", "warning");
            }
            ArrayList arrayListM8229 = m8229(abstractC17043M42109, c9385M51035, str4);
            C8150.sort(arrayListM8229, C10162.comparing(new C7958()));
            int iMax = Math.max(0, Math.min(i2, arrayListM8229.size()));
            ArrayList arrayList = new ArrayList(i);
            if (z && iMax == 0 && str4.isEmpty()) {
                if (strM31907 != null) {
                    AbstractC17043 abstractC17043M421010 = C18524.m42109(strM31907, new String[0]);
                    if (abstractC17043M421010.mo25094() && abstractC17043M421010.mo25093()) {
                        c15333M8232 = m8232(new C24051(abstractC17043M421010, "mt://current-apk", abstractC17043M421010.mo25101(), abstractC17043M421010.mo25091()));
                    }
                }
                if (c15333M8232 != null) {
                    arrayList.add(c15333M8232);
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
            int iMin = Math.min(i3 + iMax, arrayListM8229.size());
            while (iMax < iMin) {
                arrayList.add(m8232((C24051) arrayListM8229.get(iMax)));
                iMax++;
            }
            C9299 c9299 = new C9299(str4, arrayList, arrayListM8229.size(), i4 + arrayListM8229.size(), i, iMin);
            c11872M18141.close();
            return c9299;
        } catch (Throwable th) {
            try {
                c11872M18141.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m8229(AbstractC17043 abstractC17043, C9385 c9385, String str) {
        String string;
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C13323(abstractC17043, ""));
        while (!linkedList.isEmpty()) {
            C13323 c13323 = (C13323) linkedList.removeFirst();
            AbstractC17043 abstractC17044 = c13323.f37407;
            String str2 = c13323.f37408;
            for (AbstractC17043 abstractC17045 : abstractC17044.mo25500(true)) {
                if (c9385.m21854(abstractC17045.mo25505()).f76571.m18662()) {
                    if (str2.isEmpty()) {
                        string = abstractC17045.getName();
                    } else {
                        StringBuilder sbM21133 = C9179.m21133(str2, "/");
                        sbM21133.append(abstractC17045.getName());
                        string = sbM21133.toString();
                    }
                    String str3 = string;
                    if (abstractC17045.mo25087()) {
                        if (!abstractC17045.m38691()) {
                            linkedList.addLast(new C13323(abstractC17045, str3));
                        }
                    } else if (abstractC17045.mo25093() && !abstractC17045.m38691() && abstractC17045.getName().toLowerCase(Locale.ROOT).endsWith(".apk") && str3.startsWith(str)) {
                        arrayList.add(new C24051(abstractC17045, str3, abstractC17045.mo25101(), abstractC17045.mo25091()));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15333 m8232(C24051 c24051) {
        C21527 c21527;
        Long lValueOf;
        int i = 0;
        try {
            C19561 c19561 = new C19561(c24051.f76391);
            try {
                c21527 = C5433.m11941(c19561);
                c19561.close();
            } catch (Throwable th) {
                try {
                    c19561.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            String message = e.getMessage() == null ? "Failed to parse APK manifest." : e.getMessage();
            c21527 = new C21527();
            c21527.f67918 = false;
            c21527.f67920 = message;
        }
        String str = c21527.f67913;
        if (str == null) {
            str = c21527.f67916;
        }
        String str2 = str;
        String str3 = c24051.f76393;
        long j = c24051.f76394;
        long j2 = c24051.f76392;
        String str4 = c21527.f67922;
        String str5 = c21527.f67915;
        String str6 = c21527.f67921;
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
        return new C15333(str3, j, j2, str2, str4, str5, lValueOf, c21527.f67918, c21527.f67920);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m8230(String str, String str2) {
        return C5276.m11406(str2, "prefix", str == null ? null : JSON.value(str), JSON.array(), JSON.object().add("prefix", ""));
    }
}
