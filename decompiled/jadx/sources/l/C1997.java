package l;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: l.֫ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1997 extends CountedCompleter {
    public final AbstractC9198 a;
    public InterfaceC15234 b;
    public final long c;
    public final ConcurrentMapC10942 d;
    public final AbstractC20300 e;
    public final C1997 f;
    public InterfaceC5214 g;

    public C1997(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, AbstractC20300 abstractC20300) {
        super(null);
        this.a = abstractC9198;
        this.b = interfaceC15234;
        this.c = AbstractC13158.e(interfaceC15234.estimateSize());
        this.d = new ConcurrentMapC10942(Math.max(16, AbstractC13158.g << 1));
        this.e = abstractC20300;
        this.f = null;
    }

    public C1997(C1997 c1997, InterfaceC15234 interfaceC15234, C1997 c1998) {
        super(c1997);
        this.a = c1997.a;
        this.b = interfaceC15234;
        this.c = c1997.c;
        this.d = c1997.d;
        this.e = c1997.e;
        this.f = c1998;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        InterfaceC15234 interfaceC15234TrySplit;
        InterfaceC15234 interfaceC15234 = this.b;
        long j = this.c;
        boolean z = false;
        C1997 c1997 = this;
        while (interfaceC15234.estimateSize() > j && (interfaceC15234TrySplit = interfaceC15234.trySplit()) != null) {
            C1997 c1998 = new C1997(c1997, interfaceC15234TrySplit, c1997.f);
            C1997 c1999 = new C1997(c1997, interfaceC15234, c1998);
            c1997.addToPendingCount(1);
            c1999.addToPendingCount(1);
            c1997.d.put(c1998, c1999);
            if (c1997.f != null) {
                c1998.addToPendingCount(1);
                if (c1997.d.replace(c1997.f, c1997, c1998)) {
                    c1997.addToPendingCount(-1);
                } else {
                    c1998.addToPendingCount(-1);
                }
            }
            if (z) {
                interfaceC15234 = interfaceC15234TrySplit;
                c1997 = c1998;
                c1998 = c1999;
            } else {
                c1997 = c1999;
            }
            z = !z;
            c1998.fork();
        }
        if (c1997.getPendingCount() > 0) {
            C10964 c10964 = new C10964(19);
            AbstractC9198 abstractC9198 = c1997.a;
            InterfaceC8948 interfaceC8948C0 = abstractC9198.c0(abstractC9198.R(interfaceC15234), c10964);
            c1997.a.f0(interfaceC15234, interfaceC8948C0);
            c1997.g = interfaceC8948C0.build();
            c1997.b = null;
        }
        c1997.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        InterfaceC5214 interfaceC5214 = this.g;
        if (interfaceC5214 != null) {
            interfaceC5214.forEach(this.e);
            this.g = null;
        } else {
            InterfaceC15234 interfaceC15234 = this.b;
            if (interfaceC15234 != null) {
                this.a.f0(interfaceC15234, this.e);
                this.b = null;
            }
        }
        C1997 c1997 = (C1997) this.d.remove(this);
        if (c1997 != null) {
            c1997.tryComplete();
        }
    }
}
