package p067l;

/* JADX INFO: renamed from: l.ۛ᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8328 implements InterfaceC9988, InterfaceC22729, InterfaceC7441 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f22276;

    public /* synthetic */ C8328(Object obj) {
        this.f22276 = obj;
    }

    @Override // p067l.InterfaceC9988
    /* JADX INFO: renamed from: ۧ */
    public void mo6895(Object obj, Throwable th) {
        C21050 c21050 = (C21050) this.f22276;
        c21050.f66087.post(new RunnableC17695(c21050, th, 0));
    }

    @Override // p067l.InterfaceC22729
    public Object apply(Object obj) {
        return ((C13693) this.f22276).f38631.m55039().m12888((InterfaceC16692) new C20677((Throwable) obj));
    }
}
