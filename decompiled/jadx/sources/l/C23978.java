package l;

/* JADX INFO: renamed from: l.᩻᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 455Z */
/* JADX INFO: loaded from: classes.dex */
public final class C23978 extends AbstractC2043 implements InterfaceC21094 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f77742 = new C14805();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte f77743;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f77744;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte f77745;

    public C23978(EnumC23915 enumC23915, short s, short s2, short s3) {
        super(enumC23915);
        if (s >= 256 || s2 >= 256 || s3 >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f77743 = (byte) s;
        this.f77744 = (byte) s2;
        this.f77745 = (byte) s3;
    }

    public C23978(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        this.f77743 = bArr[i + 1];
        this.f77744 = bArr[i + 2];
        this.f77745 = bArr[i + 3];
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5300(this.f6840.f77583);
        c1547.m5300(this.f77743);
        c1547.m5300(this.f77744);
        c1547.m5300(this.f77745);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format23x;
    }

    @Override // l.InterfaceC21094
    /* JADX INFO: renamed from: ֫ */
    public final int mo2740() {
        return this.f77743 & 255;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m52797() {
        return this.f77744 & 255;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m52798() {
        return this.f77745 & 255;
    }
}
