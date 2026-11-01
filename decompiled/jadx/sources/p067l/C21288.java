package p067l;

/* JADX INFO: renamed from: l.᩶ۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21288 implements InterfaceC9934, InterfaceC18263, InterfaceC9988, InterfaceC4595 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f66955;

    public /* synthetic */ C21288(Object obj) {
        this.f66955 = obj;
    }

    public /* synthetic */ C21288(C2772 c2772, C17702 c17702) {
        this.f66955 = c17702;
    }

    @Override // p067l.InterfaceC18263
    public Object apply(Object obj) {
        C15936 c15936 = (C15936) obj;
        ((C14557) this.f66955).getClass();
        return c15936;
    }

    @Override // p067l.InterfaceC4595
    /* JADX INFO: renamed from: ֫ */
    public void mo8466(int i) {
        ((C8963) this.f66955).m52469(i);
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).mo6109((C17702) this.f66955);
    }

    @Override // p067l.InterfaceC9988
    /* JADX INFO: renamed from: ۧ */
    public void mo6895(Object obj, Throwable th) {
        FutureC5767 futureC5767 = (FutureC5767) this.f66955;
        if (th == null) {
            futureC5767.m12889((Object) null);
        } else {
            futureC5767.m12891(th);
        }
    }
}
