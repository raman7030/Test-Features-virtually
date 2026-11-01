package p067l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܿ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 560O */
/* JADX INFO: loaded from: classes4.dex */
public final class C19151 implements Drawable.Callback {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C22505 f57219;

    public C19151(C22505 c22505) {
        this.f57219 = c22505;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f57219.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f57219.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f57219.unscheduleSelf(runnable);
    }
}
