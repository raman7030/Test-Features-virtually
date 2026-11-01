package p067l;

/* JADX INFO: renamed from: l.ܺۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5H1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17493 extends C19506 {

    /* JADX INFO: renamed from: ֫ */
    public C4754 f52301;

    @Override // p067l.C19506, p067l.InterfaceC7949
    public final void onTransitionStart(AbstractC18164 abstractC18164) {
        C4754 c4754 = this.f52301;
        if (c4754.f10764) {
            return;
        }
        c4754.start();
        c4754.f10764 = true;
    }

    @Override // p067l.C19506, p067l.InterfaceC7949
    public final void onTransitionEnd(AbstractC18164 abstractC18164) {
        C4754 c4754 = this.f52301;
        int i = c4754.f10767 - 1;
        c4754.f10767 = i;
        if (i == 0) {
            c4754.f10764 = false;
            c4754.end();
        }
        abstractC18164.removeListener(this);
    }
}
