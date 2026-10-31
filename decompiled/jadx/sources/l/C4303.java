package l;

import com.umeng.analytics.pro.bo;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ۙ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 39TA */
/* JADX INFO: loaded from: classes2.dex */
public final class C4303 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static char[] f13880;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized String m12893(String str) {
        CRC32 crc32;
        crc32 = new CRC32();
        crc32.update(str.getBytes(StandardCharsets.UTF_8));
        return Long.toHexString(crc32.getValue());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m12894(Iterator it, String str) {
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static byte[] m12899(String str) {
        int length = str.length();
        byte[] bArr = new byte[length * 3];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != 0 && cCharAt < 128) {
                bArr[i] = (byte) cCharAt;
                i++;
            } else if (cCharAt < 2048) {
                bArr[i] = (byte) (((cCharAt >> 6) & 31) | 192);
                bArr[i + 1] = (byte) ((cCharAt & '?') | 128);
                i += 2;
            } else {
                bArr[i] = (byte) (((cCharAt >> '\f') & 15) | BERTags.FLAGS);
                bArr[i + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                bArr[i + 2] = (byte) ((cCharAt & '?') | 128);
                i += 3;
            }
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m12892(int i, int i2, byte[] bArr) {
        char c;
        char[] cArr = f13880;
        if (cArr == null || cArr.length < i2) {
            f13880 = new char[i2];
        }
        char[] cArr2 = f13880;
        int i3 = 0;
        while (i2 > 0) {
            byte b = bArr[i];
            int i4 = b & 255;
            switch (i4 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    i2--;
                    if (i4 == 0) {
                        m12895(i4, i);
                        throw null;
                    }
                    c = (char) i4;
                    i++;
                    break;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    m12895(i4, i);
                    throw null;
                case 12:
                case 13:
                    i2 -= 2;
                    if (i2 < 0) {
                        m12895(i4, i);
                        throw null;
                    }
                    int i5 = i + 1;
                    byte b2 = bArr[i5];
                    int i6 = b2 & 255;
                    if ((b2 & 192) != 128) {
                        m12895(i6, i5);
                        throw null;
                    }
                    int i7 = ((b & bo.j) << 6) | (b2 & 63);
                    if (i7 != 0 && i7 < 128) {
                        m12895(i6, i5);
                        throw null;
                    }
                    c = (char) i7;
                    i += 2;
                    break;
                    break;
                case 14:
                    i2 -= 3;
                    if (i2 < 0) {
                        m12895(i4, i);
                        throw null;
                    }
                    int i8 = i + 1;
                    byte b3 = bArr[i8];
                    int i9 = b3 & 255;
                    int i10 = b3 & 192;
                    if (i10 != 128) {
                        m12895(i9, i8);
                        throw null;
                    }
                    int i11 = i + 2;
                    byte b4 = bArr[i11];
                    int i12 = b4 & 255;
                    if (i10 != 128) {
                        m12895(i12, i11);
                        throw null;
                    }
                    int i13 = ((b & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                    if (i13 < 2048) {
                        m12895(i12, i11);
                        throw null;
                    }
                    c = (char) i13;
                    i += 3;
                    break;
                    break;
            }
            cArr2[i3] = c;
            i3++;
        }
        return new String(cArr2, 0, i3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12896(List list, C19826 c19826) {
        int iM45601 = c19826.m45601();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C19826) it.next()).m45601() == iM45601) {
                it.remove();
            }
        }
        list.add(c19826);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12895(int i, int i2) {
        StringBuilder sb = new StringBuilder("bad utf-8 byte ");
        sb.append(C7746.m20771(i));
        sb.append(" at offset ");
        char[] cArr = new char[8];
        for (int i3 = 0; i3 < 8; i3++) {
            cArr[7 - i3] = Character.forDigit(i2 & 15, 16);
            i2 >>= 4;
        }
        sb.append(new String(cArr));
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m12898(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder((length * 3) / 2);
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= ' ' && cCharAt < 127) {
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                    sb.append('\\');
                }
                sb.append(cCharAt);
            } else if (cCharAt > 127) {
                sb.append(cCharAt);
            } else if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m12897(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\\') {
                sb.append(cCharAt);
            } else {
                if (i >= length - 1) {
                    throw new IllegalArgumentException("escape Sequence error: " + cCharAt);
                }
                int i2 = i + 1;
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 == '\"') {
                    sb.append('\"');
                } else if (cCharAt2 == '\'') {
                    sb.append('\'');
                } else if (cCharAt2 == '\\') {
                    sb.append('\\');
                } else if (cCharAt2 == 'b') {
                    sb.append('\b');
                } else if (cCharAt2 == 'n') {
                    sb.append('\n');
                } else if (cCharAt2 == 'r') {
                    sb.append('\r');
                } else if (cCharAt2 == 't') {
                    sb.append('\t');
                } else {
                    if (cCharAt2 != 'u') {
                        throw new IllegalArgumentException(C20087.m46305(i, str, new StringBuilder("escape Sequence error: ")));
                    }
                    int i3 = i + 2;
                    if (i3 > length - 4) {
                        throw new IllegalArgumentException(C20087.m46305(i, str, new StringBuilder("unicode error: ")));
                    }
                    int i4 = i + 4;
                    int iM12891 = (m12891(str.charAt(i3)) << 12) | (m12891(str.charAt(i + 3)) << 8);
                    i += 5;
                    sb.append((char) (iM12891 | (m12891(str.charAt(i4)) << 4) | m12891(str.charAt(i))));
                }
                i = i2;
            }
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m12891(char c) {
        int iDigit = Character.digit(c, 16);
        if (iDigit >= 0 && iDigit <= 15) {
            return iDigit;
        }
        throw new IllegalArgumentException("illegal not hex character: " + c);
    }
}
