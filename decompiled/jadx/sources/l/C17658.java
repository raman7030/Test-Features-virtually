package l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܿ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 560O */
/* JADX INFO: loaded from: classes4.dex */
public final class C17658 implements Drawable.Callback {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21187 f54026;

    public C17658(C21187 c21187) {
        this.f54026 = c21187;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f54026.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f54026.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f54026.unscheduleSelf(runnable);
    }
}
