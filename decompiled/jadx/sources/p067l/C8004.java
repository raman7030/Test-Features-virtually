package p067l;

import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۛ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6LM */
/* JADX INFO: loaded from: classes2.dex */
public final class C8004 {
    /* JADX INFO: renamed from: ֫ */
    public static C12028 m18539(InputStream inputStream, InterfaceC14709 interfaceC14709) throws IOException {
        EnumC14039 enumC14039;
        String str;
        byte[] bArr = new byte[512];
        int i = 0;
        int i2 = 0;
        while (i2 < 512) {
            int i3 = inputStream.read(bArr, i2, 512 - i2);
            if (i3 < 0) {
                break;
            }
            if (i3 == 0) {
                int i4 = inputStream.read();
                if (i4 < 0) {
                    break;
                }
                bArr[i2] = (byte) i4;
                i2++;
            } else {
                i2 += i3;
            }
        }
        if (m18540(i2, 0, "\u0089PNG\r\n\u001a\n", bArr) || ((i2 >= 3 && bArr[0] == -1 && bArr[1] == -40 && bArr[2] == -1) || m18540(i2, 0, "BM", bArr) || m18540(i2, 0, "\u0000\u0000\u0001\u0000", bArr))) {
            enumC14039 = EnumC14039.BITMAP;
        } else if (m18540(i2, 0, "GIF87a", bArr) || m18540(i2, 0, "GIF89a", bArr)) {
            enumC14039 = EnumC14039.GIF;
        } else if (m18540(i2, 0, "RIFF", bArr) && m18540(i2, 8, "WEBP", bArr)) {
            enumC14039 = (i2 < 30 || !m18540(i2, 12, "VP8X", bArr) || (bArr[20] & 2) == 0) ? EnumC14039.BITMAP : EnumC14039.ANIMATED_WEBP;
        } else {
            enumC14039 = null;
        }
        if (enumC14039 != null) {
            return new C12028(enumC14039, null);
        }
        BitmapFactory.Options options = interfaceC14709.read();
        if (options.outWidth > 0 && options.outHeight > 0) {
            return new C12028(EnumC14039.BITMAP, options);
        }
        if (i2 >= 2 && bArr[0] == -1 && bArr[1] == -2) {
            str = new String(bArr, 2, i2 - 2, StandardCharsets.UTF_16LE);
        } else if (i2 >= 2 && bArr[0] == -2 && bArr[1] == -1) {
            str = new String(bArr, 2, i2 - 2, StandardCharsets.UTF_16BE);
        } else if (m18540(i2, 0, "<\u0000?\u0000", bArr)) {
            str = new String(bArr, 0, i2, StandardCharsets.UTF_16LE);
        } else if (m18540(i2, 0, "\u0000<\u0000?", bArr)) {
            str = new String(bArr, 0, i2, StandardCharsets.UTF_16BE);
        } else {
            str = new String(bArr, 0, i2, StandardCharsets.UTF_8);
        }
        if (str.startsWith("\ufeff")) {
            str = str.substring(1);
        }
        while (i < str.length() && (str.charAt(i) == ' ' || str.charAt(i) == '\t' || str.charAt(i) == '\r' || str.charAt(i) == '\n')) {
            i++;
        }
        int i5 = i + 1;
        if ((i5 < str.length() && str.charAt(i) == '<' && (Character.isLetter(str.charAt(i5)) || str.charAt(i5) == '_' || str.charAt(i5) == ':' || str.charAt(i5) == '?' || str.charAt(i5) == '!')) || (i2 == 512 && i == str.length())) {
            return new C12028(EnumC14039.SVG, null);
        }
        return (i2 < 18 || !C15322.m34885(bArr)) ? new C12028(EnumC14039.UNKNOWN, options) : new C12028(EnumC14039.TGA, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m18540(int i, int i2, String str, byte[] bArr) {
        if (i - i2 >= str.length()) {
            for (int i3 = 0; i3 < str.length(); i3++) {
                if ((bArr[i2 + i3] & 255) == str.charAt(i3)) {
                }
            }
            return true;
        }
        return false;
    }
}
