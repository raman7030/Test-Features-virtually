package l;

/* JADX INFO: renamed from: l.᩷ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20620 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0157 f66339;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0863 f66340;

    public RunnableC20620(C0157 c0157, C0863 c0863) {
        this.f66339 = c0157;
        this.f66340 = c0863;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9996 c9996 = (C9996) this.f66339.f1338.f45642.remove(this.f66340.f3353.getBinder());
        if (c9996 != null) {
            ((C0863) c9996.f30113).f3353.getBinder().unlinkToDeath(c9996, 0);
        }
    }
}
