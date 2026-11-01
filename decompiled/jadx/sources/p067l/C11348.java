package p067l;

import java.util.function.Function;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۢ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11348 extends AbstractC25014 {

    /* JADX INFO: renamed from: b */
    public boolean f31596b;

    /* JADX INFO: renamed from: c */
    public final C7955 f31597c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9631 f31598d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11348(C9631 c9631, InterfaceC2925 interfaceC2925) {
        super(interfaceC2925);
        this.f31598d = c9631;
        InterfaceC2925 interfaceC2926 = this.f79851a;
        C12826.requireNonNull(interfaceC2926);
        this.f31597c = new C7955(interfaceC2926, 1);
    }

    @Override // p067l.AbstractC25014, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f79851a.mo4231c(-1L);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        InterfaceC13123 interfaceC13123 = (InterfaceC13123) ((Function) this.f31598d.f26512t).apply(obj);
        if (interfaceC13123 != null) {
            try {
                boolean z = this.f31596b;
                C7955 c7955 = this.f31597c;
                if (!z) {
                    interfaceC13123.sequential().forEach(c7955);
                } else {
                    InterfaceC20202 interfaceC20202Spliterator = interfaceC13123.sequential().spliterator();
                    while (!this.f79851a.mo4233f() && interfaceC20202Spliterator.tryAdvance((IntConsumer) c7955)) {
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

    @Override // p067l.AbstractC25014, p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final boolean mo4233f() {
        this.f31596b = true;
        return this.f79851a.mo4233f();
    }
}
