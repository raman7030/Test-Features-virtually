package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ܽܿ */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC1674 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ View f54710;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1044 f54711;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ View f54712;

    public RunnableC1674(C1044 c1044, View view, View view2) {
        this.f54711 = c1044;
        this.f54710 = view;
        this.f54712 = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1044.m14167(this.f54711.f15782, this.f54710, this.f54712);
    }
}
