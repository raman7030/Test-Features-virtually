package l;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۟۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC7341 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22555;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22556;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22557 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22558;

    public /* synthetic */ RunnableC7341(ActivityC16012 activityC16012, C13136 c13136, AtomicBoolean atomicBoolean, Exception exc) {
        this.f22558 = activityC16012;
        this.f22556 = c13136;
        this.f22555 = atomicBoolean;
    }

    public /* synthetic */ RunnableC7341(C22720 c22720, C11432 c11432, C5787 c5787) {
        this.f22558 = c22720;
        this.f22556 = c11432;
        this.f22555 = c5787;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22557) {
            case 0:
                ActivityC16012.m37826((ActivityC16012) this.f22558, (C13136) this.f22556, (AtomicBoolean) this.f22555);
                break;
            default:
                C22720.m50764((C22720) this.f22558, (C11432) this.f22556, (C5787) this.f22555);
                break;
        }
    }
}
