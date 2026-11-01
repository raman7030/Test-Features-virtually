package p067l;

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
public final class C15268 {
    /* JADX INFO: renamed from: ֫ */
    public static int m34727(char c) {
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

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m34733(String str) {
        if ((str.length() & 1) != 0) {
            throw new IllegalArgumentException("Hex input must contain an even number of digits");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iM34727 = m34727(str.charAt(i2));
            int iM34728 = m34727(str.charAt(i2 + 1));
            if (iM34727 < 0 || iM34728 < 0) {
                throw new IllegalArgumentException("Hex input contains a non-hexadecimal digit");
            }
            bArr[i] = (byte) (iM34728 | (iM34727 << 4));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m34730(byte[] bArr) {
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

    /* JADX INFO: renamed from: ܽ */
    public static String m34737(String str) {
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
                    return C6988.m16053("\"", str, "\"");
                }
                i++;
                c = cCharAt;
            } else {
                if (cCharAt != '/' && !Character.isJavaIdentifierPart(cCharAt) && cCharAt != '-') {
                    return C6988.m16053("\"", str, "\"");
                }
                i++;
                c = cCharAt;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int[] m34734(int i) {
        return new int[(i + 31) >> 5];
    }

    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX INFO: renamed from: ֫ */
    public static String m34731(byte[] bArr, boolean z) {
        int iMin;
        int i = 3;
        if (!z) {
            iMin = bArr.length;
        } else {
            iMin = Math.min(bArr.length, 10485760);
            int iM37295 = C16412.m37295(Math.min(bArr.length, 32768), bArr);
            int i2 = 1;
            if (iM37295 == C16412.f48248 || iM37295 == C16412.f48234) {
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
            } else if (iM37295 == C16412.f48243) {
                iMin = m34729(bArr, iMin, false);
            } else if (iM37295 == C16412.f48236) {
                iMin = m34729(bArr, iMin, true);
            } else if (iM37295 == C16412.f48237 || iM37295 == C16412.f48247) {
                int iM34728 = iMin - m34728(iMin, bArr);
                if (iM34728 > 0) {
                    iMin -= iM34728 % 4;
                }
            } else if (iM37295 != -1) {
                Charset charsetM37298 = C16412.m37298(iM37295);
                int iMax = Math.max(0, iMin - 16);
                for (int i5 = iMin; i5 >= iMax; i5--) {
                    try {
                        CharsetDecoder charsetDecoderNewDecoder = charsetM37298.newDecoder();
                        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                        charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, 0, i5));
                        iMin = i5;
                        break;
                    } catch (CharacterCodingException unused) {
                    }
                }
            }
        }
        int i6 = C16412.f48248;
        int iM37296 = C16412.m37295(Math.min(iMin, 32768), bArr);
        if (iM37296 == -1) {
            return null;
        }
        if (iM37296 == C16412.f48248 || iM37296 == C16412.f48234) {
            if (C13061.m29899(iMin, bArr)) {
                iMin -= 3;
            } else {
                i = 0;
            }
        } else if (iM37296 == C16412.f48243) {
            if (C13061.m29892(iMin, bArr)) {
                iMin -= 2;
                i = 2;
            } else {
                i = 0;
            }
        } else {
            if (iM37296 == C16412.f48236) {
                if (C13061.m29896(iMin, bArr)) {
                    iMin -= 2;
                    i = 2;
                }
            } else if (iM37296 != C16412.f48237 ? !(iM37296 != C16412.f48247 || !C13061.m29900(iMin, bArr)) : C13061.m29898(iMin, bArr)) {
                iMin -= 4;
                i = 4;
            }
            i = 0;
        }
        return new String(bArr, i, iMin, C16412.m37298(iM37296));
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m34738(int i, int[] iArr) {
        return ((1 << (i & 31)) & iArr[i >> 5]) != 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m34739(int i, int[] iArr) {
        int i2 = i >> 5;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34732(int i, int[] iArr) {
        int i2 = i >> 5;
        iArr[i2] = (~(1 << (i & 31))) & iArr[i2];
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m34729(byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        int iM34728 = i - m34728(i, bArr);
        if (iM34728 > 0) {
            i -= iM34728 % 2;
        }
        if (i - m34728(i, bArr) >= 2) {
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

    /* JADX INFO: renamed from: ֫ */
    public static int m34728(int i, byte[] bArr) {
        int i2;
        if ((i >= 4 && bArr[0] == 0 && bArr[1] == 0 && (bArr[2] & 255) == 254 && (bArr[3] & 255) == 255) || (i >= 4 && (bArr[0] & 255) == 255 && (bArr[1] & 255) == 254 && bArr[2] == 0 && bArr[3] == 0)) {
            return 4;
        }
        if (i >= 3 && (bArr[0] & 255) == 239 && (bArr[1] & 255) == 187 && (bArr[2] & 255) == 191) {
            return 3;
        }
        return (i < 2 || !(((i2 = bArr[0] & 255) == 254 && (bArr[1] & 255) == 255) || (i2 == 255 && (bArr[1] & 255) == 254))) ? 0 : 2;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m34735(int i, int[] iArr) {
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

    /* JADX INFO: renamed from: ۧ */
    public static boolean m34736(String str) {
        C12012 c12012 = C11188.f31063;
        Set<InterfaceC9329> setM18497 = AbstractC7988.m18497();
        HashSet hashSet = new HashSet();
        for (InterfaceC9329 interfaceC9329 : setM18497) {
            if (interfaceC9329.mo18498().equals(str)) {
                hashSet.add(interfaceC9329);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((InterfaceC9329) it.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }
}
