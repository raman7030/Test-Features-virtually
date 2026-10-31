package l;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final class C14677 {
    /* JADX WARN: Bottom block not found for handler: all -> 0x00ff */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m34979(C12582 c12582, C13992 c13992, C20344 c20344, C19277 c19277, C23674 c23674) {
        C6232 c6232;
        C6232 c6233;
        C23165 c23165M34976;
        int i;
        C11151 c11151;
        String str = c20344.f65675;
        byte[] bArr = new byte[32768];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(c12582.m30845());
        int i2 = 0;
        int i3 = 0;
        while (i3 < 32768) {
            try {
                int i4 = bufferedInputStream.read(bArr, i3, 32768 - i3);
                if (i4 == -1) {
                    break;
                } else {
                    i3 += i4;
                }
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        bufferedInputStream.close();
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i3);
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.isEmpty()) {
            int iM35152 = C14776.m35152(bArrCopyOf.length, bArrCopyOf);
            Charset charsetM35151 = C14776.m35151(iM35152);
            if ((iM35152 == C14776.f45134 || iM35152 == C14776.f45120) && C11250.m27837(bArrCopyOf.length, bArrCopyOf)) {
                i2 = 3;
            } else if ((iM35152 == C14776.f45129 && C11250.m27830(bArrCopyOf.length, bArrCopyOf)) || (iM35152 == C14776.f45122 && C11250.m27834(bArrCopyOf.length, bArrCopyOf))) {
                i2 = 2;
            } else if ((iM35152 == C14776.f45123 && C11250.m27836(bArrCopyOf.length, bArrCopyOf)) || (iM35152 == C14776.f45133 && C11250.m27838(bArrCopyOf.length, bArrCopyOf))) {
                i2 = 4;
            }
            c6233 = new C6232(charsetM35151, i2, i2 != 0 ? Arrays.copyOf(bArrCopyOf, i2) : null);
        } else {
            if ("UTF-8-BOM".equalsIgnoreCase(strTrim)) {
                c6233 = new C6232(StandardCharsets.UTF_8, C11250.m27837(bArrCopyOf.length, bArrCopyOf) ? 3 : 0, C23850.f77171);
            } else {
                c6232 = new C6232(Charset.forName(strTrim), 0, null);
            }
            c23165M34976 = m34976(c12582, c20344, c6232, null, c19277, c23674, "\n");
            i = c23165M34976.f74450;
            if (i != 0) {
                throw new IOException("No content to output");
            }
            int length = String.valueOf(i).length();
            String str2 = c23165M34976.f74449;
            c11151 = new C11151(c13992, length, c6232.f19085, c6232.f19086, str2);
            try {
                m34976(c12582, c20344, c6232, c11151, c19277, c23674, str2);
                c11151.m27670();
            } catch (C11877 e) {
                c11151.m27669();
                throw e;
            }
        }
        c6232 = c6233;
        c23165M34976 = m34976(c12582, c20344, c6232, null, c19277, c23674, "\n");
        i = c23165M34976.f74450;
        if (i != 0) {
            throw new IOException("No content to output");
        }
        int length2 = String.valueOf(i).length();
        String str3 = c23165M34976.f74449;
        c11151 = new C11151(c13992, length2, c6232.f19085, c6232.f19086, str3);
        m34976(c12582, c20344, c6232, c11151, c19277, c23674, str3);
        c11151.m27670();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [l.ۧܿ᩻] */
    /* JADX WARN: Type inference failed for: r7v1, types: [l.֫ܿ᩻] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23165 m34976(C12582 c12582, C20344 c20344, C6232 c6232, C11151 c11151, C19277 c19277, C23674 c23674, String str) throws Throwable {
        C3410 c3410 = null;
        try {
            C3410 c3411 = new C3410(c12582.m30845(), c19277);
            try {
                int i = c6232.f19087;
                for (int i2 = 0; i2 < i; i2++) {
                    if (c3411.read() == -1) {
                        throw new IOException("Unexpected end of file while skipping BOM");
                    }
                }
                CharsetDecoder charsetDecoderNewDecoder = c6232.f19085.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                C13287 c13287 = c11151 == 0 ? new C13287() : null;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c3411, charsetDecoderOnUnmappableCharacter));
                    try {
                        C10466 c10466 = new C10466(bufferedReader, c13287);
                        C4821 c4821 = c11151 == 0 ? new C4821() : null;
                        if (c11151 == 0) {
                            c11151 = c4821;
                        }
                        if (c20344.f65671 == 2) {
                            m34978(c10466, c20344, (InterfaceC1978) c11151, c23674);
                        } else {
                            m34980(c10466, c20344, c11151, c23674);
                        }
                        if (c13287 != null) {
                            str = c13287.m32248();
                        }
                        C23165 c23165 = new C23165(c11151.mo6490(), str);
                        bufferedReader.close();
                        c3411.close();
                        return c23165;
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (CharacterCodingException e) {
                    throw new IOException("Invalid text encoding", e);
                }
            } catch (Throwable th3) {
                th = th3;
                c3410 = c3411;
                if (c3410 != null) {
                    c3410.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34978(C10466 c10466, C20344 c20344, InterfaceC1978 interfaceC1978, C23674 c23674) throws IOException {
        int i = c20344.f65667;
        if (i < 1 || i > 999999999) {
            throw new IOException("Text length is invalid");
        }
        if (!c20344.f65670) {
            m34977(c10466, i, interfaceC1978, c23674);
            return;
        }
        int iMin = Math.min(i / 10, 4096);
        if (iMin <= 0) {
            m34977(c10466, i, interfaceC1978, c23674);
            return;
        }
        C16794 c16794 = new C16794(iMin + 1);
        boolean z = false;
        while (true) {
            int i2 = 0;
            while (true) {
                int iM26345 = c10466.m26345();
                if (iM26345 == -1) {
                    if (!z || i2 > 0 || c16794.m39529() > 0) {
                        c16794.m39530(interfaceC1978);
                        interfaceC1978.mo6486();
                        return;
                    }
                    return;
                }
                if (!((C7643) c23674.f76700).mo1526()) {
                    c16794.m39526(iM26345);
                    while (c16794.m39529() > iMin) {
                        c16794.m39528(interfaceC1978);
                        i2++;
                    }
                    if (c16794.m39529() + i2 == i) {
                        break;
                    } else {
                        z = true;
                    }
                } else {
                    throw new C11877();
                }
            }
            int iM39525 = c16794.m39525();
            if (iM39525 != -1) {
                c16794.m39527(iM39525 + 1, interfaceC1978);
                interfaceC1978.mo6486();
            } else {
                c16794.m39530(interfaceC1978);
                interfaceC1978.mo6486();
            }
            z = true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34977(C10466 c10466, int i, InterfaceC1978 interfaceC1978, C23674 c23674) throws IOException {
        boolean z = false;
        while (true) {
            int i2 = 0;
            do {
                int iM26345 = c10466.m26345();
                if (iM26345 == -1) {
                    if (!z || i2 > 0) {
                        interfaceC1978.mo6486();
                        return;
                    }
                    return;
                }
                if (!((C7643) c23674.f76700).mo1526()) {
                    interfaceC1978.mo6488(iM26345);
                    i2++;
                    z = true;
                } else {
                    throw new C11877();
                }
            } while (i2 != i);
            interfaceC1978.mo6486();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m34980(C10466 c10466, C20344 c20344, InterfaceC1978 interfaceC1978, C23674 c23674) throws IOException {
        String strM34975 = m34975(c20344.f65677);
        StringBuilder sb = new StringBuilder(strM34975.length());
        boolean z = false;
        int i = 0;
        while (i < strM34975.length()) {
            char cCharAt = strM34975.charAt(i);
            if (cCharAt == '\r') {
                int i2 = i + 1;
                if (i2 < strM34975.length() && strM34975.charAt(i2) == '\n') {
                    i = i2;
                }
                sb.append('\n');
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            throw new IOException("Separator is empty");
        }
        C17500 c17500 = new C17500(interfaceC1978, c20344);
        C18206 c18206 = new C18206(string, c17500);
        while (true) {
            int iM26344 = c10466.m26344();
            if (iM26344 == -1) {
                c18206.m42420();
                if (!z) {
                    interfaceC1978.mo6486();
                    return;
                } else {
                    c17500.m40884();
                    return;
                }
            }
            if (!((C7643) c23674.f76700).mo1526()) {
                c18206.m42421((char) iM26344);
                z = true;
            } else {
                throw new C11877();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m34975(String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\\' || (i = i2 + 1) >= str.length()) {
                sb.append(cCharAt);
            } else {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 == 'n') {
                    sb.append('\n');
                } else if (cCharAt2 == 'r') {
                    sb.append('\r');
                } else if (cCharAt2 == 't') {
                    sb.append('\t');
                } else if (cCharAt2 == '\\') {
                    sb.append('\\');
                } else {
                    sb.append('\\');
                    sb.append(cCharAt2);
                }
                i2 = i;
            }
            i2++;
        }
        return sb.toString();
    }
}
