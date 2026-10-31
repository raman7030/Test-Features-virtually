package l;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3YK */
/* JADX INFO: loaded from: classes3.dex */
public final class C13573 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32615(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m32621(String str) {
        if ((str.length() & 1) != 0) {
            throw new IllegalArgumentException("Hex input must contain an even number of digits");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iM32615 = m32615(str.charAt(i2));
            int iM32616 = m32615(str.charAt(i2 + 1));
            if (iM32615 < 0 || iM32616 < 0) {
                throw new IllegalArgumentException("Hex input contains a non-hexadecimal digit");
            }
            bArr[i] = (byte) (iM32616 | (iM32615 << 4));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m32618(byte[] bArr) {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            cArr[i2] = charArray[(b & 255) >>> 4];
            cArr[i2 + 1] = charArray[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m32625(String str) {
        if (str == null) {
            return "null";
        }
        int length = str.length();
        if (length == 0) {
            return "\"\"";
        }
        int i = 0;
        char c = '/';
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (c == '/') {
                if (!Character.isJavaIdentifierStart(cCharAt) && cCharAt != '-') {
                    return C4860.m14172("\"", str, "\"");
                }
                i++;
                c = cCharAt;
            } else {
                if (cCharAt != '/' && !Character.isJavaIdentifierPart(cCharAt) && cCharAt != '-') {
                    return C4860.m14172("\"", str, "\"");
                }
                i++;
                c = cCharAt;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m32622(int i) {
        return new int[(i + 31) >> 5];
    }

    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m32619(byte[] bArr, boolean z) {
        int iMin;
        int i = 3;
        if (!z) {
            iMin = bArr.length;
        } else {
            iMin = Math.min(bArr.length, 10485760);
            int iM35148 = C14776.m35148(Math.min(bArr.length, 32768), bArr);
            int i2 = 1;
            if (iM35148 == C14776.f45134 || iM35148 == C14776.f45120) {
                if (iMin > 0) {
                    int i3 = iMin - 1;
                    while (i3 >= 0 && (bArr[i3] & 192) == 128) {
                        i3--;
                    }
                    if (i3 < 0) {
                        iMin = 0;
                    } else {
                        int i4 = bArr[i3] & 255;
                        if (i4 >= 128) {
                            if (i4 >= 194 && i4 <= 223) {
                                i2 = 2;
                            } else if (i4 >= 224 && i4 <= 239) {
                                i2 = 3;
                            } else if (i4 >= 240 && i4 <= 244) {
                                i2 = 4;
                            }
                        }
                        if (i2 + i3 > iMin) {
                            iMin = i3;
                        }
                    }
                }
            } else if (iM35148 == C14776.f45129) {
                iMin = m32617(bArr, iMin, false);
            } else if (iM35148 == C14776.f45122) {
                iMin = m32617(bArr, iMin, true);
            } else if (iM35148 == C14776.f45123 || iM35148 == C14776.f45133) {
                int iM32616 = iMin - m32616(iMin, bArr);
                if (iM32616 > 0) {
                    iMin -= iM32616 % 4;
                }
            } else if (iM35148 != -1) {
                Charset charsetM35151 = C14776.m35151(iM35148);
                int iMax = Math.max(0, iMin - 16);
                for (int i5 = iMin; i5 >= iMax; i5--) {
                    try {
                        CharsetDecoder charsetDecoderNewDecoder = charsetM35151.newDecoder();
                        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                        charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, 0, i5));
                        iMin = i5;
                        break;
                    } catch (CharacterCodingException unused) {
                    }
                }
            }
        }
        int i6 = C14776.f45134;
        int iM35149 = C14776.m35148(Math.min(iMin, 32768), bArr);
        if (iM35149 == -1) {
            return null;
        }
        if (iM35149 == C14776.f45134 || iM35149 == C14776.f45120) {
            if (C11250.m27837(iMin, bArr)) {
                iMin -= 3;
            } else {
                i = 0;
            }
        } else if (iM35149 == C14776.f45129) {
            if (C11250.m27830(iMin, bArr)) {
                iMin -= 2;
                i = 2;
            } else {
                i = 0;
            }
        } else {
            if (iM35149 == C14776.f45122) {
                if (C11250.m27834(iMin, bArr)) {
                    iMin -= 2;
                    i = 2;
                }
            } else if (iM35149 != C14776.f45123 ? !(iM35149 != C14776.f45133 || !C11250.m27838(iMin, bArr)) : C11250.m27836(iMin, bArr)) {
                iMin -= 4;
                i = 4;
            }
            i = 0;
        }
        return new String(bArr, i, iMin, C14776.m35151(iM35149));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m32626(int i, int[] iArr) {
        return ((1 << (i & 31)) & iArr[i >> 5]) != 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m32627(int i, int[] iArr) {
        int i2 = i >> 5;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32620(int i, int[] iArr) {
        int i2 = i >> 5;
        iArr[i2] = (~(1 << (i & 31))) & iArr[i2];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32617(byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        int iM32616 = i - m32616(i, bArr);
        if (iM32616 > 0) {
            i -= iM32616 % 2;
        }
        if (i - m32616(i, bArr) >= 2) {
            int i4 = i - 2;
            if (z) {
                i2 = bArr[i4] & 255;
                i3 = (bArr[i - 1] & 255) << 8;
            } else {
                i2 = (bArr[i4] & 255) << 8;
                i3 = bArr[i - 1] & 255;
            }
            int i5 = i3 | i2;
            if (i5 >= 55296 && i5 <= 56319) {
                return i4;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32616(int i, byte[] bArr) {
        int i2;
        if ((i >= 4 && bArr[0] == 0 && bArr[1] == 0 && (bArr[2] & 255) == 254 && (bArr[3] & 255) == 255) || (i >= 4 && (bArr[0] & 255) == 255 && (bArr[1] & 255) == 254 && bArr[2] == 0 && bArr[3] == 0)) {
            return 4;
        }
        if (i >= 3 && (bArr[0] & 255) == 239 && (bArr[1] & 255) == 187 && (bArr[2] & 255) == 191) {
            return 3;
        }
        return (i < 2 || !(((i2 = bArr[0] & 255) == 254 && (bArr[1] & 255) == 255) || (i2 == 255 && (bArr[1] & 255) == 254))) ? 0 : 2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m32623(int i, int[] iArr) {
        int length = iArr.length;
        int i2 = i & 31;
        int i3 = i >> 5;
        while (true) {
            if (i3 >= length) {
                return -1;
            }
            int i4 = iArr[i3];
            if (i4 != 0) {
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros((~((1 << i2) - 1)) & i4);
                int i5 = iNumberOfTrailingZeros != 32 ? iNumberOfTrailingZeros : -1;
                if (i5 >= 0) {
                    return (i3 << 5) + i5;
                }
            }
            i3++;
            i2 = 0;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m32624(String str) {
        C10147 c10147 = C9280.f28115;
        Set<InterfaceC7324> setM16571 = AbstractC5913.m16571();
        HashSet hashSet = new HashSet();
        for (InterfaceC7324 interfaceC7324 : setM16571) {
            if (interfaceC7324.mo16572().equals(str)) {
                hashSet.add(interfaceC7324);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((InterfaceC7324) it.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }
}
