package l;

/* JADX INFO: renamed from: l.᩵ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21RX */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC19381 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8091 f62733;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f62734;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f62735;

    public RunnableC19381(C8091 c8091) {
        this.f62733 = c8091;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f62734;
        C8091 c8091 = this.f62733;
        if (z == c8091.isPressed() && c8091.getParent() != null && this.f62735 == c8091.getWindowAttachCount()) {
            c8091.performLongClick();
            c8091.f24904 = true;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44645() {
        this.f62735 = this.f62733.getWindowAttachCount();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44644() {
        this.f62734 = this.f62733.isPressed();
    }
}
