package p067l;

/* JADX INFO: renamed from: l.᩷᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G67N */
/* JADX INFO: loaded from: classes5.dex */
public final class C22456 extends AbstractC4310 implements InterfaceC16379 {

    /* JADX INFO: renamed from: ܽ */
    public static final InterfaceC9734 f70846 = new C9044();

    /* JADX INFO: renamed from: ۧ */
    public int f70847;

    public C22456(EnumC25097 enumC25097, int i) {
        super(enumC25097);
        this.f70847 = i;
        if (i == 0) {
            throw new RuntimeException("The address offset cannot be 0. Use goto/32 instead.");
        }
    }

    public C22456(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        this.f70847 = bArr[i + 1];
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        int i2 = this.f70847;
        if (i2 == 0) {
            throw new RuntimeException("The address offset cannot be 0. Use goto/32 instead");
        }
        if (i2 < -128 || i2 > 127) {
            throw new RuntimeException("The address offset is out of range. It must be in [-128,-1] or [1, 127]");
        }
        c3838.m7529(this.f9623.f80334);
        c3838.m7529(i2);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format10t;
    }

    @Override // p067l.InterfaceC16379
    /* JADX INFO: renamed from: ᩳ */
    public final int mo7098() {
        return this.f70847;
    }
}
