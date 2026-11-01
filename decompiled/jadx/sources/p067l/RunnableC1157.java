package p067l;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: l.ۛ᩺ */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1157 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ View f22556;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ ValueAnimator f22557;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1704 f22558;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C1017 f22559;

    public RunnableC1157(View view, C1704 c1704, C1017 c1017, ValueAnimator valueAnimator) {
        this.f22556 = view;
        this.f22558 = c1704;
        this.f22559 = c1017;
        this.f22557 = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1997.m54009(this.f22556, this.f22558, this.f22559);
        this.f22557.start();
    }
}
