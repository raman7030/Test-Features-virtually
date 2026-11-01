package p067l;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: l.֡ܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2810 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Rect f4808;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ View f4809;

    public RunnableC2810(AbstractC17742 abstractC17742, View view, Rect rect) {
        this.f4809 = view;
        this.f4808 = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC17742.m40325(this.f4808, this.f4809);
    }
}
