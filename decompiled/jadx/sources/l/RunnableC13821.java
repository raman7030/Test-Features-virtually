package l;

import android.media.metrics.TrackChangeEvent;

/* JADX INFO: renamed from: l.ܰ۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC13821 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f41226;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41227;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f41228;

    public /* synthetic */ RunnableC13821(int i, Object obj, Object obj2) {
        this.f41227 = i;
        this.f41228 = obj;
        this.f41226 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41227) {
            case 0:
                DialogInterfaceOnClickListenerC19407.m44700((DialogInterfaceOnClickListenerC19407) this.f41228, (C13136) this.f41226);
                break;
            default:
                ((C11715) this.f41228).f34960.reportTrackChangeEvent((TrackChangeEvent) this.f41226);
                break;
        }
    }
}
