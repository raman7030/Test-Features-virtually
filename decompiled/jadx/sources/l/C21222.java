package l;

import com.alipay.sdk.m.p.a;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩸֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8L0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21222 extends AbstractC0759 {
    @Override // l.AbstractC0759
    /* JADX INFO: renamed from: ۧ */
    public final C18399 mo2903(C18399 c18399) throws C19105 {
        int i = c18399.f57133;
        if (i != 3 && i != 2 && i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
            throw new C19105(c18399);
        }
        if (i != 2) {
            return new C18399(c18399.f57134, c18399.f57132, 2);
        }
        return C18399.f57130;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    @Override // l.InterfaceC0053
    /* JADX INFO: renamed from: ֫ */
    public final void mo962(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f2818.f57133;
        if (i2 == 3) {
            i *= 2;
        } else if (i2 != 4) {
            if (i2 != 21) {
                if (i2 == 22) {
                    i /= 2;
                } else if (i2 != 268435456) {
                    if (i2 != 1342177280) {
                        if (i2 != 1610612736) {
                            throw new IllegalStateException();
                        }
                        i /= 2;
                    }
                }
            }
            i /= 3;
            i *= 2;
        } else {
            i /= 2;
        }
        ByteBuffer byteBufferM2900 = m2900(i);
        int i3 = this.f2818.f57133;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferM2900.put((byte) 0);
                byteBufferM2900.put((byte) ((byteBuffer.get(iPosition) & 255) + a.g));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sM10997 = (short) (C3603.m10997(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferM2900.put((byte) (sM10997 & 255));
                byteBufferM2900.put((byte) ((sM10997 >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 21) {
            while (iPosition < iLimit) {
                byteBufferM2900.put(byteBuffer.get(iPosition + 1));
                byteBufferM2900.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            while (iPosition < iLimit) {
                byteBufferM2900.put(byteBuffer.get(iPosition + 2));
                byteBufferM2900.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM2900.put(byteBuffer.get(iPosition + 1));
                byteBufferM2900.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferM2900.put(byteBuffer.get(iPosition + 1));
                byteBufferM2900.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferM2900.put(byteBuffer.get(iPosition + 1));
                byteBufferM2900.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM2900.flip();
    }
}
