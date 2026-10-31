package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1US */
/* JADX INFO: loaded from: classes2.dex */
public final class C2551 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15955 m8086() {
        try {
            Process processExec = Runtime.getRuntime().exec("df");
            processExec.waitFor();
            InputStream inputStream = processExec.getInputStream();
            Charset charset = StandardCharsets.UTF_8;
            List<String> listM49849 = C22194.m49849(inputStream);
            HashSet<C15955> hashSet = new HashSet();
            String lowerCase = ((String) listM49849.get(0)).toLowerCase();
            if (lowerCase.contains(" 1k-blocks ") || lowerCase.contains(" 1024-blocks ")) {
                boolean z = true;
                for (String str : listM49849) {
                    if (z) {
                        z = false;
                    } else {
                        String[] strArrSplit = str.split(" +");
                        if (strArrSplit.length == 6 && strArrSplit[5].startsWith("/")) {
                            try {
                                hashSet.add(new C15955(Long.parseLong(strArrSplit[1]) * ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS, Long.parseLong(strArrSplit[3]) * ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS));
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if (lowerCase.contains(" 512-blocks ")) {
                boolean z2 = true;
                for (String str2 : listM49849) {
                    if (z2) {
                        z2 = false;
                    } else {
                        String[] strArrSplit2 = str2.split(" +");
                        if (strArrSplit2.length == 6 && strArrSplit2[5].startsWith("/")) {
                            try {
                                hashSet.add(new C15955(Long.parseLong(strArrSplit2[1]) * 512, Long.parseLong(strArrSplit2[3]) * 512));
                            } catch (NumberFormatException unused2) {
                            }
                        }
                    }
                }
            } else if (lowerCase.contains(" size ")) {
                boolean z3 = true;
                for (String str3 : listM49849) {
                    if (z3) {
                        z3 = false;
                    } else {
                        String[] strArrSplit3 = str3.split(" +");
                        if (strArrSplit3.length == 6 && strArrSplit3[5].startsWith("/")) {
                            try {
                                hashSet.add(new C15955(m8085(strArrSplit3[1]), m8085(strArrSplit3[3])));
                            } catch (NumberFormatException unused3) {
                            }
                        }
                    }
                }
            }
            long jM37731 = 0;
            long jM37730 = 0;
            for (C15955 c15955 : hashSet) {
                jM37731 += c15955.m37731();
                jM37730 += c15955.m37730();
            }
            if (jM37731 == 0) {
                return null;
            }
            return new C15955(jM37731, jM37730);
        } catch (Exception unused4) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m8085(String str) {
        if (str.endsWith("K")) {
            return (long) (Float.parseFloat(str.substring(0, str.length() - 1)) * 1024.0f);
        }
        if (str.endsWith("M")) {
            return ((long) (Float.parseFloat(str.substring(0, str.length() - 1)) * 1024.0f)) * ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        }
        if (str.endsWith("G")) {
            return ((long) (Float.parseFloat(str.substring(0, str.length() - 1)) * 1024.0f)) * 1048576;
        }
        if (str.endsWith("T")) {
            return ((long) (Float.parseFloat(str.substring(0, str.length() - 1)) * 1024.0f)) * 1073741824;
        }
        return Long.parseLong(str);
    }
}
