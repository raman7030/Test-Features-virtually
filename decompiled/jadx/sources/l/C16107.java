package l;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: l.ܺᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16107 extends CountedCompleter {
    public InterfaceC15234 a;
    public final InterfaceC0585 b;
    public final AbstractC9198 c;
    public long d;

    public C16107(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, InterfaceC0585 interfaceC0585) {
        super(null);
        this.b = interfaceC0585;
        this.c = abstractC9198;
        this.a = interfaceC15234;
        this.d = 0L;
    }

    public C16107(C16107 c16107, InterfaceC15234 interfaceC15234) {
        super(c16107);
        this.a = interfaceC15234;
        this.b = c16107.b;
        this.d = c16107.d;
        this.c = c16107.c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        InterfaceC15234 interfaceC15234TrySplit;
        InterfaceC15234 interfaceC15234 = this.a;
        long jEstimateSize = interfaceC15234.estimateSize();
        long jE = this.d;
        if (jE == 0) {
            jE = AbstractC13158.e(jEstimateSize);
            this.d = jE;
        }
        boolean zS = EnumC7330.SHORT_CIRCUIT.s(((AbstractC12725) this.c).m);
        InterfaceC0585 interfaceC0585 = this.b;
        boolean z = false;
        C16107 c16107 = this;
        while (true) {
            if (zS && interfaceC0585.f()) {
                break;
            }
            if (jEstimateSize <= jE || (interfaceC15234TrySplit = interfaceC15234.trySplit()) == null) {
                c16107.c.M(interfaceC15234, interfaceC0585);
                break;
            }
            C16107 c16108 = new C16107(c16107, interfaceC15234TrySplit);
            c16107.addToPendingCount(1);
            if (z) {
                interfaceC15234 = interfaceC15234TrySplit;
            } else {
                C16107 c16109 = c16107;
                c16107 = c16108;
                c16108 = c16109;
            }
            z = !z;
            c16107.fork();
            c16107 = c16108;
            jEstimateSize = interfaceC15234.estimateSize();
        }
        c16107.a = null;
        c16107.propagateCompletion();
    }
}
