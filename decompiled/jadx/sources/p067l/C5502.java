package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۗܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37C1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5502 {

    /* JADX INFO: renamed from: ܽ */
    public static final Set f13151;

    /* JADX INFO: renamed from: ᩳ */
    public static final Object f13152 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public static final String[] f13149 = {"-lnt:numbers,table", "-lvt"};

    /* JADX INFO: renamed from: ۧ */
    public static final Pattern f13150 = Pattern.compile("^\\s*//\\s*(\\d+)#(?:.*)?$");

    static {
        Object[] objArr = {"var", "type", "endvar", "endtype", "try", "endtry", "catch", "locals_map", "stack_map"};
        HashSet hashSet = new HashSet(9);
        for (int i = 0; i < 9; i++) {
            Object obj = objArr[i];
            C12826.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
            }
        }
        f13151 = C21562.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m12129(byte[] bArr) {
        String strM12132;
        if (bArr.length == 0) {
            throw new IllegalArgumentException("classBytes must not be empty.");
        }
        synchronized (f13152) {
            try {
                C2775 c2775 = new C2775();
                C22893 c22893 = new C22893();
                if (new C6893(c2775, c22893, new C4117(bArr), f13149).m15807() != 0) {
                    throw m12130("Jdis disassembly failed.", c22893.toString(), null);
                }
                int size = c2775.m4348().size();
                if (size != 1) {
                    throw m12130("Jdis disassembly produced " + size + " jasm outputs, but this API only supports a single output.", c22893.toString(), null);
                }
                String strM47192 = ((C20882) c2775.m4348().get(0)).m47192();
                if (strM47192 == null || strM47192.isEmpty()) {
                    throw m12130("Jdis disassembly succeeded but produced no jasm text.", c22893.toString(), null);
                }
                strM12132 = m12132(strM47192);
            } catch (RuntimeException e) {
                throw m12130("Unexpected exception while running Jdis.", null, e);
            } catch (C14889 e2) {
                throw e2;
            }
        }
        return strM12132;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m12131(String str) {
        byte[] bArrM50052;
        if (str == null) {
            throw new IllegalArgumentException("jasmSource must not be null.");
        }
        if (str.trim().isEmpty()) {
            throw new IllegalArgumentException("jasmSource must not be blank.");
        }
        synchronized (f13152) {
            try {
                C11494 c11494 = new C11494();
                C22893 c22893 = new C22893();
                if (new C14807(c11494, c22893, new C18869(str.getBytes(StandardCharsets.UTF_8))).m33813() != 0) {
                    throw m12130("Jasm assembly failed.", c22893.toString(), null);
                }
                int size = c11494.m26547().size();
                if (size != 1) {
                    throw m12130("Jasm assembly produced " + size + " class outputs, but this API only supports a single output.", c22893.toString(), null);
                }
                bArrM50052 = ((C22223) c11494.m26547().get(0)).m50052();
                if (bArrM50052 == null || bArrM50052.length == 0) {
                    throw m12130("Jasm assembly succeeded but produced no class data.", c22893.toString(), null);
                }
            } catch (RuntimeException e) {
                throw m12130("Unexpected exception while running Jasm.", null, e);
            } catch (C14889 e2) {
                throw e2;
            }
        }
        return bArrM50052;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14889 m12130(String str, String str2, RuntimeException runtimeException) {
        if ((str2 == null || str2.trim().isEmpty()) && runtimeException != null) {
            str2 = C7470.m17247((Throwable) runtimeException);
        }
        if (str2 != null) {
            str2.trim().isEmpty();
        }
        return new C14889(str);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX INFO: renamed from: ۧ */
    public static String m12132(String str) {
        boolean z;
        String str2 = str.contains("\r\n") ? "\r\n" : "\n";
        String[] strArrSplit = str.split("\\R", -1);
        StringBuilder sb = new StringBuilder(str.length() + 64);
        String strGroup = null;
        for (int i = 0; i < strArrSplit.length; i++) {
            String strM53357 = strArrSplit[i];
            Matcher matcher = f13150.matcher(strM53357);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
            } else {
                if (strGroup != null) {
                    String strTrim = strM53357.trim();
                    if (strTrim.isEmpty() || strTrim.startsWith("//") || !strTrim.endsWith(C0249l.f1196b) || strTrim.startsWith("line ") || strTrim.startsWith("LineTable") || strTrim.startsWith("SourceFile")) {
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
                            z = !f13151.contains(strTrim.substring(0, iIndexOf2));
                        }
                    }
                    if (z) {
                        strM53357 = C24104.m53357(strM53357, "  // line ", strGroup);
                        strGroup = null;
                    }
                }
                sb.append(strM53357);
                if (i < strArrSplit.length - 1) {
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }
}
