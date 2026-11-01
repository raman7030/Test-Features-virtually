package p067l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܰܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15645 extends AbstractC3400 {

    /* JADX INFO: renamed from: b */
    public boolean f44761b;

    /* JADX INFO: renamed from: c */
    public final C7955 f44762c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9631 f44763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15645(C9631 c9631, InterfaceC2925 interfaceC2925) {
        super(interfaceC2925);
        this.f44763d = c9631;
        InterfaceC2925 interfaceC2926 = this.f6750a;
        C12826.requireNonNull(interfaceC2926);
        this.f44762c = new C7955(interfaceC2926, 1);
    }

    @Override // p067l.AbstractC3400, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f6750a.mo4231c(-1L);
    }

    @Override // p067l.InterfaceC12274, p067l.InterfaceC2925
    public final void accept(int i) {
        InterfaceC13123 interfaceC13123 = (InterfaceC13123) ((C18152) this.f44763d.f26512t).apply(i);
        if (interfaceC13123 != null) {
            try {
                boolean z = this.f44761b;
                C7955 c7955 = this.f44762c;
                if (!z) {
                    interfaceC13123.sequential().forEach(c7955);
                } else {
                    InterfaceC20202 interfaceC20202Spliterator = interfaceC13123.sequential().spliterator();
                    while (!this.f6750a.mo4233f() && interfaceC20202Spliterator.tryAdvance((IntConsumer) c7955)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC13123.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC13123 != null) {
            interfaceC13123.close();
        }
    }

    @Override // p067l.AbstractC3400, p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final boolean mo4233f() {
        this.f44761b = true;
        return this.f6750a.mo4233f();
    }
}
