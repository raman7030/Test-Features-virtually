package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* JADX INFO: renamed from: l.۬֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y3NK */
/* JADX INFO: loaded from: classes4.dex */
public final class C12776 extends AbstractC19833 {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (l.C21244.m48218(r6, r25) > (-65)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (l.C21244.m48218(r6, r25) > (-65)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b1, code lost:
    
        if (l.C21244.m48218(r8, r25) > (-65)) goto L53;
     */
    @Override // l.AbstractC19833
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo12950(int i, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        byte b;
        byte bM48218;
        long j;
        long j2;
        if ((i2 | i3 | (bArr.length - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        long j3 = i2;
        long j4 = i3;
        if (i == 0) {
            i4 = -1;
        } else {
            if (j3 >= j4) {
                return i;
            }
            i4 = -1;
            byte b2 = (byte) i;
            if (b2 < -32) {
                if (b2 >= -62) {
                    j2 = j3 + 1;
                }
                return -1;
            }
            if (b2 < -16) {
                byte bM48219 = (byte) (~(i >> 8));
                if (bM48219 == 0) {
                    long j5 = j3 + 1;
                    bM48219 = C21244.m48218(j3, bArr);
                    if (j5 >= j4) {
                        return C12071.m29453(b2, bM48219);
                    }
                    j3 = j5;
                }
                if (bM48219 <= -65 && ((b2 != -32 || bM48219 >= -96) && (b2 != -19 || bM48219 < -96))) {
                    j2 = j3 + 1;
                }
                return -1;
            }
            byte b3 = (byte) (~(i >> 8));
            if (b3 == 0) {
                j = j3 + 1;
                bM48218 = C21244.m48218(j3, bArr);
                if (j >= j4) {
                    return C12071.m29453(b2, bM48218);
                }
                b = 0;
            } else {
                b = (byte) (i >> 16);
                bM48218 = b3;
                j = j3;
            }
            if (b == 0) {
                long j6 = j + 1;
                byte bM482110 = C21244.m48218(j, bArr);
                if (j6 >= j4) {
                    return C12071.m29454(b2, bM48218, bM482110);
                }
                b = bM482110;
                j = j6;
            }
            if (bM48218 <= -65 && (((bM48218 + KeyFactorySpi.Ed25519_type) + (b2 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB)) >> 30) == 0 && b <= -65) {
                j3 = j + 1;
            }
            return -1;
            j3 = j2;
        }
        int i6 = (int) (j4 - j3);
        if (i6 >= 16) {
            int i7 = 8 - (((int) j3) & 7);
            int i8 = 0;
            long j7 = j3;
            while (true) {
                if (i8 >= i7) {
                    while (true) {
                        int i9 = i8 + 8;
                        if (i9 > i6 || (C21244.m48253(C21244.f68465 + j7, bArr) & (-9187201950435737472L)) != 0) {
                            break;
                        }
                        j7 += 8;
                        i8 = i9;
                    }
                    i5 = i8;
                    while (true) {
                        if (i5 >= i6) {
                            i5 = i6;
                            break;
                        }
                        long j8 = j7 + 1;
                        if (C21244.m48218(j7, bArr) < 0) {
                            break;
                        }
                        i5++;
                        j7 = j8;
                    }
                } else {
                    long j9 = j7 + 1;
                    if (C21244.m48218(j7, bArr) < 0) {
                        i5 = i8;
                        break;
                    }
                    i8++;
                    j7 = j9;
                }
            }
        } else {
            i5 = 0;
        }
        int i10 = i6 - i5;
        long j10 = j3 + ((long) i5);
        while (true) {
            byte b4 = 0;
            while (i10 > 0) {
                long j11 = j10 + 1;
                byte bM482111 = C21244.m48218(j10, bArr);
                if (bM482111 < 0) {
                    j10 = j11;
                    b4 = bM482111;
                    break;
                }
                i10--;
                j10 = j11;
                b4 = bM482111;
            }
            if (i10 == 0) {
                return 0;
            }
            int i11 = i10 - 1;
            if (b4 < -32) {
                if (i11 == 0) {
                    return b4;
                }
                i10 -= 2;
                if (b4 >= -62) {
                    long j12 = j10 + 1;
                    if (C21244.m48218(j10, bArr) <= -65) {
                        j10 = j12;
                    }
                }
                return i4;
            }
            if (b4 >= -16) {
                if (i11 < 3) {
                    return m31086(j10, bArr, b4, i11);
                }
                i10 -= 4;
                long j13 = j10 + 1;
                byte bM482112 = C21244.m48218(j10, bArr);
                if (bM482112 <= -65 && (((bM482112 + KeyFactorySpi.Ed25519_type) + (b4 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB)) >> 30) == 0) {
                    long j14 = 2 + j10;
                    if (C21244.m48218(j13, bArr) <= -65) {
                        j10 += 3;
                        if (C21244.m48218(j14, bArr) > -65) {
                        }
                    }
                }
                return i4;
            }
            if (i11 < 2) {
                return m31086(j10, bArr, b4, i11);
            }
            i10 -= 3;
            long j15 = j10 + 1;
            byte bM482113 = C21244.m48218(j10, bArr);
            if (bM482113 <= -65 && ((b4 != -32 || bM482113 >= -96) && (b4 != -19 || bM482113 < -96))) {
                j10 += 2;
                if (C21244.m48218(j15, bArr) > -65) {
                }
            }
            return i4;
        }
    }

    @Override // l.AbstractC19833
    /* JADX INFO: renamed from: ֫ */
    public final String mo12951(int i, int i2, byte[] bArr) throws C2025 {
        Charset charset = C13997.f41724;
        String str = new String(bArr, i, i2, charset);
        if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
            throw C2025.m6583();
        }
        return str;
    }

    @Override // l.AbstractC19833
    /* JADX INFO: renamed from: ֫ */
    public final String mo12952(ByteBuffer byteBuffer, int i, int i2) throws C2025 {
        byte bM48216;
        byte bM48217;
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        long jM48219 = C21244.m48219(byteBuffer) + ((long) i);
        long j = ((long) i2) + jM48219;
        char[] cArr = new char[i2];
        int i3 = 0;
        while (jM48219 < j && (bM48217 = C21244.m48216(jM48219)) >= 0) {
            jM48219++;
            cArr[i3] = (char) bM48217;
            i3++;
        }
        while (jM48219 < j) {
            long j2 = jM48219 + 1;
            byte bM48218 = C21244.m48216(jM48219);
            if (bM48218 >= 0) {
                cArr[i3] = (char) bM48218;
                i3++;
                jM48219 = j2;
                while (jM48219 < j && (bM48216 = C21244.m48216(jM48219)) >= 0) {
                    jM48219++;
                    cArr[i3] = (char) bM48216;
                    i3++;
                }
            } else if (bM48218 < -32) {
                if (j2 >= j) {
                    throw C2025.m6583();
                }
                jM48219 += 2;
                C21949.m49438(bM48218, C21244.m48216(j2), cArr, i3);
                i3++;
            } else if (bM48218 < -16) {
                if (j2 >= j - 1) {
                    throw C2025.m6583();
                }
                long j3 = 2 + jM48219;
                jM48219 += 3;
                C21949.m49437(bM48218, C21244.m48216(j2), C21244.m48216(j3), cArr, i3);
                i3++;
            } else {
                if (j2 >= j - 2) {
                    throw C2025.m6583();
                }
                byte bM48219 = C21244.m48216(j2);
                long j4 = jM48219 + 3;
                byte bM482110 = C21244.m48216(2 + jM48219);
                jM48219 += 4;
                C21949.m49436(bM48218, bM48219, bM482110, C21244.m48216(j4), cArr, i3);
                i3 += 2;
            }
        }
        return new String(cArr, 0, i3);
    }

    @Override // l.AbstractC19833
    /* JADX INFO: renamed from: ֫ */
    public final int mo12949(int i, int i2, String str, byte[] bArr) {
        long j;
        char c;
        String str2;
        String str3;
        int i3;
        char cCharAt;
        long j2 = i;
        long j3 = ((long) i2) + j2;
        int length = str.length();
        String str4 = " at index ";
        String str5 = "Failed writing ";
        if (length > i2 || bArr.length - i2 < i) {
            throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i + i2));
        }
        int i4 = 0;
        while (true) {
            j = 1;
            c = 128;
            if (i4 >= length || (cCharAt = str.charAt(i4)) >= 128) {
                break;
            }
            C21244.m48232(bArr, j2, (byte) cCharAt);
            i4++;
            j2 = 1 + j2;
        }
        if (i4 == length) {
            return (int) j2;
        }
        String str6 = str;
        while (i4 < length) {
            char cCharAt2 = str6.charAt(i4);
            if (cCharAt2 < c && j2 < j3) {
                C21244.m48232(bArr, j2, (byte) cCharAt2);
                str3 = str5;
                j2 += j;
                str2 = str4;
            } else if (cCharAt2 >= 2048 || j2 > j3 - 2) {
                str2 = str4;
                str3 = str5;
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j2 > j3 - 3) {
                    if (j2 <= j3 - 4) {
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char cCharAt3 = str.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                C21244.m48232(bArr, j2, (byte) ((codePoint >>> 18) | 240));
                                C21244.m48232(bArr, j2 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j4 = j2 + 3;
                                C21244.m48232(bArr, j2 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j2 += 4;
                                C21244.m48232(bArr, j4, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new C2899(i4 - 1, length);
                    }
                    if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                        throw new C2899(i4, length);
                    }
                    throw new ArrayIndexOutOfBoundsException(str3 + cCharAt2 + str2 + j2);
                }
                C21244.m48232(bArr, j2, (byte) ((cCharAt2 >>> '\f') | 480));
                long j5 = j2 + 2;
                C21244.m48232(bArr, j2 + 1, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                j2 += 3;
                C21244.m48232(bArr, j5, (byte) ((cCharAt2 & '?') | 128));
                str6 = str;
            } else {
                str2 = str4;
                str3 = str5;
                long j6 = j2 + j;
                C21244.m48232(bArr, j2, (byte) ((cCharAt2 >>> 6) | 960));
                j2 += 2;
                C21244.m48232(bArr, j6, (byte) (c | (cCharAt2 & '?')));
            }
            i4++;
            c = 128;
            str4 = str2;
            str5 = str3;
            j = 1;
        }
        return (int) j2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31086(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return C12071.m29445(i);
        }
        if (i2 == 1) {
            return C12071.m29453(i, C21244.m48218(j, bArr));
        }
        if (i2 == 2) {
            return C12071.m29454(i, C21244.m48218(j, bArr), C21244.m48218(j + 1, bArr));
        }
        throw new AssertionError();
    }
}
