package p067l;

import com.thegrizzlylabs.sardineandroid.model.ErrorMessage;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܽ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9A7H */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18395 implements InterfaceC13032 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m41868(char c) {
        if ('0' <= c && c <= '9') {
            return true;
        }
        if ('a' > c || c > 'f') {
            return 'A' <= c && c <= 'F';
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m41869(C20066 c20066) throws IOException {
        ErrorMessage errorMessage;
        if (c20066.m45439()) {
            return;
        }
        byte[] bArr = null;
        try {
            errorMessage = (ErrorMessage) C16383.m37192(ErrorMessage.class, c20066.m45436().m4011());
        } catch (Exception unused) {
            errorMessage = null;
        }
        if (errorMessage != null) {
            throw new IOException(errorMessage.getException() + ": " + errorMessage.getMessage());
        }
        StringBuilder sb = new StringBuilder("Error contacting ");
        String string = c20066.m45434().m24591().toString();
        Charset charset = StandardCharsets.UTF_8;
        int length = string.length();
        StringBuilder sb2 = new StringBuilder(length > 500 ? length / 2 : length);
        int i = 0;
        boolean z = false;
        while (i < length) {
            char cCharAt = string.charAt(i);
            if (cCharAt == '%') {
                if (bArr == null) {
                    try {
                        bArr = new byte[(length - i) / 3];
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern - " + e.getMessage());
                    }
                }
                int i2 = 0;
                while (true) {
                    int i3 = i + 2;
                    if (i3 >= length || cCharAt != '%') {
                        break;
                    }
                    int i4 = i + 1;
                    if (!m41868(string.charAt(i4)) || !m41868(string.charAt(i3))) {
                        throw new IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern : " + string.substring(i, i + 3));
                    }
                    int i5 = i + 3;
                    int i6 = Integer.parseInt(string.substring(i4, i5), 16);
                    if (i6 < 0) {
                        throw new IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern - negative value : " + string.substring(i, i5));
                    }
                    int i7 = i2 + 1;
                    bArr[i2] = (byte) i6;
                    if (i5 < length) {
                        cCharAt = string.charAt(i5);
                    }
                    i2 = i7;
                    i = i5;
                }
                if (i < length && cCharAt == '%') {
                    throw new IllegalArgumentException("URLDecoder: Incomplete trailing escape (%) pattern");
                }
                sb2.append(new String(bArr, 0, i2, charset));
                z = true;
            } else {
                sb2.append(cCharAt);
                i++;
            }
        }
        if (z) {
            string = sb2.toString();
        }
        sb.append(string);
        throw new C13762(sb.toString(), c20066.m45443(), c20066.m45437());
    }
}
