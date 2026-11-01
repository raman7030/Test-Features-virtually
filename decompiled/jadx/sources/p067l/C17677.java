package p067l;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: l.ܺᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17677 extends CountedCompleter {

    /* JADX INFO: renamed from: a */
    public InterfaceC16847 f52805a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2925 f52806b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11111 f52807c;

    /* JADX INFO: renamed from: d */
    public long f52808d;

    public C17677(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847, InterfaceC2925 interfaceC2925) {
        super(null);
        this.f52806b = interfaceC2925;
        this.f52807c = abstractC11111;
        this.f52805a = interfaceC16847;
        this.f52808d = 0L;
    }

    public C17677(C17677 c17677, InterfaceC16847 interfaceC16847) {
        super(c17677);
        this.f52805a = interfaceC16847;
        this.f52806b = c17677.f52806b;
        this.f52808d = c17677.f52808d;
        this.f52807c = c17677.f52807c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        InterfaceC16847 interfaceC16847TrySplit;
        InterfaceC16847 interfaceC16847 = this.f52805a;
        long jEstimateSize = interfaceC16847.estimateSize();
        long jM33979e = this.f52808d;
        if (jM33979e == 0) {
            jM33979e = AbstractC14874.m33979e(jEstimateSize);
            this.f52808d = jM33979e;
        }
        boolean zM21660s = EnumC9335.SHORT_CIRCUIT.m21660s(((AbstractC14463) this.f52807c).f41316m);
        InterfaceC2925 interfaceC2925 = this.f52806b;
        boolean z = false;
        C17677 c17677 = this;
        while (true) {
            if (zM21660s && interfaceC2925.mo4233f()) {
                break;
            }
            if (jEstimateSize <= jM33979e || (interfaceC16847TrySplit = interfaceC16847.trySplit()) == null) {
                c17677.f52807c.mo25625M(interfaceC16847, interfaceC2925);
                break;
            }
            C17677 c17678 = new C17677(c17677, interfaceC16847TrySplit);
            c17677.addToPendingCount(1);
            if (z) {
                interfaceC16847 = interfaceC16847TrySplit;
            } else {
                C17677 c17679 = c17677;
                c17677 = c17678;
                c17678 = c17679;
            }
            z = !z;
            c17677.fork();
            c17677 = c17678;
            jEstimateSize = interfaceC16847.estimateSize();
        }
        c17677.f52805a = null;
        c17677.propagateCompletion();
    }
}
