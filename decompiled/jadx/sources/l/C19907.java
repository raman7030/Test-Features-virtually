package l;

/* JADX INFO: renamed from: l.᩶ۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19907 implements InterfaceC7961, InterfaceC16724, InterfaceC8017, InterfaceC2343 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f64320;

    public /* synthetic */ C19907(Object obj) {
        this.f64320 = obj;
    }

    public /* synthetic */ C19907(C0425 c0425, C16134 c16134) {
        this.f64320 = c16134;
    }

    @Override // l.InterfaceC16724
    public Object apply(Object obj) {
        C14276 c14276 = (C14276) obj;
        ((C12825) this.f64320).getClass();
        return c14276;
    }

    @Override // l.InterfaceC2343
    /* JADX INFO: renamed from: ֫ */
    public void mo6264(int i) {
        ((C6938) this.f64320).m50129(i);
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).mo3868((C16134) this.f64320);
    }

    @Override // l.InterfaceC8017
    /* JADX INFO: renamed from: ۧ */
    public void mo4663(Object obj, Throwable th) {
        FutureC3575 futureC3575 = (FutureC3575) this.f64320;
        if (th == null) {
            futureC3575.m10912((Object) null);
        } else {
            futureC3575.m10914(th);
        }
    }
}
