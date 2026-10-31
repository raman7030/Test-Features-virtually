package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۫ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 28IA */
/* JADX INFO: loaded from: classes4.dex */
public final class C12339 extends AbstractC0759 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int f36940 = Float.floatToIntBits(Float.NaN);

    @Override // l.AbstractC0759
    /* JADX INFO: renamed from: ۧ */
    public final C18399 mo2903(C18399 c18399) throws C19105 {
        int i = c18399.f57133;
        if (i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
            throw new C19105(c18399);
        }
        if (i != 4) {
            return new C18399(c18399.f57134, c18399.f57132, 4);
        }
        return C18399.f57130;
    }

    @Override // l.InterfaceC0053
    /* JADX INFO: renamed from: ֫ */
    public final void mo962(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM2900;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f2818.f57133;
        if (i2 == 21) {
            byteBufferM2900 = m2900((i / 3) * 4);
            while (iPosition < iLimit) {
                m29943(byteBufferM2900, ((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24));
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferM2900 = m2900(i);
            while (iPosition < iLimit) {
                m29943(byteBufferM2900, (byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24));
                iPosition += 4;
            }
        } else if (i2 == 1342177280) {
            byteBufferM2900 = m2900((i / 3) * 4);
            while (iPosition < iLimit) {
                m29943(byteBufferM2900, ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
                iPosition += 3;
            }
        } else if (i2 == 1610612736) {
            byteBufferM2900 = m2900(i);
            while (iPosition < iLimit) {
                m29943(byteBufferM2900, (byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
                iPosition += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM2900.flip();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29943(ByteBuffer byteBuffer, int i) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f36940) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }
}
