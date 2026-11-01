package p067l;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۟۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC9345 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f25468;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f25469;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f25470 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f25471;

    public /* synthetic */ RunnableC9345(ActivityC17586 activityC17586, C14853 c14853, AtomicBoolean atomicBoolean, Exception exc) {
        this.f25471 = activityC17586;
        this.f25469 = c14853;
        this.f25468 = atomicBoolean;
    }

    public /* synthetic */ RunnableC9345(C23961 c23961, C13233 c13233, C7868 c7868) {
        this.f25471 = c23961;
        this.f25469 = c13233;
        this.f25468 = c7868;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25470) {
            case 0:
                ActivityC17586.m40012((ActivityC17586) this.f25471, (C14853) this.f25469, (AtomicBoolean) this.f25468);
                break;
            default:
                C23961.m53090((C23961) this.f25471, (C13233) this.f25469, (C7868) this.f25468);
                break;
        }
    }
}
