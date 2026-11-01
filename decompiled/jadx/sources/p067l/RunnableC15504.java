package p067l;

import android.media.metrics.TrackChangeEvent;

/* JADX INFO: renamed from: l.ܰ۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC15504 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f44303;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f44304;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f44305;

    public /* synthetic */ RunnableC15504(int i, Object obj, Object obj2) {
        this.f44304 = i;
        this.f44305 = obj;
        this.f44303 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44304) {
            case 0:
                DialogInterfaceOnClickListenerC20813.m46994((DialogInterfaceOnClickListenerC20813) this.f44305, (C14853) this.f44303);
                break;
            default:
                ((C13502) this.f44305).f37960.reportTrackChangeEvent((TrackChangeEvent) this.f44303);
                break;
        }
    }
}
