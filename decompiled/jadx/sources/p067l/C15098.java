package p067l;

/* JADX INFO: renamed from: l.۬᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L69I */
/* JADX INFO: loaded from: classes4.dex */
public final class C15098 extends AbstractC4310 {

    /* JADX INFO: renamed from: ܿ */
    public static final InterfaceC9734 f43088 = new C5711();

    /* JADX INFO: renamed from: ۧ */
    public short f43089;

    /* JADX INFO: renamed from: ܽ */
    public byte f43090;

    /* JADX INFO: renamed from: ᩳ */
    public short f43091;

    public C15098(EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        this.f43090 = (byte) (bArr[i + 1] & 255);
        this.f43089 = (short) C13590.m30920(i + 2, bArr);
        this.f43091 = (short) C13590.m30920(i + 4, bArr);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7529(this.f9623.f80334);
        c3838.m7529(this.f43090);
        c3838.m7533(this.f43089);
        c3838.m7533(this.f43091);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.Format3rms;
    }
}
