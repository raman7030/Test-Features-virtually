package l;

import com.alipay.sdk.m.y.l;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۗܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37C1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3297 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Set f10343;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Object f10344 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f10341 = {"-lnt:numbers,table", "-lvt"};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f10342 = Pattern.compile("^\\s*//\\s*(\\d+)#(?:.*)?$");

    static {
        Object[] objArr = {"var", "type", "endvar", "endtype", "try", "endtry", "catch", "locals_map", "stack_map"};
        HashSet hashSet = new HashSet(9);
        for (int i = 0; i < 9; i++) {
            Object obj = objArr[i];
            C11003.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        f10343 = C20195.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m10094(byte[] bArr) {
        String strM10097;
        if (bArr.length == 0) {
            throw new IllegalArgumentException("classBytes must not be empty.");
        }
        synchronized (f10344) {
            try {
                C0428 c0428 = new C0428();
                C21596 c21596 = new C21596();
                if (new C4761(c0428, c21596, new C1840(bArr), f10341).m13927() != 0) {
                    throw m10095("Jdis disassembly failed.", c21596.toString(), null);
                }
                int size = c0428.m1972().size();
                if (size != 1) {
                    throw m10095("Jdis disassembly produced " + size + " jasm outputs, but this API only supports a single output.", c21596.toString(), null);
                }
                String strM44895 = ((C19480) c0428.m1972().get(0)).m44895();
                if (strM44895 == null || strM44895.isEmpty()) {
                    throw m10095("Jdis disassembly succeeded but produced no jasm text.", c21596.toString(), null);
                }
                strM10097 = m10097(strM44895);
            } catch (RuntimeException e) {
                throw m10095("Unexpected exception while running Jdis.", null, e);
            } catch (C13174 e2) {
                throw e2;
            }
        }
        return strM10097;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m10096(String str) {
        byte[] bArrM47722;
        if (str == null) {
            throw new IllegalArgumentException("jasmSource must not be null.");
        }
        if (str.trim().isEmpty()) {
            throw new IllegalArgumentException("jasmSource must not be blank.");
        }
        synchronized (f10344) {
            try {
                C9602 c9602 = new C9602();
                C21596 c21596 = new C21596();
                if (new C13088(c9602, c21596, new C17362(str.getBytes(StandardCharsets.UTF_8))).m31723() != 0) {
                    throw m10095("Jasm assembly failed.", c21596.toString(), null);
                }
                int size = c9602.m24535().size();
                if (size != 1) {
                    throw m10095("Jasm assembly produced " + size + " class outputs, but this API only supports a single output.", c21596.toString(), null);
                }
                bArrM47722 = ((C20891) c9602.m24535().get(0)).m47722();
                if (bArrM47722 == null || bArrM47722.length == 0) {
                    throw m10095("Jasm assembly succeeded but produced no class data.", c21596.toString(), null);
                }
            } catch (RuntimeException e) {
                throw m10095("Unexpected exception while running Jasm.", null, e);
            } catch (C13174 e2) {
                throw e2;
            }
        }
        return bArrM47722;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13174 m10095(String str, String str2, RuntimeException runtimeException) {
        if ((str2 == null || str2.trim().isEmpty()) && runtimeException != null) {
            str2 = C5368.m15338((Throwable) runtimeException);
        }
        if (str2 != null) {
            str2.trim().isEmpty();
        }
        return new C13174(str);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m10097(String str) {
        boolean z;
        String str2 = str.contains("\r\n") ? "\r\n" : "\n";
        String[] strArrSplit = str.split("\\R", -1);
        StringBuilder sb = new StringBuilder(str.length() + 64);
        String strGroup = null;
        for (int i = 0; i < strArrSplit.length; i++) {
            String strM50967 = strArrSplit[i];
            Matcher matcher = f10342.matcher(strM50967);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
            } else {
                if (strGroup != null) {
                    String strTrim = strM50967.trim();
                    if (strTrim.isEmpty() || strTrim.startsWith("//") || !strTrim.endsWith(l.b) || strTrim.startsWith("line ") || strTrim.startsWith("LineTable") || strTrim.startsWith("SourceFile")) {
                        z = false;
                    } else {
                        int iIndexOf = strTrim.indexOf(58);
                        if (iIndexOf > 0) {
                            String strTrim2 = strTrim.substring(0, iIndexOf).trim();
                            if (!strTrim2.isEmpty()) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= strTrim2.length()) {
                                        strTrim = strTrim.substring(iIndexOf + 1).trim();
                                        break;
                                    }
                                    if (!Character.isLetterOrDigit((int) strTrim2.charAt(i2))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                        int iIndexOf2 = strTrim.indexOf(32);
                        if (iIndexOf2 < 0) {
                            iIndexOf2 = strTrim.indexOf(59);
                        }
                        if (iIndexOf2 < 0) {
                            z = false;
                        } else {
                            z = !f10343.contains(strTrim.substring(0, iIndexOf2));
                        }
                    }
                    if (z) {
                        strM50967 = C22870.m50967(strM50967, "  // line ", strGroup);
                        strGroup = null;
                    }
                }
                sb.append(strM50967);
                if (i < strArrSplit.length - 1) {
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }
}
