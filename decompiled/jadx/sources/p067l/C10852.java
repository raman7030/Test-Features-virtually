package p067l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۡܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10852 extends AbstractC25014 {

    /* JADX INFO: renamed from: b */
    public boolean f30071b;

    /* JADX INFO: renamed from: c */
    public final C18841 f30072c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C23023 f30073d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10852(C23023 c23023, InterfaceC2925 interfaceC2925) {
        super(interfaceC2925);
        this.f30073d = c23023;
        InterfaceC2925 interfaceC2926 = this.f79851a;
        C12826.requireNonNull(interfaceC2926);
        this.f30072c = new C18841(interfaceC2926, 1);
    }

    @Override // p067l.AbstractC25014, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f79851a.mo4231c(-1L);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m45213n(Object obj) {
        InterfaceC20165 interfaceC20165 = (InterfaceC20165) ((C18546) this.f30073d.f72404t).apply(obj);
        if (interfaceC20165 != null) {
            try {
                boolean z = this.f30071b;
                C18841 c18841 = this.f30072c;
                if (!z) {
                    interfaceC20165.sequential().forEach(c18841);
                } else {
                    InterfaceC2766 interfaceC2766Spliterator = interfaceC20165.sequential().spliterator();
                    while (!this.f79851a.mo4233f() && interfaceC2766Spliterator.tryAdvance((LongConsumer) c18841)) {
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

    @Override // p067l.AbstractC25014, p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final boolean mo4233f() {
        this.f30071b = true;
        return this.f79851a.mo4233f();
    }
}
