package l;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ܿ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 05HL */
/* JADX INFO: loaded from: classes5.dex */
public final class C17628 extends AbstractC2043 implements InterfaceC21094 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f53859 = new C18334();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte f53860;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public short f53861;

    public C17628(EnumC23915 enumC23915, short s, int i) {
        super(enumC23915);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        if (i >= 65536) {
            throw new RuntimeException("The register number must be less than v65536");
        }
        this.f53860 = (byte) s;
        this.f53861 = (short) i;
    }

    public C17628(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        this.f53860 = bArr[i + 1];
        this.f53861 = (short) C11807.m28871(i + 2, bArr);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300(this.f53860);
        c1547.m5304(this.f53861);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format22x;
    }

    @Override // l.InterfaceC21094
    /* JADX INFO: renamed from: ֫ */
    public final int mo2740() {
        return this.f53860 & 255;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m41218() {
        return this.f53861 & HPKE.aead_EXPORT_ONLY;
    }
}
