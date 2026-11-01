package p067l;

/* JADX INFO: renamed from: l.᩷᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T590 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22476 extends AbstractC4310 implements InterfaceC16379 {

    /* JADX INFO: renamed from: ܽ */
    public static final InterfaceC9734 f70894 = new C9064();

    /* JADX INFO: renamed from: ۧ */
    public int f70895;

    public C22476(EnumC25097 enumC25097, int i) {
        super(enumC25097);
        this.f70895 = i;
    }

    public C22476(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        this.f70895 = C13590.m30908(i + 2, bArr);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529(0);
        c3838.m7531(this.f70895);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format30t;
    }

    @Override // p067l.InterfaceC16379
    /* JADX INFO: renamed from: ᩳ */
    public final int mo7098() {
        return this.f70895;
    }
}
