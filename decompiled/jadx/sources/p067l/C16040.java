package p067l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܳ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16040 extends AbstractC8094 {

    /* JADX INFO: renamed from: b */
    public boolean f46431b;

    /* JADX INFO: renamed from: c */
    public final C18841 f46432c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C23023 f46433d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16040(C23023 c23023, InterfaceC2925 interfaceC2925) {
        super(interfaceC2925);
        this.f46433d = c23023;
        InterfaceC2925 interfaceC2926 = this.f21348a;
        C12826.requireNonNull(interfaceC2926);
        this.f46432c = new C18841(interfaceC2926, 1);
    }

    @Override // p067l.AbstractC8094, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f21348a.mo4231c(-1L);
    }

    @Override // p067l.InterfaceC16336, p067l.InterfaceC2925
    public final void accept(long j) {
        InterfaceC20165 interfaceC20165 = (InterfaceC20165) ((C18546) this.f46433d.f72404t).apply(j);
        if (interfaceC20165 != null) {
            try {
                boolean z = this.f46431b;
                C18841 c18841 = this.f46432c;
                if (!z) {
                    interfaceC20165.sequential().forEach(c18841);
                } else {
                    InterfaceC2766 interfaceC2766Spliterator = interfaceC20165.sequential().spliterator();
                    while (!this.f21348a.mo4233f() && interfaceC2766Spliterator.tryAdvance((LongConsumer) c18841)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC20165.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC20165 != null) {
            interfaceC20165.close();
        }
    }

    @Override // p067l.AbstractC8094, p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final boolean mo4233f() {
        this.f46431b = true;
        return this.f21348a.mo4233f();
    }
}
