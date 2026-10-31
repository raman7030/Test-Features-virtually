package l;

/* JADX INFO: renamed from: l.ۛ᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6270 implements InterfaceC8017, InterfaceC21423, InterfaceC5337 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19413;

    public /* synthetic */ C6270(Object obj) {
        this.f19413 = obj;
    }

    @Override // l.InterfaceC8017
    /* JADX INFO: renamed from: ۧ */
    public void mo4663(Object obj, Throwable th) {
        C19656 c19656 = (C19656) this.f19413;
        c19656.f63464.post(new RunnableC16126(c19656, th, 0));
    }

    @Override // l.InterfaceC21423
    public Object apply(Object obj) {
        return ((C11915) this.f19413).f35622.m52630().m10911((InterfaceC15071) new C19264((Throwable) obj));
    }
}
