package p067l;

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
public final class C16318 {
    /* JADX WARN: Bottom block not found for handler: all -> 0x00ff */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m37126(C14327 c14327, C15667 c15667, C21704 c21704, C20689 c20689, C24868 c24868) {
        C8292 c8292;
        C8292 c8293;
        C24385 c24385M37123;
        int i;
        C12967 c12967;
        String str = c21704.f68351;
        byte[] bArr = new byte[32768];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(c14327.m32922());
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
            int iM37299 = C16412.m37299(bArrCopyOf.length, bArrCopyOf);
            Charset charsetM37298 = C16412.m37298(iM37299);
            if ((iM37299 == C16412.f48248 || iM37299 == C16412.f48234) && C13061.m29899(bArrCopyOf.length, bArrCopyOf)) {
                i2 = 3;
            } else if ((iM37299 == C16412.f48243 && C13061.m29892(bArrCopyOf.length, bArrCopyOf)) || (iM37299 == C16412.f48236 && C13061.m29896(bArrCopyOf.length, bArrCopyOf))) {
                i2 = 2;
            } else if ((iM37299 == C16412.f48237 && C13061.m29898(bArrCopyOf.length, bArrCopyOf)) || (iM37299 == C16412.f48247 && C13061.m29900(bArrCopyOf.length, bArrCopyOf))) {
                i2 = 4;
            }
            c8293 = new C8292(charsetM37298, i2, i2 != 0 ? Arrays.copyOf(bArrCopyOf, i2) : null);
        } else {
            if ("UTF-8-BOM".equalsIgnoreCase(strTrim)) {
                c8293 = new C8292(StandardCharsets.UTF_8, C13061.m29899(bArrCopyOf.length, bArrCopyOf) ? 3 : 0, C25036.f79921);
            } else {
                c8292 = new C8292(Charset.forName(strTrim), 0, null);
            }
            c24385M37123 = m37123(c14327, c21704, c8292, null, c20689, c24868, "\n");
            i = c24385M37123.f77195;
            if (i != 0) {
                throw new IOException("No content to output");
            }
            int length = String.valueOf(i).length();
            String str2 = c24385M37123.f77194;
            c12967 = new C12967(c15667, length, c8292.f21950, c8292.f21951, str2);
            try {
                m37123(c14327, c21704, c8292, c12967, c20689, c24868, str2);
                c12967.m29732();
            } catch (C13657 e) {
                c12967.m29731();
                throw e;
            }
        }
        c8292 = c8293;
        c24385M37123 = m37123(c14327, c21704, c8292, null, c20689, c24868, "\n");
        i = c24385M37123.f77195;
        if (i != 0) {
            throw new IOException("No content to output");
        }
        int length2 = String.valueOf(i).length();
        String str3 = c24385M37123.f77194;
        c12967 = new C12967(c15667, length2, c8292.f21950, c8292.f21951, str3);
        m37123(c14327, c21704, c8292, c12967, c20689, c24868, str3);
        c12967.m29732();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [l.ۧܿ᩻] */
    /* JADX WARN: Type inference failed for: r7v1, types: [l.֫ܿ᩻] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX INFO: renamed from: ֫ */
    public static C24385 m37123(C14327 c14327, C21704 c21704, C8292 c8292, C12967 c12967, C20689 c20689, C24868 c24868, String str) throws Throwable {
        C5610 c5610 = null;
        try {
            C5610 c5611 = new C5610(c14327.m32922(), c20689);
            try {
                int i = c8292.f21952;
                for (int i2 = 0; i2 < i; i2++) {
                    if (c5611.read() == -1) {
                        throw new IOException("Unexpected end of file while skipping BOM");
                    }
                }
                CharsetDecoder charsetDecoderNewDecoder = c8292.f21950.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                C14997 c14997 = c12967 == 0 ? new C14997() : null;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c5611, charsetDecoderOnUnmappableCharacter));
                    try {
                        C12316 c12316 = new C12316(bufferedReader, c14997);
                        C6951 c6951 = c12967 == 0 ? new C6951() : null;
                        if (c12967 == 0) {
                            c12967 = c6951;
                        }
                        if (c21704.f68347 == 2) {
                            m37125(c12316, c21704, (InterfaceC4249) c12967, c24868);
                        } else {
                            m37127(c12316, c21704, c12967, c24868);
                        }
                        if (c14997 != null) {
                            str = c14997.m34349();
                        }
                        C24385 c24385 = new C24385(c12967.mo8632(), str);
                        bufferedReader.close();
                        c5611.close();
                        return c24385;
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
                c5610 = c5611;
                if (c5610 != null) {
                    c5610.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37125(C12316 c12316, C21704 c21704, InterfaceC4249 interfaceC4249, C24868 c24868) throws IOException {
        int i = c21704.f68343;
        if (i < 1 || i > 999999999) {
            throw new IOException("Text length is invalid");
        }
        if (!c21704.f68346) {
            m37124(c12316, i, interfaceC4249, c24868);
            return;
        }
        int iMin = Math.min(i / 10, 4096);
        if (iMin <= 0) {
            m37124(c12316, i, interfaceC4249, c24868);
            return;
        }
        C18330 c18330 = new C18330(iMin + 1);
        boolean z = false;
        while (true) {
            int i2 = 0;
            while (true) {
                int iM28377 = c12316.m28377();
                if (iM28377 == -1) {
                    if (!z || i2 > 0 || c18330.m41765() > 0) {
                        c18330.m41766(interfaceC4249);
                        interfaceC4249.mo8628();
                        return;
                    }
                    return;
                }
                if (!((C9633) c24868.f79450).mo3924()) {
                    c18330.m41762(iM28377);
                    while (c18330.m41765() > iMin) {
                        c18330.m41764(interfaceC4249);
                        i2++;
                    }
                    if (c18330.m41765() + i2 == i) {
                        break;
                    } else {
                        z = true;
                    }
                } else {
                    throw new C13657();
                }
            }
            int iM41761 = c18330.m41761();
            if (iM41761 != -1) {
                c18330.m41763(iM41761 + 1, interfaceC4249);
                interfaceC4249.mo8628();
            } else {
                c18330.m41766(interfaceC4249);
                interfaceC4249.mo8628();
            }
            z = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37124(C12316 c12316, int i, InterfaceC4249 interfaceC4249, C24868 c24868) throws IOException {
        boolean z = false;
        while (true) {
            int i2 = 0;
            do {
                int iM28377 = c12316.m28377();
                if (iM28377 == -1) {
                    if (!z || i2 > 0) {
                        interfaceC4249.mo8628();
                        return;
                    }
                    return;
                }
                if (!((C9633) c24868.f79450).mo3924()) {
                    interfaceC4249.mo8630(iM28377);
                    i2++;
                    z = true;
                } else {
                    throw new C13657();
                }
            } while (i2 != i);
            interfaceC4249.mo8628();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m37127(C12316 c12316, C21704 c21704, InterfaceC4249 interfaceC4249, C24868 c24868) throws IOException {
        String strM37122 = m37122(c21704.f68353);
        StringBuilder sb = new StringBuilder(strM37122.length());
        boolean z = false;
        int i = 0;
        while (i < strM37122.length()) {
            char cCharAt = strM37122.charAt(i);
            if (cCharAt == '\r') {
                int i2 = i + 1;
                if (i2 < strM37122.length() && strM37122.charAt(i2) == '\n') {
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
        C19001 c19001 = new C19001(interfaceC4249, c21704);
        C19672 c19672 = new C19672(string, c19001);
        while (true) {
            int iM28376 = c12316.m28376();
            if (iM28376 == -1) {
                c19672.m44681();
                if (!z) {
                    interfaceC4249.mo8628();
                    return;
                } else {
                    c19001.m43142();
                    return;
                }
            }
            if (!((C9633) c24868.f79450).mo3924()) {
                c19672.m44682((char) iM28376);
                z = true;
            } else {
                throw new C13657();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m37122(String str) {
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
