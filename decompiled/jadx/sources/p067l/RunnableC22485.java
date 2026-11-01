package p067l;

/* JADX INFO: renamed from: l.᩷᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1RG */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC22485 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ViewOnTouchListenerC11756 f70904;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f70905;

    public RunnableC22485(ViewOnTouchListenerC11756 viewOnTouchListenerC11756, int i) {
        this.f70904 = viewOnTouchListenerC11756;
        this.f70905 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnTouchListenerC11756 viewOnTouchListenerC11756 = this.f70904;
        if (this.f70905 == viewOnTouchListenerC11756.f32854) {
            viewOnTouchListenerC11756.f32851.performClick();
            viewOnTouchListenerC11756.f32851.postDelayed(this, 50L);
        }
    }
}
