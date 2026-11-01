package p067l;

import android.media.metrics.PlaybackErrorEvent;

/* JADX INFO: renamed from: l.۫۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 48U6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC14172 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f40415;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f40416;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f40417;

    public /* synthetic */ RunnableC14172(int i, Object obj, Object obj2) {
        this.f40416 = i;
        this.f40417 = obj;
        this.f40415 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40416) {
            case 0:
                ((C13502) this.f40417).f37960.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f40415);
                break;
            default:
                C12664.m29128((C12664) this.f40417, (C5713) this.f40415);
                break;
        }
    }
}
