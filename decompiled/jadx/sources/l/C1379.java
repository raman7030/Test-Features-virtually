package l;

/* JADX INFO: renamed from: l.֨᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C59K */
/* JADX INFO: loaded from: classes2.dex */
public final class C1379 extends AbstractC2043 implements InterfaceC14742 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7750 f5015 = new C5613();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f5016;

    public C1379(EnumC23915 enumC23915, int i) {
        super(enumC23915);
        this.f5016 = i;
        if (i == 0) {
            throw new RuntimeException("The address offset cannot be 0. Use goto/32 instead.");
        }
    }

    public C1379(EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        this.f5016 = C11807.m28870(i + 2, bArr);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        int i2 = this.f5016;
        if (i2 == 0) {
            throw new RuntimeException("The address offset cannot be 0. Use goto/32 instead");
        }
        if (i2 < -32768 || i2 > 32767) {
            throw new RuntimeException("The address offset is out of range. It must be in [-32768,-1] or [1, 32768]");
        }
        c1547.m5300(this.f6840.f77583);
        c1547.m5300(0);
        c1547.m5304(i2);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.Format20t;
    }

    @Override // l.InterfaceC14742
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo4860() {
        return this.f5016;
    }
}
