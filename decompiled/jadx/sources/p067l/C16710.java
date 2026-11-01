package p067l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܶ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16710 extends AbstractC25014 {

    /* JADX INFO: renamed from: b */
    public boolean f49211b;

    /* JADX INFO: renamed from: c */
    public final C13496 f49212c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C23043 f49213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16710(C23043 c23043, InterfaceC2925 interfaceC2925) {
        super(interfaceC2925);
        this.f49213d = c23043;
        InterfaceC2925 interfaceC2926 = this.f79851a;
        C12826.requireNonNull(interfaceC2926);
        this.f49212c = new C13496(interfaceC2926, 1);
    }

    @Override // p067l.AbstractC25014, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f79851a.mo4231c(-1L);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m45213n(Object obj) {
        InterfaceC2804 interfaceC2804 = (InterfaceC2804) ((C18546) this.f49213d.f72427t).apply(obj);
        if (interfaceC2804 != null) {
            try {
                boolean z = this.f49211b;
                C13496 c13496 = this.f49212c;
                if (!z) {
                    interfaceC2804.sequential().forEach(c13496);
                } else {
                    InterfaceC10124 interfaceC10124Spliterator = interfaceC2804.sequential().spliterator();
                    while (!this.f79851a.mo4233f() && interfaceC10124Spliterator.tryAdvance((DoubleConsumer) c13496)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC2804.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC2804 != null) {
            interfaceC2804.close();
        }
    }

    @Override // p067l.AbstractC25014, p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final boolean mo4233f() {
        this.f49211b = true;
        return this.f79851a.mo4233f();
    }
}
