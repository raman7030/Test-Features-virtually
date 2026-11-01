package p067l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 18H2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8118 extends AbstractC3089 {

    /* JADX INFO: renamed from: ۢ */
    public int[] f21405;

    /* JADX INFO: renamed from: ᩷ */
    public int[] f21406;

    /* JADX INFO: renamed from: ֫ */
    public final void m18808(int[] iArr) {
        this.f21405 = iArr;
    }

    @Override // p067l.AbstractC3089
    /* JADX INFO: renamed from: ۧ */
    public final C19854 mo5232(C19854 c19854) throws C20525 {
        int i = c19854.f60353;
        int[] iArr = this.f21405;
        if (iArr == null) {
            return C19854.f60350;
        }
        int i2 = c19854.f60352;
        if (!C5792.m13010(i)) {
            throw new C20525(c19854);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new C20525("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", c19854);
            }
            z |= i4 != i3;
            i3++;
        }
        if (z) {
            return new C19854(c19854.f60354, iArr.length, i);
        }
        return C19854.f60350;
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
    @Override // p067l.InterfaceC2418
    /* JADX INFO: renamed from: ֫ */
    public final void mo3357(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int[] iArr = this.f21406;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM5229 = m5229(((iLimit - iPosition) / this.f5590.f60351) * this.f5591.f60351);
        while (iPosition < iLimit) {
            for (int i5 : iArr) {
                int iM13023 = (C5792.m13023(this.f5590.f60353) * i5) + iPosition;
                int i6 = this.f5590.f60353;
                if (i6 == 2) {
                    byteBufferM5229.putShort(byteBuffer.getShort(iM13023));
                } else if (i6 == 3) {
                    byteBufferM5229.put(byteBuffer.get(iM13023));
                } else if (i6 == 4) {
                    byteBufferM5229.putFloat(byteBuffer.getFloat(iM13023));
                } else if (i6 != 21) {
                    if (i6 != 22) {
                        if (i6 == 268435456) {
                            byteBufferM5229.putShort(byteBuffer.getShort(iM13023));
                        } else if (i6 == 1342177280) {
                            byteOrderOrder = byteBuffer.order();
                            byteOrder = ByteOrder.BIG_ENDIAN;
                            if (byteOrderOrder == byteOrder) {
                                i = iM13023;
                            } else {
                                i = iM13023 + 2;
                            }
                            byte b = byteBuffer.get(i);
                            byte b2 = byteBuffer.get(iM13023 + 1);
                            if (byteBuffer.order() == byteOrder) {
                                iM13023 += 2;
                            }
                            i2 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(iM13023) << 8) & 65280)) >> 8;
                            if ((i2 & (-16777216)) != 0) {
                                z = true;
                            } else {
                                z = true;
                            }
                            C23877.m52956("Value out of range of 24-bit integer: " + Integer.toHexString(i2), z);
                            if (byteBufferM5229.remaining() >= 3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            C23877.m52957(z2);
                            if (byteBufferM5229.order() == byteOrder) {
                                i3 = (i2 & 16711680) >> 16;
                            } else {
                                i3 = i2 & 255;
                            }
                            byte b3 = (byte) i3;
                            byte b4 = (byte) ((i2 & 65280) >> 8);
                            if (byteBufferM5229.order() == byteOrder) {
                                i4 = i2 & 255;
                            } else {
                                i4 = (i2 & 16711680) >> 16;
                            }
                            byteBufferM5229.put(b3).put(b4).put((byte) i4);
                        } else if (i6 != 1610612736) {
                            throw new IllegalStateException("Unexpected encoding: " + this.f5590.f60353);
                        }
                    }
                    byteBufferM5229.putInt(byteBuffer.getInt(iM13023));
                } else {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iM13023;
                    } else {
                        i = iM13023 + 2;
                    }
                    byte b5 = byteBuffer.get(i);
                    byte b6 = byteBuffer.get(iM13023 + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iM13023 += 2;
                    }
                    i2 = ((((b5 << 24) & (-16777216)) | ((b6 << 16) & 16711680)) | ((byteBuffer.get(iM13023) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0 || (i2 & (-8388608)) == -8388608) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C23877.m52956("Value out of range of 24-bit integer: " + Integer.toHexString(i2), z);
                    if (byteBufferM5229.remaining() >= 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C23877.m52957(z2);
                    if (byteBufferM5229.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b7 = (byte) i3;
                    byte b8 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferM5229.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferM5229.put(b7).put(b8).put((byte) i4);
                }
            }
            iPosition += this.f5590.f60351;
        }
        byteBuffer.position(iLimit);
        byteBufferM5229.flip();
    }

    @Override // p067l.AbstractC3089
    /* JADX INFO: renamed from: ܳ */
    public final void mo5233() {
        this.f21406 = this.f21405;
    }

    @Override // p067l.AbstractC3089
    /* JADX INFO: renamed from: ۜ */
    public final void mo5231() {
        this.f21406 = null;
        this.f21405 = null;
    }
}
