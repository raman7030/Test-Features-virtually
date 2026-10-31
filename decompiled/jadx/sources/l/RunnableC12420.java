package l;

import android.media.metrics.PlaybackErrorEvent;

/* JADX INFO: renamed from: l.۫۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 48U6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12420 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f37398;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f37399;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f37400;

    public /* synthetic */ RunnableC12420(int i, Object obj, Object obj2) {
        this.f37399 = i;
        this.f37400 = obj;
        this.f37398 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37399) {
            case 0:
                ((C11715) this.f37400).f34960.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f37398);
                break;
            default:
                C10833.m27083((C10833) this.f37400, (C3519) this.f37398);
                break;
        }
    }
}
