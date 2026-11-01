package p067l;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۙ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5ZS */
/* JADX INFO: loaded from: classes3.dex */
public final class C7052 extends AbstractC18391 {

    /* JADX INFO: renamed from: ܿ */
    public static final InterfaceC9734 f18366 = new C21805();

    /* JADX INFO: renamed from: ܽ */
    public byte f18367;

    /* JADX INFO: renamed from: ᩳ */
    public short f18368;

    public C7052(EnumC25097 enumC25097, short s, int i, AbstractC7230 abstractC7230) {
        super(enumC25097, abstractC7230);
        if (s >= 256) {
            throw new RuntimeException("regCount must be less than 256");
        }
        if (s < 0) {
            throw new RuntimeException("regCount cannot be negative");
        }
        if (i >= 65536) {
            throw new RuntimeException("The beginning register of the range must be less than 65536");
        }
        if (i < 0) {
            throw new RuntimeException("The beginning register of the range cannot be negative");
        }
        this.f18367 = (byte) s;
        this.f18368 = (short) i;
    }

    public C7052(C5651 c5651, EnumC25097 enumC25097, byte[] bArr, int i) {
        super(c5651, enumC25097, bArr, i);
        this.f18367 = (byte) (bArr[i + 1] & 255);
        this.f18368 = (short) C13590.m30920(i + 4, bArr);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529(this.f18367);
        c3838.m7533(m41867().m16569());
        c3838.m7533(this.f18368);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format3rc;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final short m16246() {
        return (short) (this.f18367 & 255);
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m16245() {
        return this.f18368 & HPKE.aead_EXPORT_ONLY;
    }
}
