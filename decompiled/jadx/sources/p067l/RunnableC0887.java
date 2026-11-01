package p067l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.֨ۚ */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0887 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ViewGroup f6249;

    public RunnableC0887(ViewGroup viewGroup) {
        this.f6249 = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6249.setNestedScrollingEnabled(true);
    }
}
