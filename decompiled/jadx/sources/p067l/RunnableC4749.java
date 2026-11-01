package p067l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۖۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F90M */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4749 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C6090 f10759;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Drawable f10760;

    public RunnableC4749(C6090 c6090, Drawable drawable) {
        this.f10759 = c6090;
        this.f10760 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10759.invalidateDrawable(this.f10760);
    }
}
