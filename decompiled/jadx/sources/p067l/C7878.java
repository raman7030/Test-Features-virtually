package p067l;

/* JADX INFO: renamed from: l.ۛۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AY0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7878 {
    /* JADX INFO: renamed from: ֫ */
    public static final void m18198(Throwable th, InterfaceC16436 interfaceC16436) {
        try {
            C14583 c14583 = InterfaceC13913.f39261;
            InterfaceC13913 interfaceC13913 = (InterfaceC13913) interfaceC16436.mo11134(C14583.f41653);
            if (interfaceC13913 != null) {
                interfaceC13913.mo23642(th);
            } else {
                C11902.m27222(th, interfaceC16436);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                C12710.m29224(runtimeException, th);
                th = runtimeException;
            }
            C11902.m27222(th, interfaceC16436);
        }
    }
}
