package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܶ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15090 extends AbstractC23827 {
    public boolean b;
    public final C11708 c;
    public final /* synthetic */ C21753 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15090(C21753 c21753, InterfaceC0585 interfaceC0585) {
        super(interfaceC0585);
        this.d = c21753;
        InterfaceC0585 interfaceC0586 = this.a;
        C11003.requireNonNull(interfaceC0586);
        this.c = new C11708(interfaceC0586, 1);
    }

    @Override // l.AbstractC23827, l.InterfaceC0585
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        InterfaceC0458 interfaceC0458 = (InterfaceC0458) ((C17022) this.d.t).apply(obj);
        if (interfaceC0458 != null) {
            try {
                boolean z = this.b;
                C11708 c11708 = this.c;
                if (!z) {
                    interfaceC0458.sequential().forEach(c11708);
                } else {
                    InterfaceC8160 interfaceC8160Spliterator = interfaceC0458.sequential().spliterator();
                    while (!this.a.f() && interfaceC8160Spliterator.tryAdvance((DoubleConsumer) c11708)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC0458.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC0458 != null) {
            interfaceC0458.close();
        }
    }

    @Override // l.AbstractC23827, l.InterfaceC0585
    public final boolean f() {
        this.b = true;
        return this.a.f();
    }
}
