package p067l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ᩴۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6TP */
/* JADX INFO: loaded from: classes4.dex */
public final class C19986 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f60670;

    /* JADX INFO: renamed from: ۧ */
    public final MessageDigest f60671 = C16111.m36668();

    /* JADX INFO: renamed from: ܽ */
    public final CharBuffer f60672;

    public C19986(int i) {
        byte[] bArr = new byte[(i * 2) + 36];
        this.f60670 = bArr;
        this.f60672 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asCharBuffer();
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m45355(byte[] bArr, int i, int i2, char[] cArr) {
        if (bArr.length != 32 || i2 <= 0 || i < 0 || i > cArr.length - i2) {
            throw new IllegalArgumentException("Invalid load hash batch");
        }
        MessageDigest messageDigest = this.f60671;
        messageDigest.reset();
        int length = bArr.length;
        byte[] bArr2 = this.f60670;
        System.arraycopy(bArr, 0, bArr2, 0, length);
        for (int i3 = 0; i3 < 4; i3++) {
            bArr2[i3 + 32] = (byte) (i2 >>> (i3 * 8));
        }
        int i4 = i2 + i;
        int i5 = 36;
        while (i < i4) {
            int iMin = Math.min((bArr2.length - i5) / 2, i4 - i);
            CharBuffer charBuffer = this.f60672;
            charBuffer.position(i5 / 2);
            charBuffer.put(cArr, i, iMin);
            i5 += iMin * 2;
            i += iMin;
            if (i5 == bArr2.length) {
                messageDigest.update(bArr2);
                i5 = 0;
            }
        }
        if (i5 != 0) {
            messageDigest.update(bArr2, 0, i5);
        }
        return messageDigest.digest();
    }
}
