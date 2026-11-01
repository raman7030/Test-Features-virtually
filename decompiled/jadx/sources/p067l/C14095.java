package p067l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۫ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 28IA */
/* JADX INFO: loaded from: classes4.dex */
public final class C14095 extends AbstractC3089 {

    /* JADX INFO: renamed from: ᩷ */
    public static final int f39953 = Float.floatToIntBits(Float.NaN);

    @Override // p067l.AbstractC3089
    /* JADX INFO: renamed from: ۧ */
    public final C19854 mo5232(C19854 c19854) throws C20525 {
        int i = c19854.f60353;
        if (i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
            throw new C20525(c19854);
        }
        if (i != 4) {
            return new C19854(c19854.f60354, c19854.f60352, 4);
        }
        return C19854.f60350;
    }

    @Override // p067l.InterfaceC2418
    /* JADX INFO: renamed from: ֫ */
    public final void mo3357(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM5229;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f5590.f60353;
        if (i2 == 21) {
            byteBufferM5229 = m5229((i / 3) * 4);
            while (iPosition < iLimit) {
                m32003(byteBufferM5229, ((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24));
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferM5229 = m5229(i);
            while (iPosition < iLimit) {
                m32003(byteBufferM5229, (byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24));
                iPosition += 4;
            }
        } else if (i2 == 1342177280) {
            byteBufferM5229 = m5229((i / 3) * 4);
            while (iPosition < iLimit) {
                m32003(byteBufferM5229, ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
                iPosition += 3;
            }
        } else if (i2 == 1610612736) {
            byteBufferM5229 = m5229(i);
            while (iPosition < iLimit) {
                m32003(byteBufferM5229, (byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
                iPosition += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM5229.flip();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32003(ByteBuffer byteBuffer, int i) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f39953) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }
}
