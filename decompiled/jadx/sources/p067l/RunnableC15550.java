package p067l;

/* JADX INFO: renamed from: l.ܰܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC15550 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ComponentCallbacksC11117 f44435;

    public RunnableC15550(ComponentCallbacksC11117 componentCallbacksC11117) {
        this.f44435 = componentCallbacksC11117;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f44435.callStartTransitionListener(false);
    }
}
