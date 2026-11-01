package p067l;

/* JADX INFO: renamed from: l.֨ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82T8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3484 implements InterfaceC12777, InterfaceC3132 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C14213 f6990;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC12777 f6991;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC20877 f6992 = null;

    public AbstractC3484(C14213 c14213, InterfaceC12777 interfaceC12777) {
        this.f6990 = c14213;
        this.f6991 = interfaceC12777;
    }

    @Override // p067l.InterfaceC12777
    public final InterfaceC10250 getReference() {
        AbstractC20877 abstractC20877 = this.f6992;
        if (abstractC20877 != null) {
            return abstractC20877;
        }
        InterfaceC12777 interfaceC12777 = this.f6991;
        return C14213.m32684(this.f6990, interfaceC12777.mo5880(), interfaceC12777.getReference());
    }

    @Override // p067l.InterfaceC12777
    /* JADX INFO: renamed from: ֡ */
    public final int mo5880() {
        return this.f6991.mo5880();
    }

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ۢ */
    public final EnumC3167 mo6217() {
        return this.f6991.mo6217();
    }

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ۚ */
    public final int mo6216() {
        return this.f6991.mo6216();
    }

    @Override // p067l.InterfaceC3132
    /* JADX INFO: renamed from: ֫ */
    public void mo5343(C20765 c20765) {
        this.f6992 = (AbstractC20877) c20765.m46903(getReference());
    }
}
