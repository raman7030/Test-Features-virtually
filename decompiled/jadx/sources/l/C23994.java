package l;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.᩻᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23994 extends CharsetEncoder {
    public C17022 a;

    public C23994(C7061 c7061) {
        super(c7061, 1.1f, 3.0f);
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c) {
        return !Character.isSurrogate(c);
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean isLegalReplacement(byte[] bArr) {
        return (bArr.length == 1 && bArr[0] >= 0) || super.isLegalReplacement(bArr);
    }

    @Override // java.nio.charset.CharsetEncoder
    public final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        int i;
        int codePoint;
        int i2;
        int codePoint2;
        int i3 = 128;
        int i4 = 4;
        if (!charBuffer.hasArray() || !byteBuffer.hasArray()) {
            int iPosition = charBuffer.position();
            while (charBuffer.hasRemaining()) {
                char c = charBuffer.get();
                if (c < 128) {
                    if (!byteBuffer.hasRemaining()) {
                        return CoderResult.OVERFLOW;
                    }
                    byteBuffer.put((byte) c);
                } else if (c >= 2048) {
                    if (Character.isSurrogate(c)) {
                        if (this.a == null) {
                            this.a = new C17022();
                        }
                        C17022 c17022 = this.a;
                        c17022.getClass();
                        if (Character.isHighSurrogate(c)) {
                            if (charBuffer.hasRemaining()) {
                                char c2 = charBuffer.get();
                                if (Character.isLowSurrogate(c2)) {
                                    codePoint = Character.toCodePoint(c, c2);
                                    c17022.b = null;
                                } else {
                                    c17022.b = CoderResult.malformedForLength(1);
                                }
                            } else {
                                c17022.b = CoderResult.UNDERFLOW;
                            }
                            i = -1;
                        } else if (Character.isLowSurrogate(c)) {
                            c17022.b = CoderResult.malformedForLength(1);
                            i = -1;
                        } else {
                            c17022.b = null;
                        }
                        if (i < 0) {
                            i = c;
                            i = codePoint;
                            return (CoderResult) this.a.b;
                        }
                        i = c;
                        i = codePoint;
                        if (byteBuffer.remaining() < 4) {
                            return CoderResult.OVERFLOW;
                        }
                        byteBuffer.put((byte) ((i >> 18) | 240));
                        byteBuffer.put((byte) (((i >> 12) & 63) | 128));
                        byteBuffer.put((byte) (((i >> 6) & 63) | 128));
                        byteBuffer.put((byte) ((i & 63) | 128));
                        iPosition++;
                    } else {
                        if (byteBuffer.remaining() < 3) {
                            return CoderResult.OVERFLOW;
                        }
                        byteBuffer.put((byte) ((c >> '\f') | BERTags.FLAGS));
                        byteBuffer.put((byte) (((c >> 6) & 63) | 128));
                        byteBuffer.put((byte) ((c & '?') | 128));
                    }
                    iPosition++;
                } else {
                    if (byteBuffer.remaining() < 2) {
                        return CoderResult.OVERFLOW;
                    }
                    byteBuffer.put((byte) ((c >> 6) | 192));
                    byteBuffer.put((byte) ((c & '?') | 128));
                }
                iPosition++;
            }
            return CoderResult.UNDERFLOW;
        }
        char[] cArrArray = charBuffer.array();
        int iPosition2 = charBuffer.position() + charBuffer.arrayOffset();
        int iLimit = charBuffer.limit() + charBuffer.arrayOffset();
        byte[] bArrArray = byteBuffer.array();
        int iPosition3 = byteBuffer.position() + byteBuffer.arrayOffset();
        int iLimit2 = byteBuffer.limit() + byteBuffer.arrayOffset();
        int i5 = 1;
        int iMin = Math.min(iLimit - iPosition2, iLimit2 - iPosition3) + iPosition3;
        while (iPosition3 < iMin) {
            char c3 = cArrArray[iPosition2];
            if (c3 >= 128) {
                break;
            }
            iPosition2++;
            bArrArray[iPosition3] = (byte) c3;
            iPosition3++;
        }
        char c4 = 2048;
        while (iPosition2 < iLimit) {
            char c5 = cArrArray[iPosition2];
            if (c5 < i3) {
                if (iPosition3 >= iLimit2) {
                    C7061.l(charBuffer, iPosition2, byteBuffer, iPosition3);
                    return CoderResult.OVERFLOW;
                }
                bArrArray[iPosition3] = (byte) c5;
                iPosition3++;
            } else if (c5 < c4) {
                if (iLimit2 - iPosition3 < 2) {
                    C7061.l(charBuffer, iPosition2, byteBuffer, iPosition3);
                    return CoderResult.OVERFLOW;
                }
                int i6 = iPosition3 + 1;
                bArrArray[iPosition3] = (byte) ((c5 >> 6) | 192);
                iPosition3 += 2;
                bArrArray[i6] = (byte) ((c5 & '?') | i3);
            } else if (Character.isSurrogate(c5)) {
                if (this.a == null) {
                    this.a = new C17022();
                }
                C17022 c17023 = this.a;
                c17023.getClass();
                if (Character.isHighSurrogate(c5)) {
                    if (iLimit - iPosition2 < 2) {
                        c17023.b = CoderResult.UNDERFLOW;
                    } else {
                        char c6 = cArrArray[iPosition2 + 1];
                        if (Character.isLowSurrogate(c6)) {
                            codePoint2 = Character.toCodePoint(c5, c6);
                            c17023.b = null;
                        } else {
                            c17023.b = CoderResult.malformedForLength(i5);
                        }
                    }
                    i2 = -1;
                } else if (Character.isLowSurrogate(c5)) {
                    c17023.b = CoderResult.malformedForLength(i5);
                    i2 = -1;
                } else {
                    c17023.b = null;
                }
                if (i2 < 0) {
                    i2 = c5;
                    i2 = codePoint2;
                    C7061.l(charBuffer, iPosition2, byteBuffer, iPosition3);
                    return (CoderResult) this.a.b;
                }
                i2 = c5;
                i2 = codePoint2;
                if (iLimit2 - iPosition3 < i4) {
                    C7061.l(charBuffer, iPosition2, byteBuffer, iPosition3);
                    return CoderResult.OVERFLOW;
                }
                bArrArray[iPosition3] = (byte) ((i2 >> 18) | 240);
                bArrArray[iPosition3 + 1] = (byte) (((i2 >> 12) & 63) | 128);
                int i7 = iPosition3 + 3;
                bArrArray[iPosition3 + 2] = (byte) (((i2 >> 6) & 63) | 128);
                iPosition3 += 4;
                bArrArray[i7] = (byte) ((i2 & 63) | 128);
                iPosition2++;
            } else {
                if (iLimit2 - iPosition3 < 3) {
                    C7061.l(charBuffer, iPosition2, byteBuffer, iPosition3);
                    return CoderResult.OVERFLOW;
                }
                bArrArray[iPosition3] = (byte) ((c5 >> '\f') | BERTags.FLAGS);
                int i8 = iPosition3 + 2;
                bArrArray[iPosition3 + 1] = (byte) (((c5 >> 6) & 63) | 128);
                iPosition3 += 3;
                bArrArray[i8] = (byte) ((c5 & '?') | 128);
            }
            iPosition2++;
            c4 = 2048;
            i4 = 4;
            i3 = 128;
            i5 = 1;
        }
        C7061.l(charBuffer, iPosition2, byteBuffer, iPosition3);
        return CoderResult.UNDERFLOW;
    }
}
