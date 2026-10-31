package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܰܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13969 extends AbstractC1085 {
    public boolean b;
    public final C5878 c;
    public final /* synthetic */ C7641 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13969(C7641 c7641, InterfaceC0585 interfaceC0585) {
        super(interfaceC0585);
        this.d = c7641;
        InterfaceC0585 interfaceC0586 = this.a;
        C11003.requireNonNull(interfaceC0586);
        this.c = new C5878(interfaceC0586, 1);
    }

    @Override // l.AbstractC1085, l.InterfaceC0585
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // l.InterfaceC10422, l.InterfaceC0585
    public final void accept(int i) {
        InterfaceC11315 interfaceC11315 = (InterfaceC11315) ((C16607) this.d.t).apply(i);
        if (interfaceC11315 != null) {
            try {
                boolean z = this.b;
                C5878 c5878 = this.c;
                if (!z) {
                    interfaceC11315.sequential().forEach(c5878);
                } else {
                    InterfaceC18764 interfaceC18764Spliterator = interfaceC11315.sequential().spliterator();
                    while (!this.a.f() && interfaceC18764Spliterator.tryAdvance((IntConsumer) c5878)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC11315.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC11315 != null) {
            interfaceC11315.close();
        }
    }

    @Override // l.AbstractC1085, l.InterfaceC0585
    public final boolean f() {
        this.b = true;
        return this.a.f();
    }
}
