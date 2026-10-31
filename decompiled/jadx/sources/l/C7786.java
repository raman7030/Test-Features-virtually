package l;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: l.۟᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7786 extends AbstractC13158 {
    public final AbstractC9198 h;

    @Override // l.AbstractC13158, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC13158 abstractC13158 = this.d;
        if (abstractC13158 != null) {
            InterfaceC18204 interfaceC18204 = (InterfaceC18204) ((C7786) abstractC13158).f;
            interfaceC18204.i((InterfaceC18204) ((C7786) this.e).f);
            this.f = interfaceC18204;
        }
        super.onCompletion(countedCompleter);
    }

    public C7786(AbstractC9198 abstractC9198, AbstractC9198 abstractC9199, InterfaceC15234 interfaceC15234) {
        super(abstractC9199, interfaceC15234);
        this.h = abstractC9198;
    }

    public C7786(C7786 c7786, InterfaceC15234 interfaceC15234) {
        super(c7786, interfaceC15234);
        this.h = c7786.h;
    }

    @Override // l.AbstractC13158
    public final AbstractC13158 c(InterfaceC15234 interfaceC15234) {
        return new C7786(this, interfaceC15234);
    }

    @Override // l.AbstractC13158
    public final Object a() {
        AbstractC9198 abstractC9198 = this.a;
        InterfaceC18204 interfaceC18204E0 = this.h.e0();
        abstractC9198.f0(this.b, interfaceC18204E0);
        return interfaceC18204E0;
    }
}
