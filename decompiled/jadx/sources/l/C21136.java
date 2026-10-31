package l;

/* JADX INFO: renamed from: l.᩷᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G67N */
/* JADX INFO: loaded from: classes5.dex */
public final class C21136 extends AbstractC2043 implements InterfaceC14742 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f68164 = new C7024();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f68165;

    public C21136(EnumC23915 enumC23915, int i) {
        super(enumC23915);
        this.f68165 = i;
        if (i == 0) {
            throw new RuntimeException("The address offset cannot be 0. Use goto/32 instead.");
        }
    }

    public C21136(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        this.f68165 = bArr[i + 1];
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        int i2 = this.f68165;
        if (i2 == 0) {
            throw new RuntimeException("The address offset cannot be 0. Use goto/32 instead");
        }
        if (i2 < -128 || i2 > 127) {
            throw new RuntimeException("The address offset is out of range. It must be in [-128,-1] or [1, 127]");
        }
        c1547.m5300(this.f6840.f77583);
        c1547.m5300(i2);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format10t;
    }

    @Override // l.InterfaceC14742
    /* JADX INFO: renamed from: ᩳ */
    public final int mo4860() {
        return this.f68165;
    }
}
