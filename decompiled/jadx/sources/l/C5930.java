package l;

import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۛ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6LM */
/* JADX INFO: loaded from: classes2.dex */
public final class C5930 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10164 m16613(InputStream inputStream, InterfaceC12985 interfaceC12985) throws IOException {
        EnumC12280 enumC12280;
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
        if (m16614(i2, 0, "\u0089PNG\r\n\u001a\n", bArr) || ((i2 >= 3 && bArr[0] == -1 && bArr[1] == -40 && bArr[2] == -1) || m16614(i2, 0, "BM", bArr) || m16614(i2, 0, "\u0000\u0000\u0001\u0000", bArr))) {
            enumC12280 = EnumC12280.BITMAP;
        } else if (m16614(i2, 0, "GIF87a", bArr) || m16614(i2, 0, "GIF89a", bArr)) {
            enumC12280 = EnumC12280.GIF;
        } else if (m16614(i2, 0, "RIFF", bArr) && m16614(i2, 8, "WEBP", bArr)) {
            enumC12280 = (i2 < 30 || !m16614(i2, 12, "VP8X", bArr) || (bArr[20] & 2) == 0) ? EnumC12280.BITMAP : EnumC12280.ANIMATED_WEBP;
        } else {
            enumC12280 = null;
        }
        if (enumC12280 != null) {
            return new C10164(enumC12280, null);
        }
        BitmapFactory.Options options = interfaceC12985.read();
        if (options.outWidth > 0 && options.outHeight > 0) {
            return new C10164(EnumC12280.BITMAP, options);
        }
        if (i2 >= 2 && bArr[0] == -1 && bArr[1] == -2) {
            str = new String(bArr, 2, i2 - 2, StandardCharsets.UTF_16LE);
        } else if (i2 >= 2 && bArr[0] == -2 && bArr[1] == -1) {
            str = new String(bArr, 2, i2 - 2, StandardCharsets.UTF_16BE);
        } else if (m16614(i2, 0, "<\u0000?\u0000", bArr)) {
            str = new String(bArr, 0, i2, StandardCharsets.UTF_16LE);
        } else if (m16614(i2, 0, "\u0000<\u0000?", bArr)) {
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
            return new C10164(EnumC12280.SVG, null);
        }
        return (i2 < 18 || !C13630.m32770(bArr)) ? new C10164(EnumC12280.UNKNOWN, options) : new C10164(EnumC12280.TGA, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m16614(int i, int i2, String str, byte[] bArr) {
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
