package l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 18H2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6050 extends AbstractC0759 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int[] f18549;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f18550;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16879(int[] iArr) {
        this.f18549 = iArr;
    }

    @Override // l.AbstractC0759
    /* JADX INFO: renamed from: ۧ */
    public final C18399 mo2903(C18399 c18399) throws C19105 {
        int i = c18399.f57133;
        int[] iArr = this.f18549;
        if (iArr == null) {
            return C18399.f57130;
        }
        int i2 = c18399.f57132;
        if (!C3603.m11034(i)) {
            throw new C19105(c18399);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new C19105("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", c18399);
            }
            z |= i4 != i3;
            i3++;
        }
        if (z) {
            return new C18399(c18399.f57134, iArr.length, i);
        }
        return C18399.f57130;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00da  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:55:0x011c  */
    @Override // l.InterfaceC0053
    /* JADX INFO: renamed from: ֫ */
    public final void mo962(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int[] iArr = this.f18550;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM2900 = m2900(((iLimit - iPosition) / this.f2818.f57131) * this.f2819.f57131);
        while (iPosition < iLimit) {
            for (int i5 : iArr) {
                int iM11047 = (C3603.m11047(this.f2818.f57133) * i5) + iPosition;
                int i6 = this.f2818.f57133;
                if (i6 == 2) {
                    byteBufferM2900.putShort(byteBuffer.getShort(iM11047));
                } else if (i6 == 3) {
                    byteBufferM2900.put(byteBuffer.get(iM11047));
                } else if (i6 == 4) {
                    byteBufferM2900.putFloat(byteBuffer.getFloat(iM11047));
                } else if (i6 != 21) {
                    if (i6 != 22) {
                        if (i6 == 268435456) {
                            byteBufferM2900.putShort(byteBuffer.getShort(iM11047));
                        } else if (i6 == 1342177280) {
                            byteOrderOrder = byteBuffer.order();
                            byteOrder = ByteOrder.BIG_ENDIAN;
                            if (byteOrderOrder == byteOrder) {
                                i = iM11047;
                            } else {
                                i = iM11047 + 2;
                            }
                            byte b = byteBuffer.get(i);
                            byte b2 = byteBuffer.get(iM11047 + 1);
                            if (byteBuffer.order() == byteOrder) {
                                iM11047 += 2;
                            }
                            i2 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(iM11047) << 8) & 65280)) >> 8;
                            if ((i2 & (-16777216)) != 0) {
                                z = true;
                            } else {
                                z = true;
                            }
                            C22632.m50630("Value out of range of 24-bit integer: " + Integer.toHexString(i2), z);
                            if (byteBufferM2900.remaining() >= 3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            C22632.m50631(z2);
                            if (byteBufferM2900.order() == byteOrder) {
                                i3 = (i2 & 16711680) >> 16;
                            } else {
                                i3 = i2 & 255;
                            }
                            byte b3 = (byte) i3;
                            byte b4 = (byte) ((i2 & 65280) >> 8);
                            if (byteBufferM2900.order() == byteOrder) {
                                i4 = i2 & 255;
                            } else {
                                i4 = (i2 & 16711680) >> 16;
                            }
                            byteBufferM2900.put(b3).put(b4).put((byte) i4);
                        } else if (i6 != 1610612736) {
                            throw new IllegalStateException("Unexpected encoding: " + this.f2818.f57133);
                        }
                    }
                    byteBufferM2900.putInt(byteBuffer.getInt(iM11047));
                } else {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iM11047;
                    } else {
                        i = iM11047 + 2;
                    }
                    byte b5 = byteBuffer.get(i);
                    byte b6 = byteBuffer.get(iM11047 + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iM11047 += 2;
                    }
                    i2 = ((((b5 << 24) & (-16777216)) | ((b6 << 16) & 16711680)) | ((byteBuffer.get(iM11047) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0 || (i2 & (-8388608)) == -8388608) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C22632.m50630("Value out of range of 24-bit integer: " + Integer.toHexString(i2), z);
                    if (byteBufferM2900.remaining() >= 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C22632.m50631(z2);
                    if (byteBufferM2900.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b7 = (byte) i3;
                    byte b8 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferM2900.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferM2900.put(b7).put(b8).put((byte) i4);
                }
            }
            iPosition += this.f2818.f57131;
        }
        byteBuffer.position(iLimit);
        byteBufferM2900.flip();
    }

    @Override // l.AbstractC0759
    /* JADX INFO: renamed from: ܳ */
    public final void mo2904() {
        this.f18550 = this.f18549;
    }

    @Override // l.AbstractC0759
    /* JADX INFO: renamed from: ۜ */
    public final void mo2902() {
        this.f18550 = null;
        this.f18549 = null;
    }
}
