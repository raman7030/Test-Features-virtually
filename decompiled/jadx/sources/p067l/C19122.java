package p067l;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ܿ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 05HL */
/* JADX INFO: loaded from: classes5.dex */
public final class C19122 extends AbstractC4310 implements InterfaceC22416 {

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC9734 f57052 = new C19793();

    /* JADX INFO: renamed from: ۧ */
    public byte f57053;

    /* JADX INFO: renamed from: ܽ */
    public short f57054;

    public C19122(EnumC25097 enumC25097, short s, int i) {
        super(enumC25097);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        if (i >= 65536) {
            throw new RuntimeException("The register number must be less than v65536");
        }
        this.f57053 = (byte) s;
        this.f57054 = (short) i;
    }

    public C19122(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        this.f57053 = bArr[i + 1];
        this.f57054 = (short) C13590.m30920(i + 2, bArr);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529(this.f57053);
        c3838.m7533(this.f57054);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format22x;
    }

    @Override // p067l.InterfaceC22416
    /* JADX INFO: renamed from: ֫ */
    public final int mo5079() {
        return this.f57053 & 255;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m43464() {
        return this.f57054 & HPKE.aead_EXPORT_ONLY;
    }
}
