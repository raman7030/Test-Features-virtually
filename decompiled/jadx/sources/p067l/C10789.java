package p067l;

/* JADX INFO: renamed from: l.ۡۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5H1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10789 extends C19506 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C4754 f29899;

    public C10789(C4754 c4754) {
        this.f29899 = c4754;
    }

    @Override // p067l.C19506, p067l.InterfaceC7949
    public final void onTransitionCancel(AbstractC18164 abstractC18164) {
        C4754 c4754 = this.f29899;
        c4754.f10763.remove(abstractC18164);
        if (c4754.hasAnimators()) {
            return;
        }
        c4754.notifyListeners(InterfaceC12801.f36024, false);
        c4754.mEnded = true;
        c4754.notifyListeners(InterfaceC12801.f36025, false);
    }
}
