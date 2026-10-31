package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.᩵ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class CallableC19551 implements Callable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15315 f63213;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureC3575 futureC3575M10911;
        C22372 c22372 = this.f63213.f46970;
        if (c22372.f72503 && c22372.f72517 != null) {
            return new C21667(true, null);
        }
        InterfaceC20758 interfaceC20758M25230 = C10050.m25230(c22372.m5412(), C6646.of(C17852.m41819().mo23554(), new String[0]));
        if (!C20529.m47015(interfaceC20758M25230)) {
            return new C21667(false, null);
        }
        if (c22372.f72501 != null) {
            throw new IllegalStateException("Inactive session save is already running");
        }
        if (c22372.f72511 != null) {
            futureC3575M10911 = c22372.f72511.m45186();
        } else {
            futureC3575M10911 = c22372.f72497 != null ? c22372.f72497.m45254().m10911((InterfaceC15071) new C17021()) : FutureC3575.m10905(null);
        }
        c22372.f72501 = new C18845(interfaceC20758M25230, futureC3575M10911);
        return new C21667(false, c22372.f72501);
    }
}
