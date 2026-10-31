package l;

import com.umeng.analytics.pro.bo;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.۬֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F411 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12780 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31089(int i, int i2, byte[] bArr) {
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
                i6 = ((b & bo.j) << 6) | (bArr[i5] & 63);
            } else {
                i = i5;
            }
            cArr[i4] = (char) i6;
            i4++;
        }
        return new String(cArr, 0, i4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31087(byte[] bArr, int i, int i2, char[] cArr) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31090(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(m31088(str.charAt(i)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31088(char c) {
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC10370 m31093(AbstractC10370 abstractC10370) {
        return (abstractC10370.m26170((byte) 46) + 1 == 0 && abstractC10370.mo2759() == abstractC10370.length()) ? abstractC10370 : abstractC10370.m26172(abstractC10370.m26170((byte) 46) + 1, abstractC10370.mo2759());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C2609 m31092(AbstractC10370 abstractC10370) {
        C2609 c2609M8239 = C2609.m8239();
        while (true) {
            int iM26170 = abstractC10370.m26170((byte) 36);
            if (iM26170 <= 0) {
                return c2609M8239;
            }
            abstractC10370 = abstractC10370.m26172(0, iM26170);
            c2609M8239.getClass();
            c2609M8239 = new C2609(abstractC10370, c2609M8239);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m31091(AbstractC10370 abstractC10370) {
        C2609 c2609M8239 = C2609.m8239();
        String string = abstractC10370.toString();
        int iIndexOf = -1;
        while (true) {
            iIndexOf = string.indexOf(46, iIndexOf + 1);
            if (iIndexOf <= 0) {
                return c2609M8239.m8250();
            }
            int i = iIndexOf + 1;
            String strSubstring = string.substring(0, i);
            String strReplace = string.substring(i).replace('.', '$');
            C6136 c6136 = abstractC10370.f31203.f37517;
            AbstractC10370 abstractC10370M30652 = c6136.f18880.m30652(C16014.m37867(strSubstring, strReplace));
            c2609M8239.getClass();
            c2609M8239 = new C2609(abstractC10370M30652, c2609M8239);
        }
    }
}
