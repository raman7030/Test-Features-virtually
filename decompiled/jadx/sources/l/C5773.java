package l;

import com.umeng.analytics.pro.bo;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ۛۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2APZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5773 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C0225 f17747 = new C0225(C17615.f53826);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m16240(int i) {
        return (i & 192) != 128;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m16241(int i, int i2) {
        if (i != 240 || (i2 >= 144 && i2 <= 191)) {
            return (i == 244 && (i2 & 240) != 128) || (i2 & 192) != 128;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m16242(int i, int i2, int i3) {
        return ((i != -32 || (i2 & BERTags.FLAGS) != 128) && (i2 & 192) == 128 && (i3 & 192) == 128) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16237(StringBuilder sb, byte[] bArr, int i, int i2) {
        int iM16232;
        int i3 = i2 + i;
        while (i < i3) {
            int i4 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                sb.append((char) b);
            } else if ((b >> 5) != -2 || (b & 30) == 0) {
                if ((b >> 4) == -2) {
                    int i5 = i + 2;
                    if (i5 < i3) {
                        byte b2 = bArr[i4];
                        int i6 = i + 3;
                        byte b3 = bArr[i5];
                        if (m16242(b, b2, b3)) {
                            sb.append((char) 65533);
                            iM16232 = m16232(i, 3, bArr);
                            i += iM16232;
                        } else {
                            sb.append((char) (((b << 12) ^ (b2 << 6)) ^ ((-123008) ^ b3)));
                            i = i6;
                        }
                    } else {
                        if (i4 < i3) {
                            byte b4 = bArr[i4];
                            if ((b == -32 && (b4 & bo.k) == 128) || (b4 & 192) != 128) {
                                sb.append((char) 65533);
                            }
                        }
                        sb.append((char) 65533);
                        return;
                    }
                } else if ((b >> 3) == -2) {
                    int i7 = i + 3;
                    if (i7 < i3) {
                        byte b5 = bArr[i4];
                        byte b6 = bArr[i + 2];
                        int i8 = i + 4;
                        byte b7 = bArr[i7];
                        int i9 = (((b << 18) ^ (b5 << 12)) ^ (b6 << 6)) ^ (3678080 ^ b7);
                        if ((b5 & 192) != 128 || (b6 & 192) != 128 || (b7 & 192) != 128 || !Character.isSupplementaryCodePoint(i9)) {
                            sb.append((char) 65533);
                            iM16232 = m16232(i, 4, bArr);
                            i += iM16232;
                        } else {
                            int i10 = C2164.f7153;
                            sb.append((char) ((i9 >>> 10) + 55232));
                            sb.append((char) ((i9 & 1023) + 56320));
                            i = i8;
                        }
                    } else {
                        int i11 = b & 255;
                        if (i11 > 244 || (i4 < i3 && m16241(i11, bArr[i4] & 255))) {
                            sb.append((char) 65533);
                        } else {
                            i += 2;
                            sb.append((char) 65533);
                            if (i >= i3 || (bArr[i] & 192) == 128) {
                                return;
                            }
                        }
                    }
                } else {
                    sb.append((char) 65533);
                }
            } else if (i4 < i3) {
                i += 2;
                byte b8 = bArr[i4];
                if (m16240(b8)) {
                    sb.append((char) 65533);
                } else {
                    sb.append((char) (((b << 6) ^ b8) ^ 3968));
                }
            } else {
                sb.append((char) 65533);
                return;
            }
            i = i4;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16239(byte[] bArr, int i, C22706 c22706) {
        int i2;
        int i3;
        int i4;
        int iM16232;
        C0225 c0225 = f17747;
        char[] cArr = (char[]) c0225.m1479();
        if (cArr == null) {
            cArr = new char[1024];
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 < i) {
                if (i6 >= 1020) {
                    c22706.write(cArr, 0, i6);
                    i6 = 0;
                }
                int i7 = i5 + 1;
                byte b = bArr[i5];
                if (b >= 0) {
                    i2 = i6 + 1;
                    cArr[i6] = (char) b;
                } else if ((b >> 5) != -2 || (b & 30) == 0) {
                    if ((b >> 4) == -2) {
                        int i8 = i5 + 2;
                        if (i8 < i) {
                            byte b2 = bArr[i7];
                            int i9 = i5 + 3;
                            byte b3 = bArr[i8];
                            if (m16242(b, b2, b3)) {
                                i4 = i6 + 1;
                                cArr[i6] = 65533;
                                iM16232 = m16232(i5, 3, bArr);
                                i5 += iM16232;
                                i6 = i4;
                            } else {
                                char c = (char) (((b << 12) ^ (b2 << 6)) ^ ((-123008) ^ b3));
                                int i10 = C2164.f7153;
                                if (c >= 55296 && c < 57344) {
                                    cArr[i6] = 65533;
                                    i6++;
                                } else {
                                    cArr[i6] = c;
                                    i6++;
                                }
                                i5 = i9;
                            }
                        } else {
                            if (i7 < i) {
                                byte b4 = bArr[i7];
                                if ((b == -32 && (b4 & bo.k) == 128) || (b4 & 192) != 128) {
                                    i2 = i6 + 1;
                                    cArr[i6] = 65533;
                                }
                            }
                            i3 = i6 + 1;
                            cArr[i6] = 65533;
                            i6 = i3;
                        }
                    } else if ((b >> 3) == -2) {
                        int i11 = i5 + 3;
                        if (i11 < i) {
                            byte b5 = bArr[i7];
                            byte b6 = bArr[i5 + 2];
                            int i12 = i5 + 4;
                            byte b7 = bArr[i11];
                            int i13 = (((b << 18) ^ (b5 << 12)) ^ (b6 << 6)) ^ (3678080 ^ b7);
                            if ((b5 & 192) != 128 || (b6 & 192) != 128 || (b7 & 192) != 128 || !Character.isSupplementaryCodePoint(i13)) {
                                i4 = i6 + 1;
                                cArr[i6] = 65533;
                                iM16232 = m16232(i5, 4, bArr);
                                i5 += iM16232;
                                i6 = i4;
                            } else {
                                int i14 = i6 + 1;
                                int i15 = C2164.f7153;
                                cArr[i6] = (char) ((i13 >>> 10) + 55232);
                                i6 += 2;
                                cArr[i14] = (char) ((i13 & 1023) + 56320);
                                i5 = i12;
                            }
                        } else {
                            int i16 = b & 255;
                            if (i16 > 244 || (i7 < i && m16241(i16, bArr[i7] & 255))) {
                                i2 = i6 + 1;
                                cArr[i6] = 65533;
                            } else {
                                i5 += 2;
                                i4 = i6 + 1;
                                cArr[i6] = 65533;
                                if (i5 >= i || (bArr[i5] & 192) == 128) {
                                    i6 = i4;
                                }
                                i6 = i4;
                            }
                        }
                    } else {
                        i2 = i6 + 1;
                        cArr[i6] = 65533;
                    }
                } else if (i7 < i) {
                    i5 += 2;
                    byte b8 = bArr[i7];
                    if (m16240(b8)) {
                        i2 = i6 + 1;
                        cArr[i6] = 65533;
                    } else {
                        i4 = i6 + 1;
                        cArr[i6] = (char) (((b << 6) ^ b8) ^ 3968);
                        i6 = i4;
                    }
                } else {
                    i3 = i6 + 1;
                    cArr[i6] = 65533;
                    i6 = i3;
                }
                i6 = i2;
                i5 = i7;
            }
            if (i6 > 0) {
                c22706.write(cArr, 0, i6);
            }
            c0225.m1477(cArr);
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16236(OutputStream outputStream, CharSequence charSequence) throws IOException {
        int codePoint;
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 128) {
                outputStream.write((byte) cCharAt);
            } else if (cCharAt < 2048) {
                outputStream.write(((cCharAt >> 6) & 31) | 192);
                outputStream.write((cCharAt & '?') | 128);
            } else {
                int i2 = C2164.f7153;
                if (cCharAt < 55296 || cCharAt >= 57344) {
                    outputStream.write(((cCharAt >> '\f') & 15) | BERTags.FLAGS);
                    outputStream.write(((cCharAt >> 6) & 63) | 128);
                    outputStream.write((cCharAt & '?') | 128);
                } else {
                    int i3 = i + 1;
                    if (i3 < length) {
                        char cCharAt2 = charSequence.charAt(i3);
                        if (Character.isHighSurrogate(cCharAt) && Character.isLowSurrogate(cCharAt2)) {
                            codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                        } else {
                            codePoint = -1;
                        }
                    } else {
                        codePoint = -1;
                    }
                    if (codePoint >= 0) {
                        outputStream.write((codePoint >> 18) | 240);
                        outputStream.write(((codePoint >> 12) & 63) | 128);
                        outputStream.write(((codePoint >> 6) & 63) | 128);
                        outputStream.write((codePoint & 63) | 128);
                        i = i3;
                    } else {
                        outputStream.write(63);
                    }
                }
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16238(InterfaceC2077 interfaceC2077, CharSequence charSequence, boolean z) {
        int codePoint;
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 128) {
                interfaceC2077.writeByte((byte) cCharAt);
            } else if (cCharAt < 2048) {
                interfaceC2077.writeByte(((cCharAt >> 6) & 31) | 192);
                interfaceC2077.writeByte((cCharAt & '?') | 128);
            } else {
                int i2 = C2164.f7153;
                if (cCharAt < 55296 || cCharAt >= 57344) {
                    interfaceC2077.writeByte(((cCharAt >> '\f') & 15) | BERTags.FLAGS);
                    interfaceC2077.writeByte(((cCharAt >> 6) & 63) | 128);
                    interfaceC2077.writeByte((cCharAt & '?') | 128);
                } else {
                    int i3 = i + 1;
                    if (i3 < length) {
                        char cCharAt2 = charSequence.charAt(i3);
                        if (Character.isHighSurrogate(cCharAt) && Character.isLowSurrogate(cCharAt2)) {
                            codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                        } else {
                            codePoint = -1;
                        }
                    } else {
                        codePoint = -1;
                    }
                    if (codePoint >= 0) {
                        interfaceC2077.writeByte((codePoint >> 18) | 240);
                        interfaceC2077.writeByte(((codePoint >> 12) & 63) | 128);
                        interfaceC2077.writeByte(((codePoint >> 6) & 63) | 128);
                        interfaceC2077.writeByte((codePoint & 63) | 128);
                        i = i3;
                    } else if (z) {
                        interfaceC2077.writeByte(239);
                        interfaceC2077.writeByte(191);
                        interfaceC2077.writeByte(189);
                    } else {
                        interfaceC2077.writeByte(63);
                    }
                }
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m16233(CharSequence charSequence) {
        int codePoint;
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 128) {
                i2++;
            } else if (cCharAt < 2048) {
                i2 += 2;
            } else {
                int i3 = C2164.f7153;
                if (cCharAt < 55296 || cCharAt >= 57344) {
                    i2 += 3;
                } else {
                    int i4 = i + 1;
                    if (i4 < length) {
                        char cCharAt2 = charSequence.charAt(i4);
                        if (Character.isHighSurrogate(cCharAt) && Character.isLowSurrogate(cCharAt2)) {
                            codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                        } else {
                            codePoint = -1;
                        }
                    } else {
                        codePoint = -1;
                    }
                    if (codePoint < 0) {
                        i2++;
                    } else {
                        i2 += 4;
                        i = i4;
                    }
                }
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m16234(String str, boolean z) {
        int codePoint;
        int length = str.length();
        long j = 0;
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            long j2 = 1;
            if (cCharAt < 128) {
                j += j2;
            } else if (cCharAt < 2048) {
                j += 2;
            } else {
                int i2 = C2164.f7153;
                if (cCharAt < 55296 || cCharAt >= 57344) {
                    j += 3;
                } else {
                    int i3 = i + 1;
                    if (i3 < length) {
                        char cCharAt2 = str.charAt(i3);
                        if (Character.isHighSurrogate(cCharAt) && Character.isLowSurrogate(cCharAt2)) {
                            codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                        } else {
                            codePoint = -1;
                        }
                    } else {
                        codePoint = -1;
                    }
                    if (codePoint < 0) {
                        if (z) {
                            j2 = 3;
                        }
                        j += j2;
                    } else {
                        j += 4;
                        i = i3;
                    }
                }
            }
            i++;
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16235(BufferedOutputStream bufferedOutputStream, int i) throws IOException {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >>> 8) & 255);
        bufferedOutputStream.write((i >>> 16) & 255);
        bufferedOutputStream.write((i >>> 24) & 255);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m16232(int i, int i2, byte[] bArr) {
        if (i2 == 3) {
            int i3 = i + 1;
            byte b = bArr[i];
            byte b2 = bArr[i3];
            if ((b == -32 && (b2 & bo.k) == 128) || m16240(b2)) {
                return 1;
            }
        } else {
            if (i2 != 4) {
                return -1;
            }
            int i4 = i + 1;
            int i5 = bArr[i] & 255;
            int i6 = i + 2;
            byte b3 = bArr[i4];
            int i7 = b3 & 255;
            if (i5 > 244) {
                return 1;
            }
            if (i5 == 240 && (i7 < 144 || i7 > 191)) {
                return 1;
            }
            if ((i5 == 244 && (b3 & 240) != 128) || m16240(i7)) {
                return 1;
            }
            if (!m16240(bArr[i6])) {
                return 3;
            }
        }
        return 2;
    }
}
