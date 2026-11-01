package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.᩺᩷ */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1994 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public C0928 f77389;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C1698 f77390;

    public RunnableC1994(C1698 c1698, C0928 c0928) {
        this.f77390 = c1698;
        this.f77389 = c0928;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1698 c1698 = this.f77390;
        if (c1698.f29422 != null) {
            c1698.f29422.changeMenuMode();
        }
        View view = (View) c1698.f29426;
        if (view != null && view.getWindowToken() != null) {
            C0928 c0928 = this.f77389;
            if (c0928.m44900()) {
                c1698.f56081 = c0928;
            }
        }
        c1698.f56082 = null;
    }
}
