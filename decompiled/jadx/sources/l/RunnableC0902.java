package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0902 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewGroup f3474;

    public RunnableC0902(ViewGroup viewGroup) {
        this.f3474 = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3474.setNestedScrollingEnabled(true);
    }
}
