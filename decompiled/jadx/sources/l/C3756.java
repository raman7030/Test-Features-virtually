package l;

/* JADX INFO: renamed from: l.ۘۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5U9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3756 implements InterfaceC5872 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f11846;

    @Override // l.InterfaceC5872
    public final void onTransitionCancel(AbstractC16620 abstractC16620) {
    }

    @Override // l.InterfaceC5872
    public final void onTransitionPause(AbstractC16620 abstractC16620) {
    }

    @Override // l.InterfaceC5872
    public final void onTransitionResume(AbstractC16620 abstractC16620) {
    }

    @Override // l.InterfaceC5872
    public final void onTransitionStart(AbstractC16620 abstractC16620) {
        throw null;
    }

    @Override // l.InterfaceC5872
    public final void onTransitionStart(AbstractC16620 abstractC16620, boolean z) {
    }

    public C3756(Runnable runnable) {
        this.f11846 = runnable;
    }

    @Override // l.InterfaceC5872
    public final void onTransitionEnd(AbstractC16620 abstractC16620) {
        this.f11846.run();
    }

    @Override // l.InterfaceC5872
    public final void onTransitionEnd(AbstractC16620 abstractC16620, boolean z) {
        onTransitionEnd(abstractC16620);
    }
}
