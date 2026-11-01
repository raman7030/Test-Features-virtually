package p067l;

/* JADX INFO: renamed from: l.֨᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C59K */
/* JADX INFO: loaded from: classes2.dex */
public final class C3679 extends AbstractC4310 implements InterfaceC16379 {

    /* JADX INFO: renamed from: ܽ */
    public static final InterfaceC9734 f7787 = new C7703();

    /* JADX INFO: renamed from: ۧ */
    public int f7788;

    public C3679(EnumC25097 enumC25097, int i) {
        super(enumC25097);
        this.f7788 = i;
        if (i == 0) {
            throw new RuntimeException("The address offset cannot be 0. Use goto/32 instead.");
        }
    }

    public C3679(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        this.f7788 = C13590.m30919(i + 2, bArr);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        int i2 = this.f7788;
        if (i2 == 0) {
            throw new RuntimeException("The address offset cannot be 0. Use goto/32 instead");
        }
        if (i2 < -32768 || i2 > 32767) {
            throw new RuntimeException("The address offset is out of range. It must be in [-32768,-1] or [1, 32768]");
        }
        c3838.m7529(this.f9623.f80334);
        c3838.m7529(0);
        c3838.m7533(i2);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format20t;
    }

    @Override // p067l.InterfaceC16379
    /* JADX INFO: renamed from: ᩳ */
    public final int mo7098() {
        return this.f7788;
    }
}
