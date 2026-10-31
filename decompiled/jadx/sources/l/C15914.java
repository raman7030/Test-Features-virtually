package l;

/* JADX INFO: renamed from: l.ܺۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5H1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15914 extends C18032 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2510 f49155;

    @Override // l.C18032, l.InterfaceC5872
    public final void onTransitionStart(AbstractC16620 abstractC16620) {
        C2510 c2510 = this.f49155;
        if (c2510.f7973) {
            return;
        }
        c2510.start();
        c2510.f7973 = true;
    }

    @Override // l.C18032, l.InterfaceC5872
    public final void onTransitionEnd(AbstractC16620 abstractC16620) {
        C2510 c2510 = this.f49155;
        int i = c2510.f7976 - 1;
        c2510.f7976 = i;
        if (i == 0) {
            c2510.f7973 = false;
            c2510.end();
        }
        abstractC16620.removeListener(this);
    }
}
