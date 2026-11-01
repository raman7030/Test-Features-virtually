package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ܿܿ */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC1709 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ View f56606;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1044 f56607;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ View f56608;

    public RunnableC1709(C1044 c1044, View view, View view2) {
        this.f56607 = c1044;
        this.f56606 = view;
        this.f56608 = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1044.m14167(this.f56607.f15784, this.f56606, this.f56608);
    }
}
