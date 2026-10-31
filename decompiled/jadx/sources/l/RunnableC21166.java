package l;

/* JADX INFO: renamed from: l.᩷᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1RG */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC21166 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC9877 f68221;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68222;

    public RunnableC21166(ViewOnTouchListenerC9877 viewOnTouchListenerC9877, int i) {
        this.f68221 = viewOnTouchListenerC9877;
        this.f68222 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnTouchListenerC9877 viewOnTouchListenerC9877 = this.f68221;
        if (this.f68222 == viewOnTouchListenerC9877.f29897) {
            viewOnTouchListenerC9877.f29894.performClick();
            viewOnTouchListenerC9877.f29894.postDelayed(this, 50L);
        }
    }
}
