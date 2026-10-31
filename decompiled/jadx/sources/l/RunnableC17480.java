package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC17480 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f53418;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4075 f53419;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f53420;

    public RunnableC17480(C4075 c4075, View view, View view2) {
        this.f53419 = c4075;
        this.f53418 = view;
        this.f53420 = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4075.m12250(this.f53419.f12969, this.f53418, this.f53420);
    }
}
