package l;

/* JADX INFO: renamed from: l.᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20576 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9287 f66256;

    public RunnableC20576(C9287 c9287) {
        this.f66256 = c9287;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9287 c9287 = this.f66256;
        C12499 c12499 = c9287.f28147;
        if (c12499 == null || !c12499.isAttachedToWindow() || c9287.f28147.getCount() <= c9287.f28147.getChildCount() || c9287.f28147.getChildCount() > c9287.f28154) {
            return;
        }
        c9287.f28156.setInputMethodMode(2);
        c9287.show();
    }
}
