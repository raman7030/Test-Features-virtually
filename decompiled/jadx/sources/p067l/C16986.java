package p067l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܶܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16986 extends AbstractC8765 {

    /* JADX INFO: renamed from: b */
    public boolean f50222b;

    /* JADX INFO: renamed from: c */
    public final C13496 f50223c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C23043 f50224d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16986(C23043 c23043, InterfaceC2925 interfaceC2925) {
        super(interfaceC2925);
        this.f50224d = c23043;
        InterfaceC2925 interfaceC2926 = this.f23785a;
        C12826.requireNonNull(interfaceC2926);
        this.f50223c = new C13496(interfaceC2926, 1);
    }

    @Override // p067l.AbstractC8765, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f23785a.mo4231c(-1L);
    }

    @Override // p067l.InterfaceC7580, p067l.InterfaceC2925
    public final void accept(double d) {
        InterfaceC2804 interfaceC2804 = (InterfaceC2804) ((C18546) this.f50224d.f72427t).apply(d);
        if (interfaceC2804 != null) {
            try {
                boolean z = this.f50222b;
                C13496 c13496 = this.f50223c;
                if (!z) {
                    interfaceC2804.sequential().forEach(c13496);
                } else {
                    InterfaceC10124 interfaceC10124Spliterator = interfaceC2804.sequential().spliterator();
                    while (!this.f23785a.mo4233f() && interfaceC10124Spliterator.tryAdvance((DoubleConsumer) c13496)) {
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

    @Override // p067l.AbstractC8765, p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final boolean mo4233f() {
        this.f50222b = true;
        return this.f23785a.mo4233f();
    }
}
