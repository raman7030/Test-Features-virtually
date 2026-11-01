package p067l;

/* JADX INFO: renamed from: l.ᩴۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X4YZ */
/* JADX INFO: loaded from: classes5.dex */
public class C20091 extends AbstractC20762 implements InterfaceC18749 {

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC24784 f62178;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ AbstractC2655 f62179;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20091(AbstractC2655 abstractC2655, InterfaceC24784 interfaceC24784, InterfaceC3326 interfaceC3326) {
        super(abstractC2655, interfaceC3326);
        this.f62179 = abstractC2655;
        this.f62178 = interfaceC24784;
    }

    @Override // p067l.AbstractC20762
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo13523() {
        return this.f62178.getLifecycle().mo21805().m35142(EnumC15415.STARTED);
    }

    @Override // p067l.InterfaceC18749
    /* JADX INFO: renamed from: ֫ */
    public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        InterfaceC24784 interfaceC24785 = this.f62178;
        EnumC15415 enumC15415Mo21805 = interfaceC24785.getLifecycle().mo21805();
        if (enumC15415Mo21805 == EnumC15415.DESTROYED) {
            this.f62179.m4068(this.f65262);
            return;
        }
        EnumC15415 enumC15415 = null;
        while (enumC15415 != enumC15415Mo21805) {
            m46869(mo13523());
            enumC15415 = enumC15415Mo21805;
            enumC15415Mo21805 = interfaceC24785.getLifecycle().mo21805();
        }
    }

    @Override // p067l.AbstractC20762
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo45505(InterfaceC24784 interfaceC24784) {
        return this.f62178 == interfaceC24784;
    }

    @Override // p067l.AbstractC20762
    /* JADX INFO: renamed from: ֫ */
    public final void mo45504() {
        this.f62178.getLifecycle().mo21807(this);
    }
}
