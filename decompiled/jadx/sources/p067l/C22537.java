package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩸֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8L0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22537 extends AbstractC3089 {
    @Override // p067l.AbstractC3089
    /* JADX INFO: renamed from: ۧ */
    public final C19854 mo5232(C19854 c19854) throws C20525 {
        int i = c19854.f60353;
        if (i != 3 && i != 2 && i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
            throw new C20525(c19854);
        }
        if (i != 2) {
            return new C19854(c19854.f60354, c19854.f60352, 2);
        }
        return C19854.f60350;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    @Override // p067l.InterfaceC2418
    /* JADX INFO: renamed from: ֫ */
    public final void mo3357(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f5590.f60353;
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
        ByteBuffer byteBufferM5229 = m5229(i);
        int i3 = this.f5590.f60353;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferM5229.put((byte) 0);
                byteBufferM5229.put((byte) ((byteBuffer.get(iPosition) & 255) + C0184a.f879g));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sM12973 = (short) (C5792.m12973(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferM5229.put((byte) (sM12973 & 255));
                byteBufferM5229.put((byte) ((sM12973 >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 21) {
            while (iPosition < iLimit) {
                byteBufferM5229.put(byteBuffer.get(iPosition + 1));
                byteBufferM5229.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            while (iPosition < iLimit) {
                byteBufferM5229.put(byteBuffer.get(iPosition + 2));
                byteBufferM5229.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM5229.put(byteBuffer.get(iPosition + 1));
                byteBufferM5229.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferM5229.put(byteBuffer.get(iPosition + 1));
                byteBufferM5229.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferM5229.put(byteBuffer.get(iPosition + 1));
                byteBufferM5229.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM5229.flip();
    }
}
