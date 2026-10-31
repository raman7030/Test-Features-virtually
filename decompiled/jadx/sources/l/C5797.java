package l;

/* JADX INFO: renamed from: l.ۛۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AY0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5797 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m16273(Throwable th, InterfaceC14801 interfaceC14801) {
        try {
            C12852 c12852 = InterfaceC12147.f36250;
            InterfaceC12147 interfaceC12147 = (InterfaceC12147) interfaceC14801.mo9082(C12852.f38609);
            if (interfaceC12147 != null) {
                interfaceC12147.mo21673(th);
            } else {
                C10031.m25205(th, interfaceC14801);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                C10881.m27179(runtimeException, th);
                th = runtimeException;
            }
            C10031.m25205(th, interfaceC14801);
        }
    }
}
