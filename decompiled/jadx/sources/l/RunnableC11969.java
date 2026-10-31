package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۨ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11969 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f35836;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f35837;

    public RunnableC11969(AbstractActivityC3346 abstractActivityC3346, TextView textView) {
        this.f35836 = abstractActivityC3346;
        this.f35837 = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C18340.m42761(this.f35836, this.f35837);
        C18340.m42760(this);
    }
}
