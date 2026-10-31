package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۡܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8926 extends AbstractC23827 {
    public boolean b;
    public final C17332 c;
    public final /* synthetic */ C21732 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8926(C21732 c21732, InterfaceC0585 interfaceC0585) {
        super(interfaceC0585);
        this.d = c21732;
        InterfaceC0585 interfaceC0586 = this.a;
        C11003.requireNonNull(interfaceC0586);
        this.c = new C17332(interfaceC0586, 1);
    }

    @Override // l.AbstractC23827, l.InterfaceC0585
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        InterfaceC18725 interfaceC18725 = (InterfaceC18725) ((C17022) this.d.t).apply(obj);
        if (interfaceC18725 != null) {
            try {
                boolean z = this.b;
                C17332 c17332 = this.c;
                if (!z) {
                    interfaceC18725.sequential().forEach(c17332);
                } else {
                    InterfaceC0418 interfaceC0418Spliterator = interfaceC18725.sequential().spliterator();
                    while (!this.a.f() && interfaceC0418Spliterator.tryAdvance((LongConsumer) c17332)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC18725.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC18725 != null) {
            interfaceC18725.close();
        }
    }

    @Override // l.AbstractC23827, l.InterfaceC0585
    public final boolean f() {
        this.b = true;
        return this.a.f();
    }
}
