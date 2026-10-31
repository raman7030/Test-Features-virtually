package l;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.֡᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H580 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0694 extends AbstractC2043 implements InterfaceC21094 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f2634 = new C19746();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public short f2635;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public short f2636;

    public C0694(EnumC23915 enumC23915, int i, int i2) {
        super(enumC23915);
        if (i >= 65536 || i2 >= 65536) {
            throw new RuntimeException("The register number must be less than v65536");
        }
        this.f2635 = (short) i;
        this.f2636 = (short) i2;
    }

    public C0694(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        this.f2635 = (short) C11807.m28871(i + 2, bArr);
        this.f2636 = (short) C11807.m28871(i + 4, bArr);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300(0);
        c1547.m5304(this.f2635);
        c1547.m5304(this.f2636);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format32x;
    }

    @Override // l.InterfaceC21094
    /* JADX INFO: renamed from: ֫ */
    public final int mo2740() {
        return this.f2635 & HPKE.aead_EXPORT_ONLY;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m2783() {
        return this.f2636 & HPKE.aead_EXPORT_ONLY;
    }
}
