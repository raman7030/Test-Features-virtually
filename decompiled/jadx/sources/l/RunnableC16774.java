package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC16774 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f51528;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4075 f51529;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f51530;

    public RunnableC16774(C4075 c4075, View view, View view2) {
        this.f51529 = c4075;
        this.f51528 = view;
        this.f51530 = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4075.m12250(this.f51529.f12967, this.f51528, this.f51530);
    }
}
