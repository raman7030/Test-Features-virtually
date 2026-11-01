package p067l;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.֡᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H580 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3028 extends AbstractC4310 implements InterfaceC22416 {

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC9734 f5407 = new C21135();

    /* JADX INFO: renamed from: ۧ */
    public short f5408;

    /* JADX INFO: renamed from: ܽ */
    public short f5409;

    public C3028(EnumC25097 enumC25097, int i, int i2) {
        super(enumC25097);
        if (i >= 65536 || i2 >= 65536) {
            throw new RuntimeException("The register number must be less than v65536");
        }
        this.f5408 = (short) i;
        this.f5409 = (short) i2;
    }

    public C3028(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        this.f5408 = (short) C13590.m30920(i + 2, bArr);
        this.f5409 = (short) C13590.m30920(i + 4, bArr);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529(0);
        c3838.m7533(this.f5408);
        c3838.m7533(this.f5409);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format32x;
    }

    @Override // p067l.InterfaceC22416
    /* JADX INFO: renamed from: ֫ */
    public final int mo5079() {
        return this.f5408 & HPKE.aead_EXPORT_ONLY;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m5128() {
        return this.f5409 & HPKE.aead_EXPORT_ONLY;
    }
}
