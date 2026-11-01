package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.nio.ByteBuffer;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* JADX INFO: renamed from: l.ۙ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y3NK */
/* JADX INFO: loaded from: classes3.dex */
public final class C6464 extends AbstractC21217 {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] > (-65)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] > (-65)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0084, code lost:
    
        if (r13[r12] > (-65)) goto L50;
     */
    @Override // p067l.AbstractC21217
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo14814(int i, byte[] bArr, int i2, int i3) {
        byte b;
        int i4;
        int i5;
        if (i != 0) {
            if (i2 >= i3) {
                return i;
            }
            byte b2 = (byte) i;
            if (b2 < -32) {
                if (b2 >= -62) {
                    i5 = i2 + 1;
                }
                return -1;
            }
            if (b2 < -16) {
                byte b3 = (byte) (~(i >> 8));
                if (b3 == 0) {
                    int i6 = i2 + 1;
                    byte b4 = bArr[i2];
                    if (i6 >= i3) {
                        return C13840.m31515(b2, b4);
                    }
                    i2 = i6;
                    b3 = b4;
                }
                if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                    i5 = i2 + 1;
                }
                return -1;
            }
            byte b5 = (byte) (~(i >> 8));
            if (b5 == 0) {
                i4 = i2 + 1;
                b5 = bArr[i2];
                if (i4 >= i3) {
                    return C13840.m31515(b2, b5);
                }
                b = 0;
            } else {
                b = (byte) (i >> 16);
                i4 = i2;
            }
            if (b == 0) {
                int i7 = i4 + 1;
                byte b6 = bArr[i4];
                if (i7 >= i3) {
                    return C13840.m31516(b2, b5, b6);
                }
                b = b6;
                i4 = i7;
            }
            if (b5 <= -65) {
                if ((((b5 + KeyFactorySpi.Ed25519_type) + (b2 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB)) >> 30) == 0 && b <= -65) {
                    i2 = i4 + 1;
                }
            }
            return -1;
            i2 = i5;
        }
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 < i3) {
            while (i2 < i3) {
                int i8 = i2 + 1;
                byte b7 = bArr[i2];
                if (b7 < 0) {
                    if (b7 < -32) {
                        if (i8 >= i3) {
                            return b7;
                        }
                        if (b7 >= -62) {
                            i2 += 2;
                            if (bArr[i8] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b7 < -16) {
                        if (i8 >= i3 - 1) {
                            return C13840.m31511(i8, i3, bArr);
                        }
                        int i9 = i2 + 2;
                        byte b8 = bArr[i8];
                        if (b8 <= -65 && ((b7 != -32 || b8 >= -96) && (b7 != -19 || b8 < -96))) {
                            i2 += 3;
                            if (bArr[i9] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i8 >= i3 - 2) {
                        return C13840.m31511(i8, i3, bArr);
                    }
                    int i10 = i2 + 2;
                    byte b9 = bArr[i8];
                    if (b9 <= -65) {
                        if ((((b9 + KeyFactorySpi.Ed25519_type) + (b7 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB)) >> 30) == 0) {
                            int i11 = i2 + 3;
                            if (bArr[i10] <= -65) {
                                i2 += 4;
                                if (bArr[i11] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i2 = i8;
            }
        }
        return 0;
    }

    @Override // p067l.AbstractC21217
    /* JADX INFO: renamed from: ֫ */
    public final String mo14815(int i, int i2, byte[] bArr) throws C4293 {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (b < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                cArr[i5] = (char) b2;
                i5++;
                i = i6;
                while (i < i3) {
                    byte b3 = bArr[i];
                    if (b3 < 0) {
                        break;
                    }
                    i++;
                    cArr[i5] = (char) b3;
                    i5++;
                }
            } else if (b2 < -32) {
                if (i6 >= i3) {
                    throw C4293.m8709();
                }
                i += 2;
                C23228.m51775(b2, bArr[i6], cArr, i5);
                i5++;
            } else if (b2 < -16) {
                if (i6 >= i3 - 1) {
                    throw C4293.m8709();
                }
                int i7 = i + 2;
                i += 3;
                C23228.m51774(b2, bArr[i6], bArr[i7], cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw C4293.m8709();
                }
                byte b4 = bArr[i6];
                int i8 = i + 3;
                byte b5 = bArr[i + 2];
                i += 4;
                C23228.m51773(b2, b4, b5, bArr[i8], cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    @Override // p067l.AbstractC21217
    /* JADX INFO: renamed from: ֫ */
    public final String mo14816(ByteBuffer byteBuffer, int i, int i2) {
        return AbstractC21217.m47913(byteBuffer, i, i2);
    }

    @Override // p067l.AbstractC21217
    /* JADX INFO: renamed from: ֫ */
    public final int mo14813(int i, int i2, String str, byte[] bArr) {
        int i3;
        int i4;
        char cCharAt;
        int length = str.length();
        int i5 = i2 + i;
        int i6 = 0;
        while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
            bArr[i4] = (byte) cCharAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 < 128 && i7 < i5) {
                bArr[i7] = (byte) cCharAt2;
                i7++;
            } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                i7 += 2;
                bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                    if (i7 <= i5 - 4) {
                        int i9 = i6 + 1;
                        if (i9 != str.length()) {
                            char cCharAt3 = str.charAt(i9);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i10 = i7 + 3;
                                bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i7 += 4;
                                bArr[i10] = (byte) ((codePoint & 63) | 128);
                                i6 = i9;
                            } else {
                                i6 = i9;
                            }
                        }
                        throw new C5123(i6 - 1, length);
                    }
                    if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                        throw new C5123(i6, length);
                    }
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i7);
                }
                bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i11 = i7 + 2;
                bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i7 += 3;
                bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
            }
            i6++;
        }
        return i7;
    }
}
