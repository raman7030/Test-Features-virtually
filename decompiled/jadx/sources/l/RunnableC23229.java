package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23229 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C1732 f74646;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17254 f74647;

    public RunnableC23229(C17254 c17254, C1732 c1732) {
        this.f74647 = c17254;
        this.f74646 = c1732;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C17254 c17254 = this.f74647;
        if (c17254.f26497 != null) {
            c17254.f26497.changeMenuMode();
        }
        View view = (View) c17254.f26501;
        if (view != null && view.getWindowToken() != null) {
            C1732 c1732 = this.f74646;
            if (c1732.m42640()) {
                c17254.f52899 = c1732;
            }
        }
        c17254.f52900 = null;
    }
}
