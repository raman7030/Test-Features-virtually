package p067l;

/* JADX INFO: renamed from: l.ۘۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5U9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5938 implements InterfaceC7949 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ Runnable f14652;

    @Override // p067l.InterfaceC7949
    public final void onTransitionCancel(AbstractC18164 abstractC18164) {
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionPause(AbstractC18164 abstractC18164) {
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionResume(AbstractC18164 abstractC18164) {
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionStart(AbstractC18164 abstractC18164) {
        throw null;
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionStart(AbstractC18164 abstractC18164, boolean z) {
    }

    public C5938(Runnable runnable) {
        this.f14652 = runnable;
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionEnd(AbstractC18164 abstractC18164) {
        this.f14652.run();
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionEnd(AbstractC18164 abstractC18164, boolean z) {
        onTransitionEnd(abstractC18164);
    }
}
