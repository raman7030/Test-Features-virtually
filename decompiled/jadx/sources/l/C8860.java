package l;

/* JADX INFO: renamed from: l.ۡۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5H1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8860 extends C18032 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2510 f26976;

    public C8860(C2510 c2510) {
        this.f26976 = c2510;
    }

    @Override // l.C18032, l.InterfaceC5872
    public final void onTransitionCancel(AbstractC16620 abstractC16620) {
        C2510 c2510 = this.f26976;
        c2510.f7972.remove(abstractC16620);
        if (c2510.hasAnimators()) {
            return;
        }
        c2510.notifyListeners(InterfaceC10977.f33031, false);
        c2510.mEnded = true;
        c2510.notifyListeners(InterfaceC10977.f33032, false);
    }
}
