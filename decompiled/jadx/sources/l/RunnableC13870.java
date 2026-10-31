package l;

/* JADX INFO: renamed from: l.ܰܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC13870 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ComponentCallbacksC9205 f41354;

    public RunnableC13870(ComponentCallbacksC9205 componentCallbacksC9205) {
        this.f41354 = componentCallbacksC9205;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41354.callStartTransitionListener(false);
    }
}
