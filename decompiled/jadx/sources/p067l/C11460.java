package p067l;

/* JADX INFO: renamed from: l.ۢۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5H1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11460 extends C19506 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC18164 f31969;

    public C11460(AbstractC18164 abstractC18164) {
        this.f31969 = abstractC18164;
    }

    @Override // p067l.C19506, p067l.InterfaceC7949
    public final void onTransitionEnd(AbstractC18164 abstractC18164) {
        this.f31969.runAnimators();
        abstractC18164.removeListener(this);
    }
}
