package p067l;

/* JADX INFO: renamed from: l.ۚܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82T8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7508 extends AbstractC3484 implements InterfaceC14532 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C14213 f19722;

    /* JADX INFO: renamed from: ۙ */
    public AbstractC20877 f19723;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7508(C14213 c14213, InterfaceC14532 interfaceC14532) {
        super(c14213, interfaceC14532);
        this.f19722 = c14213;
        this.f19723 = null;
    }

    @Override // p067l.InterfaceC14532
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC10250 mo11754() {
        AbstractC20877 abstractC20877 = this.f19723;
        if (abstractC20877 != null) {
            return abstractC20877;
        }
        InterfaceC14532 interfaceC14532 = (InterfaceC14532) this.f6991;
        return C14213.m32684(this.f19722, interfaceC14532.mo11755(), interfaceC14532.mo11754());
    }

    @Override // p067l.InterfaceC14532
    /* JADX INFO: renamed from: ۠ */
    public final int mo11755() {
        return ((InterfaceC14532) this.f6991).mo11755();
    }

    @Override // p067l.AbstractC3484, p067l.InterfaceC3132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5343(C20765 c20765) {
        super.mo5343(c20765);
        this.f19723 = (AbstractC20877) c20765.m46903(mo11754());
    }
}
