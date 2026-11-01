package p067l;

/* JADX INFO: renamed from: l.ۛܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAKC */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8202 extends AbstractC5996 {

    /* JADX INFO: renamed from: ۡ֫ */
    public static final /* synthetic */ int f21770 = 0;

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final DialogInterfaceC2564 mo12166(AbstractActivityC5549 abstractActivityC5549) {
        final C24164 c24164 = new C24164(abstractActivityC5549);
        c24164.mo51878(new RunnableC10258(4, this));
        if (mo5459()) {
            c24164.mo51877(new ViewOnClickListenerC11051(3, c24164));
        } else {
            m13458(abstractActivityC5549);
        }
        m13468().m4066(c24164.m53441(), new InterfaceC3326() { // from class: l.ۤܶۢ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                AbstractC8202.m18990(this.f34167, c24164);
            }
        });
        c24164.mo51883();
        return c24164.m53441();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m18990(AbstractC8202 abstractC8202, C24164 c24164) {
        if (abstractC8202.m13497()) {
            c24164.m53437(abstractC8202.m13493());
        }
        if (abstractC8202.m13483()) {
            c24164.m53431(abstractC8202.m13470());
        }
        c24164.m53436(abstractC8202.m13475());
    }
}
