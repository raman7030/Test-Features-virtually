package l;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۙ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5ZS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4928 extends AbstractC16859 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f15534 = new C20451();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f15535;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public short f15536;

    public C4928(EnumC23915 enumC23915, short s, int i, AbstractC5116 abstractC5116) {
        super(enumC23915, abstractC5116);
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
        this.f15535 = (byte) s;
        this.f15536 = (short) i;
    }

    public C4928(C3454 c3454, EnumC23915 enumC23915, byte[] bArr, int i) {
        super(c3454, enumC23915, bArr, i);
        this.f15535 = (byte) (bArr[i + 1] & 255);
        this.f15536 = (short) C11807.m28871(i + 4, bArr);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300(this.f15535);
        c1547.m5304(m39631().m14661());
        c1547.m5304(this.f15536);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format3rc;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final short m14349() {
        return (short) (this.f15535 & 255);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m14348() {
        return this.f15536 & HPKE.aead_EXPORT_ONLY;
    }
}
