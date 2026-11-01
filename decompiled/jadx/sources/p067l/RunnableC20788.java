package p067l;

/* JADX INFO: renamed from: l.᩵ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21RX */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20788 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C10058 f65344;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f65345;

    /* JADX INFO: renamed from: ᩹ */
    public int f65346;

    public RunnableC20788(C10058 c10058) {
        this.f65344 = c10058;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f65345;
        C10058 c10058 = this.f65344;
        if (z == c10058.isPressed() && c10058.getParent() != null && this.f65346 == c10058.getWindowAttachCount()) {
            c10058.performLongClick();
            c10058.f27815 = true;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46939() {
        this.f65346 = this.f65344.getWindowAttachCount();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46938() {
        this.f65345 = this.f65344.isPressed();
    }
}
