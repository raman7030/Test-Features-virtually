package p067l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.᩵ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class CallableC20950 implements Callable {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C16924 f65833;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureC5767 futureC5767M12888;
        C23631 c23631 = this.f65833.f50095;
        if (c23631.f75228 && c23631.f75242 != null) {
            return new C22961(true, null);
        }
        InterfaceC22097 interfaceC22097M27247 = C11920.m27247(c23631.m7641(), C8685.m20115of(C19335.m44065().mo25505(), new String[0]));
        if (!C21879.m49338(interfaceC22097M27247)) {
            return new C22961(false, null);
        }
        if (c23631.f75226 != null) {
            throw new IllegalStateException("Inactive session save is already running");
        }
        if (c23631.f75236 != null) {
            futureC5767M12888 = c23631.f75236.m47483();
        } else {
            futureC5767M12888 = c23631.f75222 != null ? c23631.f75222.m47551().m12888((InterfaceC16692) new C18545()) : FutureC5767.m12882(null);
        }
        c23631.f75226 = new C20279(interfaceC22097M27247, futureC5767M12888);
        return new C22961(false, c23631.f75226);
    }
}
