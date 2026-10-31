package l;

import com.umeng.analytics.pro.bo;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ܳ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14821 extends CharsetDecoder {
    public static boolean a(int i, int i2, int i3) {
        return ((i != -32 || (i2 & BERTags.FLAGS) != 128) && (i2 & 192) == 128 && (i3 & 192) == 128) ? false : true;
    }

    public static boolean b(int i, int i2) {
        if (i != 240 || (i2 >= 144 && i2 <= 191)) {
            return (i == 244 && (i2 & 240) != 128) || (i2 & 192) != 128;
        }
        return true;
    }

    public static boolean c(int i) {
        return (i & 192) != 128;
    }

    public C14821(C7061 c7061) {
        super(c7061, 1.0f, 1.0f);
    }

    public static CoderResult e(ByteBuffer byteBuffer, int i) {
        int i2 = 1;
        if (i == 1 || i == 2) {
            return CoderResult.malformedForLength(1);
        }
        if (i == 3) {
            byte b = byteBuffer.get();
            byte b2 = byteBuffer.get();
            if ((b != -32 || (b2 & bo.k) != 128) && !c(b2)) {
                i2 = 2;
            }
            return CoderResult.malformedForLength(i2);
        }
        if (i != 4) {
            return null;
        }
        int i3 = byteBuffer.get() & 255;
        byte b3 = byteBuffer.get();
        int i4 = b3 & 255;
        if (i3 > 244 || ((i3 == 240 && (i4 < 144 || i4 > 191)) || ((i3 == 244 && (b3 & 240) != 128) || c(i4)))) {
            return CoderResult.malformedForLength(1);
        }
        if (c(byteBuffer.get())) {
            return CoderResult.malformedForLength(2);
        }
        return CoderResult.malformedForLength(3);
    }

    public static CoderResult d(ByteBuffer byteBuffer, int i, CharBuffer charBuffer, int i2, int i3) {
        CoderResult coderResultE = e(byteBuffer, i3);
        C7061.l(byteBuffer, i, charBuffer, i2);
        return coderResultE;
    }

    public static CoderResult g(Buffer buffer, int i, int i2, Buffer buffer2, int i3, int i4) {
        C7061.l(buffer, i, buffer2, i3);
        return (i4 == 0 || i2 - i < i4) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
    }

    public static CoderResult f(Buffer buffer, int i, int i2) {
        buffer.position(i);
        return (i2 == 0 || buffer.remaining() < i2) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x029a, code lost:
    
        if ((r1 & 192) != r3) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0109, code lost:
    
        if ((r1 & 192) != r5) goto L59;
     */
    @Override // java.nio.charset.CharsetDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        char c;
        CoderResult coderResultE;
        char c2;
        int i;
        if (!byteBuffer.hasArray() || !charBuffer.hasArray()) {
            int iPosition = byteBuffer.position();
            int iLimit = byteBuffer.limit();
            while (iPosition < iLimit) {
                byte b = byteBuffer.get();
                if (b >= 0) {
                    if (charBuffer.remaining() < 1) {
                        return f(byteBuffer, iPosition, 1);
                    }
                    charBuffer.put((char) b);
                    iPosition++;
                } else {
                    if ((b >> 5) == -2 && (b & 30) != 0) {
                        int i2 = 2;
                        if (iLimit - iPosition >= 2) {
                            if (charBuffer.remaining() < 1) {
                                i2 = 2;
                            } else {
                                byte b2 = byteBuffer.get();
                                if (c(b2)) {
                                    return CoderResult.malformedForLength(1);
                                }
                                charBuffer.put((char) (((b << 6) ^ b2) ^ 3968));
                                iPosition += 2;
                            }
                        }
                        return f(byteBuffer, iPosition, i2);
                    }
                    if ((b >> 4) != -2) {
                        if ((b >> 3) == -2) {
                            int i3 = iLimit - iPosition;
                            if (i3 < 4 || charBuffer.remaining() < 2) {
                                int i4 = b & 255;
                                if (i4 > 244 || (i3 > 1 && b(i4, byteBuffer.get() & 255))) {
                                    return CoderResult.malformedForLength(1);
                                }
                                if (i3 <= 2 || (byteBuffer.get() & 192) == 128) {
                                    return f(byteBuffer, iPosition, 4);
                                }
                                return CoderResult.malformedForLength(2);
                            }
                            byte b3 = byteBuffer.get();
                            byte b4 = byteBuffer.get();
                            byte b5 = byteBuffer.get();
                            int i5 = (((b << 18) ^ (b3 << 12)) ^ (b4 << 6)) ^ (b5 ^ GCMSIVBlockCipher.MASK);
                            if ((b3 & 192) == 128 && (b4 & 192) == 128 && (b5 & 192) == 128 && Character.isSupplementaryCodePoint(i5)) {
                                charBuffer.put(Character.highSurrogate(i5));
                                charBuffer.put(Character.lowSurrogate(i5));
                                iPosition += 4;
                            } else {
                                coderResultE = e(byteBuffer, 4);
                            }
                        } else {
                            coderResultE = e(byteBuffer, 1);
                        }
                        return coderResultE;
                    }
                    int i6 = iLimit - iPosition;
                    if (i6 < 3 || charBuffer.remaining() < 1) {
                        if (i6 > 1) {
                            byte b6 = byteBuffer.get();
                            if (b == -32) {
                                c = 128;
                                if ((b6 & bo.k) != 128) {
                                }
                                return CoderResult.malformedForLength(1);
                            }
                            c = 128;
                        }
                        return f(byteBuffer, iPosition, 3);
                    }
                    byte b7 = byteBuffer.get();
                    byte b8 = byteBuffer.get();
                    if (a(b, b7, b8)) {
                        coderResultE = e(byteBuffer, 3);
                        return coderResultE;
                    }
                    char c3 = (char) (((b << 12) ^ (b7 << 6)) ^ (b8 ^ GCMSIVBlockCipher.MASK));
                    if (Character.isSurrogate(c3)) {
                        return CoderResult.malformedForLength(3);
                    }
                    charBuffer.put(c3);
                    iPosition += 3;
                }
            }
            return f(byteBuffer, iPosition, 0);
        }
        byte[] bArrArray = byteBuffer.array();
        int iPosition2 = byteBuffer.position() + byteBuffer.arrayOffset();
        int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.limit();
        char[] cArrArray = charBuffer.array();
        int iPosition3 = charBuffer.position() + charBuffer.arrayOffset();
        int iLimit2 = charBuffer.limit() + charBuffer.arrayOffset();
        byte b9 = GCMSIVBlockCipher.MASK;
        int iMin = Math.min(iArrayOffset - iPosition2, iLimit2 - iPosition3) + iPosition3;
        while (iPosition3 < iMin) {
            byte b10 = bArrArray[iPosition2];
            if (b10 < 0) {
                break;
            }
            iPosition2++;
            cArrArray[iPosition3] = (char) b10;
            iPosition3++;
        }
        int i7 = 2;
        while (iPosition2 < iArrayOffset) {
            byte b11 = bArrArray[iPosition2];
            if (b11 >= 0) {
                if (iPosition3 >= iLimit2) {
                    return g(byteBuffer, iPosition2, iArrayOffset, charBuffer, iPosition3, 1);
                }
                i = iPosition3 + 1;
                cArrArray[iPosition3] = (char) b11;
                iPosition2++;
            } else if ((b11 >> 5) != -2 || (b11 & 30) == 0) {
                if ((b11 >> 4) == -2) {
                    int i8 = iArrayOffset - iPosition2;
                    if (i8 < 3 || iPosition3 >= iLimit2) {
                        if (i8 > 1) {
                            byte b12 = bArrArray[iPosition2 + 1];
                            if (b11 == -32) {
                                c2 = 128;
                                if ((b12 & bo.k) != 128) {
                                }
                                C7061.l(byteBuffer, iPosition2, charBuffer, iPosition3);
                                return CoderResult.malformedForLength(1);
                            }
                            c2 = 128;
                        }
                        return g(byteBuffer, iPosition2, iArrayOffset, charBuffer, iPosition3, 3);
                    }
                    byte b13 = bArrArray[iPosition2 + 1];
                    byte b14 = bArrArray[iPosition2 + 2];
                    if (a(b11, b13, b14)) {
                        return d(byteBuffer, iPosition2, charBuffer, iPosition3, 3);
                    }
                    char c4 = (char) (((b13 << 6) ^ (b11 << 12)) ^ (b14 ^ b9));
                    if (Character.isSurrogate(c4)) {
                        C7061.l(byteBuffer, iPosition2, charBuffer, iPosition3);
                        return CoderResult.malformedForLength(3);
                    }
                    i = iPosition3 + 1;
                    cArrArray[iPosition3] = c4;
                    iPosition2 += 3;
                } else {
                    if ((b11 >> 3) != -2) {
                        return d(byteBuffer, iPosition2, charBuffer, iPosition3, 1);
                    }
                    int i9 = iArrayOffset - iPosition2;
                    if (i9 < 4 || iLimit2 - iPosition3 < 2) {
                        int i10 = b11 & 255;
                        if (i10 > 244 || (i9 > 1 && b(i10, bArrArray[iPosition2 + 1] & 255))) {
                            C7061.l(byteBuffer, iPosition2, charBuffer, iPosition3);
                            return CoderResult.malformedForLength(1);
                        }
                        if (i9 <= 2 || (bArrArray[iPosition2 + 2] & 192) == 128) {
                            return g(byteBuffer, iPosition2, iArrayOffset, charBuffer, iPosition3, 4);
                        }
                        C7061.l(byteBuffer, iPosition2, charBuffer, iPosition3);
                        return CoderResult.malformedForLength(2);
                    }
                    byte b15 = bArrArray[iPosition2 + 1];
                    byte b16 = bArrArray[iPosition2 + 2];
                    byte b17 = bArrArray[iPosition2 + 3];
                    int i11 = (((b11 << 18) ^ (b15 << 12)) ^ (b16 << 6)) ^ (b17 ^ GCMSIVBlockCipher.MASK);
                    if ((b15 & 192) != 128 || (b16 & 192) != 128 || (b17 & 192) != 128 || !Character.isSupplementaryCodePoint(i11)) {
                        return d(byteBuffer, iPosition2, charBuffer, iPosition3, 4);
                    }
                    int i12 = iPosition3 + 1;
                    cArrArray[iPosition3] = Character.highSurrogate(i11);
                    iPosition3 += 2;
                    cArrArray[i12] = Character.lowSurrogate(i11);
                    iPosition2 += 4;
                }
                i7 = 2;
                b9 = GCMSIVBlockCipher.MASK;
            } else {
                if (iArrayOffset - iPosition2 < i7 || iPosition3 >= iLimit2) {
                    return g(byteBuffer, iPosition2, iArrayOffset, charBuffer, iPosition3, 2);
                }
                byte b18 = bArrArray[iPosition2 + 1];
                if (c(b18)) {
                    C7061.l(byteBuffer, iPosition2, charBuffer, iPosition3);
                    return CoderResult.malformedForLength(1);
                }
                i = iPosition3 + 1;
                cArrArray[iPosition3] = (char) ((b18 ^ (b11 << 6)) ^ 3968);
                iPosition2 += 2;
            }
            iPosition3 = i;
            i7 = 2;
            b9 = GCMSIVBlockCipher.MASK;
        }
        return g(byteBuffer, iPosition2, iArrayOffset, charBuffer, iPosition3, 0);
    }
}
