package p067l;

import com.umeng.analytics.pro.C0684bo;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.۬֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F411 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14514 {
    /* JADX INFO: renamed from: ֫ */
    public static String m33173(int i, int i2, byte[] bArr) {
        char[] cArr = new char[i2];
        int i3 = i2 + i;
        int i4 = 0;
        while (i < i3) {
            int i5 = i + 1;
            byte b = bArr[i];
            int i6 = b & 255;
            if (i6 >= 224) {
                int i7 = i + 2;
                i += 3;
                i6 = ((bArr[i5] & 63) << 6) | ((b & 15) << 12) | (bArr[i7] & 63);
            } else if (i6 >= 192) {
                i += 2;
                i6 = ((b & C0684bo.f2505j) << 6) | (bArr[i5] & 63);
            } else {
                i = i5;
            }
            cArr[i4] = (char) i6;
            i4++;
        }
        return new String(cArr, 0, i4);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m33171(byte[] bArr, int i, int i2, char[] cArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i3];
            if (1 <= c && c <= 127) {
                bArr[i] = (byte) c;
                i++;
            } else if (c <= 2047) {
                int i4 = i + 1;
                bArr[i] = (byte) ((c >> 6) | 192);
                i += 2;
                bArr[i4] = (byte) ((c & '?') | 128);
            } else {
                bArr[i] = (byte) ((c >> '\f') | BERTags.FLAGS);
                int i5 = i + 2;
                bArr[i + 1] = (byte) (((c >> 6) & 63) | 128);
                i += 3;
                bArr[i5] = (byte) ((c & '?') | 128);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m33174(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(m33172(str.charAt(i)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m33172(char c) {
        if (c == '\f') {
            return "\\f";
        }
        if (c == '\r') {
            return "\\r";
        }
        if (c == '\"') {
            return "\\\"";
        }
        if (c == '\'') {
            return "\\'";
        }
        if (c == '\\') {
            return "\\\\";
        }
        switch (c) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            default:
                return (c < ' ' || c > '~') ? String.format("\\u%04x", Integer.valueOf(c)) : String.valueOf(c);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC12224 m33177(AbstractC12224 abstractC12224) {
        return (abstractC12224.m28199((byte) 46) + 1 == 0 && abstractC12224.mo5098() == abstractC12224.length()) ? abstractC12224 : abstractC12224.m28201(abstractC12224.m28199((byte) 46) + 1, abstractC12224.mo5098());
    }

    /* JADX INFO: renamed from: ۧ */
    public static C4848 m33176(AbstractC12224 abstractC12224) {
        C4848 c4848M10283 = C4848.m10283();
        while (true) {
            int iM28199 = abstractC12224.m28199((byte) 36);
            if (iM28199 <= 0) {
                return c4848M10283;
            }
            abstractC12224 = abstractC12224.m28201(0, iM28199);
            c4848M10283.getClass();
            c4848M10283 = new C4848(abstractC12224, c4848M10283);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4848 m33175(AbstractC12224 abstractC12224) {
        C4848 c4848M10283 = C4848.m10283();
        String string = abstractC12224.toString();
        int iIndexOf = -1;
        while (true) {
            iIndexOf = string.indexOf(46, iIndexOf + 1);
            if (iIndexOf <= 0) {
                return c4848M10283.m10294();
            }
            int i = iIndexOf + 1;
            String strSubstring = string.substring(0, i);
            String strReplace = string.substring(i).replace('.', '$');
            C8200 c8200 = abstractC12224.f34165.f40540;
            AbstractC12224 abstractC12224M32717 = c8200.f21738.m32717(C17588.m40053(strSubstring, strReplace));
            c4848M10283.getClass();
            c4848M10283 = new C4848(abstractC12224M32717, c4848M10283);
        }
    }
}
